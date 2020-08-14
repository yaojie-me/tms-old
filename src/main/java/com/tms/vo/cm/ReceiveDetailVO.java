/***************************************************************\
 *     The skeleton of this class is generated by an automatic *
 * code generator for NC product. It is based on Velocity.     *
\***************************************************************/
package com.tms.vo.cm;

import org.nw.vo.pub.SuperVO;
import org.nw.vo.pub.lang.UFBoolean;
import org.nw.vo.pub.lang.UFDate;
import org.nw.vo.pub.lang.UFDateTime;
import org.nw.vo.pub.lang.UFDouble;

/**
 * <b> 在此处简要描述此类的功能 </b>
 * <p>
 * 在此处添加此类的描述信息
 * </p>
 * 创建日期:2013-03-23 18:52:21
 * 
 */
@SuppressWarnings("serial")
public class ReceiveDetailVO extends SuperVO {
	private String invoice_vbillno;
	private String pk_receive_detail;
	private UFDateTime ts;
	private String pk_op_project;
	private String billing_corp;
	private String memo;
	private Integer balatype;
	private UFDouble got_amount;
	private Integer rece_type;
	private String currency;
	private UFDouble volume_count;
	private UFDouble weight_count;
	private Integer merge_type;
	private Integer num_count;
	private Integer dr;
	private String parent_id;
	private String pk_corp;
	private UFDouble cost_amount;
	private Integer vbillstatus;
	private String bala_customer;
	private UFDateTime create_time;
	private String vbillno;
	private String create_user;
	private UFDouble ungot_amount;
	private UFDouble fee_weight_count;
	private String pk_customer;
	private String check_no;
	private String check_head;
	private UFDouble pack_num_count;
	private Integer tax_cat;
	private UFDouble tax_rate;
	private UFDouble taxmny;
	private UFDate dbilldate;
	private String modify_user;
	private UFDateTime modify_time;
	private Integer unconfirm_type;
	private String unconfirm_memo;
	
	private String cust_orderno;
	private String orderno;
	
	private UFBoolean edi_flag;
	private String edi_msg;
	private UFDouble discount;
	private String discount_memo;
	
	private UFDateTime account_period;
	private Integer estimated_state;
	
	
	public String getPk_op_project() {
		return pk_op_project;
	}

	public void setPk_op_project(String pk_op_project) {
		this.pk_op_project = pk_op_project;
	}

	public String getBilling_corp() {
		return billing_corp;
	}

	public void setBilling_corp(String billing_corp) {
		this.billing_corp = billing_corp;
	}

	public UFDateTime getAccount_period() {
		return account_period;
	}

	public void setAccount_period(UFDateTime account_period) {
		this.account_period = account_period;
	}

	public Integer getEstimated_state() {
		return estimated_state;
	}

	public void setEstimated_state(Integer estimated_state) {
		this.estimated_state = estimated_state;
	}

	public UFDouble getDiscount() {
		return discount;
	}

	public void setDiscount(UFDouble discount) {
		this.discount = discount;
	}

	public String getDiscount_memo() {
		return discount_memo;
	}

	public void setDiscount_memo(String discount_memo) {
		this.discount_memo = discount_memo;
	}

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

	public String getCust_orderno() {
		return cust_orderno;
	}

	public void setCust_orderno(String cust_orderno) {
		this.cust_orderno = cust_orderno;
	}

	public String getOrderno() {
		return orderno;
	}

	public void setOrderno(String orderno) {
		this.orderno = orderno;
	}
	
	public String getModify_user() {
		return modify_user;
	}

	public void setModify_user(String modify_user) {
		this.modify_user = modify_user;
	}

	public UFDateTime getModify_time() {
		return modify_time;
	}

	public void setModify_time(UFDateTime modify_time) {
		this.modify_time = modify_time;
	}

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
	private UFBoolean upload_flag;
	
	private UFDateTime commit_time;
	private String commit_user;
	private UFDateTime confirm_time;
	private String confirm_user;
	private UFBoolean kpi_flag;
	public UFBoolean getKpi_flag() {
		return kpi_flag;
	}

	public void setKpi_flag(UFBoolean kpi_flag) {
		this.kpi_flag = kpi_flag;
	}

	public UFDateTime getConfirm_time() {
		return confirm_time;
	}

