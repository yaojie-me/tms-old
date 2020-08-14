package com.tms.vo.fleet;

import org.nw.vo.pub.SuperVO;
import org.nw.vo.pub.lang.UFDateTime;
import org.nw.vo.pub.lang.UFDouble;
@SuppressWarnings("serial")
public class RemiBVO extends SuperVO {
	
	private String pk_remi;
	private String pk_remi_b;
	private String pk_vehicle_pay;
	private String pk_expense_type;
	private UFDouble amount;
	private String memo;
	
	private Integer dr;
	private String ts;
	
	private String def1;
	private String def2;
	private String def4;
	private String def3;
	private String def5;
	private String def6;
	private String def7;
	private String def8;
	private String def9;
	private String def10;
	private UFDouble def11;
	private UFDouble def12;
	
	public static final String PK_REMI = "pk_remi";
	public static final String PK_REMI_B = "pk_remi_b";

	public String getPk_remi() {
		return pk_remi;
	}

	public void setPk_remi(String pk_remi) {
		this.pk_remi = pk_remi;
	}

	public String getPk_remi_b() {
		return pk_remi_b;
	}

	public void setPk_remi_b(String pk_remi_b) {
		this.pk_remi_b = pk_remi_b;
	}

	public String getPk_vehicle_pay() {
		return pk_vehicle_pay;
	}

	public void setPk_vehicle_pay(String pk_vehicle_pay) {
		this.pk_vehicle_pay = pk_vehicle_pay;
	}

	public String getPk_expense_type() {
		return pk_expense_type;
	}

	public void setPk_expense_type(String pk_expense_type) {
		this.pk_expense_type = pk_expense_type;
	}

	public UFDouble getAmount() {
		return amount;
	}

	public void setAmount(UFDouble amount) {
		this.amount = amount;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public Integer getDr() {
		return dr;
	}

	public void setDr(Integer dr) {
		this.dr = dr;
	}

	public String getTs() {
		return ts;
	}

	public void setTs(String ts) {
		this.ts = ts;
	}

	public String getDef1() {
		return def1;
	}

	public void setDef1(String def1) {
		this.def1 = def1;
	}

	public String getDef2() {
		return def2;
	}

	public void setDef2(String def2) {
		this.def2 = def2;
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

	public String getDef9() {
		return def9;
	}

	public void setDef9(String def9) {
		this.def9 = def9;
	}

	public String getDef10() {
		return def10;
	}

	public void setDef10(String def10) {
		this.def10 = def10;
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

	public RemiBVO() {
		super();
	}

	@Override
	public String getParentPKFieldName() {
		return PK_REMI;
	}

	@Override
	public String getPKFieldName() {
		return "PK_REMI_B";
	}

	@Override
	public String getTableName() {
		return "ts_remi_b";
	}

}
