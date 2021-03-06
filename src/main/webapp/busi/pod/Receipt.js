Ext.ns('uft.pod');
/**
 * 回单
 * @param {} config
 */
uft.pod.Receipt = function(config){
	Ext.apply(this,config);
	if(!this.records){
		uft.Utils.showErrorMsg('请先选择要回单的记录！');
		return false;
	}
	this.formPanel = new uft.extend.form.FormPanel({
		labelWidth : 60,
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
					name : 'receipt_man',
					fieldLabel : '回单人',
					allowBlank : false,
					itemCls:'uft-form-label-not-null',
					colspan : 1
				},{
					xtype : 'datetimefield',
					name : 'act_receipt_date',
					fieldLabel : '回单时间',
					allowBlank : false,
					itemCls:'uft-form-label-not-null',
					value : DateUtils.formatDate(new Date(),'yyyy-MM-dd H:m:s'),
					newlineflag : true,
					colspan : 1
				},{
					name : 'receipt_memo',
					fieldLabel : '回单备注',
					colspan : 2
				}]
			}]
	});
	uft.pod.Receipt.superclass.constructor.call(this, {
		title : '回单',
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
Ext.extend(uft.pod.Receipt,Ext.Window, {
	saveAction : function(){
		var form = this.formPanel.getForm();
		var errors = this.formPanel.getErrors();
		if(errors.length!=0) {
			uft.Utils.showWarnMsg(Utils.arrayToString(errors,''));
			return;
		}
		var params = this.app.newAjaxParams(),pks=[];
		for(var i=0;i<this.records.length;i++){
			pks.push(this.records[i].data['pk_invoice']);
		}
		params['pk_invoice'] = pks;
		var values = form.getFieldValues(false);
		Ext.apply(params,values);
		uft.Utils.doAjax({
	    	scope : this,
	    	params : params,
	    	url : 'receipt.json',
	    	success : function(values){
	    		if(values && values.datas){//保存成功直接销毁窗口
    				for(var i=0;i<values.datas.length;i++){
	    				this.app.setAppValues(values.datas[i],{updateToHeaderGrid:true,updateRecord:this.records[i],saveToCache:true,updateBody:false});
    				}
    				if(typeof(this.app.getBillStatusField) == 'function'){
		    			this.app.statusMgr.setBizStatus(values.datas[0].HEADER[this.app.getBillStatusField()]);
		    		}
	    			this.app.statusMgr.updateStatus();
	    		}
	    		this.destroy();
	    	}
	    });				
	}
});
