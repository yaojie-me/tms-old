package com.tms.web.ref;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.nw.basic.util.ReflectionUtils;
import org.nw.dao.NWDao;
import org.nw.dao.PaginationVO;
import org.nw.jf.ext.ref.AbstractGridRefModel;
import org.nw.utils.CorpHelper;
import org.nw.web.utils.ControllerHelper;
import org.nw.web.utils.ServletContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tms.constants.DataDictConst;
import com.tms.vo.base.AddressVO;
import com.tms.vo.base.AreaVO;

/**
 * 城市地址档案(并集)
 * 
 * @author xuqc
 * @date 2012-7-2 下午06:03:15
 */
@Controller
@RequestMapping(value = "/ref/common/aaa")
public class AddressAndAreaDefaultRefModel extends AbstractGridRefModel {

	private static String area_sql = "select pk_area as pk_aaa,code,name,memo,area_level from ts_area WITH(NOLOCK) where isnull(dr,0)=0 and isnull(locked_flag,'N')='N' and (area_level=5 or area_level=6 or area_level=7) ";
	private static String address_sql = "select pk_address as pk_aaa,addr_code as code,addr_name as name,memo from ts_address WITH(NOLOCK) where isnull(dr,0)=0 and isnull(locked_flag,'N')='N' ";
	/**
	 * 
	 */
	private static final long serialVersionUID = -4697550166289979740L;

	protected String[] getFieldCode() {
		return new String[] { "code", "name", "memo" };
	}

