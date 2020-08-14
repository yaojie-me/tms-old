package org.nw.basic.util;

import java.beans.PropertyDescriptor;
import java.beans.PropertyEditor;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.URI;
import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Static convenience methods for JavaBeans: for instantiating beans, checking
 * bean property types, copying bean properties, etc.
 * <p>
 * Mainly for use within the framework, but to some degree also useful for
 * application classes.
 * 
 * @author Rod Johnson
 * @author Juergen Hoeller
 * @author Rob Harrop
 * @author Sam Brannen
 */
public class BeanUtils {

	private static final Log logger = LogFactory.getLog(BeanUtils.class);

	private static final Map<Class<?>, Boolean> unknownEditorTypes = Collections
			.synchronizedMap(new WeakHashMap<Class<?>, Boolean>());

	/**
	 * Convenience method to instantiate a class using its no-arg constructor.
	 * As this method doesn't try to load classes by name, it should avoid
	 * class-loading issues.
	 * 
	 * @param clazz
	 *            class to instantiate
	 * @return the new instance
	 * @throws BeanInstantiationException
	 *             if the bean cannot be instantiated
	 */
	public static <T> T instantiate(Class<T> clazz) {
		Assert.notNull(clazz, "Class must not be null");
		if(clazz.isInterface()) {
			throw new RuntimeException(clazz.getName() + " Specified class is an interface");
		}
		try {
			return clazz.newInstance();
		} catch(InstantiationException ex) {
			throw new RuntimeException(clazz.getName() + " Is it an abstract class?", ex);
		} catch(IllegalAccessException ex) {
			throw new RuntimeException(clazz.getName() + " Is the constructor accessible?", ex);
		}
	}

	/**
	 * Convenience method to instantiate a class using its no-arg constructor.
	 * As this method doesn't try to load classes by name, it should avoid
	 * class-loading issues.
	 * <p>
	 * Note that this method tries to set the constructor accessible if given a
	 * non-accessible (that is, non-public) constructor.
	 * 
	 * @param clazz
	 *            class to instantiate
	 * @return the new instance
	 * @throws BeanInstantiationException
	 *             if the bean cannot be instantiated
	 */
	public static <T> T instantiateClass(Class<T> clazz) {
		Assert.notNull(clazz, "Class must not be null");
		if(clazz.isInterface()) {
			throw new RuntimeException(clazz.getName() + " Specified class is an interface");
		}
		try {
			return instantiateClass(clazz.getDeclaredConstructor());
		} catch(NoSuchMethodException ex) {
			throw new RuntimeException(clazz.getName() + " No default constructor found", ex);
		}
	}

	/**
	 * Convenience method to instantiate a class using the given constructor. As
	 * this method doesn't try to load classes by name, it should avoid
	 * class-loading issues.
	 * <p>
	 * Note that this method tries to set the constructor accessible if given a
	 * non-accessible (that is, non-public) constructor.
	 * 
	 * @param ctor
	 *            the constructor to instantiate
	 * @param args
	 *            the constructor arguments to apply
	 * @return the new instance
	 * @throws BeanInstantiationException
	 *             if the bean cannot be instantiated
	 */
	public static <T> T instantiateClass(Constructor<T> ctor, Object... args) {
		Assert.notNull(ctor, "Constructor must not be null");
		try {
			ReflectionUtils.makeAccessible(ctor);
			return ctor.newInstance(args);
		} catch(InstantiationException ex) {
			throw new RuntimeException(ctor.getDeclaringClass().getName() + " Is it an abstract class?", ex);
		} catch(IllegalAccessException ex) {
			throw new RuntimeException(ctor.getDeclaringClass().getName() + " Is the constructor accessible?", ex);
		} catch(IllegalArgumentException ex) {
			throw new RuntimeException(ctor.getDeclaringClass().getName() + " Illegal arguments for constructor", ex);
		} catch(InvocationTargetException ex) {
			throw new RuntimeException(ctor.getDeclaringClass().getName() + " Constructor threw exception",
					ex.getTargetException());
		}
	}

	/**
	 * Find a method with the given method name and the given parameter types,
	 * declared on the given class or one of its superclasses. Prefers public
	 * methods, but will return a protected, package access, or private method
	 * too.
	 * <p>
	 * Checks <code>Class.getMethod</code> first, falling back to
	 * <code>findDeclaredMethod</code>. This allows to find public methods
	 * without issues even in environments with restricted Java security
	 * settings.
	 * 
	 * @param clazz
	 *            the class to check
	 * @param methodName
	 *            the name of the method to find
	 * @param paramTypes
	 *            the parameter types of the method to find
	 * @return the Method object, or <code>null</code> if not found
	 * @see java.lang.Class#getMethod
	 * @see #findDeclaredMethod
	 */
	public static Method findMethod(Class<?> clazz, String methodName, Class<?>... paramTypes) {
		try {
			return clazz.getMethod(methodName, paramTypes);
		} catch(NoSuchMethodException ex) {
			return findDeclaredMethod(clazz, methodName, paramTypes);
		}
	}

