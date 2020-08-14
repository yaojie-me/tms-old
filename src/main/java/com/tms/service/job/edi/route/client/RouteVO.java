/***************************************************************\
 *     The skeleton of this class is generated by an automatic *
 * code generator for NC product. It is based on Velocity.     *
\***************************************************************/
package com.tms.service.job.edi.route.client;

import org.nw.vo.pub.SuperVO;
import org.nw.vo.pub.lang.UFBoolean;
import org.nw.vo.pub.lang.UFDate;
import org.nw.vo.pub.lang.UFDateTime;
import org.nw.vo.pub.lang.UFDouble;

@SuppressWarnings("serial")
public class RouteVO extends SuperVO {
	private String pk_route;
	private String commandname;
	private String message;
	private Integer dr;
	private UFDateTime ts;
	private String syncexp_memo;
	private UFBoolean syncexp_flag;
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
	
	
	public String getPk_route() {
		return pk_route;
	}

	public void setPk_route(String pk_route) {
		this.pk_route = pk_route;
	}

	public String getCommandname() {
		return commandname;
	}

	public void setCommandname(String commandname) {
		this.commandname = commandname;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getDr() {
		return dr;
	}

	public void setDr(Integer dr) {
		this.dr = dr;
	}

	public UFDateTime getTs() {
		return ts;
	}

	public void setTs(UFDateTime ts) {
		this.ts = ts;
	}

	public String getSyncexp_memo() {
		return syncexp_memo;
	}

	public void setSyncexp_memo(String syncexp_memo) {
		this.syncexp_memo = syncexp_memo;
	}

	public UFBoolean getSyncexp_flag() {
		return syncexp_flag;
	}

	public void setSyncexp_flag(UFBoolean syncexp_flag) {
		this.syncexp_flag = syncexp_flag;
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

	public java.lang.String getParentPKFieldName() {
		return null;
	}

	public java.lang.String getPKFieldName() {
		return "pk_route";
	}

	public java.lang.String getTableName() {
		return "edi_route";
	}

}