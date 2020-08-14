/***************************************************************\
 *     The skeleton of this class is generated by an automatic *
 * code generator for NC product. It is based on Velocity.     *
\***************************************************************/
package org.nw.vo.sys;

import org.nw.vo.pub.SuperVO;
import org.nw.vo.pub.lang.UFBoolean;
import org.nw.vo.pub.lang.UFDateTime;

/**
 */
@SuppressWarnings("serial")
public class CorpVO extends SuperVO {
	private String pk_corp;
	private String corp_name;
	private Integer corp_level;
	private UFDateTime create_time;
	private String modify_user;
	private String address;
	private Integer dr;
	private String create_user;
	private UFDateTime modify_time;
	private UFDateTime ts;
	private UFBoolean leaf_flag;
	private String shortname;
	private String fathercorp;
	private String corp_code;
	private String url;
	private String zipcode;
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

	public static final String PK_CORP = "pk_corp";
	public static final String CORP_NAME = "corp_name";
	public static final String LEVEL = "level";
	public static final String CREATE_TIME = "create_time";
	public static final String MODIFY_USER = "modify_user";
	public static final String ADDRESS = "address";
	public static final String CREATE_USER = "create_user";
	public static final String MODIFY_TIME = "modify_time";
	public static final String LEAF_FLAG = "leaf_flag";
	public static final String SHORTNAME = "shortname";
	public static final String FATHERCORP = "fathercorp";
	public static final String CORP_CODE = "corp_code";
	public static final String URL = "url";
	public static final String ZIPCODE = "zipcode";

	/**
	 * ����pk_corp��Getter����. ��������:2012-06-16 23:17:43
	 * 
	 * @return String
	 */
	public String getPk_corp() {
		return pk_corp;
	}

	/**
	 * ����pk_corp��Setter����. ��������:2012-06-16 23:17:43
	 * 
	 * @param newPk_corp
	 *            String
	 */
	public void setPk_corp(String newPk_corp) {
		this.pk_corp = newPk_corp;
	}

	/**
	 * ����corp_name��Getter����. ��������:2012-06-16 23:17:43
	 * 
	 * @return String
	 */
	public String getCorp_name() {
		return corp_name;
	}

	/**
	 * ����corp_name��Setter����. ��������:2012-06-16 23:17:43
	 * 
	 * @param newCorp_name
	 *            String
	 */
	public void setCorp_name(String newCorp_name) {
		this.corp_name = newCorp_name;
	}

	/**
	 * ����level��Getter����. ��������:2012-06-16 23:17:43
	 * 
	 * @return Integer
	 */

	/**
	 * ����modify_user��Getter����. ��������:2012-06-16 23:17:43
	 * 
	 * @return String
	 */
	public String getModify_user() {
		return modify_user;
	}

	public Integer getCorp_level() {
		return corp_level;
	}

	public void setCorp_level(Integer corp_level) {
		this.corp_level = corp_level;
	}

	/**
	 * ����modify_user��Setter����. ��������:2012-06-16 23:17:43
	 * 
	 * @param newModify_user
	 *            String
	 */
	public void setModify_user(String newModify_user) {
		this.modify_user = newModify_user;
	}

	/**
	 * ����address��Getter����. ��������:2012-06-16 23:17:43
	 * 
	 * @return String
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * ����address��Setter����. ��������:2012-06-16 23:17:43
	 * 
	 * @param newAddress
	 *            String
	 */
	public void setAddress(String newAddress) {
		this.address = newAddress;
	}

	/**
	 * ����dr��Getter����. ��������:2012-06-16 23:17:43
	 * 
	 * @return Integer
	 */
	public Integer getDr() {
		return dr;
	}

	/**
	 * ����dr��Setter����. ��������:2012-06-16 23:17:43
	 * 
	 * @param newDr
	 *            Integer
	 */
	public void setDr(Integer newDr) {
		this.dr = newDr;
	}

	/**
	 * ����create_user��Getter����. ��������:2012-06-16 23:17:43
	 * 
	 * @return String
	 */
	public String getCreate_user() {
		return create_user;
	}

