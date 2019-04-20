package com.platform.risk.dto.req;

import java.util.List;

import com.platform.risk.annotation.FieldRequired;

public class RiskRequestReq {

	/**
	 * 用户名称
	 */
	private String name;
	/**
	 * 身份证号
	 */
	private String idNum;
	/**
	 * 各个 app 平台的用户 id
	 */
	private Integer uid;
	/**
	 * 手机号
	 */
	private String mobile;
	/**
	 * 公司编码 写: TSD MB D
	 */
	private String companyCode;
	/**
	 * 产品编码 西瓜商城: TSD02 天神 贷:TSD01 天天回收:TSD03
	 */
	private String productCode;
	/**
	 * 产品编码 写: 7days 14days 12da 10days
	 */
	private String goodsCode;
	/**
	 * 资金方编码 写: TSD MB DR
	 */
	private String fundCode;
	/**
	 * 是否 root:1 是 2 否
	 */
	private Integer isRoot;
	/**
	 * 用户中心 id
	 */
	private Integer userCenterId;
	/**
	 * 芝麻分 没有传 0
	 */
	private Integer zmScore;
	/**
	 * 运营商 token
	 */
	private String token;
	/**
	 * 魔蝎淘宝 id 没有传空字符串
	 */
	private String tbTaskId;
	/**
	 * 第一联系人手机号
	 */
	private String contactsMobile;
	/**
	 * 第二联系人手机号
	 */
	private String contactsMobileSec;
	/**
	 * 第一联系人名字
	 */
	private String contactsName;
	/**
	 * 第二联系人名字
	 */
	private String contactsNameSec;
	/**
	 * 职业名字 没有传空字符串
	 */
	private String jobName;
	/**
	 * 订单号
	 */
	private String orderNo;
	/**
	 * 身份号有效期 没有传空字符串
	 */
	private String validPeriod;
	/**
	 * 国籍 没有传空字符串
	 */
	private String nation;
	/**
	 * 身份证地址 没有传空字符串
	 */
	private String birthplace;
	/**
	 * 新用户创建时间
	 */
	private String addTime;
	/**
	 * qq 号 没有传空字符串
	 */
	private String qqNum;
	/**
	 * 设备 id 没有传空字符串
	 */
	private String deviceId;
	/**
	 * app 列表 没有传空字符串
	 */
	private String appList;
	/**
	 * 银行卡号 没有传空字符
	 */
	private String cardNum;
	/**
	 * 银行卡预留电话 没有传空字符串
	 */
	private String reservedMobile;
	/**
	 * 银行编号 没有传空字符串
	 */
	private String gateId;
	/**
	 * 银行卡名称 没有传空字符串
	 */
	private String bankName;
	/**
	 * 用户公司名称 没有传空字符串
	 */
	private String companyName;
	/**
	 * 用户公司地址 没有传空字符串
	 */
	private String companyAddress;
	/**
	 * 用户公司电话 没有传空字符串
	 */
	private String companyPhone;
	/**
	 * 用户手机系统类型 1:安卓, 2:IOS
	 */
	private Integer systemType;
	/**
	 * 用户现居住地址 没有传空字符串
	 */
	private String userAddress;
	/**
	 * 身份证正反面 url 没有传空字符串
	 */
	private String filePath;
	/**
	 * 风控结果推送 url
	 */
	private String callbackUrl;
	/**
	 * 签名(name,idNum,mobile,companyCode,productCode,orderNo)
	 */
	private String sign;
	/**
	 * 通讯录: name=联系人姓名, phone 系人手机号 没有传空数组
	 */
	private List<RiskRequestContact> contacts;
	/**
	 * 经度,取值范围为[-180,180] 纬度,取值范围为[-180,180]
	 */
	private RiskRequestLoc loc;
	/**
	 * 是否风控回归测试:0 不是，1 是
	 */
	private Integer isTest;
	/**
	 * 社保卡 tid
	 */
	private String socialCard;
	/**
	 * 信用卡 tid
	 */
	private String creditCard;
	/**
	 * 住房公积金 tid
	 */
	private String housingFund;
	/**
	 * 饿了么 token
	 */
	private String elemeToken;
	/**
	 * 用户来源渠道
	 */
	private String userChannel;

	@FieldRequired(value = "[ data.name : may not be empty ];")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@FieldRequired(value = "[ data.idNum : may not be empty ];")
	public String getIdNum() {
		return idNum;
	}

	public void setIdNum(String idNum) {
		this.idNum = idNum;
	}

	@FieldRequired(value = "[ data.uid : may not be empty ];")
	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	@FieldRequired(value = "[ data.mobile : may not be empty ];")
	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@FieldRequired(value = "[ data.companyCode : may not be empty ];")
	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	@FieldRequired(value = "[ data.productCode : may not be empty ];")
	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	@FieldRequired(value = "[ data.goodsCode : may not be empty ];")
	public String getGoodsCode() {
		return goodsCode;
	}

	public void setGoodsCode(String goodsCode) {
		this.goodsCode = goodsCode;
	}

	@FieldRequired(value = "[ data.fundCode : may not be empty ];")
	public String getFundCode() {
		return fundCode;
	}

