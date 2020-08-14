/***************************************************************\
 *     The skeleton of this class is generated by an automatic *
 * code generator for NC product. It is based on Velocity.     *
\***************************************************************/
package com.tms.vo.inv;

import org.nw.vo.pub.SuperVO;
import org.nw.vo.pub.lang.UFBoolean;
import org.nw.vo.pub.lang.UFDateTime;
import org.nw.vo.pub.lang.UFDouble;

/**
 */
@SuppressWarnings("serial")
public class InvTrackingVO extends SuperVO {
	private String entrust_vbillno;
	private String pk_corp;
	private UFDateTime tracking_time;
	private String pk_inv_tracking;
	private String invoice_vbillno;
	private UFDateTime ts;
	private String exp_type;
	private String tracking_memo;
	private UFDateTime create_time;
	private String create_user;
	private Integer tracking_status;
	private String exp_memo;
	private UFBoolean exp_flag;
	private Integer dr;
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
	private UFBoolean node_flag;
	private UFBoolean edi_flag;
	private String edi_msg;

	public UFBoolean getEdi_flag() {
		return edi_flag;
	}

	public void setEdi_flag(UFBoolean edi_flag) {
		this.edi_flag = edi_flag;
	}

	public String getEdi_msg() {
		return edi_msg;
	}

