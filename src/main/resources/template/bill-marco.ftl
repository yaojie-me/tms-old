<#macro getItems cardShowList cardHideList>
	<#if cardShowList?size!=0>
		<#list cardShowList as field>	
		   <#if field_index!=0>,</#if>
			   ${field.genFormItem()}
		</#list>     
	</#if>	
	<#if (cardShowList?size!=0&&cardHideList?size!=0)>
		,
	</#if>
	<#if cardHideList?size!=0>
		<#list cardHideList as field>	
		   <#if field_index!=0>,</#if>
			   ${field.genFormItem()}
		</#list>     
	</#if>
</#macro>
<#macro genHeaderCard pos>
	var ${"card_" + pos} = null;
	<#assign onePosTabVos=components[pos]["onePosTabVos"]/>
	<#assign onePosFieldVosMapWithTab=components[pos]["onePosFieldVosMapWithTab"]/>
	<#assign isShowTab=isShowTab||(onePosTabVos?size>1) /> 
	<#if (onePosTabVos?size>0)>
		${"card_" + pos} = new uft.extend.form.FormPanel({
			labelWidth : ${labelWidth},
			border : false,
			autoScroll : true,
			<#if isShowTab>
				<#if useFieldSetInHeader>
					padding : '5px 0 0 0',
					<#assign idx=1/>
					items : [
						<#list onePosFieldVosMapWithTab?keys as key>
							<#assign tab=UiTempletUtils.filterTabByCode(onePosTabVos, key) /> 
							<#assign onePosFieldVosWithTab=onePosFieldVosMapWithTab[key] /> 
							<#assign cardShowList=UiTempletUtils.filterCardShow(onePosFieldVosWithTab) />
							<#assign cardHideList=UiTempletUtils.filterCardHide(onePosFieldVosWithTab) />
							<#if idx!=1>,</#if>
							{
								xtype : 'fieldset',
								collapsible : true,
								title : '${tab.tabname}',
								layout : 'tableform',
								padding : '5px 5px 0',
								layoutConfig: {columns:${tableColumns}},
								defaults:{
									anchor: '95%'
								},
								items : [
									<@getItems cardShowList cardHideList/>
								]
							}
							<#assign idx=(idx+1)/>
						</#list>
					]
				<#else>
					<#assign idx=1/>
					items: {
						xtype:'tabpanel',
						deferredRender : false,
						border : false,
						activeTab: 0,
						defaults:{
							autoHeight:true, 
							bodyStyle:'padding:10px'
						},						
						items : [
							<#list onePosFieldVosMapWithTab?keys as key>
								<#assign tab=UiTempletUtils.filterTabByCode(onePosTabVos, key) /> 
								<#assign onePosFieldVosWithTab=onePosFieldVosMapWithTab[key] /> 
								<#assign cardShowList=UiTempletUtils.filterCardShow(onePosFieldVosWithTab) />
								<#assign cardHideList=UiTempletUtils.filterCardHide(onePosFieldVosWithTab) />
								<#if idx!=1>,</#if>
								{
									title : '${tab.tabname}',
									layout : 'tableform',
									hideMode: 'offsets',
									padding : '5px 5px 0',
									border : false,
									layoutConfig: {columns:${tableColumns}},
									defaults:{
										anchor: '95%'
									},
									items :[
										<@getItems cardShowList cardHideList/>
									]
								}
								<#assign idx=(idx+1)/>
							</#list>							
						]					
					}
				</#if>
			<#else>
				layout : 'tableform',
				padding : '5px 5px 0',
				layoutConfig: {columns:${tableColumns}},
				defaults:{
					anchor: '95%'
				},
				<#assign idx=1/>
				items : [
					<#list onePosFieldVosMapWithTab?keys as key>
						<#assign onePosFieldVosWithTab=onePosFieldVosMapWithTab[key] /> 
						<#assign cardShowList=UiTempletUtils.filterCardShow(onePosFieldVosWithTab) />
						<#assign cardHideList=UiTempletUtils.filterCardHide(onePosFieldVosWithTab) />
						<@getItems cardShowList cardHideList/>
					</#list>	
				]
			</#if>			
		});
	</#if>
</#macro>

