/***************************************************************\
 *     The skeleton of this class is generated by an automatic *
 * code generator for NC product. It is based on Velocity.     *
\***************************************************************/
package com.tms.vo.tp;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.nw.vo.pub.SuperVO;
import org.nw.vo.pub.lang.UFBoolean;
import org.nw.vo.pub.lang.UFDate;
import org.nw.vo.pub.lang.UFDateTime;
import org.nw.vo.pub.lang.UFDouble;

/**
 */
@SuppressWarnings("serial")
public class SegmentVO extends SuperVO {
	private String pk_corp;
	private String arri_area;
	private String req_deli_time;
	private UFDateTime create_time;
	private String req_arri_date;
	private String arri_phone;
	private String deli_area;
	private Integer dr;
	private String arri_province;
	private Integer vbillstatus;
	private String deli_phone;
	private String arri_email;
	private String pk_segment;
	private String deli_email;
	private String pk_arrival;
	private UFDateTime ts;
	private String arri_mobile;
	private String arri_contact;
	private String arri_city;
	private Integer seg_type;
	private String vbillno;
	private String deli_mobile;
	private UFDouble distance;
	private String req_arri_time;
	private String invoice_vbillno;
	private String memo;
	private String req_deli_date;
	private UFDouble weight_count;
	private String deli_city;
	private String create_user;
	private String arri_detail_addr;
	private String pk_delivery;
	private String deli_contact;
	private UFDouble volume_count;
	private UFDouble fee_weight_count;
	private Integer num_count;
	private Integer mileage;
	private String deli_province;
	private Integer seg_mark;
	private String parent_seg;
	private String deli_detail_addr;
	private String pk_trans_type;
	private UFDouble volume_weight_count;
	private Integer deli_method;
	private UFDouble pack_num_count;
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

	private String deli_process;
	private String arri_process;
	private String note;
	private UFDate dbilldate;
	private String modify_user;
	private UFDateTime modify_time;

	// 2015-05-28
	private Integer delegate_status;
	private String delegate_corp;
	private String delegate_user;
	private UFDateTime delegate_time;
	
	//yaojiie 2015 12 27 添加运力信息字段
	private String pk_carrier;
	private String carno;
	private String pk_driver;
	
	//yaojiie 2016 1 6 添加退单字段
	private UFBoolean if_vent;
	private String vent_user;
	private String vent_reason;
	private UFDateTime vent_time;
	private Integer vent_type;
	private String ord_orderno;
	//加入一个ord_lot字段，方便记录信息
	private String ord_lot;
	
	private String pz_line;
	private Integer pz_mileage;
	
	private Integer urgent_level;
	private UFBoolean new_segment;//是否是委托单修改时产生的
	

	public UFBoolean getNew_segment() {
		return new_segment;
	}

	public void setNew_segment(UFBoolean new_segment) {
		this.new_segment = new_segment;
	}

	public Integer getUrgent_level() {
		return urgent_level;
	}

	public void setUrgent_level(Integer urgent_level) {
		this.urgent_level = urgent_level;
	}
	
	public String getPz_line() {
		return pz_line;
	}

	public void setPz_line(String pz_line) {
		this.pz_line = pz_line;
	}

	public Integer getPz_mileage() {
		return pz_mileage;
	}

	public void setPz_mileage(Integer pz_mileage) {
		this.pz_mileage = pz_mileage;
	}

	public String getOrd_lot() {
		return ord_lot;
	}

	public void setOrd_lot(String ord_lot) {
		this.ord_lot = ord_lot;
	}

	public String getOrd_orderno() {
		return ord_orderno;
	}

	public void setOrd_orderno(String ord_orderno) {
		this.ord_orderno = ord_orderno;
	}

	public Integer getVent_type() {
		return vent_type;
	}

	public void setVent_type(Integer vent_type) {
		this.vent_type = vent_type;
	}

