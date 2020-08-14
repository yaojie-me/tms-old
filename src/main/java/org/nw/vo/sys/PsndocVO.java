/***************************************************************\
 *     The skeleton of this class is generated by an automatic *
 * code generator for NC product. It is based on Velocity.     *
\***************************************************************/
package org.nw.vo.sys;

import org.nw.vo.pub.SuperVO;
import org.nw.vo.pub.lang.UFBoolean;
import org.nw.vo.pub.lang.UFDate;
import org.nw.vo.pub.lang.UFDateTime;

/**
 */
@SuppressWarnings("serial")
public class PsndocVO extends SuperVO {
	private String pk_corp;
	private UFDateTime create_time;
	private String pk_psndoc;
	private String mobile;
	private Integer dr;
	private String addr;
	private UFDate lic_time;
	private String job_num;
	private String birthdate;
	private String id;
	private String psncode;
	private Integer sex;
	private UFDateTime ts;
	private String degree;
	private String photo;
	private UFDate leave_time;
	private String homephone;
	private String post;
	private UFDate lic_approve_time;
	private UFBoolean locked_flag;
	private String officephone;
	private String pk_dept;
	private String relationship;
	private String create_user;
	private UFDate join_time;
	private Integer marriage;
	private Integer work_status;
	private String psnname;
	private String hometown;
	private String email;
	private String lic_type;
	private String driver_lic;
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
	private UFDateTime modify_time;
	private String modify_user;

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
	public static final String CREATE_TIME = "create_time";
	public static final String PK_PSNDOC = "pk_psndoc";
	public static final String MOBILE = "mobile";
	public static final String ADDR = "addr";
	public static final String LIC_TIME = "lic_time";
	public static final String JOB_NUM = "job_num";
	public static final String BIRTHDATE = "birthdate";
	public static final String ID = "id";
	public static final String PSNCODE = "psncode";
	public static final String SEX = "sex";
	public static final String DEGREE = "degree";
	public static final String PHOTO = "photo";
	public static final String LEAVE_TIME = "leave_time";
	public static final String HOMEPHONE = "homephone";
	public static final String POST = "post";
	public static final String LIC_APPROVE_TIME = "lic_approve_time";
	public static final String LOCKED_FLAG = "locked_flag";
	public static final String OFFICEPHONE = "officephone";
	public static final String PK_DEPT = "pk_dept";
	public static final String RELATIONSHIP = "relationship";
	public static final String CREATE_USER = "create_user";
	public static final String JOIN_TIME = "join_time";
	public static final String MARRIAGE = "marriage";
	public static final String WORK_STATUS = "work_status";
	public static final String PSNNAME = "psnname";
	public static final String HOMETOWN = "hometown";
	public static final String EMAIL = "email";
	public static final String LIC_TYPE = "lic_type";
	public static final String DRIVER_LIC = "driver_lic";
	public static final String ZIPCODE = "zipcode";

	public UFDate getLic_time() {
		return lic_time;
	}

	public void setLic_time(UFDate lic_time) {
		this.lic_time = lic_time;
	}

	public UFDate getLeave_time() {
		return leave_time;
	}

	public void setLeave_time(UFDate leave_time) {
		this.leave_time = leave_time;
	}

	public UFDate getLic_approve_time() {
		return lic_approve_time;
	}

	public void setLic_approve_time(UFDate lic_approve_time) {
		this.lic_approve_time = lic_approve_time;
	}

	public UFDate getJoin_time() {
		return join_time;
	}

	public void setJoin_time(UFDate join_time) {
		this.join_time = join_time;
	}

	/**
	 * ����pk_corp��Getter����. ��������:2012-06-16 23:18:17
	 * 
	 * @return String
	 */
	public String getPk_corp() {
		return pk_corp;
	}

	/**
	 * ����pk_corp��Setter����. ��������:2012-06-16 23:18:17
	 * 
	 * @param newPk_corp
	 *            String
	 */
	public void setPk_corp(String newPk_corp) {
		this.pk_corp = newPk_corp;
	}

	public UFDateTime getCreate_time() {
		return create_time;
	}

	public void setCreate_time(UFDateTime create_time) {
		this.create_time = create_time;
	}

	/**
	 * ����pk_psndoc��Getter����. ��������:2012-06-16 23:18:17
	 * 
	 * @return String
	 */
	public String getPk_psndoc() {
		return pk_psndoc;
	}

	/**
	 * ����pk_psndoc��Setter����. ��������:2012-06-16 23:18:17
	 * 
	 * @param newPk_psndoc
	 *            String
	 */
	public void setPk_psndoc(String newPk_psndoc) {
		this.pk_psndoc = newPk_psndoc;
	}

	/**
	 * ����mobile��Getter����. ��������:2012-06-16 23:18:17
	 * 
	 * @return String
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * ����mobile��Setter����. ��������:2012-06-16 23:18:17
	 * 
	 * @param newMobile
	 *            String
	 */
	public void setMobile(String newMobile) {
		this.mobile = newMobile;
	}