<#macro genHeaderGrid>
	<#assign onePosFieldVos=components["0"]["onePosFieldVos"]/>
	<#assign onePosFieldVosForList=UiTempletUtils.filterList(onePosFieldVos) />
	<#if onePosFieldVosForList?size!=0>
		var R=[],C=[];
		<#list onePosFieldVosForList as field>
			R.push(${field.genRecordType()});
		</#list>
		<#assign onePosFieldVosForList=UiTempletUtils.reOrderHeaderList(onePosFieldVosForList,headerListItemKey)/>
		<#list onePosFieldVosForList as field>
			C.push(${field.genListColumn()});
		</#list>
		
		S.hp = {};
		S.hp['templateID'] = '${templateID}';
		S.hp['tabCode']= '${headerTabCode}';
		S.hp['billId']='${billId}';
		S.hp['billIds']='${billIds}';
		S.hp['funCode']='${funCode}';
		S.hp['nodeKey']='${nodeKey}';
		var pk_portlet = Utils.getParameter('pk_portlet');
		if(pk_portlet){
			S.hp['pk_portlet'] = pk_portlet;
		}
		S.headerGridConfig = {
			id : '${firstHeaderTabCode}',
			pkFieldName : '${headerPkField}',
			dataUrl : '${headerGridDataUrl}',
			params : Ext.apply({},S.hp),
			singleSelect : ${headerGridSingleSelect},
			isAddBbar : ${headerGridPagination},
			bufferView : ${headerGridBufferView},
			immediatelyLoad : ${headerGridImmediatelyLoad},
			isCheckboxSelectionModel : ${headerGridCheckboxSelectionModel},
			sortable : ${headerGridSortable},
			isAddPageSizePlugin : ${headerGridPageSizePlugin},
			plugins : ${headerGridPlugins},
			recordType : R,
			columns :  C
		};
		if('${headerGridPageSize}' != 'null'){
			S.headerGridConfig['pageSize'] = ${headerGridPageSize};
		}
		S.headerGrid = new uft.extend.grid.BasicGrid(S.headerGridConfig);
		delete hp,R,C;
	</#if>
</#macro>
<#macro genBodyGrid>
	<#assign onePosTabVos=components["1"]["onePosTabVos"]/>
	<#assign onePosFieldVosMapWithTab=components["1"]["onePosFieldVosMapWithTab"]/>
	<#if onePosTabVos?size!=0>
		S.bp = {};
		S.bp['templateID'] = '${templateID}';
		S.bp['isBody'] = 'true';
		S.bp['funCode']='${funCode}';
		S.bp['nodeKey']='${nodeKey}';
		
		S.bodyGrids = [],S.bodyTitles=[];
		<#assign num=0 />
		<#list onePosFieldVosMapWithTab?keys as key>
			Ext.apply(S.bp,{tabCode:'${key}'});
			<#assign tab=UiTempletUtils.filterTabByCode(onePosTabVos, key) />
			<#assign onePosFieldVosWithTab=onePosFieldVosMapWithTab[key] />
			<#assign pkFieldName=childrenPkFieldMap[key]?default("") />
			<#assign onePosFieldVosWithTabForList=UiTempletUtils.filterList(onePosFieldVosWithTab) />
			<#assign bodyGridCheckboxSelectionModel=bodyGridsCheckboxSelectionModel[num] />
			<#assign bodyGridPagination=bodyGridsPagination[num] />
			<#assign bodyGridBufferView=bodyGridsBufferView[num] />
			<#assign bodyGridDataUrl=bodyGridsDataUrl[num] />
			<#assign bodyGridType=bodyGridsType[num] />
			<#assign bodyGridImmediatelyLoad=bodyGridsImmediatelyLoad[num] />
			<#assign bodyGridSingleSelect=bodyGridsSingleSelect[num] />
			<#assign bodyGridPlugins=bodyGridsPlugins[num] />
			<#assign bodyGridNewRowWhenWalkInLastCell=bodyGridsNewRowWhenWalkInLastCell[num] />
			<#assign bodyGridDragDropRowOrder=bodyGridsDragDropRowOrder[num] />
			<#assign bodyGridSortable=bodyGridsSortable[num] />
			
			var R=[],C=[];
			<#list onePosFieldVosWithTabForList as field>
				R.push(${field.genRecordType()});
			</#list>
			<#list onePosFieldVosWithTabForList as field>
				C.push(${field.genListColumn()});
			</#list>
			S.bodyGrids.push(new ${bodyGridType}({
					id : '${key}',
					title : ('${bodyWaterfallScene}'=='true' || '${waterfallScene}'=='true')?'${tab.tabname}':null,
					pkFieldName : '${pkFieldName}',
					dataUrl : '${bodyGridDataUrl}',
					params : Ext.apply({},S.bp),
					border : false,
					isCheckboxSelectionModel : ${bodyGridCheckboxSelectionModel},
					singleSelect : ${bodyGridSingleSelect},
					isAddBbar : ${bodyGridPagination},
					bufferView : ${bodyGridBufferView},
					immediatelyLoad : ${bodyGridImmediatelyLoad},
					plugins : ${bodyGridPlugins},
					newRowWhenWalkInLastCell : ${bodyGridNewRowWhenWalkInLastCell},
					sortable : ${bodyGridSortable},
					dragDropRowOrder : ${bodyGridDragDropRowOrder},
					recordType : R,
					columns : C
				}));
			S.bodyTitles.push('${tab.tabname}');
			delete R,C;
			<#assign num=(num+1)/>
		</#list>
		delete S.bp;
	</#if>
</#macro>