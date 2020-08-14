<!-- 加入这个注释避免当body没有html内容时，在ie下出现空白行,同时在IE下当点击日期控件时出现js错误	-->
<script type="text/javascript">
	<#import "bill-marco.ftl" as billMarco>
	<#list components?keys as pos> 
			<#if '${isBuildHeaderCard}' == 'true'>
				<#if '${pos}' != '1'>
					<@billMarco.genHeaderCard pos />
				</#if>
			</#if>
	</#list>
	Ext.namespace("${moduleName}");
	if(!${moduleName + ".appUiConfig"}) {
		${moduleName + ".appUiConfig"} = {};
	}
	var S = ${moduleName + ".appUiConfig"};
	<#if '${isBuildHeaderCard}' == 'true'>
		if(card_0 != null){
			S.headerCard = card_0;
		}
		if(card_2 != null) {
			S.footCard = card_2;
		}
	</#if>
	
	<#if '${isBuildHeaderGrid}' == 'true'>
		<@billMarco.genHeaderGrid/>
	</#if>
	
	<@billMarco.genBodyGrid/>

	S.templateID='${templateID}';
	S.headerPkField = '${headerPkField}';
	S.context = new uft.jf.Context();
	S.context.setBillType('${billType}');
	S.context.setBillId('${billId}');
	S.context.setBillIds('${billIds}');
	S.context.setTemplateID('${templateID}');
	S.context.setHeaderTabCode('${headerTabCode}');
	S.context.setBodyTabCode('${bodyTabCode}');
	S.context.setFunCode('${funCode}');
	S.context.setNodeKey('${nodeKey}');
	
	<#if '${headerHeight}' != '' && '${headerHeight}' != 'null'>
		S.headerHeight = parseInt('${headerHeight}');
	</#if>
	S.waterfallScene = '${waterfallScene}'=='true';
	S.bodyWaterfallScene = '${bodyWaterfallScene}'=='true';
	S.headerSplit = '${headerSplit}'=='true';
	S.btnArray = '${btnArray}';
	var lia = '${lockingItemAry}';
	if(lia != 'null'){
		var queryItems = Ext.decode(lia);
		if(queryItems.length > 0){
			if(!window.qConfig){
				window.qConfig = {};
			}
			Ext.apply(window.qConfig,{queryItems:queryItems,grid:S.headerGrid||S.bodyGrids[0]});
			S.topQueryForm = new uft.jf.QueryFormPanel(window.qConfig);
		}
	}
	delete S;
</script>

