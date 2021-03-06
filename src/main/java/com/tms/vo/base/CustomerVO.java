/***************************************************************\
 *     The skeleton of this class is generated by an automatic *
 * code generator for NC product. It is based on Velocity.     *
\***************************************************************/
package com.tms.vo.base;

import org.nw.vo.pub.SuperVO;
import org.nw.vo.pub.lang.UFBoolean;
import org.nw.vo.pub.lang.UFDate;
import org.nw.vo.pub.lang.UFDateTime;
import org.nw.vo.pub.lang.UFDouble;

/**
 * <b> �ڴ˴���Ҫ��������Ĺ��� </b>
 * <p>
 * �ڴ˴���Ӵ����������Ϣ
 * </p>
 * ��������:2012-07-17 23:18:30
 * 
 * @author Administrator
 * @version NCPrj 1.0
 */
@SuppressWarnings("serial")
public class CustomerVO extends SuperVO {
	private String pk_corp;
	private String billing_corp;
	private String phone;
	private String pk_psndoc;
	private String psncontact;
	private String mobile;
	private String tax_identify;
	private String cust_code;
	private Integer account_period;
	private String address;
	private Integer dr;
	private String pk_customer;
	private UFDouble discount_rate;
	private String fax;
	private String billing_payable;
	private Integer acc_period_ahead;
	private UFDate billing_date;
	private UFDateTime ts;
	private String balatype;
	private String memo;
	private String contact_post;
	private UFDouble register_capital;
	private UFDouble credit_amount;
	private UFBoolean locked_flag;
	private String bank_account;
	private Integer cust_type;
	private String register_addr;
	private String pk_billing_type;
	private String account_name;
	private String pk_city;
	private String pk_dept;
	private String bank;
	private String legal_represent;
	private String contact;
	private String pk_area;
	private String pk_province;
	private String email;
	private String cust_name;
	private String website;
	private String zipcode;
	private Integer billing_ahead;
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
	private Integer billing_rule;
	private String branch_company;
	private String photo;
	
	
	public String getBilling_corp() {
		return billing_corp;
	}

