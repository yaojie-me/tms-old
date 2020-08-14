package com.tms.vo.inv;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import org.nw.vo.pub.CircularlyAccessibleValueObject;
import org.nw.vo.pub.SuperVO;
import org.nw.vo.trade.pub.IExAggVO;

import org.nw.vo.HYBillVO;

public class ExAggOrderlotVO  extends HYBillVO implements IExAggVO {

	private HashMap hmChildVOs = new HashMap();

	public String[] getTableCodes() {

		return new String[] { "ts_orderlot_inv","ts_orderlot_devi","ts_orderlot_rd" };

	}

	public String[] getTableNames() {

		return new String[] { "ts_orderlot_inv","ts_orderlot_devi","ts_orderlot_rd" };
	}

	public CircularlyAccessibleValueObject[] getAllChildrenVO() {

		ArrayList al = new ArrayList();
		for(int i = 0; i < getTableCodes().length; i++) {
			CircularlyAccessibleValueObject[] cvos = getTableVO(getTableCodes()[i]);
			if(cvos != null)
				al.addAll(Arrays.asList(cvos));
		}

		return (SuperVO[]) al.toArray(new SuperVO[0]);
	}

	public CircularlyAccessibleValueObject[] getTableVO(String tableCode) {

		return (CircularlyAccessibleValueObject[]) hmChildVOs.get(tableCode);
	}

	public void setParentId(SuperVO item, String id) {
	}

	public void setTableVO(String tableCode, CircularlyAccessibleValueObject[] vos) {
		hmChildVOs.put(tableCode, vos);
	}

	// 增加一个删除某个tableVO的方法
	public void removeTableVO(String tableCode) {
		hmChildVOs.remove(tableCode);
	}

	public String getDefaultTableCode() {

		return getTableCodes()[0];
	}

	public SuperVO[] getChildVOsByParentId(String tableCode, String parentId) {

		return null;
	}

	public HashMap getHmEditingVOs() throws Exception {

		return null;
	}

	public String getParentId(SuperVO item) {

		return null;
	}
}