	public void setFundCode(String fundCode) {
		this.fundCode = fundCode;
	}

	@FieldRequired(value = "[ data.isRoot : may not be empty ];")
	public Integer getIsRoot() {
		return isRoot;
	}

	public void setIsRoot(Integer isRoot) {
		this.isRoot = isRoot;
	}

	@FieldRequired(value = "[ data.userCenterId : may not be empty ];")
	public Integer getUserCenterId() {
		return userCenterId;
	}

	public void setUserCenterId(Integer userCenterId) {
		this.userCenterId = userCenterId;
	}

	@FieldRequired(value = "[ data.zmScore : may not be empty ];")
	public Integer getZmScore() {
		return zmScore;
	}

	public void setZmScore(Integer zmScore) {
		this.zmScore = zmScore;
	}

	@FieldRequired(value = "[ data.token : may not be empty ];")
	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getTbTaskId() {
		return tbTaskId;
	}

	public void setTbTaskId(String tbTaskId) {
		this.tbTaskId = tbTaskId;
	}

	@FieldRequired(value = "[ data.contactsMobile : may not be empty ];")
	public String getContactsMobile() {
		return contactsMobile;
	}

	public void setContactsMobile(String contactsMobile) {
		this.contactsMobile = contactsMobile;
	}

	@FieldRequired(value = "[ data.contactsMobileSec : may not be empty ];")
	public String getContactsMobileSec() {
		return contactsMobileSec;
	}

	public void setContactsMobileSec(String contactsMobileSec) {
		this.contactsMobileSec = contactsMobileSec;
	}

	@FieldRequired(value = "[ data.contactsName : may not be empty ];")
	public String getContactsName() {
		return contactsName;
	}

	public void setContactsName(String contactsName) {
		this.contactsName = contactsName;
	}

	@FieldRequired(value = "[ data.contactsNameSec : may not be empty ];")
	public String getContactsNameSec() {
		return contactsNameSec;
	}

	public void setContactsNameSec(String contactsNameSec) {
		this.contactsNameSec = contactsNameSec;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	@FieldRequired(value = "[ data.orderNo : may not be empty ];")
	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getValidPeriod() {
		return validPeriod;
	}

	public void setValidPeriod(String validPeriod) {
		this.validPeriod = validPeriod;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public String getBirthplace() {
		return birthplace;
	}

	public void setBirthplace(String birthplace) {
		this.birthplace = birthplace;
	}

	@FieldRequired(value = "[ data.addTime : may not be empty ];")
	public String getAddTime() {
		return addTime;
	}

	public void setAddTime(String addTime) {
		this.addTime = addTime;
	}

	public String getQqNum() {
		return qqNum;
	}

	public void setQqNum(String qqNum) {
		this.qqNum = qqNum;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getAppList() {
		return appList;
	}

	public void setAppList(String appList) {
		this.appList = appList;
	}

	public String getCardNum() {
		return cardNum;
	}

	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}

	public String getReservedMobile() {
		return reservedMobile;
	}

	public void setReservedMobile(String reservedMobile) {
		this.reservedMobile = reservedMobile;
	}

	public String getGateId() {
		return gateId;
	}

	public void setGateId(String gateId) {
		this.gateId = gateId;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}

	public String getCompanyPhone() {
		return companyPhone;
	}

	public void setCompanyPhone(String companyPhone) {
		this.companyPhone = companyPhone;
	}

	@FieldRequired(value = "[ data.systemType : may not be empty ];")
	public Integer getSystemType() {
		return systemType;
	}

	public void setSystemType(Integer systemType) {
		this.systemType = systemType;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	@FieldRequired(value = "[ data.callbackUrl : may not be empty ];")
	public String getCallbackUrl() {
		return callbackUrl;
	}

	public void setCallbackUrl(String callbackUrl) {
		this.callbackUrl = callbackUrl;
	}

	@FieldRequired(value = "[ data.sign : may not be empty ];")
	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	@FieldRequired(value = "[ data.contacts : may not be empty ];")
	public List<RiskRequestContact> getContacts() {
		return contacts;
	}

	public void setContacts(List<RiskRequestContact> contacts) {
		this.contacts = contacts;
	}

	public RiskRequestLoc getLoc() {
		return loc;
	}

	public void setLoc(RiskRequestLoc loc) {
		this.loc = loc;
	}

	public Integer getIsTest() {
		return isTest;
	}

	public void setIsTest(Integer isTest) {
		this.isTest = isTest;
	}

	public String getSocialCard() {
		return socialCard;
	}

	public void setSocialCard(String socialCard) {
		this.socialCard = socialCard;
	}

	public String getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(String creditCard) {
		this.creditCard = creditCard;
	}

	public String getHousingFund() {
		return housingFund;
	}

	public void setHousingFund(String housingFund) {
		this.housingFund = housingFund;
	}

	public String getElemeToken() {
		return elemeToken;
	}

	public void setElemeToken(String elemeToken) {
		this.elemeToken = elemeToken;
	}

	public String getUserChannel() {
		return userChannel;
	}

	public void setUserChannel(String userChannel) {
		this.userChannel = userChannel;
	}

}
