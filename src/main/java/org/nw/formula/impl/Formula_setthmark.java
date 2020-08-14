package org.nw.formula.impl;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.nw.formula.AbstractFormula;
import org.nw.formula.IFormula;

/**
 * setThMark(String)将传入的字符串或数字转为金额后加入千分位标志 如果希望保留数字后面的0,则需要先将数字转为字符创,
 * 然后再用setThMark()函数,比如setThMark(toString(56510.000)).
 * 
 * @author fangw
 */
public class Formula_setthmark extends AbstractFormula {

	/**
	 * 获取公式执行结果
	 * 
	 * @param rowContext
	 * @return
	 */
	public Object getResult(Map<String, Object> rowContext) {
		logger.debug("开始执行公式：" + this.getFormulaStr());

		List<Object> argList = new ArrayList<Object>(this.getArgs().size());
		argList.addAll(this.getArgs());// 不能直接用getArgs(),因为不能直接改变它，否则会出问题

		for(int i = 0; i < argList.size(); i++) {
			Object obj = argList.get(i);
			if(obj instanceof IFormula) {
				IFormula formula = (IFormula) obj;
				// 如果参数是子公式，则先执行子公式
				argList.set(i, formula.getResult(rowContext));
			} else {
				try {
					Double.parseDouble(obj.toString());
				} catch(NumberFormatException e) {
					// 如果参数不是子公式，且不能转化为数值，则把变量翻译为值
					argList.set(i, rowContext.get(obj));
				}
			}
		}

		// 进行计算
		if(argList.get(0) == null || argList.get(0).toString().equalsIgnoreCase("null")) {
			return null;
		} else {
			DecimalFormat df = new DecimalFormat();
			df.setGroupingUsed(true);// 显示千分位

			Double value = null;
			if(argList.get(0) instanceof Double) {
				value = (Double) argList.get(0);
			} else {
				String str = argList.get(0).toString();
				if(str.contains(".")) {
					str = str.substring(str.indexOf(".") + 1);
					df.setMinimumFractionDigits(str.length());
					df.setMaximumFractionDigits(str.length());
				}
				value = Double.parseDouble(argList.get(0).toString());
			}

			return df.format(value);
		}
	}

}