	/**
	 * ����dr��Getter����. ��������:2012-06-16 23:18:17
	 * 
	 * @return Integer
	 */
	public Integer getDr() {
		return dr;
	}

	/**
	 * ����dr��Setter����. ��������:2012-06-16 23:18:17
	 * 
	 * @param newDr
	 *            Integer
	 */
	public void setDr(Integer newDr) {
		this.dr = newDr;
	}

	/**
	 * ����addr��Getter����. ��������:2012-06-16 23:18:17
	 * 
	 * @return String
	 */
	public String getAddr() {
		return addr;
	}

	/**
	 * ����addr��Setter����. ��������:2012-06-16 23:18:17
	 * 
	 * @param newAddr
	 *            String
	 */
	public void setAddr(String newAddr) {
		this.addr = newAddr;
	}

	/**
	 * ����job_num��Getter����. ��������:2012-06-16 23:18:17
	 * 
	 * @return String
	 */
	public String getJob_num() {
		return job_num;
	}

	/**
	 * ����job_num��Setter����. ��������:2012-06-16 23:18:17
	 * 
	 * @param newJob_num
	 *            String
	 */
	public void setJob_num(String newJob_num) {
		this.job_num = newJob_num;
	}

	/**
	 * ����birthdate��Getter����. ��������:2012-06-16 23:18:17
	 * 
	 * @return String
	 */
	public String getBirthdate() {
		return birthdate;
	}

	/**
	 * ����birthdate��Setter����. ��������:2012-06-16 23:18:17
	 * 
	 * @param newBirthdate
	 *            String
	 */
	public void setBirthdate(String newBirthdate) {
		this.birthdate = newBirthdate;
	}

	/**
	 * ����id��Getter����. ��������:2012-06-16 23:18:17
	 * 
	 * @return String
	 */
	public String getId() {
		return id;
	}

	/**
	 * ����id��Setter����. ��������:2012-06-16 23:18:17
	 * 
	 * @param newId
	 *            String
	 */
	public void setId(String newId) {
		this.id = newId;
	}

	/**
	 * ����psncode��Getter����. ��������:2012-06-16 23:18:17
	 * 
	 * @return String
	 */
	public String getPsncode() {
		return psncode;
	}

	/**
	 * ����psncode��Setter����. ��������:2012-06-16 23:18:17
	 * 
	 * @param newPsncode
	 *            String
	 */
	public void setPsncode(String newPsncode) {
		this.psncode = newPsncode;
	}

	/**
	 * ����ts��Getter����. ��������:2012-06-16 23:18:17
	 * 
	 * @return UFDateTime
	 */
	public UFDateTime getTs() {
		return ts;
	}

	/**
	 * ����ts��Setter����. ��������:2012-06-16 23:18:17
	 * 
	 * @param newTs
	 *            UFDateTime
	 */
	public void setTs(UFDateTime newTs) {
		this.ts = newTs;
	}

	/**
	 * ����degree��Getter����. ��������:2012-06-16 23:18:17
	 * 
	 * @return String
	 */
	public String getDegree() {
		return degree;
	}

	/**
	 * ����degree��Setter����. ��������:2012-06-16 23:18:17
	 * 
	 * @param newDegree
	 *            String
	 */
	public void setDegree(String newDegree) {
		this.degree = newDegree;
	}

	/**
	 * ����photo��Getter����. ��������:2012-06-16 23:18:17
	 * 
	 * @return String
	 */
	public String getPhoto() {
		return photo;
	}

	/**
	 * ����photo��Setter����. ��������:2012-06-16 23:18:17
	 * 
	 * @param newPhoto
	 *            String
	 */
	public void setPhoto(String newPhoto) {
		this.photo = newPhoto;
	}

	/**
	 * ����homephone��Getter����. ��������:2012-06-16 23:18:17
	 * 
	 * @return String
	 */
	public String getHomephone() {
		return homephone;
	}

	/**
	 * ����homephone��Setter����. ��������:2012-06-16 23:18:17
	 * 
	 * @param newHomephone
	 *            String
	 */
	public void setHomephone(String newHomephone) {
		this.homephone = newHomephone;
	}

	/**
	 * ����post��Getter����. ��������:2012-06-16 23:18:17
	 * 
	 * @return String
	 */
	public String getPost() {
		return post;
	}

	/**
	 * ����post��Setter����. ��������:2012-06-16 23:18:17
	 * 
	 * @param newPost
	 *            String
	 */
	public void setPost(String newPost) {
		this.post = newPost;
	}

	/**
	 * ����locked_flag��Getter����. ��������:2012-06-16 23:18:17
	 * 
	 * @return UFBoolean
	 */
	public UFBoolean getLocked_flag() {
		return locked_flag;
	}

	/**
	 * ����locked_flag��Setter����. ��������:2012-06-16 23:18:17
	 * 
	 * @param newLocked_flag
	 *            UFBoolean
	 */
	public void setLocked_flag(UFBoolean newLocked_flag) {
		this.locked_flag = newLocked_flag;
	}

