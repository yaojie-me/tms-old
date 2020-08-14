Ext.ns('uft.cm');
/**
 * 对账单收款记录
 * @param {} config
 */
uft.cm.ReceCheckSheetRecord = function(config){
	Ext.apply(this,config);
	if(!this.record){
		uft.Utils.showErrorMsg('请先选择记录！');
		return false;
	}
	var values = Utils.doSyncRequest('getTempletMap.json',{funCode:'t481',tabCode:'ts_rece_check_sheet_record'},'POST');
	if(!values || !values.data){
		if(langague && langague == 'en_US'){
			uft.Utils.showErrorMsg('No template data,funCode：t481,tabcode:ts_rece_check_sheet_record！');
		}else{
			uft.Utils.showErrorMsg('没有模板数据，funCode：t481,tabcode:ts_rece_check_sheet_record！');
		}
		return false;
	}
	var R=values.data.records;
	var C=values.data.columns;
	var params = values.data.params;
	params['isBody'] = 'true';
	params['pk_rece_check_sheet'] = this.record.data['pk_rece_check_sheet'];
	this.grid = new uft.extend.grid.BasicGrid({
		id : 'ts_rece_check_sheet_record_1',
		pkFieldName : 'pk_rece_check_sheet_record',
		dataUrl:'loadReceCheckSheetRecord.json',
		immediatelyLoad : true,
		isCheckboxSelectionModel : false,
		params : params,
		recordType : R,
		columns : C
	});
	uft.cm.ReceCheckSheetRecord.superclass.constructor.call(this, {
		title : '收款记录',
		width : 800,
		height : 500,
		collapsible : false,
		frame : true,
		closable : true,
		draggable : true,
		resizable : true,
		modal : true,
		border : false,
		layout : 'fit',
		items : [this.grid],
		buttons : [{
			iconCls : 'btnCancel',
			text : '关&nbsp;&nbsp;闭',
			scope : this,
			handler : function() {
				this.destroy();
			}
		}]
    });
	var processorColumn = uft.Utils.getColumn(this.grid,'_processor');
	if(processorColumn){
		processorColumn.renderer = function(){
			return "<div align='center'><a href='javascript:deleteReceCheckSheetRecord();'>删除</a></div>";
		};	
	}    
};
Ext.extend(uft.cm.ReceCheckSheetRecord,Ext.Window, {
});
//删除收款纪录,将收款金额恢复
function deleteReceCheckSheetRecord(){
	var grid = Ext.getCmp('ts_rece_check_sheet_record_1');
	if(grid){
		var record = uft.Utils.getSelectedRecord(grid);
		var pk_rece_check_sheet_record = record.data['pk_rece_check_sheet_record'];
		var params = this.app.newAjaxParams();
		params['pk_rece_check_sheet_record']=pk_rece_check_sheet_record;
		uft.Utils.doAjax({
	    	scope : this,
	    	params : params,
	    	isTip : false,
	    	url : 'deleteReceCheckSheetRecord.json',
	    	success : function(values){
	    		if(values){//保存成功直接销毁窗口
	    			grid.getStore().remove(record);
	    			if(values.datas){
	    				var headerGrid = app.getHeaderGrid();
	    				var headerRecord = uft.Utils.getSelectedRecord(headerGrid);
	    				app._setHeaderValues([headerRecord],values.datas);
	    				this.app.statusMgr.setBizStatus(values.datas[0][this.app.getBillStatusField()]);
	    				this.app.statusMgr.updateStatus();
	    			}
	    		}
	    	}
	    });
	}
}