	protected String[] getFieldName() {
		return new String[] { "编码", "名称", "备注" };
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Map<String, Object> load4Grid(HttpServletRequest request) {
		int offset = getOffset(request);
		int pageSize = getPageSize(request);
		StringBuffer cond = new StringBuffer("1=1");
		String whereClause = this.getExtendCond(request);
		String sql = null;
		if(StringUtils.isNotBlank(whereClause)) {
			cond.append(" and ");
			cond.append(whereClause);
		}
		String addr_type = request.getParameter("addr_type"); // 地址类型，可能是城市/地址
		if(StringUtils.isBlank(addr_type)) {
			addr_type = DataDictConst.ADDR_TYPE.CITY.intValue() + ""; // 默认是城市
		}
		PaginationVO page = null;
		if(addr_type.equals(DataDictConst.ADDR_TYPE.CITY.intValue() + "")) {
			// 选择了城市,从ts_area表中读取城市列表
			String condition = getGridQueryCondition(request, AreaVO.class);
			if(StringUtils.isNotBlank(condition)) {
				cond.append(" and ");
				cond.append(condition);
			}
			sql = area_sql + " and " + cond.toString();
			page = baseRefService.queryBySqlForPagination(HashMap.class, sql, offset, pageSize);
			List<HashMap> mapList = page.getItems();
			for(HashMap map : mapList) {
				int area_level = Integer.parseInt(map.get("area_level").toString());
				String name = map.get("name").toString();
				if(area_level == 6) {
					// 区级
					map.put("name", "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + name);// 增加一个缩进
				} else {
					// 城市级
					map.put("name", "<b>" + name + "</b>");
				}
			}
		} else if(addr_type.equals(DataDictConst.ADDR_TYPE.ADDR.intValue() + "")) {
			// 选择了地址，从地址表中读取
			cond.append(" and " + CorpHelper.getCurrentCorpWithChildrenAndParent());
			String condition = getGridQueryCondition(request, AddressVO.class);
			if(StringUtils.isNotBlank(condition)) {
				cond.append(" and ");
				cond.append(condition);
			}
			sql = address_sql + " and " + cond.toString();
			page = baseRefService.queryBySqlForPagination(HashMap.class, sql, offset, pageSize);
		}
		return this.genAjaxResponse(true, null, page);
	}

	protected String getGridQueryCondition(HttpServletRequest request, Class<?> clazz) {
		String addr_type = request.getParameter("addr_type"); // 地址类型，可能是城市/地址
		if(StringUtils.isBlank(addr_type)) {
			addr_type = DataDictConst.ADDR_TYPE.CITY.intValue() + ""; // 默认是城市
		}
		String fields[] = null;
		if(addr_type.equals(DataDictConst.ADDR_TYPE.CITY.intValue() + "")) {
			fields = ControllerHelper.getGridQueryFields(request);
		} else {
			fields = new String[] { "addr_code", "addr_name", "memo" };
		}

		String keyword = ControllerHelper.getGridQueryKeyword(request);

		StringBuffer sb = new StringBuffer("(");
		if(fields == null || fields.length == 0 || StringUtils.isBlank(keyword))
			return "";
		if(clazz == null) {
			// 不进行field校验，直接拼装
			// 根据fieldsType判断参数类型
			String[] fieldsType = ControllerHelper.getGridQueryFieldsType(request);
			// 字段类型全部使用string类型
			for(int i = 0; i < fields.length; i++) {
				if(i > 0)
					sb.append(" or ");
				// if(StringUtils.isNotBlank(prefix)) {
				// sb.append(prefix + ".");
				// }
				sb.append(fields[i]);
				if("int".equalsIgnoreCase(fieldsType[i]) || "float".equalsIgnoreCase(fieldsType[i])) {
					// 数字型
					sb.append("=");
					sb.append(keyword);
				} else {
					sb.append(" like '%"); // 加入完全模糊查询
					sb.append(keyword);
					sb.append("%'");
				}
			}
		} else {
			for(int i = 0; i < fields.length; i++) {
				// 处理xtsOrg.orgName的情况
				Field field;
				if(fields[i].indexOf(".") > 0) {
					String temp = fields[i].substring(0, fields[i].indexOf("."));
					Field nestedField = ReflectionUtils.findField(clazz, temp);
					String f = fields[i].substring(fields[i].indexOf(".") + 1, fields[i].length());
					field = ReflectionUtils.findField(nestedField.getType(), f);
				} else
					field = ReflectionUtils.findField(clazz, fields[i]);
				if(field == null)
					continue;
				if(Number.class.isAssignableFrom(field.getType())) { // number类型
					int value;
					try {
						value = Integer.parseInt(keyword);
					} catch(Exception e) {
						continue;
					}
					if(i > 0 && sb.length() > 1)
						sb.append(" or ");
					// if(StringUtils.isNotBlank(prefix)) {
					// sb.append(prefix + ".");
					// }
					sb.append(fields[i]);
					sb.append(" = ");
					sb.append(value);
				} else {
					if(i > 0 && sb.length() > 1)
						sb.append(" or ");
					sb.append("( ");
					String[] keywordAry = keyword.split(" "); // 如果keyword包括空格，那么作为多个查询条件
					for(int j = 0; j < keywordAry.length; j++) {
						if(StringUtils.isNotBlank(keywordAry[j])) {
							// if(StringUtils.isNotBlank(prefix)) {
							// sb.append(prefix + ".");
							// }
							sb.append(fields[i]);
							sb.append(" like '%");// 使用完全模糊匹配
							sb.append(keywordAry[j]);
							sb.append("%'");
							if(j < keywordAry.length - 1) {
								sb.append(" or ");
							}
						}
					}
					sb.append(" )");
				}
			}
		}
		sb.append(")");
		if(sb.length() <= 2) {// 没有查询条件，只有()
			return null;
		}
		return sb.toString();
	}

	public String getPkFieldCode() {
		return "pk_aaa";
	}

	public String getCodeFieldCode() {
		return "code";
	}

	public String getNameFieldCode() {
		return "name";
	}

	@SuppressWarnings("rawtypes")
	public Map<String, Object> getByCode(String code) {
		String addr_type = ServletContextHolder.getRequest().getParameter("addr_type"); // 地址类型，可能是城市/地址
		// XXX 2014-12-30 这里不能使用默认值，比如导入的时候根本不知道这个是什么类型
		// if(StringUtils.isBlank(addr_type)) {
		// addr_type = DataDictConst.ADDR_TYPE.CITY.intValue() + ""; // 默认是城市
		// }
		if(StringUtils.isBlank(addr_type)) {
			// XXX 2014-12-30 先根据城市去查询，如果查询不到，根据地址去查询
			String sql = area_sql + " and (code=? or name=?)";
			HashMap map = NWDao.getInstance().queryForObject(sql, HashMap.class, code, code);
			if(map == null || map.values().size() == 0) {
				// 再根据地址去查询
				sql = address_sql + " and (addr_code=? or addr_name=?)";
				map = NWDao.getInstance().queryForObject(sql, HashMap.class, code, code);
			}
			return this.genAjaxResponse(true, null, map);
		} else {
			if(addr_type.equals(DataDictConst.ADDR_TYPE.CITY.intValue() + "")) {
				String sql = area_sql + " and (code=? or name=?)";
				return this.genAjaxResponse(true, null,
						NWDao.getInstance().queryForObject(sql, HashMap.class, code, code));
			} else if(addr_type.equals(DataDictConst.ADDR_TYPE.ADDR.intValue() + "")) {
				String sql = address_sql + " and (addr_code=? or addr_name=?)";
				return this.genAjaxResponse(true, null,
						NWDao.getInstance().queryForObject(sql, HashMap.class, code, code));
			}
		}
		return this.genAjaxResponse(true, null, null);
	}

	@SuppressWarnings("rawtypes")
	public Map<String, Object> getByPk(String pk) {
		String addr_type = ServletContextHolder.getRequest().getParameter("addr_type"); // 地址类型，可能是城市/地址
		// if(StringUtils.isBlank(addr_type)) {
		// addr_type = DataDictConst.ADDR_TYPE.CITY.intValue() + ""; // 默认是城市
		// }
		if(StringUtils.isBlank(addr_type)) {
			// XXX 2014-12-30 先根据城市去查询，如果查询不到，根据地址去查询
			String sql = area_sql + " and pk_area=?";
			HashMap map = NWDao.getInstance().queryForObject(sql, HashMap.class, pk);
			if(map == null || map.values().size() == 0) {
				sql = address_sql + " and pk_address=?";
				map = NWDao.getInstance().queryForObject(sql, HashMap.class, pk);
			}
			return this.genAjaxResponse(true, null, map);
		} else {
			return getByPk(addr_type, pk);
		}
	}

	public Map<String, Object> getByPk(String addr_type, String pk) {
		if(addr_type.equals(DataDictConst.ADDR_TYPE.CITY.intValue() + "")) {
			String sql = area_sql + " and pk_area=?";
			return this.genAjaxResponse(true, null, NWDao.getInstance().queryForObject(sql, HashMap.class, pk));
		} else if(addr_type.equals(DataDictConst.ADDR_TYPE.ADDR.intValue() + "")) {
			String sql = address_sql + " and pk_address=?";
			return this.genAjaxResponse(true, null, NWDao.getInstance().queryForObject(sql, HashMap.class, pk));
		}
		return this.genAjaxResponse(true, null, null);
	}

}