	/**
	 * Find a method with the given method name and the given parameter types,
	 * declared on the given class or one of its superclasses. Will return a
	 * public, protected, package access, or private method.
	 * <p>
	 * Checks <code>Class.getDeclaredMethod</code>, cascading upwards to all
	 * superclasses.
	 * 
	 * @param clazz
	 *            the class to check
	 * @param methodName
	 *            the name of the method to find
	 * @param paramTypes
	 *            the parameter types of the method to find
	 * @return the Method object, or <code>null</code> if not found
	 * @see java.lang.Class#getDeclaredMethod
	 */
	public static Method findDeclaredMethod(Class<?> clazz, String methodName, Class<?>[] paramTypes) {
		try {
			return clazz.getDeclaredMethod(methodName, paramTypes);
		} catch(NoSuchMethodException ex) {
			if(clazz.getSuperclass() != null) {
				return findDeclaredMethod(clazz.getSuperclass(), methodName, paramTypes);
			}
			return null;
		}
	}

	/**
	 * Find a method with the given method name and minimal parameters (best
	 * case: none), declared on the given class or one of its superclasses.
	 * Prefers public methods, but will return a protected, package access, or
	 * private method too.
	 * <p>
	 * Checks <code>Class.getMethods</code> first, falling back to
	 * <code>findDeclaredMethodWithMinimalParameters</code>. This allows for
	 * finding public methods without issues even in environments with
	 * restricted Java security settings.
	 * 
	 * @param clazz
	 *            the class to check
	 * @param methodName
	 *            the name of the method to find
	 * @return the Method object, or <code>null</code> if not found
	 * @throws IllegalArgumentException
	 *             if methods of the given name were found but could not be
	 *             resolved to a unique method with minimal parameters
	 * @see java.lang.Class#getMethods
	 * @see #findDeclaredMethodWithMinimalParameters
	 */
	public static Method findMethodWithMinimalParameters(Class<?> clazz, String methodName)
			throws IllegalArgumentException {

		Method targetMethod = findMethodWithMinimalParameters(clazz.getMethods(), methodName);
		if(targetMethod == null) {
			targetMethod = findDeclaredMethodWithMinimalParameters(clazz, methodName);
		}
		return targetMethod;
	}

	/**
	 * Find a method with the given method name and minimal parameters (best
	 * case: none), declared on the given class or one of its superclasses. Will
	 * return a public, protected, package access, or private method.
	 * <p>
	 * Checks <code>Class.getDeclaredMethods</code>, cascading upwards to all
	 * superclasses.
	 * 
	 * @param clazz
	 *            the class to check
	 * @param methodName
	 *            the name of the method to find
	 * @return the Method object, or <code>null</code> if not found
	 * @throws IllegalArgumentException
	 *             if methods of the given name were found but could not be
	 *             resolved to a unique method with minimal parameters
	 * @see java.lang.Class#getDeclaredMethods
	 */
	public static Method findDeclaredMethodWithMinimalParameters(Class<?> clazz, String methodName)
			throws IllegalArgumentException {

		Method targetMethod = findMethodWithMinimalParameters(clazz.getDeclaredMethods(), methodName);
		if(targetMethod == null && clazz.getSuperclass() != null) {
			targetMethod = findDeclaredMethodWithMinimalParameters(clazz.getSuperclass(), methodName);
		}
		return targetMethod;
	}