	public void setBilling_corp(String billing_corp) {
		this.billing_corp = billing_corp;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getBranch_company() {
		return branch_company;
	}

	public void setBranch_company(String branch_company) {
		this.branch_company = branch_company;
	}

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

	public static final String PK_CORP = "pk_corp";
	public static final String PHONE = "phone";
	public static final String PK_PSNDOC = "pk_psndoc";
	public static final String PSNCONTACT = "psncontact";
	public static final String MOBILE = "mobile";
	public static final String TAX_IDENTIFY = "tax_identify";
	public static final String CUST_CODE = "cust_code";
	public static final String ACCOUNT_PERIOD = "account_period";
	public static final String ADDRESS = "address";
	public static final String PK_CUSTOMER = "pk_customer";
	public static final String DISCOUNT_RATE = "discount_rate";
	public static final String FAX = "fax";
	public static final String BILLING_PAYABLE = "billing_payable";
	public static final String ACC_PERIOD_AHEAD = "acc_period_ahead";
	public static final String BILLING_DATE = "billing_date";
	public static final String BALATYPE = "balatype";
	public static final String MEMO = "memo";
	public static final String CONTACT_POST = "contact_post";
	public static final String REGISTER_CAPITAL = "register_capital";
	public static final String CREDIT_AMOUNT = "credit_amount";
	public static final String LOCKED_FLAG = "locked_flag";
	public static final String BANK_ACCOUNT = "bank_account";
	public static final String CUST_TYPE = "cust_type";
	public static final String REGISTER_ADDR = "register_addr";
	public static final String PK_BILLING_TYPE = "pk_billing_type";
	public static final String ACCOUNT_NAME = "account_name";
	public static final String PK_CITY = "pk_city";
	public static final String PK_DEPT = "pk_dept";
	public static final String BANK = "bank";
	public static final String LEGAL_REPRESENT = "legal_represent";
	public static final String CONTACT = "contact";
	public static final String PK_AREA = "pk_area";
	public static final String PK_PROVINCE = "pk_province";
	public static final String EMAIL = "email";
	public static final String CUST_NAME = "cust_name";
	public static final String WEBSITE = "website";
	public static final String ZIPCODE = "zipcode";
	public static final String BILLING_AHEAD = "billing_ahead";
	public static final String BILLING_RULE = "billing_rule";

	public Integer getBilling_rule() {
		return billing_rule;
	}

	public void setBilling_rule(Integer billing_rule) {
		this.billing_rule = billing_rule;
	}

	public String getPk_corp() {
		return pk_corp;
	}

	public void setPk_corp(String pk_corp) {
		this.pk_corp = pk_corp;
	}

	public String getPsncontact() {
		return psncontact;
	}

	public void setPsncontact(String psncontact) {
		this.psncontact = psncontact;
	}

	/**
	 * ����phone��Getter����. ��������:2012-07-17 23:18:30
	 * 
	 * @return String
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * ����phone��Setter����. ��������:2012-07-17 23:18:30
	 * 
	 * @param newPhone
	 *            String
	 */
	public void setPhone(String newPhone) {
		this.phone = newPhone;
	}

	/**
	 * ����pk_psndoc��Getter����. ��������:2012-07-17 23:18:30
	 * 
	 * @return String
	 */
	public String getPk_psndoc() {
		return pk_psndoc;
	}

	/**
	 * ����pk_psndoc��Setter����. ��������:2012-07-17 23:18:30
	 * 
	 * @param newPk_psndoc
	 *            String
	 */
	public void setPk_psndoc(String newPk_psndoc) {
		this.pk_psndoc = newPk_psndoc;
	}

	/**
	 * ����mobile��Getter����. ��������:2012-07-17 23:18:30
	 * 
	 * @return String
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * ����mobile��Setter����. ��������:2012-07-17 23:18:30
	 * 
	 * @param newMobile
	 *            String
	 */
	public void setMobile(String newMobile) {
		this.mobile = newMobile;
	}

	/**
	 * ����tax_identify��Getter����. ��������:2012-07-17 23:18:30
	 * 
	 * @return String
	 */
	public String getTax_identify() {
		return tax_identify;
	}

	/**
	 * ����tax_identify��Setter����. ��������:2012-07-17 23:18:30
	 * 
	 * @param newTax_identify
	 *            String
	 */
	public void setTax_identify(String newTax_identify) {
		this.tax_identify = newTax_identify;
	}

	/**
	 * ����cust_code��Getter����. ��������:2012-07-17 23:18:30
	 * 
	 * @return String
	 */
	public String getCust_code() {
		return cust_code;
	}

	/**
	 * ����cust_code��Setter����. ��������:2012-07-17 23:18:30
	 * 
	 * @param newCust_code
	 *            String
	 */
	public void setCust_code(String newCust_code) {
		this.cust_code = newCust_code;
	}

	/**
	 * ����account_period��Getter����. ��������:2012-07-17 23:18:30
	 * 
	 * @return Integer
	 */
	public Integer getAccount_period() {
		return account_period;
	}

	/**
	 * ����account_period��Setter����. ��������:2012-07-17 23:18:30
	 * 
	 * @param newAccount_period
	 *            Integer
	 */
	public void setAccount_period(Integer newAccount_period) {
		this.account_period = newAccount_period;
	}

	/**
	 * ����address��Getter����. ��������:2012-07-17 23:18:30
	 * 
	 * @return String
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * ����address��Setter����. ��������:2012-07-17 23:18:30
	 * 
	 * @param newAddress
	 *            String
	 */
	public void setAddress(String newAddress) {
		this.address = newAddress;
	}

	/**
	 * ����dr��Getter����. ��������:2012-07-17 23:18:30
	 * 
	 * @return Integer
	 */
	public Integer getDr() {
		return dr;
	}

	/**
	 * ����dr��Setter����. ��������:2012-07-17 23:18:30
	 * 
	 * @param newDr
	 *            Integer
	 */
	public void setDr(Integer newDr) {
		this.dr = newDr;
	}

	/**
	 * ����pk_customer��Getter����. ��������:2012-07-17 23:18:30
	 * 
	 * @return String
	 */
	public String getPk_customer() {
		return pk_customer;
	}

	/**
	 * ����pk_customer��Setter����. ��������:2012-07-17 23:18:30
	 * 
	 * @param newPk_customer
	 *            String
	 */
	public void setPk_customer(String newPk_customer) {
		this.pk_customer = newPk_customer;
	}

	/**
	 * ����discount_rate��Getter����. ��������:2012-07-17 23:18:30
	 * 
	 * @return UFDouble
	 */
	public UFDouble getDiscount_rate() {
		return discount_rate;
	}

	/**
	 * ����discount_rate��Setter����. ��������:2012-07-17 23:18:30
	 * 
	 * @param newDiscount_rate
	 *            UFDouble
	 */
	public void setDiscount_rate(UFDouble newDiscount_rate) {
		this.discount_rate = newDiscount_rate;
	}

	/**
	 * ����fax��Getter����. ��������:2012-07-17 23:18:30
	 * 
	 * @return String
	 */
	public String getFax() {
		return fax;
	}

	/**
	 * ����fax��Setter����. ��������:2012-07-17 23:18:30
	 * 
	 * @param newFax
	 *            String
	 */
	public void setFax(String newFax) {
		this.fax = newFax;
	}

	/**
	 * ����billing_payable��Getter����. ��������:2012-07-17 23:18:30
	 * 
	 * @return String
	 */
	public String getBilling_payable() {
		return billing_payable;
	}

	/**
	 * ����billing_payable��Setter����. ��������:2012-07-17 23:18:30
	 * 
	 * @param newBilling_payable
	 *            String
	 */
	public void setBilling_payable(String newBilling_payable) {
		this.billing_payable = newBilling_payable;
	}

	/**
	 * ����acc_period_ahead��Getter����. ��������:2012-07-17 23:18:30
	 * 
	 * @return Integer
	 */
	public Integer getAcc_period_ahead() {
		return acc_period_ahead;
	}

	/**
	 * ����acc_period_ahead��Setter����. ��������:2012-07-17 23:18:30
	 * 
	 * @param newAcc_period_ahead
	 *            Integer
	 */
	public void setAcc_period_ahead(Integer newAcc_period_ahead) {
		this.acc_period_ahead = newAcc_period_ahead;
	}

	/**
	 * ����billing_date��Getter����. ��������:2012-07-17 23:18:30
	 * 
	 * @return UFDate
	 */
	public UFDate getBilling_date() {
		return billing_date;
	}

	/**
	 * ����billing_date��Setter����. ��������:2012-07-17 23:18:30
	 * 
	 * @param newBilling_date
	 *            UFDate
	 */
	public void setBilling_date(UFDate newBilling_date) {
		this.billing_date = newBilling_date;
	}

	/**
	 * ����ts��Getter����. ��������:2012-07-17 23:18:30
	 * 
	 * @return UFDateTime
	 */
	public UFDateTime getTs() {
		return ts;
	}

	/**
	 * ����ts��Setter����. ��������:2012-07-17 23:18:30
	 * 
	 * @param newTs
	 *            UFDateTime
	 */
	public void setTs(UFDateTime newTs) {
		this.ts = newTs;
	}

	public String getBalatype() {
		return balatype;
	}

	public void setBalatype(String balatype) {
		this.balatype = balatype;
	}

	/**
	 * ����memo��Getter����. ��������:2012-07-17 23:18:30
	 * 
	 * @return String
	 */
	public String getMemo() {
		return memo;
	}

	/**
	 * ����memo��Setter����. ��������:2012-07-17 23:18:30
	 * 
	 * @param newMemo
	 *            String
	 */
	public void setMemo(String newMemo) {
		this.memo = newMemo;
	}

	/**
	 * ����contact_post��Getter����. ��������:2012-07-17 23:18:30
	 * 
	 * @return String
	 */
	public String getContact_post() {
		return contact_post;
	}

	/**
	 * ����contact_post��Setter����. ��������:2012-07-17 23:18:30
	 * 
	 * @param newContact_post
	 *            String
	 */
	public void setContact_post(String newContact_post) {
		this.contact_post = newContact_post;
	}

	/**
	 * ����register_capital��Getter����. ��������:2012-07-17 23:18:30
	 * 
	 * @return UFDouble
	 */
	public UFDouble getRegister_capital() {
		return register_capital;
	}

	/**
	 * ����register_capital��Setter����. ��������:2012-07-17 23:18:30
	 * 
	 * @param newRegister_capital
	 *            UFDouble
	 */
	public void setRegister_capital(UFDouble newRegister_capital) {
		this.register_capital = newRegister_capital;
	}

	/**
	 * ����credit_amount��Getter����. ��������:2012-07-17 23:18:30
	 * 
	 * @return UFDouble
	 */
	public UFDouble getCredit_amount() {
		return credit_amount;
	}

	/**
	 * ����credit_amount��Setter����. ��������:2012-07-17 23:18:30
	 * 
	 * @param newCredit_amount
	 *            UFDouble
	 */
	public void setCredit_amount(UFDouble newCredit_amount) {
		this.credit_amount = newCredit_amount;
	}

	/**
	 * ����locked_flag��Getter����. ��������:2012-07-17 23:18:30
	 * 
	 * @return UFBoolean
	 */
	public UFBoolean getLocked_flag() {
		return locked_flag;
	}

	/**
	 * ����locked_flag��Setter����. ��������:2012-07-17 23:18:30
	 * 
	 * @param newLocked_flag
	 *            UFBoolean
	 */
	public void setLocked_flag(UFBoolean newLocked_flag) {
		this.locked_flag = newLocked_flag;
	}

	/**
	 * ����bank_account��Getter����. ��������:2012-07-17 23:18:30
	 * 
	 * @return String
	 */
	public String getBank_account() {
		return bank_account;
	}

	/**
	 * ����bank_account��Setter����. ��������:2012-07-17 23:18:30
	 * 
	 * @param newBank_account
	 *            String
	 */
	public void setBank_account(String newBank_account) {
		this.bank_account = newBank_account;
	}

	/**
	 * ����cust_type��Getter����. ��������:2012-07-17 23:18:30
	 * 
	 * @return Integer
	 */
	public Integer getCust_type() {
		return cust_type;
	}

	/**
	 * ����cust_type��Setter����. ��������:2012-07-17 23:18:30
	 * 
	 * @param newCust_type
	 *            Integer
	 */
	public void setCust_type(Integer newCust_type) {
		this.cust_type = newCust_type;
	}

	/**
	 * ����register_addr��Getter����. ��������:2012-07-17 23:18:30
	 * 
	 * @return String
	 */
	public String getRegister_addr() {
		return register_addr;
	}

	/**
	 * ����register_addr��Setter����. ��������:2012-07-17 23:18:30
	 * 
	 * @param newRegister_addr
	 *            String
	 */
	public void setRegister_addr(String newRegister_addr) {
		this.register_addr = newRegister_addr;
	}

	/**
	 * ����pk_billing_type��Getter����. ��������:2012-07-17 23:18:30
	 * 
	 * @return String
	 */
	public String getPk_billing_type() {
		return pk_billing_type;
	}

	/**
	 * ����pk_billing_type��Setter����. ��������:2012-07-17 23:18:30
	 * 
	 * @param newPk_billing_type
	 *            String
	 */
	public void setPk_billing_type(String newPk_billing_type) {
		this.pk_billing_type = newPk_billing_type;
	}

	/**
	 * ����account_name��Getter����. ��������:2012-07-17 23:18:30
	 * 
	 * @return String
	 */
	public String getAccount_name() {
		return account_name;
	}

	/**
	 * ����account_name��Setter����. ��������:2012-07-17 23:18:30
	 * 
	 * @param newAccount_name
	 *            String
	 */
	public void setAccount_name(String newAccount_name) {
		this.account_name = newAccount_name;
	}

	/**
	 * ����pk_city��Getter����. ��������:2012-07-17 23:18:30
	 * 
	 * @return String
	 */
	public String getPk_city() {
		return pk_city;
	}

	/**
	 * ����pk_city��Setter����. ��������:2012-07-17 23:18:30
	 * 
	 * @param newPk_city
	 *            String
	 */
	public void setPk_city(String newPk_city) {
		this.pk_city = newPk_city;
	}

	/**
	 * ����pk_dept��Getter����. ��������:2012-07-17 23:18:30
	 * 
	 * @return String
	 */
	public String getPk_dept() {
		return pk_dept;
	}

	/**
	 * ����pk_dept��Setter����. ��������:2012-07-17 23:18:30
	 * 
	 * @param newPk_dept
	 *            String
	 */
	public void setPk_dept(String newPk_dept) {
		this.pk_dept = newPk_dept;
	}

	/**
	 * ����bank��Getter����. ��������:2012-07-17 23:18:30
	 * 
	 * @return String
	 */
	public String getBank() {
		return bank;
	}

	/**
	 * ����bank��Setter����. ��������:2012-07-17 23:18:30
	 * 
	 * @param newBank
	 *            String
	 */
	public void setBank(String newBank) {
		this.bank = newBank;
	}

	/**
	 * ����legal_represent��Getter����. ��������:2012-07-17 23:18:30
	 * 
	 * @return String
	 */
	public String getLegal_represent() {
		return legal_represent;
	}

	/**
	 * ����legal_represent��Setter����. ��������:2012-07-17 23:18:30
	 * 
	 * @param newLegal_represent
	 *            String
	 */
	public void setLegal_represent(String newLegal_represent) {
		this.legal_represent = newLegal_represent;
	}

	/**
	 * ����contact��Getter����. ��������:2012-07-17 23:18:30
	 * 
	 * @return String
	 */
	public String getContact() {
		return contact;
	}

	/**
	 * ����contact��Setter����. ��������:2012-07-17 23:18:30
	 * 
	 * @param newContact
	 *            String
	 */
	public void setContact(String newContact) {
		this.contact = newContact;
	}

	/**
	 * ����pk_area��Getter����. ��������:2012-07-17 23:18:30
	 * 
	 * @return String
	 */
	public String getPk_area() {
		return pk_area;
	}

	/**
	 * ����pk_area��Setter����. ��������:2012-07-17 23:18:30
	 * 
	 * @param newPk_area
	 *            String
	 */
	public void setPk_area(String newPk_area) {
		this.pk_area = newPk_area;
	}

	/**
	 * ����pk_province��Getter����. ��������:2012-07-17 23:18:30
	 * 
	 * @return String
	 */
	public String getPk_province() {
		return pk_province;
	}

	/**
	 * ����pk_province��Setter����. ��������:2012-07-17 23:18:30
	 * 
	 * @param newPk_province
	 *            String
	 */
	public void setPk_province(String newPk_province) {
		this.pk_province = newPk_province;
	}

	/**
	 * ����email��Getter����. ��������:2012-07-17 23:18:30
	 * 
	 * @return String
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * ����email��Setter����. ��������:2012-07-17 23:18:30
	 * 
	 * @param newEmail
	 *            String
	 */
	public void setEmail(String newEmail) {
		this.email = newEmail;
	}

	/**
	 * ����cust_name��Getter����. ��������:2012-07-17 23:18:30
	 * 
	 * @return String
	 */
	public String getCust_name() {
		return cust_name;
	}

	/**
	 * ����cust_name��Setter����. ��������:2012-07-17 23:18:30
	 * 
	 * @param newCust_name
	 *            String
	 */
	public void setCust_name(String newCust_name) {
		this.cust_name = newCust_name;
	}

	/**
	 * ����website��Getter����. ��������:2012-07-17 23:18:30
	 * 
	 * @return String
	 */
	public String getWebsite() {
		return website;
	}

	/**
	 * ����website��Setter����. ��������:2012-07-17 23:18:30
	 * 
	 * @param newWebsite
	 *            String
	 */
	public void setWebsite(String newWebsite) {
		this.website = newWebsite;
	}

	/**
	 * ����zipcode��Getter����. ��������:2012-07-17 23:18:30
	 * 
	 * @return String
	 */
	public String getZipcode() {
		return zipcode;
	}

	/**
	 * ����zipcode��Setter����. ��������:2012-07-17 23:18:30
	 * 
	 * @param newZipcode
	 *            String
	 */
	public void setZipcode(String newZipcode) {
		this.zipcode = newZipcode;
	}

	/**
	 * ����billing_ahead��Getter����. ��������:2012-07-17 23:18:30
	 * 
	 * @return Integer
	 */
	public Integer getBilling_ahead() {
		return billing_ahead;
	}

	/**
	 * ����billing_ahead��Setter����. ��������:2012-07-17 23:18:30
	 * 
	 * @param newBilling_ahead
	 *            Integer
	 */
	public void setBilling_ahead(Integer newBilling_ahead) {
		this.billing_ahead = newBilling_ahead;
	}

	/**
	 * <p>
	 * ȡ�ø�VO�����ֶ�.
	 * <p>
	 * ��������:2012-07-17 23:18:30
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
	 * ��������:2012-07-17 23:18:30
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getPKFieldName() {
		return "pk_customer";
	}

	/**
	 * <p>
	 * ���ر����.
	 * <p>
	 * ��������:2012-07-17 23:18:30
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getTableName() {
		return "ts_customer";
	}

	/**
	 * ����Ĭ�Ϸ�ʽ����������.
	 * 
	 * ��������:2012-07-17 23:18:30
	 */
	public CustomerVO() {
		super();
	}
}
