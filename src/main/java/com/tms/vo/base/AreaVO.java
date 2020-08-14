/***************************************************************\
 *     The skeleton of this class is generated by an automatic *
 * code generator for NC product. It is based on Velocity.     *
\***************************************************************/
package com.tms.vo.base;

import org.nw.vo.pub.SuperVO;
import org.nw.vo.pub.lang.UFBoolean;
import org.nw.vo.pub.lang.UFDateTime;
import org.nw.vo.pub.lang.UFDouble;

/**
 */
@SuppressWarnings("serial")
public class AreaVO extends SuperVO {
	private String code;
	private String memo;
	private String pk_area;
	private UFDateTime ts;
	private Integer dr;
	private String name;
	private String parent_id;
	private Integer area_level;
	private UFBoolean locked_flag;
	private Integer display_order;
	private String pk_corp;
	private String def10;
	private String def2;
	private String def1;
	private String def4;
	private String def3;
	private String def9;
	private String def5;
	private String def6;
	private String def7;
	private String def8;
	private UFDouble def11;
	private UFDouble def12;
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

	public UFDouble getDef11() {
		return def11;
	}

	public void setDef11(UFDouble def11) {
		this.def11 = def11;
	}

	public UFDouble getDef12() {
		return def12;
	}

	public void setDef12(UFDouble def12) {
		this.def12 = def12;
	}

	public String getDef10() {
		return def10;
	}

	public void setDef10(String def10) {
		this.def10 = def10;
	}

	public String getDef2() {
		return def2;
	}

	public void setDef2(String def2) {
		this.def2 = def2;
	}

	public String getDef1() {
		return def1;
	}

	public void setDef1(String def1) {
		this.def1 = def1;
	}

	public String getDef4() {
		return def4;
	}

	public void setDef4(String def4) {
		this.def4 = def4;
	}

	public String getDef3() {
		return def3;
	}

	public void setDef3(String def3) {
		this.def3 = def3;
	}

	public String getDef9() {
		return def9;
	}

	public void setDef9(String def9) {
		this.def9 = def9;
	}

	public String getDef5() {
		return def5;
	}

	public void setDef5(String def5) {
		this.def5 = def5;
	}

	public String getDef6() {
		return def6;
	}

	public void setDef6(String def6) {
		this.def6 = def6;
	}

	public String getDef7() {
		return def7;
	}

	public void setDef7(String def7) {
		this.def7 = def7;
	}

	public String getDef8() {
		return def8;
	}

	public void setDef8(String def8) {
		this.def8 = def8;
	}

	public static final String CODE = "code";
	public static final String MEMO = "memo";
	public static final String PK_AREA = "pk_area";
	public static final String PK_CITY = "pk_city";
	public static final String NAME = "name";
	public static final String PARENT_ID = "parent_id";
	public static final String LEVEL = "level";
	public static final String LOCKED_FLAG = "locked_flag";
	public static final String DISPLAY_ORDER = "display_order";
	public static final String PK_CORP = "pk_corp";

	public Integer getDisplay_order() {
		return display_order;
	}

	public void setDisplay_order(Integer display_order) {
		this.display_order = display_order;
	}

	public String getParent_id() {
		return parent_id;
	}

	public void setParent_id(String parent_id) {
		this.parent_id = parent_id;
	}

	public Integer getArea_level() {
		return area_level;
	}

	public void setArea_level(Integer area_level) {
		this.area_level = area_level;
	}

	public UFBoolean getLocked_flag() {
		return locked_flag;
	}

	public void setLocked_flag(UFBoolean locked_flag) {
		this.locked_flag = locked_flag;
	}

	public String getPk_corp() {
		return pk_corp;
	}

	public void setPk_corp(String pk_corp) {
		this.pk_corp = pk_corp;
	}

	/**
	 * ����code��Getter����. ��������:2012-07-10 16:09:56
	 * 
	 * @return String
	 */
	public String getCode() {
		return code;
	}

	/**
	 * ����code��Setter����. ��������:2012-07-10 16:09:56
	 * 
	 * @param newCode
	 *            String
	 */
	public void setCode(String newCode) {
		this.code = newCode;
	}

	/**
	 * ����memo��Getter����. ��������:2012-07-10 16:09:56
	 * 
	 * @return String
	 */
	public String getMemo() {
		return memo;
	}

	/**
	 * ����memo��Setter����. ��������:2012-07-10 16:09:56
	 * 
	 * @param newMemo
	 *            String
	 */
	public void setMemo(String newMemo) {
		this.memo = newMemo;
	}

	/**
	 * ����pk_area��Getter����. ��������:2012-07-10 16:09:56
	 * 
	 * @return String
	 */
	public String getPk_area() {
		return pk_area;
	}

	/**
	 * ����pk_area��Setter����. ��������:2012-07-10 16:09:56
	 * 
	 * @param newPk_area
	 *            String
	 */
	public void setPk_area(String newPk_area) {
		this.pk_area = newPk_area;
	}

	/**
	 * ����ts��Getter����. ��������:2012-07-10 16:09:56
	 * 
	 * @return UFDateTime
	 */
	public UFDateTime getTs() {
		return ts;
	}

	/**
	 * ����ts��Setter����. ��������:2012-07-10 16:09:56
	 * 
	 * @param newTs
	 *            UFDateTime
	 */
	public void setTs(UFDateTime newTs) {
		this.ts = newTs;
	}

	/**
	 * ����dr��Getter����. ��������:2012-07-10 16:09:56
	 * 
	 * @return Integer
	 */
	public Integer getDr() {
		return dr;
	}

	/**
	 * ����dr��Setter����. ��������:2012-07-10 16:09:56
	 * 
	 * @param newDr
	 *            Integer
	 */
	public void setDr(Integer newDr) {
		this.dr = newDr;
	}

	/**
	 * ����name��Getter����. ��������:2012-07-10 16:09:56
	 * 
	 * @return String
	 */
	public String getName() {
		return name;
	}

	/**
	 * ����name��Setter����. ��������:2012-07-10 16:09:56
	 * 
	 * @param newName
	 *            String
	 */
	public void setName(String newName) {
		this.name = newName;
	}

	/**
	 * <p>
	 * ȡ�ø�VO�����ֶ�.
	 * <p>
	 * ��������:2012-07-10 16:09:56
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getParentPKFieldName() {
		return null;
	}

	/**
	 * <p>
	 * ȡ�ñ�����.
	 * <p>
	 * ��������:2012-07-10 16:09:56
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getPKFieldName() {
		return "pk_area";
	}

	/**
	 * <p>
	 * ���ر����.
	 * <p>
	 * ��������:2012-07-10 16:09:56
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getTableName() {
		return "ts_area";
	}

	/**
	 * ����Ĭ�Ϸ�ʽ����������.
	 * 
	 * ��������:2012-07-10 16:09:56
	 */
	public AreaVO() {
		super();
	}
}