	/**
	 * Find a method with the given method name and minimal parameters (best
	 * case: none) in the given list of methods.
	 * 
	 * @param methods
	 *            the methods to check
	 * @param methodName
	 *            the name of the method to find
	 * @return the Method object, or <code>null</code> if not found
	 * @throws IllegalArgumentException
	 *             if methods of the given name were found but could not be
	 *             resolved to a unique method with minimal parameters
	 */
	public static Method findMethodWithMinimalParameters(Method[] methods, String methodName)
			throws IllegalArgumentException {

		Method targetMethod = null;
		int numMethodsFoundWithCurrentMinimumArgs = 0;
		for(Method method : methods) {
			if(method.getName().equals(methodName)) {
				int numParams = method.getParameterTypes().length;
				if(targetMethod == null || numParams < targetMethod.getParameterTypes().length) {
					targetMethod = method;
					numMethodsFoundWithCurrentMinimumArgs = 1;
				} else {
					if(targetMethod.getParameterTypes().length == numParams) {
						// Additional candidate with same length.
						numMethodsFoundWithCurrentMinimumArgs++;
					}
				}
			}
		}
		if(numMethodsFoundWithCurrentMinimumArgs > 1) {
			throw new IllegalArgumentException("Cannot resolve method '" + methodName
					+ "' to a unique method. Attempted to resolve to overloaded method with "
					+ "the least number of parameters, but there were " + numMethodsFoundWithCurrentMinimumArgs
					+ " candidates.");
		}
		return targetMethod;
	}

	/**
	 * Parse a method signature in the form
	 * <code>methodName[([arg_list])]</code>, where <code>arg_list</code> is an
	 * optional, comma-separated list of fully-qualified type names, and
	 * attempts to resolve that signature against the supplied
	 * <code>Class</code>.
	 * <p>
	 * When not supplying an argument list (<code>methodName</code>) the method
	 * whose name matches and has the least number of parameters will be
	 * returned. When supplying an argument type list, only the method whose
	 * name and argument types match will be returned.
	 * <p>
	 * Note then that <code>methodName</code> and <code>methodName()</code> are
	 * <strong>not</strong> resolved in the same way. The signature
	 * <code>methodName</code> means the method called <code>methodName</code>
	 * with the least number of arguments, whereas <code>methodName()</code>
	 * means the method called <code>methodName</code> with exactly 0 arguments.
	 * <p>
	 * If no method can be found, then <code>null</code> is returned.
	 * 
	 * @param signature
	 *            the method signature as String representation
	 * @param clazz
	 *            the class to resolve the method signature against
	 * @return the resolved Method
	 * @see #findMethod
	 * @see #findMethodWithMinimalParameters
	 */
	public static Method resolveSignature(String signature, Class<?> clazz) {
		Assert.hasText(signature, "'signature' must not be empty");
		Assert.notNull(clazz, "Class must not be null");

		int firstParen = signature.indexOf("(");
		int lastParen = signature.indexOf(")");

		if(firstParen > -1 && lastParen == -1) {
			throw new IllegalArgumentException("Invalid method signature '" + signature
					+ "': expected closing ')' for args list");
		} else if(lastParen > -1 && firstParen == -1) {
			throw new IllegalArgumentException("Invalid method signature '" + signature
					+ "': expected opening '(' for args list");
		} else if(firstParen == -1 && lastParen == -1) {
			return findMethodWithMinimalParameters(clazz, signature);
		} else {
			String methodName = signature.substring(0, firstParen);
			String[] parameterTypeNames = StringUtils.commaDelimitedListToStringArray(signature.substring(
					firstParen + 1, lastParen));
			Class<?>[] parameterTypes = new Class[parameterTypeNames.length];
			for(int i = 0; i < parameterTypeNames.length; i++) {
				String parameterTypeName = parameterTypeNames[i].trim();
				try {
					parameterTypes[i] = ClassUtils.forName(parameterTypeName, clazz.getClassLoader());
				} catch(Throwable ex) {
					throw new IllegalArgumentException("Invalid method signature: unable to resolve type ["
							+ parameterTypeName + "] for argument " + i + ". Root cause: " + ex);
				}
			}
			return findMethod(clazz, methodName, parameterTypes);
		}
	}

	/**
	 * Retrieve the JavaBeans <code>PropertyDescriptor</code>s of a given class.
	 * 
	 * @param clazz
	 *            the Class to retrieve the PropertyDescriptors for
	 * @return an array of <code>PropertyDescriptors</code> for the given class
	 * @throws Exception
	 *             if PropertyDescriptor look fails
	 */
	public static PropertyDescriptor[] getPropertyDescriptors(Class<?> clazz) throws Exception {
		CachedIntrospectionResults cr = CachedIntrospectionResults.forClass(clazz);
		return cr.getPropertyDescriptors();
	}

	/**
	 * Retrieve the JavaBeans <code>PropertyDescriptors</code> for the given
	 * property.
	 * 
	 * @param clazz
	 *            the Class to retrieve the PropertyDescriptor for
	 * @param propertyName
	 *            the name of the property
	 * @return the corresponding PropertyDescriptor, or <code>null</code> if
	 *         none
	 * @throws Exception
	 *             if PropertyDescriptor lookup fails
	 */
	public static PropertyDescriptor getPropertyDescriptor(Class<?> clazz, String propertyName) throws Exception {
		CachedIntrospectionResults cr = CachedIntrospectionResults.forClass(clazz);
		return cr.getPropertyDescriptor(propertyName);
	}