	/**
	 * ����create_user��Setter����. ��������:2012-06-16 23:17:43
	 * 
	 * @param newCreate_user
	 *            String
	 */
	public void setCreate_user(String newCreate_user) {
		this.create_user = newCreate_user;
	}

	public UFDateTime getCreate_time() {
		return create_time;
	}

	public void setCreate_time(UFDateTime create_time) {
		this.create_time = create_time;
	}

	public UFDateTime getModify_time() {
		return modify_time;
	}

	public void setModify_time(UFDateTime modify_time) {
		this.modify_time = modify_time;
	}

	/**
	 * ����ts��Getter����. ��������:2012-06-16 23:17:43
	 * 
	 * @return UFDateTime
	 */
	public UFDateTime getTs() {
		return ts;
	}

	/**
	 * ����ts��Setter����. ��������:2012-06-16 23:17:43
	 * 
	 * @param newTs
	 *            UFDateTime
	 */
	public void setTs(UFDateTime newTs) {
		this.ts = newTs;
	}

	/**
	 * ����leaf_flag��Getter����. ��������:2012-06-16 23:17:43
	 * 
	 * @return UFBoolean
	 */
	public UFBoolean getLeaf_flag() {
		return leaf_flag;
	}

	/**
	 * ����leaf_flag��Setter����. ��������:2012-06-16 23:17:43
	 * 
	 * @param newLeaf_flag
	 *            UFBoolean
	 */
	public void setLeaf_flag(UFBoolean newLeaf_flag) {
		this.leaf_flag = newLeaf_flag;
	}

	/**
	 * ����shortname��Getter����. ��������:2012-06-16 23:17:43
	 * 
	 * @return String
	 */
	public String getShortname() {
		return shortname;
	}

	/**
	 * ����shortname��Setter����. ��������:2012-06-16 23:17:43
	 * 
	 * @param newShortname
	 *            String
	 */
	public void setShortname(String newShortname) {
		this.shortname = newShortname;
	}

	/**
	 * ����fathercorp��Getter����. ��������:2012-06-16 23:17:43
	 * 
	 * @return String
	 */
	public String getFathercorp() {
		return fathercorp;
	}

	/**
	 * ����fathercorp��Setter����. ��������:2012-06-16 23:17:43
	 * 
	 * @param newFathercorp
	 *            String
	 */
	public void setFathercorp(String newFathercorp) {
		this.fathercorp = newFathercorp;
	}

	/**
	 * ����corp_code��Getter����. ��������:2012-06-16 23:17:43
	 * 
	 * @return String
	 */
	public String getCorp_code() {
		return corp_code;
	}

	/**
	 * ����corp_code��Setter����. ��������:2012-06-16 23:17:43
	 * 
	 * @param newCorp_code
	 *            String
	 */
	public void setCorp_code(String newCorp_code) {
		this.corp_code = newCorp_code;
	}

	/**
	 * ����url��Getter����. ��������:2012-06-16 23:17:43
	 * 
	 * @return String
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * ����url��Setter����. ��������:2012-06-16 23:17:43
	 * 
	 * @param newUrl
	 *            String
	 */
	public void setUrl(String newUrl) {
		this.url = newUrl;
	}

	/**
	 * ����zipcode��Getter����. ��������:2012-06-16 23:17:43
	 * 
	 * @return String
	 */
	public String getZipcode() {
		return zipcode;
	}

	/**
	 * ����zipcode��Setter����. ��������:2012-06-16 23:17:43
	 * 
	 * @param newZipcode
	 *            String
	 */
	public void setZipcode(String newZipcode) {
		this.zipcode = newZipcode;
	}

	/**
	 * <p>
	 * ȡ�ø�VO�����ֶ�.
	 * <p>
	 * ��������:2012-06-16 23:17:43
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
	 * ��������:2012-06-16 23:17:43
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getPKFieldName() {
		return "pk_corp";
	}

	/**
	 * <p>
	 * ���ر����.
	 * <p>
	 * ��������:2012-06-16 23:17:43
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getTableName() {
		return "nw_corp";
	}

	/**
	 * ����Ĭ�Ϸ�ʽ����������.
	 * 
	 * ��������:2012-06-16 23:17:43
	 */
	public CorpVO() {
		super();
	}
}
