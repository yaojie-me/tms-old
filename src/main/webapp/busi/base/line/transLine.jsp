<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<html>
	<head>
		<%@ include file="/common/header.jsp"%>
	</head>
	<body>
	<!-- 加入这个注释避免当body没有html内容时，在ie下出现空白行	-->
	<nw:Bill templetVO="${templetVO}" headerGridPageSize="20" headerGridImmediatelyLoad="true"  headerGridCheckboxSelectionModel="true" 
		headerGridSingleSelect="false" bodyGridsPagination="false"/>				
	</body>
	<script type="text/javascript">

		//自定义工具类，从基类继承可以使用基类已经定义的button，以及button和handler的绑定
		MyToolbar = Ext.extend(uft.jf.ToftToolbar, {
			getBtnArray : function(){
				var btns = new Array();
				btns.push(this.btn_query);
				btns.push(this.btn_add);
				btns.push(this.btn_edit);
				btns.push(this.btn_copy);
				btns.push(this.btn_save);
				btns.push(this.btn_can);
				btns.push(this.btn_del);
				btns.push(this.btn_ref);
				btns.push(this.btn_list);
				btns.push(this.btn_card);
				btns.push(this.btn_import);
				btns.push(this.btn_export);
				return btns;
			},
			btn_edit_handler : function(){
				MyToolbar.superclass.btn_edit_handler.call(this);
				var line_code = uft.Utils.getField('line_code');
				line_code.setReadOnly(true);
			}
		});
		${moduleName}.appUiConfig.toolbar = new MyToolbar(${moduleName}.appUiConfig);
		var app = new uft.jf.ToftPanel(${moduleName}.appUiConfig);
		
		var start_addr = Ext.getCmp('start_addr'),end_addr=Ext.getCmp('end_addr');
		function afterChangeStartAddrType(field,value,originalValue){
			start_addr.setValue(null);
		}
		function afterChangeEndAddrType(field,value,originalValue){
			end_addr.setValue(null);
		}
		start_addr.on('beforesetvalueaftersubmit',function(cmp,obj){
			if(obj && obj.name){
				var name = obj.name;
				name = name.replace('<b>','');
				name = name.replace('</b>','');
				name = name.replace('&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;','');
				obj.name = name;
			}
		});
		end_addr.on('beforesetvalueaftersubmit',function(cmp,obj){
			if(obj && obj.name){
				var name = obj.name;
				name = name.replace('<b>','');
				name = name.replace('</b>','');
				name = name.replace('&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;','');
				obj.name = name;
			}
		});
	</script>
	<%@ include file="/common/footer.jsp"%>
</html>
	