	/**
	 * Find a JavaBeans <code>PropertyDescriptor</code> for the given method,
	 * with the method either being the read method or the write method for that
	 * bean property.
	 * 
	 * @param method
	 *            the method to find a corresponding PropertyDescriptor for
	 * @return the corresponding PropertyDescriptor, or <code>null</code> if
	 *         none
	 * @throws Exception
	 *             if PropertyDescriptor lookup fails
	 */
	public static PropertyDescriptor findPropertyForMethod(Method method) throws Exception {
		Assert.notNull(method, "Method must not be null");
		PropertyDescriptor[] pds = getPropertyDescriptors(method.getDeclaringClass());
		for(PropertyDescriptor pd : pds) {
			if(method.equals(pd.getReadMethod()) || method.equals(pd.getWriteMethod())) {
				return pd;
			}
		}
		return null;
	}

	/**
	 * Find a JavaBeans PropertyEditor following the 'Editor' suffix convention
	 * (e.g. "mypackage.MyDomainClass" -> "mypackage.MyDomainClassEditor").
	 * <p>
	 * Compatible to the standard JavaBeans convention as implemented by
	 * {@link java.beans.PropertyEditorManager} but isolated from the latter's
	 * registered default editors for primitive types.
	 * 
	 * @param targetType
	 *            the type to find an editor for
	 * @return the corresponding editor, or <code>null</code> if none found
	 */
	public static PropertyEditor findEditorByConvention(Class<?> targetType) {
		if(targetType == null || targetType.isArray() || unknownEditorTypes.containsKey(targetType)) {
			return null;
		}
		ClassLoader cl = targetType.getClassLoader();
		if(cl == null) {
			try {
				cl = ClassLoader.getSystemClassLoader();
				if(cl == null) {
					return null;
				}
			} catch(Throwable ex) {
				// e.g. AccessControlException on Google App Engine
				if(logger.isDebugEnabled()) {
					logger.debug("Could not access system ClassLoader: " + ex);
				}
				return null;
			}
		}
		String editorName = targetType.getName() + "Editor";
		try {
			Class<?> editorClass = cl.loadClass(editorName);
			if(!PropertyEditor.class.isAssignableFrom(editorClass)) {
				if(logger.isWarnEnabled()) {
					logger.warn("Editor class [" + editorName
							+ "] does not implement [java.beans.PropertyEditor] interface");
				}
				unknownEditorTypes.put(targetType, Boolean.TRUE);
				return null;
			}
			return (PropertyEditor) instantiateClass(editorClass);
		} catch(ClassNotFoundException ex) {
			if(logger.isDebugEnabled()) {
				logger.debug("No property editor [" + editorName + "] found for type " + targetType.getName()
						+ " according to 'Editor' suffix convention");
			}
			unknownEditorTypes.put(targetType, Boolean.TRUE);
			return null;
		}
	}

	/**
	 * Determine the bean property type for the given property from the given
	 * classes/interfaces, if possible.
	 * 
	 * @param propertyName
	 *            the name of the bean property
	 * @param beanClasses
	 *            the classes to check against
	 * @return the property type, or <code>Object.class</code> as fallback
	 */
	public static Class<?> findPropertyType(String propertyName, Class<?>[] beanClasses) throws Exception {
		if(beanClasses != null) {
			for(Class<?> beanClass : beanClasses) {
				PropertyDescriptor pd = getPropertyDescriptor(beanClass, propertyName);
				if(pd != null) {
					return pd.getPropertyType();
				}
			}
		}
		return Object.class;
	}

	/**
	 * Check if the given type represents a "simple" property: a primitive, a
	 * String or other CharSequence, a Number, a Date, a URI, a URL, a Locale, a
	 * Class, or a corresponding array.
	 * <p>
	 * Used to determine properties to check for a "simple" dependency-check.
	 * 
	 * @param clazz
	 *            the type to check
	 * @return whether the given type represents a "simple" property
	 * @see org.springframework.beans.factory.support.RootBeanDefinition#DEPENDENCY_CHECK_SIMPLE
	 * @see org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory#checkDependencies
	 */
	public static boolean isSimpleProperty(Class<?> clazz) {
		Assert.notNull(clazz, "Class must not be null");
		return isSimpleValueType(clazz) || (clazz.isArray() && isSimpleValueType(clazz.getComponentType()));
	}

