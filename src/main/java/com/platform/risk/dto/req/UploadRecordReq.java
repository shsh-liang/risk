package com.platform.risk.dto.req;

import com.platform.risk.annotation.FieldRequired;

public class UploadRecordReq {

	/**
	 * 风控序列号
	 */
	private String serialNo;
	/**
	 * 业务订单号 id
	 */
	private String loanNo;
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
	 * 用户中心 id
	 */
	private Integer platformUid;
	/**
	 * 手机号
	 */
	private String mobile;
	/**
	 * 状态:0 创建账单 1 正常还款 2 还款 3 逾期还款
	 */
	private Integer repayStatus;
	/**
	 * 实际还款日
	 */
	private String actualRepayDate;
	/**
	 * 计划还款日
	 */
	private String planRepayDate;
	/**
	 * 公司编码 写: TSD
	 */
	private String companyCode;
	/**
	 * 产品编码 西瓜商城: TSD02 天神 贷:TSD01 天天回收:TSD03
	 */
	private String productCode;
	/**
	 * 放款时间
	 */
	private String loanTime;
	/**
	 * 订单完成时间
	 */
	private String closeTime;
	/**
	 * 放款金额 分
	 */
	private Integer loanAmount;
	/**
	 * 本金分
	 */
	private Integer capital;
	/**
	 * 砍头息 分
	 */
	private Integer cutInterest;
	/**
	 * 利息分
	 */
	private Integer interest;
	/**
	 * 滞纳金 分
	 */
	private Integer surchargeFee;
	/**
	 * 逾期罚息金额 分
	 */
	private Integer penaltyInterest;
	/**
	 * 银行罚息 分
	 */
	private Integer bankInterest;
	/**
	 * 资金方编码 写: TSD MB DR
	 */
	private String fundCode;
	/**
	 * 产品编码 写: 7days 14days 12d 10days
	 */
	private String goodsCode;
	/**
	 * 实际还款金额 分
	 */
	private Integer realRepaymentAmount;
	/**
	 * 实际应还金额 分
	 */
	private Integer realShouldAmount;

	@FieldRequired(value = "[ data.serialNo : may not be empty ];")
	public String getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	@FieldRequired(value = "[ data.loanNo : may not be empty ];")
	public String getLoanNo() {
		return loanNo;
	}

	public void setLoanNo(String loanNo) {
		this.loanNo = loanNo;
	}

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

	@FieldRequired(value = "[ data.platformUid : may not be empty ];")
	public Integer getPlatformUid() {
		return platformUid;
	}

	public void setPlatformUid(Integer platformUid) {
		this.platformUid = platformUid;
	}

	@FieldRequired(value = "[ data.mobile : may not be empty ];")
	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Integer getRepayStatus() {
		return repayStatus;
	}

	public void setRepayStatus(Integer repayStatus) {
		this.repayStatus = repayStatus;
	}

	public String getActualRepayDate() {
		return actualRepayDate;
	}

	public void setActualRepayDate(String actualRepayDate) {
		this.actualRepayDate = actualRepayDate;
	}

	public String getPlanRepayDate() {
		return planRepayDate;
	}

	public void setPlanRepayDate(String planRepayDate) {
		this.planRepayDate = planRepayDate;
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

	public String getLoanTime() {
		return loanTime;
	}

	public void setLoanTime(String loanTime) {
		this.loanTime = loanTime;
	}

	public String getCloseTime() {
		return closeTime;
	}

	public void setCloseTime(String closeTime) {
		this.closeTime = closeTime;
	}

	public Integer getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(Integer loanAmount) {
		this.loanAmount = loanAmount;
	}

	public Integer getCapital() {
		return capital;
	}

	public void setCapital(Integer capital) {
		this.capital = capital;
	}

	public Integer getCutInterest() {
		return cutInterest;
	}

	public void setCutInterest(Integer cutInterest) {
		this.cutInterest = cutInterest;
	}

	public Integer getInterest() {
		return interest;
	}

	public void setInterest(Integer interest) {
		this.interest = interest;
	}

	public Integer getSurchargeFee() {
		return surchargeFee;
	}

	public void setSurchargeFee(Integer surchargeFee) {
		this.surchargeFee = surchargeFee;
	}

	public Integer getPenaltyInterest() {
		return penaltyInterest;
	}

	public void setPenaltyInterest(Integer penaltyInterest) {
		this.penaltyInterest = penaltyInterest;
	}

	public Integer getBankInterest() {
		return bankInterest;
	}

	public void setBankInterest(Integer bankInterest) {
		this.bankInterest = bankInterest;
	}

	@FieldRequired(value = "[ data.fundCode : may not be empty ];")
	public String getFundCode() {
		return fundCode;
	}

	public void setFundCode(String fundCode) {
		this.fundCode = fundCode;
	}

	@FieldRequired(value = "[ data.goodsCode : may not be empty ];")
	public String getGoodsCode() {
		return goodsCode;
	}

	public void setGoodsCode(String goodsCode) {
		this.goodsCode = goodsCode;
	}

	public Integer getRealRepaymentAmount() {
		return realRepaymentAmount;
	}

	public void setRealRepaymentAmount(Integer realRepaymentAmount) {
		this.realRepaymentAmount = realRepaymentAmount;
	}

	public Integer getRealShouldAmount() {
		return realShouldAmount;
	}

	public void setRealShouldAmount(Integer realShouldAmount) {
		this.realShouldAmount = realShouldAmount;
	}
}