	public UFBoolean getIf_vent() {
		return if_vent;
	}

	public void setIf_vent(UFBoolean if_vent) {
		this.if_vent = if_vent;
	}

	public String getVent_user() {
		return vent_user;
	}

	public void setVent_user(String vent_user) {
		this.vent_user = vent_user;
	}

	public String getVent_reason() {
		return vent_reason;
	}

	public void setVent_reason(String vent_reason) {
		this.vent_reason = vent_reason;
	}

	public UFDateTime getVent_time() {
		return vent_time;
	}

	public void setVent_time(UFDateTime vent_time) {
		this.vent_time = vent_time;
	}

	public String getPk_carrier() {
		return pk_carrier;
	}

	public void setPk_carrier(String pk_carrier) {
		this.pk_carrier = pk_carrier;
	}

	public String getCarno() {
		return carno;
	}

	public void setCarno(String carno) {
		this.carno = carno;
	}

	public String getPk_driver() {
		return pk_driver;
	}

	public void setPk_driver(String pk_driver) {
		this.pk_driver = pk_driver;
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

	public UFDouble getPack_num_count() {
		return pack_num_count;
	}

	public void setPack_num_count(UFDouble pack_num_count) {
		this.pack_num_count = pack_num_count;
	}

	public String getDeli_process() {
		return deli_process;
	}

	public void setDeli_process(String deli_process) {
		this.deli_process = deli_process;
	}

	public String getArri_process() {
		return arri_process;
	}

	public void setArri_process(String arri_process) {
		this.arri_process = arri_process;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
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

	public Integer getDelegate_status() {
		return delegate_status;
	}

	public void setDelegate_status(Integer delegate_status) {
		this.delegate_status = delegate_status;
	}

	public String getDelegate_corp() {
		return delegate_corp;
	}

	public void setDelegate_corp(String delegate_corp) {
		this.delegate_corp = delegate_corp;
	}

	public String getDelegate_user() {
		return delegate_user;
	}

	public void setDelegate_user(String delegate_user) {
		this.delegate_user = delegate_user;
	}

	public UFDateTime getDelegate_time() {
		return delegate_time;
	}

	public void setDelegate_time(UFDateTime delegate_time) {
		this.delegate_time = delegate_time;
	}

	public static final String DELI_METHOD = "deli_method";
	public static final String VOLUME_WEIGHT_COUNT = "volume_weight_count";
	public static final String PK_CORP = "pk_corp";
	public static final String ARRI_AREA = "arri_area";
	public static final String REQ_DELI_TIME = "req_deli_time";
	public static final String CREATE_TIME = "create_time";
	public static final String REQ_ARRI_DATE = "req_arri_date";
	public static final String ARRI_PHONE = "arri_phone";
	public static final String DELI_AREA = "deli_area";
	public static final String ARRI_PROVINCE = "arri_province";
	public static final String VBILLSTATUS = "vbillstatus";
	public static final String DELI_PHONE = "deli_phone";
	public static final String ARRI_EMAIL = "arri_email";
	public static final String PK_SEGMENT = "pk_segment";
	public static final String DELI_EMAIL = "deli_email";
	public static final String PK_ARRIVAL = "pk_arrival";
	public static final String ARRI_MOBILE = "arri_mobile";
	public static final String ARRI_CONTACT = "arri_contact";
	public static final String ARRI_CITY = "arri_city";
	public static final String SEG_TYPE = "seg_type";
	public static final String VBILLNO = "vbillno";
	public static final String DELI_MOBILE = "deli_mobile";
	public static final String DISTANCE = "distance";
	public static final String REQ_ARRI_TIME = "req_arri_time";
	public static final String INVOICE_VBILLNO = "invoice_vbillno";
	public static final String MEMO = "memo";
	public static final String REQ_DELI_DATE = "req_deli_date";
	public static final String WEIGHT_COUNT = "weight_count";
	public static final String DELI_CITY = "deli_city";
	public static final String CREATE_USER = "create_user";
	public static final String ARRI_DETAIL_ADDR = "arri_detail_addr";
	public static final String PK_DELIVERY = "pk_delivery";
	public static final String DELI_CONTACT = "deli_contact";
	public static final String VOLUME_COUNT = "volume_count";
	public static final String FEE_WEIGHT_COUNT = "fee_weight_count";
	public static final String NUM_COUNT = "num_count";
	public static final String MILEAGE = "mileage";
	public static final String DELI_PROVINCE = "deli_province";
	public static final String SEG_MARK = "seg_mark";
	public static final String PARENT_SEG = "parent_seg";
	public static final String DELI_DETAIL_ADDR = "deli_detail_addr";
	public static final String PK_TRANS_TYPE = "pk_trans_type";
	public static final String DBILLDATE = "dbilldate";
	public static final String DELEGATE_STATUS = "delegate_status";
	public static final String DELEGATE_CORP = "delegate_corp";
	public static final String DELEGATE_USER = "delegate_user";
	public static final String DELEGATE_TIME = "delegate_time";

	public UFDate getDbilldate() {
		return dbilldate;
	}

	public void setDbilldate(UFDate dbilldate) {
		this.dbilldate = dbilldate;
	}

	public Integer getDeli_method() {
		return deli_method;
	}

	public void setDeli_method(Integer deli_method) {
		this.deli_method = deli_method;
	}

	public UFDouble getVolume_weight_count() {
		return volume_weight_count;
	}

	public void setVolume_weight_count(UFDouble volume_weight_count) {
		this.volume_weight_count = volume_weight_count;
	}

	public String getPk_trans_type() {
		return pk_trans_type;
	}

	public void setPk_trans_type(String pk_trans_type) {
		this.pk_trans_type = pk_trans_type;
	}

	public UFDouble getFee_weight_count() {
		return fee_weight_count;
	}

	public void setFee_weight_count(UFDouble fee_weight_count) {
		this.fee_weight_count = fee_weight_count;
	}

	/**
	 * pk_corpGetter. :2012-08-22 17:37:47
	 * 
	 * @return String
	 */
	public String getPk_corp() {
		return pk_corp;
	}

	/**
	 * pk_corpSetter. :2012-08-22 17:37:47
	 * 
	 * @param newPk_corp
	 *            String
	 */
	public void setPk_corp(String newPk_corp) {
		this.pk_corp = newPk_corp;
	}

	/**
	 * arri_areaGetter. :2012-08-22 17:37:47
	 * 
	 * @return String
	 */
	public String getArri_area() {
		return arri_area;
	}

	/**
	 * arri_areaSetter. :2012-08-22 17:37:47
	 * 
	 * @param newArri_area
	 *            String
	 */
	public void setArri_area(String newArri_area) {
		this.arri_area = newArri_area;
	}

	/**
	 * req_deli_timeGetter. :2012-08-22 17:37:47
	 * 
	 * @return String
	 */
	public String getReq_deli_time() {
		return req_deli_time;
	}

	/**
	 * req_deli_timeSetter. :2012-08-22 17:37:47
	 * 
	 * @param newReq_deli_time
	 *            String
	 */
	public void setReq_deli_time(String newReq_deli_time) {
		this.req_deli_time = newReq_deli_time;
	}

	/**
	 * create_timeGetter. :2012-08-22 17:37:47
	 * 
	 * @return UFDateTime
	 */
	public UFDateTime getCreate_time() {
		return create_time;
	}

	/**
	 * create_timeSetter. :2012-08-22 17:37:47
	 * 
	 * @param newCreate_time
	 *            UFDateTime
	 */
	public void setCreate_time(UFDateTime newCreate_time) {
		this.create_time = newCreate_time;
	}

	/**
	 * arri_phoneGetter. :2012-08-22 17:37:47
	 * 
	 * @return String
	 */
	public String getArri_phone() {
		return arri_phone;
	}

	/**
	 * arri_phoneSetter. :2012-08-22 17:37:47
	 * 
	 * @param newArri_phone
	 *            String
	 */
	public void setArri_phone(String newArri_phone) {
		this.arri_phone = newArri_phone;
	}

	/**
	 * deli_areaGetter. :2012-08-22 17:37:47
	 * 
	 * @return String
	 */
	public String getDeli_area() {
		return deli_area;
	}

	/**
	 * deli_areaSetter. :2012-08-22 17:37:47
	 * 
	 * @param newDeli_area
	 *            String
	 */
	public void setDeli_area(String newDeli_area) {
		this.deli_area = newDeli_area;
	}

	/**
	 * drGetter. :2012-08-22 17:37:47
	 * 
	 * @return Integer
	 */
	public Integer getDr() {
		return dr;
	}

	/**
	 * drSetter. :2012-08-22 17:37:47
	 * 
	 * @param newDr
	 *            Integer
	 */
	public void setDr(Integer newDr) {
		this.dr = newDr;
	}

	/**
	 * arri_provinceGetter. :2012-08-22 17:37:47
	 * 
	 * @return String
	 */
	public String getArri_province() {
		return arri_province;
	}

	/**
	 * arri_provinceSetter. :2012-08-22 17:37:47
	 * 
	 * @param newArri_province
	 *            String
	 */
	public void setArri_province(String newArri_province) {
		this.arri_province = newArri_province;
	}

	/**
	 * vbillstatusGetter. :2012-08-22 17:37:47
	 * 
	 * @return Integer
	 */
	public Integer getVbillstatus() {
		return vbillstatus;
	}

	/**
	 * vbillstatusSetter. :2012-08-22 17:37:47
	 * 
	 * @param newVbillstatus
	 *            Integer
	 */
	public void setVbillstatus(Integer newVbillstatus) {
		this.vbillstatus = newVbillstatus;
	}

	/**
	 * deli_phoneGetter. :2012-08-22 17:37:47
	 * 
	 * @return String
	 */
	public String getDeli_phone() {
		return deli_phone;
	}

	/**
	 * deli_phoneSetter. :2012-08-22 17:37:47
	 * 
	 * @param newDeli_phone
	 *            String
	 */
	public void setDeli_phone(String newDeli_phone) {
		this.deli_phone = newDeli_phone;
	}

	/**
	 * arri_emailGetter. :2012-08-22 17:37:47
	 * 
	 * @return String
	 */
	public String getArri_email() {
		return arri_email;
	}

	/**
	 * arri_emailSetter. :2012-08-22 17:37:47
	 * 
	 * @param newArri_email
	 *            String
	 */
	public void setArri_email(String newArri_email) {
		this.arri_email = newArri_email;
	}

	/**
	 * pk_segmentGetter. :2012-08-22 17:37:47
	 * 
	 * @return String
	 */
	public String getPk_segment() {
		return pk_segment;
	}

	/**
	 * pk_segmentSetter. :2012-08-22 17:37:47
	 * 
	 * @param newPk_segment
	 *            String
	 */
	public void setPk_segment(String newPk_segment) {
		this.pk_segment = newPk_segment;
	}

	/**
	 * deli_emailGetter. :2012-08-22 17:37:47
	 * 
	 * @return String
	 */
	public String getDeli_email() {
		return deli_email;
	}

	/**
	 * deli_emailSetter. :2012-08-22 17:37:47
	 * 
	 * @param newDeli_email
	 *            String
	 */
	public void setDeli_email(String newDeli_email) {
		this.deli_email = newDeli_email;
	}

	/**
	 * pk_arrivalGetter. :2012-08-22 17:37:47
	 * 
	 * @return String
	 */
	public String getPk_arrival() {
		return pk_arrival;
	}

	/**
	 * pk_arrivalSetter. :2012-08-22 17:37:47
	 * 
	 * @param newPk_arrival
	 *            String
	 */
	public void setPk_arrival(String newPk_arrival) {
		this.pk_arrival = newPk_arrival;
	}

	/**
	 * tsGetter. :2012-08-22 17:37:47
	 * 
	 * @return UFDateTime
	 */
	public UFDateTime getTs() {
		return ts;
	}

	/**
	 * tsSetter. :2012-08-22 17:37:47
	 * 
	 * @param newTs
	 *            UFDateTime
	 */
	public void setTs(UFDateTime newTs) {
		this.ts = newTs;
	}

	/**
	 * arri_mobileGetter. :2012-08-22 17:37:47
	 * 
	 * @return String
	 */
	public String getArri_mobile() {
		return arri_mobile;
	}

	/**
	 * arri_mobileSetter. :2012-08-22 17:37:47
	 * 
	 * @param newArri_mobile
	 *            String
	 */
	public void setArri_mobile(String newArri_mobile) {
		this.arri_mobile = newArri_mobile;
	}

	/**
	 * arri_contactGetter. :2012-08-22 17:37:47
	 * 
	 * @return String
	 */
	public String getArri_contact() {
		return arri_contact;
	}

	/**
	 * arri_contactSetter. :2012-08-22 17:37:47
	 * 
	 * @param newArri_contact
	 *            String
	 */
	public void setArri_contact(String newArri_contact) {
		this.arri_contact = newArri_contact;
	}

	/**
	 * arri_cityGetter. :2012-08-22 17:37:47
	 * 
	 * @return String
	 */
	public String getArri_city() {
		return arri_city;
	}

	/**
	 * arri_citySetter. :2012-08-22 17:37:47
	 * 
	 * @param newArri_city
	 *            String
	 */
	public void setArri_city(String newArri_city) {
		this.arri_city = newArri_city;
	}

	/**
	 * seg_typeGetter. :2012-08-22 17:37:47
	 * 
	 * @return Integer
	 */
	public Integer getSeg_type() {
		return seg_type;
	}

	/**
	 * seg_typeSetter. :2012-08-22 17:37:47
	 * 
	 * @param newSeg_type
	 *            Integer
	 */
	public void setSeg_type(Integer newSeg_type) {
		this.seg_type = newSeg_type;
	}

	/**
	 * vbillnoGetter. :2012-08-22 17:37:47
	 * 
	 * @return String
	 */
	public String getVbillno() {
		return vbillno;
	}

	/**
	 * vbillnoSetter. :2012-08-22 17:37:47
	 * 
	 * @param newVbillno
	 *            String
	 */
	public void setVbillno(String newVbillno) {
		this.vbillno = newVbillno;
	}

	/**
	 * deli_mobileGetter. :2012-08-22 17:37:47
	 * 
	 * @return String
	 */
	public String getDeli_mobile() {
		return deli_mobile;
	}

	/**
	 * deli_mobileSetter. :2012-08-22 17:37:47
	 * 
	 * @param newDeli_mobile
	 *            String
	 */
	public void setDeli_mobile(String newDeli_mobile) {
		this.deli_mobile = newDeli_mobile;
	}

	/**
	 * distanceGetter. :2012-08-22 17:37:47
	 * 
	 * @return UFDouble
	 */
	public UFDouble getDistance() {
		return distance;
	}

	/**
	 * distanceSetter. :2012-08-22 17:37:47
	 * 
	 * @param newDistance
	 *            UFDouble
	 */
	public void setDistance(UFDouble newDistance) {
		this.distance = newDistance;
	}

	/**
	 * req_arri_timeGetter. :2012-08-22 17:37:47
	 * 
	 * @return String
	 */
	public String getReq_arri_time() {
		return req_arri_time;
	}

	/**
	 * req_arri_timeSetter. :2012-08-22 17:37:47
	 * 
	 * @param newReq_arri_time
	 *            String
	 */
	public void setReq_arri_time(String newReq_arri_time) {
		this.req_arri_time = newReq_arri_time;
	}

	/**
	 * invoice_vbillnoGetter. :2012-08-22 17:37:47
	 * 
	 * @return String
	 */
	public String getInvoice_vbillno() {
		return invoice_vbillno;
	}

	/**
	 * invoice_vbillnoSetter. :2012-08-22 17:37:47
	 * 
	 * @param newInvoice_vbillno
	 *            String
	 */
	public void setInvoice_vbillno(String newInvoice_vbillno) {
		this.invoice_vbillno = newInvoice_vbillno;
	}

	/**
	 * memoGetter. :2012-08-22 17:37:47
	 * 
	 * @return String
	 */
	public String getMemo() {
		return memo;
	}

	/**
	 * memoSetter. :2012-08-22 17:37:47
	 * 
	 * @param newMemo
	 *            String
	 */
	public void setMemo(String newMemo) {
		this.memo = newMemo;
	}

	public String getReq_arri_date() {
		return req_arri_date;
	}

	public void setReq_arri_date(String req_arri_date) {
		this.req_arri_date = req_arri_date;
	}

	public String getReq_deli_date() {
		return req_deli_date;
	}

	public void setReq_deli_date(String req_deli_date) {
		this.req_deli_date = req_deli_date;
	}

	/**
	 * weight_countGetter. :2012-08-22 17:37:47
	 * 
	 * @return UFDouble
	 */
	public UFDouble getWeight_count() {
		return weight_count;
	}

	/**
	 * weight_countSetter. :2012-08-22 17:37:47
	 * 
	 * @param newWeight_count
	 *            UFDouble
	 */
	public void setWeight_count(UFDouble newWeight_count) {
		this.weight_count = newWeight_count;
	}

	/**
	 * deli_cityGetter. :2012-08-22 17:37:47
	 * 
	 * @return String
	 */
	public String getDeli_city() {
		return deli_city;
	}

	/**
	 * deli_citySetter. :2012-08-22 17:37:47
	 * 
	 * @param newDeli_city
	 *            String
	 */
	public void setDeli_city(String newDeli_city) {
		this.deli_city = newDeli_city;
	}

	/**
	 * create_userGetter. :2012-08-22 17:37:47
	 * 
	 * @return String
	 */
	public String getCreate_user() {
		return create_user;
	}

	/**
	 * create_userSetter. :2012-08-22 17:37:47
	 * 
	 * @param newCreate_user
	 *            String
	 */
	public void setCreate_user(String newCreate_user) {
		this.create_user = newCreate_user;
	}

	/**
	 * arri_detail_addrGetter. :2012-08-22 17:37:47
	 * 
	 * @return String
	 */
	public String getArri_detail_addr() {
		return arri_detail_addr;
	}

	/**
	 * arri_detail_addrSetter. :2012-08-22 17:37:47
	 * 
	 * @param newArri_detail_addr
	 *            String
	 */
	public void setArri_detail_addr(String newArri_detail_addr) {
		this.arri_detail_addr = newArri_detail_addr;
	}

	/**
	 * pk_deliveryGetter. :2012-08-22 17:37:47
	 * 
	 * @return String
	 */
	public String getPk_delivery() {
		return pk_delivery;
	}

	/**
	 * pk_deliverySetter. :2012-08-22 17:37:47
	 * 
	 * @param newPk_delivery
	 *            String
	 */
	public void setPk_delivery(String newPk_delivery) {
		this.pk_delivery = newPk_delivery;
	}

	/**
	 * deli_contactGetter. :2012-08-22 17:37:47
	 * 
	 * @return String
	 */
	public String getDeli_contact() {
		return deli_contact;
	}

	/**
	 * deli_contactSetter. :2012-08-22 17:37:47
	 * 
	 * @param newDeli_contact
	 *            String
	 */
	public void setDeli_contact(String newDeli_contact) {
		this.deli_contact = newDeli_contact;
	}

	/**
	 * volume_countGetter. :2012-08-22 17:37:47
	 * 
	 * @return UFDouble
	 */
	public UFDouble getVolume_count() {
		return volume_count;
	}

	/**
	 * volume_countSetter. :2012-08-22 17:37:47
	 * 
	 * @param newVolume_count
	 *            UFDouble
	 */
	public void setVolume_count(UFDouble newVolume_count) {
		this.volume_count = newVolume_count;
	}

	public Integer getNum_count() {
		return num_count;
	}

	public void setNum_count(Integer num_count) {
		this.num_count = num_count;
	}

	public Integer getMileage() {
		return mileage;
	}

	public void setMileage(Integer mileage) {
		this.mileage = mileage;
	}

	/**
	 * deli_provinceGetter. :2012-08-22 17:37:47
	 * 
	 * @return String
	 */
	public String getDeli_province() {
		return deli_province;
	}

	/**
	 * deli_provinceSetter. :2012-08-22 17:37:47
	 * 
	 * @param newDeli_province
	 *            String
	 */
	public void setDeli_province(String newDeli_province) {
		this.deli_province = newDeli_province;
	}

	/**
	 * seg_markGetter. :2012-08-22 17:37:47
	 * 
	 * @return Integer
	 */
	public Integer getSeg_mark() {
		return seg_mark;
	}

	/**
	 * seg_markSetter. :2012-08-22 17:37:47
	 * 
	 * @param newSeg_mark
	 *            Integer
	 */
	public void setSeg_mark(Integer newSeg_mark) {
		this.seg_mark = newSeg_mark;
	}

	/**
	 * parent_segGetter. :2012-08-22 17:37:47
	 * 
	 * @return String
	 */
	public String getParent_seg() {
		return parent_seg;
	}

	/**
	 * parent_segSetter. :2012-08-22 17:37:47
	 * 
	 * @param newParent_seg
	 *            String
	 */
	public void setParent_seg(String newParent_seg) {
		this.parent_seg = newParent_seg;
	}

	/**
	 * deli_detail_addrGetter. :2012-08-22 17:37:47
	 * 
	 * @return String
	 */
	public String getDeli_detail_addr() {
		return deli_detail_addr;
	}

	/**
	 * deli_detail_addrSetter. :2012-08-22 17:37:47
	 * 
	 * @param newDeli_detail_addr
	 *            String
	 */
	public void setDeli_detail_addr(String newDeli_detail_addr) {
		this.deli_detail_addr = newDeli_detail_addr;
	}

	/**
	 * <p>
	 * oVO.
	 * <p>
	 * :2012-08-22 17:37:47
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getParentPKFieldName() {
		return null;
	}

	/**
	 * <p>
	 * ~n.
	 * <p>
	 * :2012-08-22 17:37:47
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getPKFieldName() {
		return "pk_segment";
	}

	/**
	 * <p>
	 * .
	 * <p>
	 * :2012-08-22 17:37:47
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getTableName() {
		return "ts_segment";
	}

	/**
	 * I'.
	 * 
	 * :2012-08-22 17:37:47
	 */
	public SegmentVO() {
		super();
	}

	/**
	 * 在操作运段的分段时通常需要拷贝运段的包装信息
	 * 
	 * @return
	 */
	public SegmentVO clone() {
		SegmentVO cloneObj = null;
		try {
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			ObjectOutputStream oo = new ObjectOutputStream(out);
			oo.writeObject(this);

			ByteArrayInputStream in = new ByteArrayInputStream(out.toByteArray());
			ObjectInputStream oi = new ObjectInputStream(in);
			cloneObj = (SegmentVO) oi.readObject();
		} catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		return cloneObj;
	}
}