	/**
	 * Check if the given type represents a "simple" value type: a primitive, a
	 * String or other CharSequence, a Number, a Date, a URI, a URL, a Locale or
	 * a Class.
	 * 
	 * @param clazz
	 *            the type to check
	 * @return whether the given type represents a "simple" value type
	 */
	public static boolean isSimpleValueType(Class<?> clazz) {
		return ClassUtils.isPrimitiveOrWrapper(clazz) || clazz.isEnum() || CharSequence.class.isAssignableFrom(clazz)
				|| Number.class.isAssignableFrom(clazz) || Date.class.isAssignableFrom(clazz)
				|| clazz.equals(URI.class) || clazz.equals(URL.class) || clazz.equals(Locale.class)
				|| clazz.equals(Class.class);
	}

	/**
	 * Copy the property values of the given source bean into the target bean.
	 * <p>
	 * Note: The source and target classes do not have to match or even be
	 * derived from each other, as long as the properties match. Any bean
	 * properties that the source bean exposes but the target bean does not will
	 * silently be ignored.
	 * <p>
	 * This is just a convenience method. For more complex transfer needs,
	 * consider using a full BeanWrapper.
	 * 
	 * @param source
	 *            the source bean
	 * @param target
	 *            the target bean
	 * @throws Exception
	 *             if the copying failed
	 * @see BeanWrapper
	 */
	public static void copyProperties(Object source, Object target) {
		copyProperties(source, target, null, true);
	}

	/**
	 * Copy the property values of the given source bean into the target bean.
	 * <p>
	 * Note: The source and target classes do not have to match or even be
	 * derived from each other, as long as the properties match. Any bean
	 * properties that the source bean exposes but the target bean does not will
	 * silently be ignored.
	 * <p>
	 * This is just a convenience method. For more complex transfer needs,
	 * consider using a full BeanWrapper.
	 * 
	 * @param source
	 *            the source bean
	 * @param target
	 *            the target bean
	 * @throws Exception
	 *             if the copying failed
	 * @see BeanWrapper
	 */
	public static void copyProperties(Object source, Object target, boolean copyNull) {
		copyProperties(source, target, null, copyNull);
	}

	/**
	 * Copy the property values of the given source bean into the given target
	 * bean, ignoring the given "ignoreProperties".
	 * <p>
	 * Note: The source and target classes do not have to match or even be
	 * derived from each other, as long as the properties match. Any bean
	 * properties that the source bean exposes but the target bean does not will
	 * silently be ignored.
	 * <p>
	 * This is just a convenience method. For more complex transfer needs,
	 * consider using a full BeanWrapper.
	 * 
	 * @param source
	 *            the source bean
	 * @param target
	 *            the target bean
	 * @param ignoreProperties
	 *            array of property names to ignore
	 * @param copyNull
	 *            copy null property?
	 * @throws Exception
	 *             if the copying failed
	 * @see BeanWrapper
	 */
	private static void copyProperties(Object source, Object target, String[] ignoreProperties, boolean copyNull) {
		Assert.notNull(source, "Source must not be null");
		Assert.notNull(target, "Target must not be null");

		try {
			Class<?> actualEditable = target.getClass();
			PropertyDescriptor[] targetPds = getPropertyDescriptors(actualEditable);
			List<String> ignoreList = (ignoreProperties != null) ? Arrays.asList(ignoreProperties) : null;

			for(PropertyDescriptor targetPd : targetPds) {
				if(targetPd.getWriteMethod() != null
						&& (ignoreProperties == null || (!ignoreList.contains(targetPd.getName())))) {
					PropertyDescriptor sourcePd = getPropertyDescriptor(source.getClass(), targetPd.getName());
					if(sourcePd != null && sourcePd.getReadMethod() != null) {
						try {
							Method readMethod = sourcePd.getReadMethod();
							if(!Modifier.isPublic(readMethod.getDeclaringClass().getModifiers())) {
								readMethod.setAccessible(true);
							}
							Object value = readMethod.invoke(source);
							if(value == null && !copyNull) {
								// 如果不拷贝null字段
								continue;
							}
							Method writeMethod = targetPd.getWriteMethod();
							if(!Modifier.isPublic(writeMethod.getDeclaringClass().getModifiers())) {
								writeMethod.setAccessible(true);
							}
							writeMethod.invoke(target, value);
						} catch(Throwable ex) {
							throw new Exception("Could not copy properties from source to target", ex);
						}
					}
				}
			}
		} catch(Exception e) {
			throw new RuntimeException(e);
		}
	}

}
