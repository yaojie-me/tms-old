package org;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.tms.constants.TransTypeConst;

public class ExceptionReference {
	
	@SuppressWarnings("serial")
	private Map<String,String> enMap = new HashMap<String,String>(){
		{
			put("?不是一个文件夹！", "");
			put("您下载的文件已经不存在，请刷新页面！", "");
			put("您预览的文件已经不存在，请刷新页面！", "");
			put("删除操作的主键不能为空！", "");
			put("没有选择要导入的文件！", "");
			put("地址?不正确，请检查数据", "");
			put("第?行的客户编码不存在！", "");
			put("第?行的客户名称不存在！", "");
			put("规则生效日期与必须在失效日期之前！", "");
			put("规则生效时间段与?重复！", "");
			put("请先选择一行合同记录进行导入！", "");
			put("区域?错误，请检查数据！", "");
			put("地址?错误，请检查数据！", "");
			put("设备类型 ?错误，请检查数据！", "");
			put("第?行的[始发区域类型]不能为空！", "");
			put("第?行的[目的区域类型]不能为空！", "");
			put("第?行的[费用类型:?]错误，不是有效的费用类型！", "");
			put("第?行的[报价类型:?]错误，不是有效的报价类型！", "");
			put("第?行的[价格类型:?]错误，不是有效的价格类型！", "");
			put("第?行的[计价方式:?]错误，不是有效的计价方式！", "");
			put("客户[PK:?]已经被删除，请重新选择！", "");
			put("结算客户[PK:?]已经被删除，请重新选择！", "");
			put("承运商[PK:?]已经被删除，请重新选择！", "");
			put("车型吨位+重量计价方式，单价1不能为空，也不能为0！", "");
			put("编码为?的记录已经被引用，不能删除！", "");
			put("必须是[新建]状态的应付明细才能修改！", "");
			put("请先选择一行对账单记录！", "");
			put("只有[新建]状态的对账单才能删除！", "");
			put("对账单已经被删除！", "");
			put("应付明细必须是[确认,部分核销]才能执行收款！", "");
			put("应付明细已经被删除！", "");
			put("应付对账必须是[确认]状态才能执行开票！", "");
			put("开票金额不能为空！", "The invoice amount cannot be empty!");
			put("发票类型不能为空！", "Invoice type cannot be empty!");
			put("发票号不能为空！", "Invoice No cannot be empty!");
			put("发票抬头不能为空！", "");
			put("请先选择付款纪录！", "");
			put("该付款纪录已经被删除！", "");
			put("该付款纪录所对应的应付对账已经被删除！", "");
			put("第?行的[应付明细单号]不能为空！", "");
			put("第?行的[应收明细单号]不能为空！", "");
			put("第?行的[费用类型]不能为空！", "");
			put("第?行的[金额]不能为空！", "");
			put("第?行的[批次号]不能为空！", "");
			put("没有查询到应付明细单号，请检查数据！", "");
			put("单据号:?状态不是新建，不允许导入，请检查数据！", "");
			put("单据号:?不存在，请检查数据！", "");
			put("当前的运输方式已经被删除，pk:?！", "");
			put("系统参数中，设置的pay_devi_dimension参数不支持，当前值是[?]！", "");//FIXME
			put("批次号:?没有查询到，或者委托单状态有误，请检查数据！", "");
			put("批次号:?对应的应付明细单号:?的状态不正确，请检查数据！", "");
			put("不能删除单据类型为[原始单据、承运商索赔]的单据！", "");
			put("只能删除单据状态为[新建]的单据！", "");
			put("承运商索赔时，付款金额不能大于0！", "");
			put("承运商索赔时，付款金额不能小于总金额！", "");
			put("付款金额不能小于0！", "");
			put("付款金额不能大于总金额！", "");
			put("应付明细必须是确认和部分核销状态才能执行全额付款！", "");
			put("不能删除付款类型是对账收款的记录！", "");
			put("该付款纪录所对应的应付明细已经被删除！", "");
			put("生成对账单时参数不能为空！", "");
			put("只有[确认]状态的应付明细才能生成对账单！", "");
			put("只有[确认]状态的应付明细才能加入对账单！", "");
			put("应付明细对应的委托单已经被删除！", "");
			put("委托单没有关联的运段！", "");
			put("只有[新建]状态的单据才能进行提交！", "");
			put("只有[确认中]状态的单据才能进行反提交！", "");
			put("应付明细[?]必须是[新建]状态才能进行重算金额！", "");
			put("应付明细[?]必须是[原始单据]类型才能进行重算金额！", "");
			put("应付明细[?]没有对应的委托单！", "");
			put("应付明细[?]对应的委托单[?]已经不存在！", "");
			put("委托单[?]必须是[已提货]、[已到货]状态才能重算费用", "");
			put("发货单的订单类型必须完全一样才能重算费用，比如全部是提货段、全部是干线段或全部是配送段！", "");
			put("发货单辅助表的数据为空，不能匹配计算费用！", "");
			put("发货单的订单类型必须完全一样才能重算费用，比如全部是返箱！", "");
			put("可能没有定义单据号规则，无法生成编码！", "");
			put("请选择单据！", "");
			put("没有查询到批次信息，请检查数据！", "");
			put("应付明细状态不是[新建]！", "");
			put("您选择的应付明细单据没有批次号！", "");
			put("您选择的应付明细单据有多个批次号，请检查数据！", "");
			put("只有[新建]状态的单据才能进行关闭！", "");
			put("只有[关闭]状态的单据才能进行撤销关闭！", "");
			put("应收明细已经被删除！", "");
			put("请先选择收款纪录！", "");
			put("该收款纪录已经被删除！", "");
			put("该收款纪录所对应的应收对账已经被删除！", "");
			put("没有查询到应收明细单号，请检查数据！", "");
			put("应收明细对应的发货单单已经被删除！", "");
			put("应收明细必须是[确认,部分核销]状态才能执行收款！", "");
			put("客户索赔时，收款金额不能大于0！", "");
			put("客户索赔时，收款金额不能小于总金额！", "");
			put("收款金额不能小于0！", "");
			put("收款金额不能大于总金额！", "");
			put("应收明细必须是[确认,部分核销]状态才能执行全额收款！", "");
			put("不能删除收款类型是对账收款的记录！", "");
			put("该收款纪录所对应的应收明细已经被删除！", "");
			put("只有[确认]状态的应收明细才能生成对账单！", "");
			put("只有[确认]状态的应收明细才能加入对账单！", "");
			put("只有[新建]状态的应收明细才能重新计算金额！", "");
			put("只有[新建]状态的单据才能进行确认！", "");
			put("现金到付类应收明细确认时，金额不能为0！", "");
			put("应付明细不是新建状态！", "");
			put("删除应付明细或委托单失败，无法反确认单据！", "");
			put("对应应付明细已被删除或者确认，无法反确认单据！", "");
			put("应收明细[?]必须是[新建]状态才能进行重算金额！", "");
			put("应收明细[?]必须是[原始单据]类型才能进行重算金额！", "");
			put("应收明细[?]没有对应的发货单！", "");
			put("应收明细[?]对应的发货单[?]已经不存在！", "");
			put("没有录入车辆信息，请检查数据！", "");
			put("费用类型中没有维护编码为ET40的保险费！", "");
			put("发货单[?]必须是[?]才能重算费用！", "");
			put("发货单必须是相同的运输方式和结算客户才能重算费用！", "");
			put("公司配置文件[?]第一层配置不正确！", "");
			put("公司配置文件[?]第二层配置不正确！", "");
			put("公司配置文件[?]第三层配置不正确！", "");
			put("公司配置文件[?]第四层配置不正确！", "");
			put("公司配置文件[?]第五层配置不正确！", "");
			put("没有创建编码为:[?]的公司！", "");
			put("只有[新建]和[拒绝]状态的单据才能进行提交！", "");
			put("拒绝时，必须提供拒绝原因！", "");
			put("只有状态是[确认,拒绝]的单据，才可以重新审核！", "");
			put("只有状态是[确认]的单据，才可以派车！", "");
			put("车牌号和主驾驶都不能为空！", "");
			put("只有状态是[派车中]的单据，才可以出车！", "");
			put("只有状态是[出车中]的单据，才可以收车！", "");
			put("收车时间必须晚于出车时间，而且不晚于当前时间！", "");
			put("收车码表数不能小于出车码表数！", "");
			put("编码解析错误！", "");
			put("根据始发地[?]没有匹配到城市记录！", "");
			put("根据始发地[?]匹配到多条城市记录，基础数据有问题！", "");
			put("根据提货地址[?]和始发地[?]没有匹配到地址！", "");
			put("根据目的城市[?]没有匹配到地址！", "");
			put("?客户不存在！", "");
			put("第?行的预计提货日期、送货日期、发货人、提货地址、始发地、目的城市等关键字段都不能为空！", "");
			put("根据第?行始发地[?]没有匹配到城市记录！", "");
			put("根据第?行始发地[?]匹配到多条城市记录，基础数据有问题！", "");
			put("第?行的发货单不能为空！", "");
			put("第?行的发货单号已经不存在！", "");
			put("第?行的发货单不是[新增、已确认、已提货]状态，不能进行更新！", "");
			put("不能修改第?行的发货人！", "");
			put("不能修改第?行的提货地址！", "");
			put("不能修改第?行的始发地！", "");
			put("基础数据中没有维护名称为[?]的运输方式！", "");
			put("第?行的货品编码不存在！", "");
			put("第?计划数量，数量等数据必须大于0！", "");
			put("第?行重量和体积必须大于0！", "");
			put("发货单对应的应收明细不是[新建]状态，不能更新发货单！", "");
			put("必须是[确认]状态的单据才能反确认，单据号:?！", "");
			put("该发货单对应的运段已经配载过了,单据号:?！", "");
			put("该发货单对应了多条运段，不能反确认，单据号:?！", "");
			put("该发货单对应的运段已经配载过了！", "");
			put("必须是[新建]状态的单据才能删除，单据号:?！", "");
			put("发货单所对应的应收明细必须是[新建]状态才能删除发货单！", "");
			put("现金到付类发货单确认时，金额不能为0！<br/>单据号:?！", "");
			put("现金到付类发货单确认时，金额不能为0！", "");
			put("发货单 [?]运输方式不是MilkRun，如果需要进行MilkRun操作，请修改系统规则！", "");
			put("发货单[?]只有是[确认]状态的发货单才允许进行MilkRun操作 ，请检查数据！", "");
			put("发货单[?]必须要有承运商才允许进行MilkRun操作 ，请检查数据！", "");
			put("发货单[?]的运段状态 不是待调度，请检查数据！", "");
			put("发货单[?]没有路线信息，请检查数据！", "");
			put("发货单[?],只有是[确认]状态的发货单才允许此操作 ，请检查数据！", "");
			put("发货单[?]必须要有承运商才允许此操作 ，请检查数据！", "");
			put("发货单[?]已做了分量操作，不能同步更新！", "");
			put("应付明细必须[新建]状态才能进行更新,单据号[?],委托单号[?]", "");
			put("订单号[?]已存在！", "");
			put("客户订单号[?]已存在！", "");
			put("起始地址 [?]没有维护！", "");
			put("目的地址 [?]没有维护！", "");
			put("地址 [?]没有维护！", "");
			put("车辆类型 [?]没有维护！", "");
			put("合同服务没有启动，服务ID：contractServiceImpl", "");
			put("第[?]行的客户编码不能为空！", "");
			put("第[?]行的运输方式不能为空！", "");//FIXME
			put("第[?]行的要求提货日期不能为空！", "");
			put("第[?]行的要求到货日期不能为空！", "");
			put("第[?]行的件数不能为空！", "");
			put("第[?]行的重量不能为空！", "");
			put("第[?]行的体积不能为空！", "");
			put("第[?]行的提货方不能为空！", "");
			put("第[?]行的收货方能为空！", "");
			put("第[?]行的运输方式错误！", "");
			put("第[?]行的操作类型错误！", "");
			put("第[?]行的地址编码不存在！", "");
			put("第[?]行计划件数、件数、等数据必须大于0！", "");//FIXME
			put("第[?]行重量和体积必须大于0！", "");
			put("第[?]计划数量、数量等数据必须大于0！", "");
			put("发货单[?]已经被删除！", "");
			put("发货单[?]必须是[到货]或者[部分到货]状态才能重算费用！", "");
			put("发货单[?]所对应的原始应收明细以及被删除！", "");
			put("应收明细[?]必须是新建状态才能重算费用！", "");
			put("发货单[?]的订单号不能为空！", "");
			put("发货单[?]必须是[到货]、[签收]、[部分签收]、[已回单]或者[部分到货]状态才能重算费用！", "");
			put("订单辅助表记录已经被删除，订单号[?]！", "");
			put("批次订单记录已经被删除，批次号[?]！", "");
			put("根据提货方PK[?]没有匹配到地址记录！", "");
			put("根据提货方PK[?]匹配到多条地址记录，基础数据有问题！", "");
			put("根据收货方PK[?]没有匹配到地址记录！", "");
			put("根据收货方PK[?]匹配到多条地址记录，基础数据有问题！", "");
			put("第[?]行的订单号[?]已存在！", "");
			put("第[?]行的客户订单号[?]已存在！", "");
			put("应付明细服务没有启动，服务ID：PayDetailServiceImpl", "");
			put("运输方式必须是[公路零担、公路整车、公路零担+公路整车、公路整车+公路零担]方式！", "");
			put("批次号[?]没有匹配到提货段运费合同，请检查！", "");
			put("批次号[?],应付明细单号[?]没有匹配到提货段运费合同，请检查！", "");
			put("批次号[?]没有匹配到送货费合同，请检查！", "");
			put("匹配的合同明细没有维护费用类型，明细ID[?]", "");
			put("时效匹配服务没有启动，服务ID：LimitServiceImpl", "");
			put("无法实例化业务转换类，类名：?", "");
			put("指标明细编码不允许重复！", "");
			put("发货单状态更新到已到货时处理出现异常，发货单或者委托单不能为空！", "");
			put("发货单已生成签收单！", "");
			put("发货单状态从已到货更新到已提货时处理出现异常，发货单或者委托单不能为空！", "");
			put("执行签收时需要选择发货单！", "");
			put("只有已到货的发货单才能执行签收！", "");
			put("发货单[?]没有对应的POD签收单！", "");
			put("签收时间晚于当前时间，请检查数据！", "");
			put("执行异常签收时需要选择发货单！", "");
			put("只有已到货的发货单才能执行异常签收！", "");
			put("第[?]行签收件数+拒收件数+破损件数+丢失件数必须等于件数！", "");
			put("发货单[?]对应的原始应收明细被删除了！", "");
			put("撤销签收时需要选择发货单！", "");
			put("只有已签收的发货单才能执行撤销！", "");
			put("执行回单时需要选择发货单！", "");
			put("只有已签收的发货单才能执行回单！", "");
			put("只有已签收的发货单才能执行异常回单！", "");
			put("撤销回单时需要选择发货单！", "");
			put("只有已回单的发货单才能执行撤销！", "");
			put("vbillno参数是必须的！", "");
			put("发货单[?]不存在或者已经被删除！", "");
			put("必须是待确认的单据才能删除！", "");
			put("委托单所对应的应付明细必须是[新建]状态才能删除委托单！", "");
			put("必须是[未确认]状态的委托单才能进行确认！", "");
			put("分公司客户不存在！", "");
			put("必须是[已确认]状态的委托单才能进行反确认！委托单号[?]", "");
			put("该委托单包含的发货单已经签收或回单过，不能反确认，委托单号[?]", "");
			put("必须是[已确认]状态的委托单才能进行反确认！", "");
			put("只有 [已确认、已提货]状态 的委托单才能退单，单据号[?]", "");
			put("退单时，对应的应付明细状态必须是[新建]状态！", "");
			put("只有两个节点的委托单才能退单，单据号[?]", "");
			put("分公司结算时，发货单必须是[新建]状态才能删除，单据号[?]", "");
			put("分公司结算时，发货单所对应的应付明细必须是[新建]状态才能删除发货单！", "");
			put("退单时，现金到付调整明细状态必须是新建的[?]", "");
			put("只有退单的委托单才能撤销，PK[?]", "");
			put("主键不能为空！", "");
			put("请选择委托单！", "");
			put("当前委托单已经生成过入库单，不能重复生成！", "");
			put("货品[编码：?]不存在，不能生成入库单！", "");
			put("第[?]行：车牌号和车辆类型不能同时为空！", "");
			put("委托单[?]不存在，请检查数据！", "");
			put("第[?]行：车辆类型为空，提供的车牌号错误！", "");
			put("第[?]行：车辆类型为空，车牌号获取的车辆类型也为空！", "");
			put("第[?]行：输入的车辆类型不正确！", "");
			put("请选择批次！", "");
			put("没有获取到身份证信息！", "");
			put("不是有效的身份证！", "");
			put("读取超时！", "");
			put("身份证识别有问题！", "");
			put("读卡器打开失败,无法读取身份证信息！", "");
			put("没有需要验证的身份信息！", "");
			put("没有需要验证的身份证信息！", "");
			put("请先选择记录！", "");
			put("委托单不存在！", "");
			put("委托单号不能为空！", "");
			put("只有到货的委托单才可以回单！", "");
			put("回单时间错误！", "");
			put("委托单已回单！", "");
			put("只有已回单的委托单才可以撤销回单！", "");
			put("费用类型表必须存在一条类型编码是[?]的记录！", "");
			put("只有[处理中、已处理]状态的单据才能进行撤销！", "");
			put("没有勾选客户是否索赔和承运商是否索赔，不能进行撤销！", "");
			put("客户索赔对应的应收明细不是新建状态,不能撤销处理！", "");
			put("承运商索赔对应的应付明细不是新建状态,不能撤销处理！", "");
			put("只有[处理中]状态的单据才能进行结案！", "");
			put("只有[已处理]状态的单据才能进行撤销结案！", "");
			put("没有需要导入的信息！", "");
			put(":文件不存在!", "");
			put("解析配置文件时出错，错误信息:?", "");
			put("请求LBS数据时出错,错误信息:?", "");
			put("请求LBS数据时出错,请求地址不存在,URL:?", "");
			put("该地址已经被删除，地址PK[?]", "");
			put("跟踪信息状态为空，请检查单据!", "");
			put("参数不能为空！", "");
			put("委托单必须是[已确认、已提货]状态下才能保存跟踪信息！", "");
			put("请先确认上一个节点，节点行号[?]！", "");
			put("委托单[?]上个运段节点未操作完成，当前节点无法进行后续操作！", "");
			put("节点已经是非到货状态，不能反确认", "");
			put("请先反确认下一个节点，节点行号[?]！", "");
			put("委托单[?]对应的发货单已经[?]，不能反确认！", "");
			put("委托单[?]对应的发货单已经回单，不能反确认！", "");
			put("节点是运段[?]的起始地，该运段必须是[已提货]状态才能反确认！", "");
			put("节点是运段[?]的目的地，该运段的子运段[?]不是[待调度、已调度]状态，不能反确认！", "");
			put("删除时主键不能为空！", "");
			put("该记录已经被删除，请刷新页面！", "");
			put("跟踪时间不能大于当前时间！", "");
			put("委托单已经被删除，pk_entrust[?]！", "");
			put("委托单[?]没有实际提货时间！", "");
			put("委托单号[?]，车牌号[?]的车辆没有关联GPS_ID！", "");
			put("委托单号[?]，车牌号[?]的车辆关联了多个GPS_ID！", "");
			put("应付明细不是[新建]，不能修改货品信息！", "");
			put("应付明细[?]，不是新建，请检查！", "");
			put("分公司结算单据不能使用配载，请使用批量配载！", "");
			put("必须是[待调度]状态的运段才能执行配载!", "");
			put("单据已经不存在，单据号[?]！", "");
			put("配载时路线信息还没有加载完全，请重新点击[保存]即可！", "");
			put("当前的运输方式已经被删除，pk[?]！", "");
			put("第一个节点[?]必须是运段的始发地！", "");
			put("最后一个节点[?]必须是运段的目的地！", "");
			put("运段[?]的起始地[?]必须在目的地的前面！", "");
			put("运段的提货方不是有效的地址，请检查！", "");
			put("运段的收货方不是有效的地址，请检查！", "");
			put("时间顺序有误</br>?</br>?", "");
			put("参数不对，不需要撤销！", "");
			put("只有待调度的分段才能撤销！", "");
			put("只有运段类型为分段运段的运段才可以进行撤销！", "");
			put("运段标识为父级运段的运段不能撤销！", "");
			put("不存在父级运段，不需要撤销！", "");
			put("该运段的同级运段还存在子运段，不能撤销！", "");
			put("只有所有子运段都为[待调度]状态才能撤销！", "");
			put("车牌号[?]的车辆没有关联GPS_ID！", "");
			put("操作失败，运段[?]，已委派！", "");
			put("请先选择需要调整的库存记录！", "");
			put("没有调整单的明细信息！", "");
			put("调整数量不能大于当前库存量", "");
			put("调整单明细对应的库存记录已经被删除，内部批次号[?]！", "");
			put("调整数量不能大于当前库存量！", "");
			put("该单据已经被删除，请刷新页面！", "");
			put("可用数量为0，不能进行移动！", "");
			put("移动数量必须大于0并且小于等于可用数量！", "");
			put("批次表中没有相应的记录，批次号[?]", "");
			put("该出库单的已分配数量不为0，不能关闭！", "");
			put("没有找到相应的出库单分配明细，无法取消分配！", "");
			put("没有找到相应的分配明细，无法取消分配，明细ID[?]！", "");
			put("分配明细不是[新建]状态，不能取消分配，明细单号[?]！", "");
			put("该分配明细对应的出货明细记录已经被删除，无法取消分配，明细单号[?]！", "");
			put("该出库单已经被删除，无法取消分配，明细单号[?]！", "");
			put("执行分配时关键参数丢失！", "");
			put("分配数量必须大于0，小于等于可用数量！", "");
			put("内部批次号[?]在批次表中没有相应的记录！", "");
			put("分配数量的和不能大于订单数量！", "");
			put("您没有对任何记录进行分配操作！", "");
			put("该出库单明细记录已经被删除，不能进行分配！", "");
			put("该出库单已经被删除，不能进行分配，出库单明细号[?]", "");
			put("该出库单明细记录已经不需要分配，出库单明细号[?]", "");
			put("没有库存数据，无法分配，出库单明细号[?]", "");
			put("接收数量不能为空！", "");
			put("单据[?]不是[新增]或[部分收货]状态，不能全部收货！", "");
			put("该单据[?]没有明细信息，不需要进行收货！", "");
			put("该单据[?]的明细中，存在没有维护货位的行，不能全部收货！", "");
			put("该单据[?]的明细中，存在没有维护货品属性的行，不能全部收货！", "");
			put("该出库单明细记录已经被删除，不能发货！", "");
			put("该出库单明细记录没有对应的分配明细，不需要发货！", "");
			put("该分配明细已经被删除，不能发货！", "");
			put("该出库单已经被删除，不能发货，出库单明细号[?]", "");
			put("该分配明细没有的分配数量为0，不能发货！", "");
			put("分配明细记录没有对应的批次QTY记录，内部批次号[?]", "");
			put("该出库单明细记录已经被删除，不能取消发货！", "");
			put("该出库单已经被删除，不能取消发货，出库单明细号[?]", "");
			put("无法实例化parentVO，请检查billInfo配置！", "");
			put("没有继承getCodeFieldCode方法返回code字段名，无法根据code查询VO！", "");
			put("验证服务没有启动，服务ID:AuthenticationService", "");
			put("请先选择要撤销签收的记录！", "");
			put("应收明细不存在！", "");
			put("应付明细不存在！", "");
			put("批次号[?]中应付明细[?]状态有误！", "");
			put("费用计算缺少参数！", "");
			put("费用计算方法分配器出现错误:?", "");
			put("查询附件时,需要选择一条单据！", "");
			put("单据号不能为空！", "");
			put("查看附件时主键参数不能为空！", "");
			put("文件下载出错,错误信息:?", "");
			put("批量下载附件时主键参数不能为空！", "");
			put("预览附件时主键参数不能为空！", "");
			put("您查看的文件不存在！", "");
			put("获取成功！", "");
			put("第[?]行的运输方式和第[?]行的运输方式相同，请重新修改！", "");
			put("第[?]行的地址和第[?]行的地址相同，请重新修改！", "");
			put("只有[新建]状态的对账单才可以修改！", "");
			put("请先选择一行应付对账记录！", "");
			put("不能将单据类型从[其他类型]改成[原始类型]！", "");
			put("新增单据的单据类型不能选择[原始单据]！", "");
			put("系统分摊金额不等于手工分摊金额，请重新分配！", "");
			put("请先选择一行应付明细记录！", "");
			put("加载应付明细对账单时，承运商不能为空！", "");
			put("请先选择要加入对账单的应付明细！", "");
			put("请先选择对账单记录！", "");
			put("billId不能为空！", "");
			put("请先选择一行应收对账记录！", "");
			put("您不能修改父级公司的数据！", "");
			put("不能保存单据状态为空的单据！", "");
			put("只能编辑单据状态为[新建]的单据！", "");
			put("请先选择一行应收明细记录！", "");
			put("加载应收明细对账单时，结算客户不能为空！", "");
			put("请先选择要加入对账单的应收明细！", "");
			put("运输方式不能为空！", "");
			put("货品和货品对应的包装明细不能为空！", "");
			put("总数量计算不正确,请检查表单！", "");
			put("总件数计算不正确,请检查表单！", "");
			put("总重量计算不正确,请检查表单！", "");
			put("总体积计算不正确,请检查表单！", "");
			put("总计费重计算不正确,请检查表单！", "");
			put("订单号已经被使用，请使用其他订单号！", "");
			put("客户订单号已经被使用，请使用其他客户订单号！", "");
			put("匹配合同时，结算客户、运输方式、起始地址、目的地址都不能为空！", "");
			put("加载表体数据时，主键不能为空！", "");
			put("请先选择记录进行修订！", "");
			put("发货单必须是[已确认、已提货、部分提货、部分到货、已到货]状态下才能进行修订！", "");
			put("发货单对应的应收凭证状态必须是[新建]才能进行修订,应收凭证单号[?]！", "");
			put("发货单对应的调度计划[调度单号:?]已做了分量操作，发货单不能修订！", "");
			put("发货单对应的应付凭证状态必须是[新建]才能进行修订，应付凭证单号[?]！", "");
			put("没有发送行参数，请确认是否选中行！", "");
			put("批次号参数不能为空！", "");
			put("编码已经存在！", "");
			put("已存在相同的数据！", "");
			put("查询POD签收单时需要选择一条发货单！", "");
			put("参数发货单pk不能为空！", "");
			put("查看签收单附件时主键参数不能为空！", "");
			put("批量下载签收单附件时主键参数不能为空！", "");
			put("请先选择要签收的记录！", "");
			put("请先选择要回单的记录！", "");
			put("请先选择要撤销回单的记录！", "");
			put("必须指定地址PK", "");
			put("第[?]委托单号不能为空！", "");
			put("匹配合同时，承运商、运输方式、起始地址、目的地址都不能为空！", "");
			put("您不能删除系统创建的费用明细!", "");
			put("费用类型为[运费]的费用明细只能有一条！", "");
			put("委托单对应的应付凭证状态必须是[新建]才能进行修订,应收凭证单号[?]！", "");
			put("缺少签收信息！", "");
			put("回单时间不能为空！", "");
			put("发货单号不能为空！", "");
			put("只有状态为[已提货]的委托单，才能进行到货！", "");
			put("entrust_vbillno参数不能为空！", "");
			put("删除委托单跟踪记录时，主键不能为空！", "");
			put("上传文件不能为空！", "");
			put("上一个节点[?]还未到货，不允许进行到货确认！", "");
			put("委托单[?]输入的节点号[?]超出范围！", "");
			put("文件下载出错！", "");
			put("委托单参数[pk_entrust]是必须的！", "");
			put("委托单已经不存在,或被删除,pk_entrust[?]！", "");
			put("GPS号参数[gps_id]是必须的！", "");
			put("车牌号参数[carno]或者司机参数[pk_driver]是必须的！", "");
			put("委托单号的参数不能为空，参数名称:entrust_vbillno", "");
			put("文件名称参数不能为空！", "");
			put("未能找到文件！", "");
			put("没有分配单据模板！", "");
			put("主键为[?]的费用类型已经不存在！", "");
			put("相同发货单的运段不能一起配载！", "");
			put("请先选择运段！", "");
			put("请先选择节点！", "");
			put("你没有选择任何运段！", "");
			put("请选择要委派的公司！", "");
			put("请选择要委派的运段！", "");
			put("请先选择要撤销委派的运段！", "");
			put("车牌号参数[carno]是必须的！", "");
			put("请先选择要同步的订单！", "");
			put("请先选择要委派的订单！", "");
			put("请先选择承运商！", "");
			put("表体订单数量的和不等于表头的总订单数量！", "");
			put("表体订单重量的和不等于表头的总重量！", "");
			put("表体订单体积的和不等于表头的总体积！", "");
			put("请先选择出库单明细再进行分配！", "");
			put("请选择一行明细记录进行取消分配！", "");
			put("必须是[新建]和[部分收货]的入库单才能进行收货！", "");
			put("第[?]行的接收量不能大于订单量减去已接收量！", "");
			put("表体重量的和不等于表头的总重量！", "");
			put("表体体积的和不等于表头的总体积！", "");
			put("纯web框架的util不再支持基于主键的分页处理！", "");
			put("更新时主键不能为空！", "");
			put("新增时主键不能为空！", "");
			put("模板文件的名称不能为空！", "");
			put("文件不存在,目录:?！", "");
			put("有配置导入字段，funCode[?]！", "");
			put("导入的校验类实例化失败，类名称:[?]！", "");
			put("第[?]行的[?:?]数据不能为空\n", "");
			put("第[?]行的[?:?]数据有误,错误信息：?\n", "");
			put("导入模板时需要注入Service类！", "");
			put("数据库中已存在编码为[?]的记录！", "");
			put("导入编码不允许重复[?]！", "");
			put("没有需要保存的数据！", "");
			put("_get公式只应该有一个参数！", "");
			put("不支持[?]含有子公式类型显示公式，请正确填写！", "");
			put("公式错误[?]！", "");
			put("不支持该公式[?]！", "");
			put("公式解析错误，不应该还有分号！", "");
			put("任务已经被删除，任务ID[?]！", "");
			put("获取主表类出错", "");
			put("只有[确认]状态的单据才能进行反确认,单据号[?]！", "");
			put("没有定义单据类型信息，则报表必须继承getSelectSql方法，返回自己的查询语句！", "");
			put("没有配置单据信息，请继承该方法，查询合计数据！", "");
			put("功能节点[?]没有定义[请求的URL地址]！", "");
			put("联查按钮定义不正确，没有定义url或者fun_code！", "");
			put("表[?]的ID为[?]的记录已经被引用，不能删除！", "");
			put("该条记录已经被引用，不能删除！", "");
			put("可能没有定义编码规则，无法生成编码，请录入！", "");
			put("没有定义使用编码规则，又没有录入编码！", "");
			put("VOTable中表头类名配置不正确！", "");
			put("没有获取到主表数据，可能该单据已被删除！", "");
			put("功能注册编码不能为空！", "");
			put("自定义按钮已经被删除！", "");
			put("自定义按钮没有设置要调用的存储过程，请写在[单据类型]项中！", "");
			put("该节点已存在快捷方式！", "");
			put("单据模板已经被分配，不能删除！", "");
			put("模板已经被修改，请重新加载！", "");
			put("单据模板PK不能为空！", "");
			put("当前已经存在查询模板，如果想覆盖，请勾选[是否覆盖]复选框！", "");
			put("菜单已经被删除！", "");
			put("请选择按钮节点！", "");
			put("该节点已经分配了模板，不能删除！", "");
			put("数据已经被删除，无法完成复制！", "");
			put("任务配置记录已经被删除，pk_job_def[?]！", "");
			put("任务名称[?]，业务处理类不能为空！", "");
			put("平台级参数不能删除！", "");
			put("只能修改本公司的参数！", "");
			put("子公司账户不能删除集团的模板！", "");
			put("查询条件[?:?]出现重复，这是不允许的！", "");
			put("单据已被改变或已被他人删除，请重新查询，类名称[?]，单据ID[?]！", "");
			put("单据类型的VOTABLE子表配置了多个VO信息，但单据VO并没有实现IExAggVO接口！", "");
			put("没有找到对应该表体的VO[?]！", "");
			put("VOTABLE配置不正确，请检查！", "");
			put("表体的VO类没有定义getParentPKFieldName的返回值！", "");
			put("没有定义单据号生成规则，单据类型[?]！", "");
			put("系统没有定义名称为[?]的参数，请联系管理员！", "");
			put("系统参数中必须定义默认的分摊类型，参数名称[?]！", "");
			put("系统参数中必须定义默认的分摊维度，参数名称[?]！", "");
			put("模板ID不能为空！", "");
			put("模板主键不能为空,可能没有分配模板！", "");
			put("您请求的模板文件已经不存在，请刷新页面！", "");
			put("templetId不能为空！", "");
			put("报表模板已经不存在，可能已经被删除，templetID[?]！", "");
			put("加载待办数据时，主键参数不能为空！", "");
			put("组件已经被删除，请重新刷新页面！", "");
			put("请先定义组建的查询语句，组件编码是[?]！", "");
			put("该功能节点已经被删除或锁定，功能编码[?]！", "");
			put("您的软件，将在[?]天后过期，请联系销售顾问购买许可证！", "");
			put("批量下载文件时主键参数不能为空！", "");
			put("更新已读标记时主键不能为空！", "");
			put("请先选择单据类型！", "");
			put("单据模板类型参数不能为空！", "");
			put("主键参数pk_billtemplet不能为空！", "");
			put("请先选择一条待复制的模板！", "");
			put("复制模板时模板名称不能为空！", "");
			put("复制模板时节点号不能为空！", "");
			put("参数不完整！", "");
			put("请先选择功能菜单！", "");
			put("请先选择功能节点！", "");
			put("公司编码不能为空！", "");
			put("读取数据字典总的下拉项时，数据类型编码不能为空！", "");
			put("查询单据附件时，单据类型和单据PK不能为空！", "");
			put("上传单据附件时，单据类型和单据PK不能为空！", "");
			put("您预览的文件不存在！", "");
			put("功能菜单编码不能为空！", "");
			put("请选择一行记录！", "");
			put("请选择模板文件！", "");
			put("读取参照类时，参照名称不能为空！", "");
			put("该规则已经存在！", "");
			put("请先选择一个角色!", "");
			put("请先选择功能节点和角色！", "");
			put("请选择一个人进行重置密码!", "");
			put("两次输入的密码不相同!", "");
			put("用户不存在!", "");
			put("portlet ID列不能重复！", "");
			put("批量确认时存在异常，单据ID", "");
			put("没有分配报表模板！", "");
			put("JSON转聚合VO时，有子表数据但没有找到子表VO类，可能VOTABLE没有配置！", "");
			put("没有分配查询模板！", "");
			put("没有查询模板，或查询模板为空！", "");
			put("有查询模板,但模板字段为空！", "");
			put("保存的条件中字段和组件id不对应", "");
			put("没有任何查询条件，不执行保存动作!", "");
			put("子类需要定义上传文件的字段名称！", "");
			put("上传文件错误:?", "");
			put("生成缩略图失败，可能不是图片文件:?", "");
			put("文件名称参数不能为空", "");
			put("文件名称不正确！", "");
			put("请先选择一张单据进行打印！", "");
			put("模板文件在编译成jasper文件时出错,错误信息:?", "");
			put("打印模板文件为空！", "");
			put("页签编码不能为空！", "");
			put("查询模板时，功能注册编码或者模板编码不能为空！", "");
			put("根据功能编码或模板编码没有找到相应模板！code:", "");
			put("根据功能编码或模板编码没有找到相应模板！code:?", "");
			put("根据模板PK没有找到相应模板！PK:?", "");
			put("必须是 multipart/form-data 类型数据！", "");
			put("解析上传文件时出错，错误信息：单个文件大小不能超过?", "");
			put("解析上传文件时出错，错误信息：", "");
			put("附件格式必须为[?]！", "");
			put("图片格式必须为[?]等!", "");
			put("文件[?],已不存在:?","");
			put("pk_fun参数是必须的！", "");
			put("您选择的运输方式已经存在，不能重复录入！", "");
			put("您选择的地址已经存在，请重新选择！", "");
			put("不能选择相同的包装明细！", "");
			put("请先选中要修改的节点！", "");
			put("根节点不允许修改！", "");
			put("请先选中要删除的节点！", "");
			put("根节点不允许删除！", "");
			put("请选择记录！", "");
			put("只能选择一条记录！", "");
			put("不能删除付款类型是对账付款的记录！", "");
			put("必须是已确认的应付明细才能加入对账单！", "");
			put("必须是同一个承运商的应付明细才能加入对账单！", "");
			put("不能删除系统费用明细！", "");
			put("系统费用明细不允许复制！", "");
			put("必须是已确认的应收明细才能加入对账单！", "");
			put("必须是同一个结算客户的应收明细才能加入对账单！", "");
			put("只能选择一条记录进行查看！", "");
			put("不能删除系统创建的费用明细！", "");
			put("不能复制系统创建的费用明细！", "");
			put("要求提货日期不能大于要求收货日期！", "");
			put("要求收货日期不能小于要求提货日期！", "");
			put("费用类型为[运费]的记录已经存在！", "");
			put("修改了发货单信息，请使用[计算]操作！", "");
			put("请先确认上一个节点！", "");
			put("请先反确认下一个节点！", "");
			put("请先选择记录进行打印！", "");
			put("没有记录需要确认！", "");
			put("没有记录需要反确认！", "");
			put("没有读取到身份证信息！", "");
			put("没有返回信息！", "");
			put("运段本身的节点不能删除！", "");
			put("要求离开时间必须大于等于要求到达时间！", "");
			put("要求离开时间必须小于等于下一行的要求到达时间！", "");
			put("要求到达时间必须小于等于要求离开时间！", "");
			put("非编辑态不能拖动行！", "");
			put("相同发货单的运段不能一起排单！", "");
			put("拆分件数必须大于等于0并且小于等于总件数！", "");
			put("拆分重量不能大于总重量！", "");
			put("拆分体积不能大于总体积！", "");
			put("拆分件数必须不等于0，并且不等于总件数！", "");
			put("拆分件数、拆分重量和拆分体积不能全部为0！", "");
			put("请先选中要删除的记录！", "");
			put("拆段节点不能是运段的提货方或者收货方！", "");
			put("要求离开日期必须大于等于您选择的所有运段中最大的提货日期！", "");
			put("要求离开日期必须小于等于您选择的所有运段中最小的到货日期！", "");
			put("要求离开日期必须大于等于要求到达日期！", "");
			put("要求到达日期必须小于您选择的所有运段中最小的到货日期！", "");
			put("要求到达日期必须大于您选择的所有运段中最大的提货日期！", "");
			put("请先增加节点！", "");
			put("必须选择状态为[待调度]的单据！", "");
			put("调整数量必须大于0，小于等于可用数量！", "");
			put("请先选择库存记录！", "");
			put("请先查询库存信息！", "");
			put("分配数量必须大于0，小于等于待分配数量！", "");
			put("请选择出库单明细表中的记录！", "");
			put("请先选择要自动分配的出库单明细记录！", "");
			put("请先选择要取消分配的明细记录！", "");
			put("只能选择一条记录进行下载！", "");
			put("只有叶子节点才能加入快捷方式!", "");
			put("只能打开叶子节点!", "");
			put("打开的节点编码不正确！", "");
			put("打开的节点不存在！", "");
			put("表格参数是必须的！", "");
			put("列参数是必须的！", "");
			put("选择的记录状态不一致，请确认!", "");
			put("只能选择一条记录进行修订！", "");
			put("只能选择一条记录进行操作！", "");
			put("请先选中要操作的数据！", "");
			put("请先复制一行！", "");
			put("只有[新增]状态的单据才能添加或删除附件！", "");
			put("请先选中左边的树节点！", "");
			put("只能选择一条记录进行修改！", "");
			put("请选择一条记录进行修改！", "");
			put("只能选择一条记录进行复制！", "");
			put("表体不能没有记录！", "");
			put("请先选中父节点！", "");
			put("模板参数[pk_templet]不能为空！", "");
			put("表头的headerGrid是必须的！", "");
			put("不支持多主表！", "");
			put("不能选择同一个页签！", "");
			put("项目主键已存在，请换一个！", "");
			put("没有模板数据，不能保存！", "");
			put("请先保存模板！", "");
			put("有且只能选择一行记录！", "");
			put("页签名称已存在，请换一个！", "");
			put("请至少选择两个节点！", "");
			put("请选择单据类型！", "");
			put("公司单据规则已经存在，不能新增，只能修改！", "");
			put("只能选择按钮节点！", "");
			put("请选择叶子节点！", "");
			put("公司编码规则已经存在，不能新增，只能修改！", "");
			put("请选择功能菜单树的叶子节点！", "");
			put("请先选中末级节点！", "");
			put("请选择角色树的叶子节点！", "");
			put("邮件发送成功！", "");
			put("文件上传成功！", "");
			put("请使用其他模板名称！", "");
			put("上传文件不合法，必须是png,jpeg,jpg类型的文件！", "");
			put("请先选择要加入对账单的记录！", "");
			put("没有模板数据，funCode：t406！", "");
			put("您必须选择相同承运商的记录！", "");
			put("请先选择要付款的记录！", "");
			put("请先选择要对账的记录！", "");
			put("请先选择要收款的记录！", "");
			put("请先选择要开票的记录！", "");
			put("该费用类型已经存在！", "");
			put("请先选择要审核的记录！", "");
			put("请先选择要出车的记录！", "");
			put("请先选择要派车的记录！", "");
			put("请先选中一条委托单！", "");
			put("请先选中一个车牌号或者司机！", "");
			put("请先选中一条异常记录！", "");
			put("请先选中一个gps号！", "");
			put("该委托单还没有绑定GPS！", "");
			put("请先选择要退单的记录！", "");
			put("请选择运段！", "");
			put("包含参照制单的页面必须存在表头列表对象[headerGrid]！", "");
			put("子表的主键字段不能为空，请检查Service中的billInfo配置！", "");
			put("子表的主键字段不能为空，请检查VOTable的配置！", "");
			put("单据类型和单据PK不能为空！", "");
			put("表格对象是必须的，否则无法执行查询！", "");
			put("查询项不能为空！", "");
			put("没有任何查询条件，不能保存！", "");
			put("请先选择要反确认的记录！", "");
			put("待拷贝对象不能为空！", "");
			put("上传文件不合法，必须是[doc,docx,xls,xlsx,ppt,pptx,pdf]类型的文件！", "");
			put("服务器处理失败，请重试，若还有问题，请联系管理员！", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			put("", "");
			
		}
	};

	public String getEnValue(String zh_CN_Message){
		if(StringUtils.isNotBlank(zh_CN_Message)){
			if(StringUtils.isNotBlank(enMap.get(zh_CN_Message))){
				return enMap.get(zh_CN_Message);
			}
		}
		return zh_CN_Message;
	}
	
	

}
