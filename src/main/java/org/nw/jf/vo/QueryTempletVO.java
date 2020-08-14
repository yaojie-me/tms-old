/***************************************************************\
 *     The skeleton of this class is generated by an automatic *
 * code generator for NC product. It is based on Velocity.     *
\***************************************************************/
package org.nw.jf.vo;

import org.nw.vo.pub.SuperVO;
import org.nw.vo.pub.lang.UFDateTime;

/**
 * <b> 在此处简要描述此类的功能 </b>
 * <p>
 * 在此处添加此类的描述信息
 * </p>
 * 创建日期:2012-12-29 15:17:18
 * 
 * @author Administrator
 * @version NCPrj 1.0
 */
@SuppressWarnings("serial")
public class QueryTempletVO extends SuperVO {
	private String metaclass;
	private String pk_corp;
	private String resid;
	private Integer dr;
	private String pk_templet;
	private String model_code;
	private String node_code;
	private UFDateTime ts;
	private String model_name;
	private String fixcondition;
	private String describe;
	private UFDateTime create_time;
	private String create_user;
	private UFDateTime modify_time;
	private String modify_user;

	public UFDateTime getCreate_time() {
		return create_time;
	}

	public void setCreate_time(UFDateTime create_time) {
		this.create_time = create_time;
	}

	public String getCreate_user() {
		return create_user;
	}

	public void setCreate_user(String create_user) {
		this.create_user = create_user;
	}

	public UFDateTime getModify_time() {
		return modify_time;
	}

	public void setModify_time(UFDateTime modify_time) {
		this.modify_time = modify_time;
	}

	public String getModify_user() {
		return modify_user;
	}

	public void setModify_user(String modify_user) {
		this.modify_user = modify_user;
	}

	public static final String METACLASS = "metaclass";
	public static final String PK_CORP = "pk_corp";
	public static final String RESID = "resid";
	public static final String PK_TEMPLET = "pk_templet";
	public static final String MODEL_CODE = "model_code";
	public static final String NODE_CODE = "node_code";
	public static final String MODEL_NAME = "model_name";
	public static final String FIXCONDITION = "fixcondition";
	public static final String DESCRIBE = "describe";

	/**
	 * 属性metaclass的Getter方法. 创建日期:2012-12-29 15:17:18
	 * 
	 * @return String
	 */
	public String getMetaclass() {
		return metaclass;
	}

	/**
	 * 属性metaclass的Setter方法. 创建日期:2012-12-29 15:17:18
	 * 
	 * @param newMetaclass
	 *            String
	 */
	public void setMetaclass(String newMetaclass) {
		this.metaclass = newMetaclass;
	}

	/**
	 * 属性pk_corp的Getter方法. 创建日期:2012-12-29 15:17:18
	 * 
	 * @return String
	 */
	public String getPk_corp() {
		return pk_corp;
	}

	/**
	 * 属性pk_corp的Setter方法. 创建日期:2012-12-29 15:17:18
	 * 
	 * @param newPk_corp
	 *            String
	 */
	public void setPk_corp(String newPk_corp) {
		this.pk_corp = newPk_corp;
	}

	/**
	 * 属性resid的Getter方法. 创建日期:2012-12-29 15:17:18
	 * 
	 * @return String
	 */
	public String getResid() {
		return resid;
	}

	/**
	 * 属性resid的Setter方法. 创建日期:2012-12-29 15:17:18
	 * 
	 * @param newResid
	 *            String
	 */
	public void setResid(String newResid) {
		this.resid = newResid;
	}

	/**
	 * 属性dr的Getter方法. 创建日期:2012-12-29 15:17:18
	 * 
	 * @return Integer
	 */
	public Integer getDr() {
		return dr;
	}

	/**
	 * 属性dr的Setter方法. 创建日期:2012-12-29 15:17:18
	 * 
	 * @param newDr
	 *            Integer
	 */
	public void setDr(Integer newDr) {
		this.dr = newDr;
	}


	public String getPk_templet() {
		return pk_templet;
	}

	public void setPk_templet(String pk_templet) {
		this.pk_templet = pk_templet;
	}

	/**
	 * 属性model_code的Getter方法. 创建日期:2012-12-29 15:17:18
	 * 
	 * @return String
	 */
	public String getModel_code() {
		return model_code;
	}

	/**
	 * 属性model_code的Setter方法. 创建日期:2012-12-29 15:17:18
	 * 
	 * @param newModel_code
	 *            String
	 */
	public void setModel_code(String newModel_code) {
		this.model_code = newModel_code;
	}

	/**
	 * 属性node_code的Getter方法. 创建日期:2012-12-29 15:17:18
	 * 
	 * @return String
	 */
	public String getNode_code() {
		return node_code;
	}

	/**
	 * 属性node_code的Setter方法. 创建日期:2012-12-29 15:17:18
	 * 
	 * @param newNode_code
	 *            String
	 */
	public void setNode_code(String newNode_code) {
		this.node_code = newNode_code;
	}

	/**
	 * 属性ts的Getter方法. 创建日期:2012-12-29 15:17:18
	 * 
	 * @return UFDateTime
	 */
	public UFDateTime getTs() {
		return ts;
	}

	/**
	 * 属性ts的Setter方法. 创建日期:2012-12-29 15:17:18
	 * 
	 * @param newTs
	 *            UFDateTime
	 */
	public void setTs(UFDateTime newTs) {
		this.ts = newTs;
	}

	/**
	 * 属性model_name的Getter方法. 创建日期:2012-12-29 15:17:18
	 * 
	 * @return String
	 */
	public String getModel_name() {
		return model_name;
	}

	/**
	 * 属性model_name的Setter方法. 创建日期:2012-12-29 15:17:18
	 * 
	 * @param newModel_name
	 *            String
	 */
	public void setModel_name(String newModel_name) {
		this.model_name = newModel_name;
	}

	/**
	 * 属性fixcondition的Getter方法. 创建日期:2012-12-29 15:17:18
	 * 
	 * @return String
	 */
	public String getFixcondition() {
		return fixcondition;
	}

	/**
	 * 属性fixcondition的Setter方法. 创建日期:2012-12-29 15:17:18
	 * 
	 * @param newFixcondition
	 *            String
	 */
	public void setFixcondition(String newFixcondition) {
		this.fixcondition = newFixcondition;
	}

	/**
	 * 属性describe的Getter方法. 创建日期:2012-12-29 15:17:18
	 * 
	 * @return String
	 */
	public String getDescribe() {
		return describe;
	}

	/**
	 * 属性describe的Setter方法. 创建日期:2012-12-29 15:17:18
	 * 
	 * @param newDescribe
	 *            String
	 */
	public void setDescribe(String newDescribe) {
		this.describe = newDescribe;
	}

	/**
	 * <p>
	 * 取得父VO主键字段.
	 * <p>
	 * 创建日期:2012-12-29 15:17:18
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getParentPKFieldName() {
		return null;
	}

	/**
	 * <p>
	 * 取得表主键.
	 * <p>
	 * 创建日期:2012-12-29 15:17:18
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getPKFieldName() {
		return PK_TEMPLET;
	}

	/**
	 * <p>
	 * 返回表名称.
	 * <p>
	 * 创建日期:2012-12-29 15:17:18
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getTableName() {
		return "nw_query_templet";
	}

	/**
	 * 按照默认方式创建构造子.
	 * 
	 * 创建日期:2012-12-29 15:17:18
	 */
	public QueryTempletVO() {
		super();
	}
}