	public void setConfirm_time(UFDateTime confirm_time) {
		this.confirm_time = confirm_time;
	}

	public String getConfirm_user() {
		return confirm_user;
	}

	public void setConfirm_user(String confirm_user) {
		this.confirm_user = confirm_user;
	}
	
	public UFDateTime getCommit_time() {
		return commit_time;
	}

	public void setCommit_time(UFDateTime commit_time) {
		this.commit_time = commit_time;
	}

	public String getCommit_user() {
		return commit_user;
	}

	public void setCommit_user(String commit_user) {
		this.commit_user = commit_user;
	}

	public UFBoolean getUpload_flag() {
		return upload_flag;
	}

	public void setUpload_flag(UFBoolean upload_flag) {
		this.upload_flag = upload_flag;
	}

	private String pk_pay_detail;
	
	public String getPk_pay_detail() {
		return pk_pay_detail;
	}

	public void setPk_pay_detail(String pk_pay_detail) {
		this.pk_pay_detail = pk_pay_detail;
	}

	public Integer getTax_cat() {
		return tax_cat;
	}

	public void setTax_cat(Integer tax_cat) {
		this.tax_cat = tax_cat;
	}

	public UFDouble getTax_rate() {
		return tax_rate;
	}

	public void setTax_rate(UFDouble tax_rate) {
		this.tax_rate = tax_rate;
	}

	public UFDouble getTaxmny() {
		return taxmny;
	}

	public void setTaxmny(UFDouble taxmny) {
		this.taxmny = taxmny;
	}

	public UFDouble getPack_num_count() {
		return pack_num_count;
	}

	public void setPack_num_count(UFDouble pack_num_count) {
		this.pack_num_count = pack_num_count;
	}

	public String getCheck_no() {
		return check_no;
	}

	public void setCheck_no(String check_no) {
		this.check_no = check_no;
	}

	public String getCheck_head() {
		return check_head;
	}