	/**
	 * ����officephone��Getter����. ��������:2012-06-16 23:18:17
	 * 
	 * @return String
	 */
	public String getOfficephone() {
		return officephone;
	}

	/**
	 * ����officephone��Setter����. ��������:2012-06-16 23:18:17
	 * 
	 * @param newOfficephone
	 *            String
	 */
	public void setOfficephone(String newOfficephone) {
		this.officephone = newOfficephone;
	}

	/**
	 * ����pk_dept��Getter����. ��������:2012-06-16 23:18:17
	 * 
	 * @return String
	 */
	public String getPk_dept() {
		return pk_dept;
	}

	/**
	 * ����pk_dept��Setter����. ��������:2012-06-16 23:18:17
	 * 
	 * @param newPk_dept
	 *            String
	 */
	public void setPk_dept(String newPk_dept) {
		this.pk_dept = newPk_dept;
	}

	/**
	 * ����relationship��Getter����. ��������:2012-06-16 23:18:17
	 * 
	 * @return String
	 */
	public String getRelationship() {
		return relationship;
	}

	/**
	 * ����relationship��Setter����. ��������:2012-06-16 23:18:17
	 * 
	 * @param newRelationship
	 *            String
	 */
	public void setRelationship(String newRelationship) {
		this.relationship = newRelationship;
	}

	/**
	 * ����create_user��Getter����. ��������:2012-06-16 23:18:17
	 * 
	 * @return String
	 */
	public String getCreate_user() {
		return create_user;
	}

	/**
	 * ����create_user��Setter����. ��������:2012-06-16 23:18:17
	 * 
	 * @param newCreate_user
	 *            String
	 */
	public void setCreate_user(String newCreate_user) {
		this.create_user = newCreate_user;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public Integer getMarriage() {
		return marriage;
	}

	public void setMarriage(Integer marriage) {
		this.marriage = marriage;
	}

	/**
	 * ����work_status��Getter����. ��������:2012-06-16 23:18:17
	 * 
	 * @return Integer
	 */
	public Integer getWork_status() {
		return work_status;
	}

	/**
	 * ����work_status��Setter����. ��������:2012-06-16 23:18:17
	 * 
	 * @param newWork_status
	 *            Integer
	 */
	public void setWork_status(Integer newWork_status) {
		this.work_status = newWork_status;
	}

	/**
	 * ����psnname��Getter����. ��������:2012-06-16 23:18:17
	 * 
	 * @return String
	 */
	public String getPsnname() {
		return psnname;
	}

	/**
	 * ����psnname��Setter����. ��������:2012-06-16 23:18:17
	 * 
	 * @param newPsnname
	 *            String
	 */
	public void setPsnname(String newPsnname) {
		this.psnname = newPsnname;
	}

	/**
	 * ����hometown��Getter����. ��������:2012-06-16 23:18:17
	 * 
	 * @return String
	 */
	public String getHometown() {
		return hometown;
	}

	/**
	 * ����hometown��Setter����. ��������:2012-06-16 23:18:17
	 * 
	 * @param newHometown
	 *            String
	 */
	public void setHometown(String newHometown) {
		this.hometown = newHometown;
	}

	/**
	 * ����email��Getter����. ��������:2012-06-16 23:18:17
	 * 
	 * @return String
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * ����email��Setter����. ��������:2012-06-16 23:18:17
	 * 
	 * @param newEmail
	 *            String
	 */
	public void setEmail(String newEmail) {
		this.email = newEmail;
	}

	public String getLic_type() {
		return lic_type;
	}

	public void setLic_type(String lic_type) {
		this.lic_type = lic_type;
	}

	/**
	 * ����driver_lic��Getter����. ��������:2012-06-16 23:18:17
	 * 
	 * @return String
	 */
	public String getDriver_lic() {
		return driver_lic;
	}

	/**
	 * ����driver_lic��Setter����. ��������:2012-06-16 23:18:17
	 * 
	 * @param newDriver_lic
	 *            String
	 */
	public void setDriver_lic(String newDriver_lic) {
		this.driver_lic = newDriver_lic;
	}

	/**
	 * ����zipcode��Getter����. ��������:2012-06-16 23:18:17
	 * 
	 * @return String
	 */
	public String getZipcode() {
		return zipcode;
	}

	/**
	 * ����zipcode��Setter����. ��������:2012-06-16 23:18:17
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
	 * ��������:2012-06-16 23:18:17
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
	 * ��������:2012-06-16 23:18:17
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getPKFieldName() {
		return "pk_psndoc";
	}

	/**
	 * <p>
	 * ���ر����.
	 * <p>
	 * ��������:2012-06-16 23:18:17
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getTableName() {
		return "nw_psndoc";
	}

	/**
	 * ����Ĭ�Ϸ�ʽ����������.
	 * 
	 * ��������:2012-06-16 23:18:17
	 */
	public PsndocVO() {
		super();
	}
}