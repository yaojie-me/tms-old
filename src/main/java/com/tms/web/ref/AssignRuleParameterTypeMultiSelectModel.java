package com.tms.web.ref;

import org.nw.jf.ext.ref.userdefine.IMultiSelect;
import org.nw.service.sys.impl.DataDictServiceImpl;
import org.nw.vo.pub.AggregatedValueObject;
import org.nw.vo.sys.DataDictBVO;


public class AssignRuleParameterTypeMultiSelectModel implements IMultiSelect {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String getConsult_code() {
		DataDictServiceImpl service = new DataDictServiceImpl();
		AggregatedValueObject aggVO = service.getAggVOByDatatypeCode("assign_rule_parameter_type");
		if(aggVO != null) {
			if(aggVO.getChildrenVO() != null && aggVO.getChildrenVO().length > 0) {
				StringBuffer sb = new StringBuffer("SX,");
				DataDictBVO[] childVOs = (DataDictBVO[]) aggVO.getChildrenVO();
				for(DataDictBVO childVO : childVOs) {
					sb.append(childVO.getDisplay_name()).append("=").append(childVO.getValue()).append(",");
				}
				return sb.substring(0, sb.length() - 1);// 去掉最后一个逗号
			}
		}
		return null;
	}

}