	public void setCheck_head(String check_head) {
		this.check_head = check_head;
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

	private UFDouble trans_fee_price;// 运费单价
	private UFDouble trans_fee_count;// 总运费
	private UFDouble other_fee_count;// 除运费外的其他费用

	private UFDouble total_cost;// 总成本
	private UFDouble maori;// 毛利
	private String maori_fee;// 毛利率

	// 关联id，如果是客户索赔，那么这里存储的就是异常事故的id
	private String relationid;

	public String getRelationid() {
		return relationid;
	}

	public void setRelationid(String relationid) {
		this.relationid = relationid;
	}

	public UFDouble getTotal_cost() {
		return total_cost;
	}

	public void setTotal_cost(UFDouble total_cost) {
		this.total_cost = total_cost;
	}

	public UFDouble getMaori() {
		return maori;
	}

	public void setMaori(UFDouble maori) {
		this.maori = maori;
	}

	public String getMaori_fee() {
		return maori_fee;
	}

	public void setMaori_fee(String maori_fee) {
		this.maori_fee = maori_fee;
	}

	public UFDouble getTrans_fee_price() {
		return trans_fee_price;
	}

	public void setTrans_fee_price(UFDouble trans_fee_price) {
		this.trans_fee_price = trans_fee_price;
	}

	public UFDouble getTrans_fee_count() {
		return trans_fee_count;
	}

	public void setTrans_fee_count(UFDouble trans_fee_count) {
		this.trans_fee_count = trans_fee_count;
	}

	public UFDouble getOther_fee_count() {
		return other_fee_count;
	}

	public void setOther_fee_count(UFDouble other_fee_count) {
		this.other_fee_count = other_fee_count;
	}

	public static final String TRANS_FEE_PRICE = "trans_fee_price";
	public static final String TRANS_FEE_COUNT = "trans_fee_count";
	public static final String OTHER_FEE_COUNT = "other_fee_count";

	public static final String INVOICE_VBILLNO = "invoice_vbillno";
	public static final String PK_RECEIVE_DETAIL = "pk_receive_detail";
	public static final String MEMO = "memo";
	public static final String BALATYPE = "balatype";
	public static final String GOT_AMOUNT = "got_amount";
	public static final String TYPE = "type";
	public static final String CURRENCY = "currency";
	public static final String VOLUME_COUNT = "volume_count";
	public static final String WEIGHT_COUNT = "weight_count";
	public static final String FEE_WEIGHT_COUNT = "fee_weight_count";
	public static final String MERGE_TYPE = "merge_type";
	public static final String NUM_COUNT = "num_count";
	public static final String PARENT_ID = "parent_id";
	public static final String PK_CORP = "pk_corp";
	public static final String COST_AMOUNT = "cost_amount";
	public static final String VBILLSTATUS = "vbillstatus";
	public static final String BALA_CUSTOMER = "bala_customer";
	public static final String CREATE_TIME = "create_time";
	public static final String VBILLNO = "vbillno";
	public static final String CREATE_USER = "create_user";
	public static final String UNGOT_AMOUNT = "ungot_amount";
	public static final String PK_CUSTOMER = "pk_customer";
	public static final String DBILLDATE = "dbilldate";

	public UFDate getDbilldate() {
		return dbilldate;
	}

	public void setDbilldate(UFDate dbilldate) {
		this.dbilldate = dbilldate;
	}

	public UFDouble getFee_weight_count() {
		return fee_weight_count;
	}

	public void setFee_weight_count(UFDouble fee_weight_count) {
		this.fee_weight_count = fee_weight_count;
	}

	/**
	 * 属性invoice_vbillno的Getter方法. 创建日期:2013-03-23 18:52:21
	 * 
	 * @return String
	 */
	public String getInvoice_vbillno() {
		return invoice_vbillno;
	}

	/**
	 * 属性invoice_vbillno的Setter方法. 创建日期:2013-03-23 18:52:21
	 * 
	 * @param newInvoice_vbillno
	 *            String
	 */
	public void setInvoice_vbillno(String newInvoice_vbillno) {
		this.invoice_vbillno = newInvoice_vbillno;
	}

	/**
	 * 属性pk_receive_detail的Getter方法. 创建日期:2013-03-23 18:52:21
	 * 
	 * @return String
	 */
	public String getPk_receive_detail() {
		return pk_receive_detail;
	}

	/**
	 * 属性pk_receive_detail的Setter方法. 创建日期:2013-03-23 18:52:21
	 * 
	 * @param newPk_receive_detail
	 *            String
	 */
	public void setPk_receive_detail(String newPk_receive_detail) {
		this.pk_receive_detail = newPk_receive_detail;
	}

	/**
	 * 属性ts的Getter方法. 创建日期:2013-03-23 18:52:21
	 * 
	 * @return UFDateTime
	 */
	public UFDateTime getTs() {
		return ts;
	}

	/**
	 * 属性ts的Setter方法. 创建日期:2013-03-23 18:52:21
	 * 
	 * @param newTs
	 *            UFDateTime
	 */
	public void setTs(UFDateTime newTs) {
		this.ts = newTs;
	}

	/**
	 * 属性memo的Getter方法. 创建日期:2013-03-23 18:52:21
	 * 
	 * @return String
	 */
	public String getMemo() {
		return memo;
	}

	/**
	 * 属性memo的Setter方法. 创建日期:2013-03-23 18:52:21
	 * 
	 * @param newMemo
	 *            String
	 */
	public void setMemo(String newMemo) {
		this.memo = newMemo;
	}

	/**
	 * 属性balatype的Getter方法. 创建日期:2013-03-23 18:52:21
	 * 
	 * @return Integer
	 */
	public Integer getBalatype() {
		return balatype;
	}

	/**
	 * 属性balatype的Setter方法. 创建日期:2013-03-23 18:52:21
	 * 
	 * @param newBalatype
	 *            Integer
	 */
	public void setBalatype(Integer newBalatype) {
		this.balatype = newBalatype;
	}

	/**
	 * 属性got_amount的Getter方法. 创建日期:2013-03-23 18:52:21
	 * 
	 * @return UFDouble
	 */
	public UFDouble getGot_amount() {
		return got_amount;
	}

	/**
	 * 属性got_amount的Setter方法. 创建日期:2013-03-23 18:52:21
	 * 
	 * @param newGot_amount
	 *            UFDouble
	 */
	public void setGot_amount(UFDouble newGot_amount) {
		this.got_amount = newGot_amount;
	}

	public Integer getRece_type() {
		return rece_type;
	}

	public void setRece_type(Integer rece_type) {
		this.rece_type = rece_type;
	}

	/**
	 * 属性currency的Getter方法. 创建日期:2013-03-23 18:52:21
	 * 
	 * @return String
	 */
	public String getCurrency() {
		return currency;
	}

	/**
	 * 属性currency的Setter方法. 创建日期:2013-03-23 18:52:21
	 * 
	 * @param newCurrency
	 *            String
	 */
	public void setCurrency(String newCurrency) {
		this.currency = newCurrency;
	}

	public UFDouble getWeight_count() {
		return weight_count;
	}

	public void setWeight_count(UFDouble weight_count) {
		this.weight_count = weight_count;
	}

	/**
	 * 属性volume_count的Getter方法. 创建日期:2013-03-23 18:52:21
	 * 
	 * @return UFDouble
	 */
	public UFDouble getVolume_count() {
		return volume_count;
	}

	/**
	 * 属性volume_count的Setter方法. 创建日期:2013-03-23 18:52:21
	 * 
	 * @param newVolume_count
	 *            UFDouble
	 */
	public void setVolume_count(UFDouble newVolume_count) {
		this.volume_count = newVolume_count;
	}

	/**
	 * 属性merge_type的Getter方法. 创建日期:2013-03-23 18:52:21
	 * 
	 * @return Integer
	 */
	public Integer getMerge_type() {
		return merge_type;
	}

	/**
	 * 属性merge_type的Setter方法. 创建日期:2013-03-23 18:52:21
	 * 
	 * @param newMerge_type
	 *            Integer
	 */
	public void setMerge_type(Integer newMerge_type) {
		this.merge_type = newMerge_type;
	}

	/**
	 * 属性num_count的Getter方法. 创建日期:2013-03-23 18:52:21
	 * 
	 * @return Integer
	 */
	public Integer getNum_count() {
		return num_count;
	}

	/**
	 * 属性num_count的Setter方法. 创建日期:2013-03-23 18:52:21
	 * 
	 * @param newNum_count
	 *            Integer
	 */
	public void setNum_count(Integer newNum_count) {
		this.num_count = newNum_count;
	}

	/**
	 * 属性dr的Getter方法. 创建日期:2013-03-23 18:52:21
	 * 
	 * @return Integer
	 */
	public Integer getDr() {
		return dr;
	}

	/**
	 * 属性dr的Setter方法. 创建日期:2013-03-23 18:52:21
	 * 
	 * @param newDr
	 *            Integer
	 */
	public void setDr(Integer newDr) {
		this.dr = newDr;
	}

	/**
	 * 属性parent_id的Getter方法. 创建日期:2013-03-23 18:52:21
	 * 
	 * @return String
	 */
	public String getParent_id() {
		return parent_id;
	}

	/**
	 * 属性parent_id的Setter方法. 创建日期:2013-03-23 18:52:21
	 * 
	 * @param newParent_id
	 *            String
	 */
	public void setParent_id(String newParent_id) {
		this.parent_id = newParent_id;
	}

	/**
	 * 属性pk_corp的Getter方法. 创建日期:2013-03-23 18:52:21
	 * 
	 * @return String
	 */
	public String getPk_corp() {
		return pk_corp;
	}

	/**
	 * 属性pk_corp的Setter方法. 创建日期:2013-03-23 18:52:21
	 * 
	 * @param newPk_corp
	 *            String
	 */
	public void setPk_corp(String newPk_corp) {
		this.pk_corp = newPk_corp;
	}

	/**
	 * 属性cost_amount的Getter方法. 创建日期:2013-03-23 18:52:21
	 * 
	 * @return UFDouble
	 */
	public UFDouble getCost_amount() {
		return cost_amount;
	}

	/**
	 * 属性cost_amount的Setter方法. 创建日期:2013-03-23 18:52:21
	 * 
	 * @param newCost_amount
	 *            UFDouble
	 */
	public void setCost_amount(UFDouble newCost_amount) {
		this.cost_amount = newCost_amount;
	}

	/**
	 * 属性vbillstatus的Getter方法. 创建日期:2013-03-23 18:52:21
	 * 
	 * @return Integer
	 */
	public Integer getVbillstatus() {
		return vbillstatus;
	}

	/**
	 * 属性vbillstatus的Setter方法. 创建日期:2013-03-23 18:52:21
	 * 
	 * @param newVbillstatus
	 *            Integer
	 */
	public void setVbillstatus(Integer newVbillstatus) {
		this.vbillstatus = newVbillstatus;
	}

	/**
	 * 属性bala_customer的Getter方法. 创建日期:2013-03-23 18:52:21
	 * 
	 * @return String
	 */
	public String getBala_customer() {
		return bala_customer;
	}

	/**
	 * 属性bala_customer的Setter方法. 创建日期:2013-03-23 18:52:21
	 * 
	 * @param newBala_customer
	 *            String
	 */
	public void setBala_customer(String newBala_customer) {
		this.bala_customer = newBala_customer;
	}

	/**
	 * 属性create_time的Getter方法. 创建日期:2013-03-23 18:52:21
	 * 
	 * @return UFDateTime
	 */
	public UFDateTime getCreate_time() {
		return create_time;
	}

	/**
	 * 属性create_time的Setter方法. 创建日期:2013-03-23 18:52:21
	 * 
	 * @param newCreate_time
	 *            UFDateTime
	 */
	public void setCreate_time(UFDateTime newCreate_time) {
		this.create_time = newCreate_time;
	}

	/**
	 * 属性vbillno的Getter方法. 创建日期:2013-03-23 18:52:21
	 * 
	 * @return String
	 */
	public String getVbillno() {
		return vbillno;
	}

	/**
	 * 属性vbillno的Setter方法. 创建日期:2013-03-23 18:52:21
	 * 
	 * @param newVbillno
	 *            String
	 */
	public void setVbillno(String newVbillno) {
		this.vbillno = newVbillno;
	}

	/**
	 * 属性create_user的Getter方法. 创建日期:2013-03-23 18:52:21
	 * 
	 * @return String
	 */
	public String getCreate_user() {
		return create_user;
	}

	/**
	 * 属性create_user的Setter方法. 创建日期:2013-03-23 18:52:21
	 * 
	 * @param newCreate_user
	 *            String
	 */
	public void setCreate_user(String newCreate_user) {
		this.create_user = newCreate_user;
	}

	/**
	 * 属性ungot_amount的Getter方法. 创建日期:2013-03-23 18:52:21
	 * 
	 * @return UFDouble
	 */
	public UFDouble getUngot_amount() {
		return ungot_amount;
	}

	/**
	 * 属性ungot_amount的Setter方法. 创建日期:2013-03-23 18:52:21
	 * 
	 * @param newUngot_amount
	 *            UFDouble
	 */
	public void setUngot_amount(UFDouble newUngot_amount) {
		this.ungot_amount = newUngot_amount;
	}

	/**
	 * 属性pk_customer的Getter方法. 创建日期:2013-03-23 18:52:21
	 * 
	 * @return String
	 */
	public String getPk_customer() {
		return pk_customer;
	}

	/**
	 * 属性pk_customer的Setter方法. 创建日期:2013-03-23 18:52:21
	 * 
	 * @param newPk_customer
	 *            String
	 */
	public void setPk_customer(String newPk_customer) {
		this.pk_customer = newPk_customer;
	}

	/**
	 * <p>
	 * 取得父VO主键字段.
	 * <p>
	 * 创建日期:2013-03-23 18:52:21
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
	 * 创建日期:2013-03-23 18:52:21
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getPKFieldName() {
		return "pk_receive_detail";
	}

	/**
	 * <p>
	 * 返回表名称.
	 * <p>
	 * 创建日期:2013-03-23 18:52:21
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getTableName() {
		return "ts_receive_detail";
	}

	/**
	 * 按照默认方式创建构造子.
	 * 
	 * 创建日期:2013-03-23 18:52:21
	 */
	public ReceiveDetailVO() {
		super();
	}

	public Integer getUnconfirm_type() {
		return unconfirm_type;
	}

	public void setUnconfirm_type(Integer unconfirm_type) {
		this.unconfirm_type = unconfirm_type;
	}

	public String getUnconfirm_memo() {
		return unconfirm_memo;
	}

	public void setUnconfirm_memo(String unconfirm_memo) {
		this.unconfirm_memo = unconfirm_memo;
	}
}