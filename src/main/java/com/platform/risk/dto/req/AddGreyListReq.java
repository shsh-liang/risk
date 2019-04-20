package com.platform.risk.dto.req;

import com.platform.risk.annotation.FieldRequired;

public class AddGreyListReq {

	/**
	 * 用户名称
	 */
	private String name;
	/**
	 * 身份证号
	 */
	private String idNum;
	/**
	 * 手机号
	 */
	private String mobile;
	/**
	 * 灰名单原因
	 */
	private String reason;
	/**
	 * 公司编码 写: TSD 买呗 MB
	 */
	private String companyCode;
	/**
	 * 产品编码 西瓜商城: TSD02 天神贷:T 天天回收:TSD03 买呗 MB01
	 */
	private String productCode;

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

	@FieldRequired(value = "[ data.mobile : may not be empty ];")
	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
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
}
