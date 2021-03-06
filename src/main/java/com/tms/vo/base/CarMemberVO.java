/***************************************************************\
 *     The skeleton of this class is generated by an automatic *
 * code generator for NC product. It is based on Velocity.     *
\***************************************************************/
package com.tms.vo.base;

import org.nw.vo.pub.SuperVO;
import org.nw.vo.pub.lang.UFDateTime;
import org.nw.vo.pub.lang.UFDouble;

/**
 */
@SuppressWarnings("serial")
public class CarMemberVO extends SuperVO {
	private String code;
	private String memo;
	private String contact;
	private String pk_car_member;
	private String pk_car;
	private UFDateTime ts;
	private Integer dr;
	private String pk_psndoc;
	private String post;
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
	public static final String CONTACT = "contact";
	public static final String PK_CAR_MEMBER = "pk_car_member";
	public static final String PK_CAR = "pk_car";
	public static final String PK_PSNDOC = "pk_psndoc";
	public static final String POST = "post";

	/**
	 * ����code��Getter����. ��������:2012-07-22 22:43:55
	 * 
	 * @return String
	 */
	public String getCode() {
		return code;
	}

	/**
	 * ����code��Setter����. ��������:2012-07-22 22:43:55
	 * 
	 * @param newCode
	 *            String
	 */
	public void setCode(String newCode) {
		this.code = newCode;
	}

	/**
	 * ����memo��Getter����. ��������:2012-07-22 22:43:55
	 * 
	 * @return String
	 */
	public String getMemo() {
		return memo;
	}

	/**
	 * ����memo��Setter����. ��������:2012-07-22 22:43:55
	 * 
	 * @param newMemo
	 *            String
	 */
	public void setMemo(String newMemo) {
		this.memo = newMemo;
	}

	/**
	 * ����contact��Getter����. ��������:2012-07-22 22:43:55
	 * 
	 * @return String
	 */
	public String getContact() {
		return contact;
	}

	/**
	 * ����contact��Setter����. ��������:2012-07-22 22:43:55
	 * 
	 * @param newContact
	 *            String
	 */
	public void setContact(String newContact) {
		this.contact = newContact;
	}

	/**
	 * ����pk_car_member��Getter����. ��������:2012-07-22 22:43:55
	 * 
	 * @return String
	 */
	public String getPk_car_member() {
		return pk_car_member;
	}

	/**
	 * ����pk_car_member��Setter����. ��������:2012-07-22 22:43:55
	 * 
	 * @param newPk_car_member
	 *            String
	 */
	public void setPk_car_member(String newPk_car_member) {
		this.pk_car_member = newPk_car_member;
	}

	/**
	 * ����pk_car��Getter����. ��������:2012-07-22 22:43:55
	 * 
	 * @return String
	 */
	public String getPk_car() {
		return pk_car;
	}

	/**
	 * ����pk_car��Setter����. ��������:2012-07-22 22:43:55
	 * 
	 * @param newPk_car
	 *            String
	 */
	public void setPk_car(String newPk_car) {
		this.pk_car = newPk_car;
	}

	/**
	 * ����ts��Getter����. ��������:2012-07-22 22:43:55
	 * 
	 * @return UFDateTime
	 */
	public UFDateTime getTs() {
		return ts;
	}

	/**
	 * ����ts��Setter����. ��������:2012-07-22 22:43:55
	 * 
	 * @param newTs
	 *            UFDateTime
	 */
	public void setTs(UFDateTime newTs) {
		this.ts = newTs;
	}

	/**
	 * ����dr��Getter����. ��������:2012-07-22 22:43:55
	 * 
	 * @return Integer
	 */
	public Integer getDr() {
		return dr;
	}

	/**
	 * ����dr��Setter����. ��������:2012-07-22 22:43:55
	 * 
	 * @param newDr
	 *            Integer
	 */
	public void setDr(Integer newDr) {
		this.dr = newDr;
	}

	public String getPk_psndoc() {
		return pk_psndoc;
	}

	public void setPk_psndoc(String pk_psndoc) {
		this.pk_psndoc = pk_psndoc;
	}

	/**
	 * ����post��Getter����. ��������:2012-07-22 22:43:55
	 * 
	 * @return String
	 */
	public String getPost() {
		return post;
	}

	/**
	 * ����post��Setter����. ��������:2012-07-22 22:43:55
	 * 
	 * @param newPost
	 *            String
	 */
	public void setPost(String newPost) {
		this.post = newPost;
	}

	/**
	 * <p>
	 * ȡ�ø�VO�����ֶ�.
	 * <p>
	 * ��������:2012-07-22 22:43:55
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getParentPKFieldName() {
		return "pk_car";
	}

	/**
	 * <p>
	 * ȡ�ñ�����.
	 * <p>
	 * ��������:2012-07-22 22:43:55
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getPKFieldName() {
		return "pk_car_member";
	}

	/**
	 * <p>
	 * ���ر����.
	 * <p>
	 * ��������:2012-07-22 22:43:55
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getTableName() {
		return "ts_car_member";
	}

	/**
	 * ����Ĭ�Ϸ�ʽ����������.
	 * 
	 * ��������:2012-07-22 22:43:55
	 */
	public CarMemberVO() {
		super();
	}
}
