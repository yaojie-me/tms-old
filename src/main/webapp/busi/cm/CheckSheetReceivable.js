Ext.ns('uft.cm');
/**
 * 对账单收款
 * @param {} config
 */
uft.cm.CheckSheetReceivable = function(config){
	Ext.apply(this,config);
	if(!this.record){
		uft.Utils.showErrorMsg('请先选择要收款的记录！');
		return false;
	}
//	var values = Utils.doSyncRequest(ctxPath+'/cm/rd/getCheckHead.json',{bala_customer:this.record.data['bala_customer']});
//	var checkHead = values.checkHead;
	this.formPanel = new uft.extend.form.FormPanel({
		labelWidth : 80,
		border : false,
		items : [{
				layout : 'tableform',
				layoutConfig: {columns:2},
				border : false,
				padding : '5px 5px 0',
				defaults:{
					anchor: '95%',
					xtype : 'textfield'
				},      
				items : [{
					name : 'vbillno',
					fieldLabel : '对账单号',
					itemCls:'uft-form-label-not-edit',
					value : this.record.data['vbillno'],
					readOnly : true,
					colspan : 1
				},{
					name : 'customer_name',
					fieldLabel : '客户',
					itemCls:'uft-form-label-not-edit',
					readOnly : true,
					value : this.record.data['customer_name'],
					colspan : 1
				},{
					name : 'bala_customer_name',
					fieldLabel : '结算客户',
					itemCls:'uft-form-label-not-edit',
					readOnly : true,
					value : this.record.data['bala_customer_name'],
					colspan : 1
				},{
					name : 'cost_amount',
					fieldLabel : '总金额',
					itemCls:'uft-form-label-not-edit',
					xtype : 'uftnumberfield',
					readOnly : true,
					decimalPrecision : 2,
					value : this.record.data['cost_amount'],
					colspan : 1
				},{
					name : 'got_amount',
					fieldLabel : '已收金额',
					itemCls:'uft-form-label-not-edit',
					xtype : 'uftnumberfield',
					readOnly : true,
					decimalPrecision : 2,
					value : this.record.data['got_amount'],
					colspan : 1
				},{
					name : 'ungot_amount',
					fieldLabel : '未收金额',
					itemCls:'uft-form-label-not-edit',
					xtype : 'uftnumberfield',
					readOnly : true,
					decimalPrecision : 2,
					value : this.record.data['ungot_amount'],
					colspan : 1
				},{
					name : 'receivable_amount',
					fieldLabel : '本次收款金额',
					xtype : 'uftnumberfield',
					allowBlank : false,
					itemCls:'uft-form-label-not-null',
					decimalPrecision : 2,
					value : this.record.data['ungot_amount'],
					colspan : 1
				},{
					xtype : 'uftdatefield',
					name : 'receivable_date',
					fieldLabel : '收款日期',
					allowBlank : false,
					itemCls:'uft-form-label-not-null',
					value : DateUtils.formatDate(new Date(),'yyyy-MM-dd'),
					colspan : 1
				},{"refName":"用户档案-web",
				   "xtype":"headerreffield",
				   "id":"receivable_man",
				   "name":"receivable_man",
				   "fieldLabel":"收款人",
				   "colspan":1,
				   "refWindow":{"model":1,"leafflag":false,"params":"refName:'用户档案-web'",
				   				"gridDataUrl":ctxPath + "/ref/common/user/load4Grid.json",
				   				"extGridColumnDescns":[
				   					{"type":"string","width":120,"dataIndex":"pk_user","sortable":true,"xtype":"gridcolumn","hidden":true},
				   					{"header":"用户编码","type":"string","width":120,"dataIndex":"user_code","xtype":"gridcolumn"},
				   					{"header":"用户名称","type":"string","width":120,"dataIndex":"user_name","xtype":"gridcolumn"},
				   					{"header":"用户备注","type":"string","width":120,"dataIndex":"user_note","xtype":"gridcolumn"},
				   					{"header":"用户类型","type":"string","width":120,"dataIndex":"user_type","xtype":"gridcolumn"}]},
				   				"pkField":"pk_user","codeField":"user_code","nameField":"user_name",
				   				"showCodeOnBlur":false,
				   				"getByPkUrl":ctxPath + "/ref/common/user/getByPk.do",
				   				"getByCodeUrl":ctxPath + "/ref/common/user/getByCode.do"
				},{
					xtype : 'uftcombo',
					name : 'receivable_method',
					fieldLabel : '收款方式',
					itemCls:'uft-form-label-not-null',
					allowBlank : false,
					dataUrl : ctxPath+'/cm/rd/getReceivableMethod.json',
					colspan : 1
				},{
					name : 'check_no',
					fieldLabel : '发票号',
					value : this.record.data['check_no'],
					colspan : 1
				},{
					name : 'check_head',
					fieldLabel : '发票抬头',
					value : this.record.data['check_head'],
					colspan : 1
				},{
					name : 'discount',
					fieldLabel : '贴息',
					xtype : 'uftnumberfield',
					decimalPrecision : 2,
					colspan : 1
				},{
					xtype : 'uftcombo',
					name : 'discount_memo',
					fieldLabel : '贴息原因',
					dataUrl : ctxPath+'/cm/rd/getDiscountMemo.json',
					colspan : 1
				},{
					name : 'check_remark',
					fieldLabel : '发票备注',
					value : this.record.data['check_remark'],
					colspan : 2
				},{
					name : 'memo',
					fieldLabel : '收款备注',
					colspan : 2
				}]
			}]
	});
	uft.cm.CheckSheetReceivable.superclass.constructor.call(this, {
		title : '收款',
		width : 500,
		height : 300,
		collapsible : false,
		frame : true,
		closable : true,
		draggable : true,
		resizable : true,
		modal : true,
		border : false,
		layout : 'fit',
		items : [this.formPanel],
		buttons : [{
			iconCls : 'btnYes',
			text : '保&nbsp;&nbsp;存',
			actiontype : 'submit',
			scope : this,
			handler : this.saveAction
		},{
			iconCls : 'btnCancel',
			text : '取&nbsp;&nbsp;消',
			scope : this,
			handler : function() {
				this.destroy();
			}
		}]
    });	
};
Ext.extend(uft.cm.CheckSheetReceivable,Ext.Window, {
	saveAction : function(){
		var pk_rece_check_sheet = this.record.data['pk_rece_check_sheet'];
		var vbillno = this.record.data['vbillno'];
		var form = this.formPanel.getForm();
		var errors = this.formPanel.getErrors();
		if(errors.length==0) {
			var values = form.getFieldValues(false);
			Ext.apply(values,{relationid:pk_rece_check_sheet,vbillno:vbillno});
			var params = this.app.newAjaxParams();
			params[uft.jf.Constants.HEADER] = Ext.encode(values);
			uft.Utils.doAjax({
		    	scope : this,
		    	params : params,
		    	isTip : false,
		    	url : 'receivable.json',
		    	success : function(values){
		    		if(values){//保存成功直接销毁窗口
		    			if(values.datas){
		    				this.app._setHeaderValues([this.record],values.datas);
		    				this.app.statusMgr.setBizStatus(values.datas[0][this.app.getBillStatusField()]);
		    				this.app.statusMgr.updateStatus();
		    			}
			    		this.destroy();
		    		}
		    	}
		    });	
		}else{
			uft.Utils.showWarnMsg(Utils.arrayToString(errors,''));
			return;
		}
	}
});