	public void setEdi_msg(String edi_msg) {
		this.edi_msg = edi_msg;
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

	public static final String PK_ENTRUST = "pk_entrust";
	public static final String PK_CORP = "pk_corp";
	public static final String TRACKING_TIME = "tracking_time";
	public static final String PK_INV_TRACKING = "pk_inv_tracking";
	public static final String PK_INVOICE = "pk_invoice";
	public static final String EXP_TYPE = "exp_type";
	public static final String TRACKING_MEMO = "tracking_memo";
	public static final String CREATE_TIME = "create_time";
	public static final String CREATE_USER = "create_user";
	public static final String TRACKING_STATUS = "tracking_status";
	public static final String EXP_MEMO = "exp_memo";
	public static final String EXP_FLAG = "exp_flag";
	public static final String NODE_FLAG = "node_flag";

	public UFBoolean getNode_flag() {
		return node_flag;
	}

	public void setNode_flag(UFBoolean node_flag) {
		this.node_flag = node_flag;
	}

	/**
	 * ����pk_corp��Getter����. ��������:2013-05-12 11:32:06
	 * 
	 * @return String
	 */
	public String getPk_corp() {
		return pk_corp;
	}

	/**
	 * ����pk_corp��Setter����. ��������:2013-05-12 11:32:06
	 * 
	 * @param newPk_corp
	 *            String
	 */
	public void setPk_corp(String newPk_corp) {
		this.pk_corp = newPk_corp;
	}

	/**
	 * ����tracking_time��Getter����. ��������:2013-05-12 11:32:06
	 * 
	 * @return UFDateTime
	 */
	public UFDateTime getTracking_time() {
		return tracking_time;
	}

	/**
	 * ����tracking_time��Setter����. ��������:2013-05-12 11:32:06
	 * 
	 * @param newTracking_time
	 *            UFDateTime
	 */
	public void setTracking_time(UFDateTime newTracking_time) {
		this.tracking_time = newTracking_time;
	}

	/**
	 * ����pk_inv_tracking��Getter����. ��������:2013-05-12 11:32:06
	 * 
	 * @return String
	 */
	public String getPk_inv_tracking() {
		return pk_inv_tracking;
	}

	/**
	 * ����pk_inv_tracking��Setter����. ��������:2013-05-12 11:32:06
	 * 
	 * @param newPk_inv_tracking
	 *            String
	 */
	public void setPk_inv_tracking(String newPk_inv_tracking) {
		this.pk_inv_tracking = newPk_inv_tracking;
	}

	public String getEntrust_vbillno() {
		return entrust_vbillno;
	}

	public void setEntrust_vbillno(String entrust_vbillno) {
		this.entrust_vbillno = entrust_vbillno;
	}

	public String getInvoice_vbillno() {
		return invoice_vbillno;
	}

	public void setInvoice_vbillno(String invoice_vbillno) {
		this.invoice_vbillno = invoice_vbillno;
	}

	/**
	 * ����ts��Getter����. ��������:2013-05-12 11:32:06
	 * 
	 * @return UFDateTime
	 */
	public UFDateTime getTs() {
		return ts;
	}

	/**
	 * ����ts��Setter����. ��������:2013-05-12 11:32:06
	 * 
	 * @param newTs
	 *            UFDateTime
	 */
	public void setTs(UFDateTime newTs) {
		this.ts = newTs;
	}

	/**
	 * ����exp_type��Getter����. ��������:2013-05-12 11:32:06
	 * 
	 * @return String
	 */
	public String getExp_type() {
		return exp_type;
	}

	/**
	 * ����exp_type��Setter����. ��������:2013-05-12 11:32:06
	 * 
	 * @param newExp_type
	 *            String
	 */
	public void setExp_type(String newExp_type) {
		this.exp_type = newExp_type;
	}

	/**
	 * ����tracking_memo��Getter����. ��������:2013-05-12 11:32:06
	 * 
	 * @return String
	 */
	public String getTracking_memo() {
		return tracking_memo;
	}

	/**
	 * ����tracking_memo��Setter����. ��������:2013-05-12 11:32:06
	 * 
	 * @param newTracking_memo
	 *            String
	 */
	public void setTracking_memo(String newTracking_memo) {
		this.tracking_memo = newTracking_memo;
	}

	/**
	 * ����create_time��Getter����. ��������:2013-05-12 11:32:06
	 * 
	 * @return UFDateTime
	 */
	public UFDateTime getCreate_time() {
		return create_time;
	}

	/**
	 * ����create_time��Setter����. ��������:2013-05-12 11:32:06
	 * 
	 * @param newCreate_time
	 *            UFDateTime
	 */
	public void setCreate_time(UFDateTime newCreate_time) {
		this.create_time = newCreate_time;
	}

	/**
	 * ����create_user��Getter����. ��������:2013-05-12 11:32:06
	 * 
	 * @return String
	 */
	public String getCreate_user() {
		return create_user;
	}

	/**
	 * ����create_user��Setter����. ��������:2013-05-12 11:32:06
	 * 
	 * @param newCreate_user
	 *            String
	 */
	public void setCreate_user(String newCreate_user) {
		this.create_user = newCreate_user;
	}

	/**
	 * ����tracking_status��Getter����. ��������:2013-05-12 11:32:06
	 * 
	 * @return Integer
	 */
	public Integer getTracking_status() {
		return tracking_status;
	}

	/**
	 * ����tracking_status��Setter����. ��������:2013-05-12 11:32:06
	 * 
	 * @param newTracking_status
	 *            Integer
	 */
	public void setTracking_status(Integer newTracking_status) {
		this.tracking_status = newTracking_status;
	}

	/**
	 * ����exp_memo��Getter����. ��������:2013-05-12 11:32:06
	 * 
	 * @return String
	 */
	public String getExp_memo() {
		return exp_memo;
	}

	/**
	 * ����exp_memo��Setter����. ��������:2013-05-12 11:32:06
	 * 
	 * @param newExp_memo
	 *            String
	 */
	public void setExp_memo(String newExp_memo) {
		this.exp_memo = newExp_memo;
	}

	/**
	 * ����exp_flag��Getter����. ��������:2013-05-12 11:32:06
	 * 
	 * @return UFBoolean
	 */
	public UFBoolean getExp_flag() {
		return exp_flag;
	}

	/**
	 * ����exp_flag��Setter����. ��������:2013-05-12 11:32:06
	 * 
	 * @param newExp_flag
	 *            UFBoolean
	 */
	public void setExp_flag(UFBoolean newExp_flag) {
		this.exp_flag = newExp_flag;
	}

	/**
	 * ����dr��Getter����. ��������:2013-05-12 11:32:06
	 * 
	 * @return Integer
	 */
	public Integer getDr() {
		return dr;
	}

	/**
	 * ����dr��Setter����. ��������:2013-05-12 11:32:06
	 * 
	 * @param newDr
	 *            Integer
	 */
	public void setDr(Integer newDr) {
		this.dr = newDr;
	}

	/**
	 * <p>
	 * ȡ�ø�VO����ֶ�.
	 * <p>
	 * ��������:2013-05-12 11:32:06
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getParentPKFieldName() {
		return "pk_invoice";
	}

	/**
	 * <p>
	 * ȡ�ñ����.
	 * <p>
	 * ��������:2013-05-12 11:32:06
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getPKFieldName() {
		return "pk_inv_tracking";
	}

	/**
	 * <p>
	 * ���ر����.
	 * <p>
	 * ��������:2013-05-12 11:32:06
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getTableName() {
		return "ts_inv_tracking";
	}

	/**
	 * ����Ĭ�Ϸ�ʽ����������.
	 * 
	 * ��������:2013-05-12 11:32:06
	 */
	public InvTrackingVO() {
		super();
	}
}