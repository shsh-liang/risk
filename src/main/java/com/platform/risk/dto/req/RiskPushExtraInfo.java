package com.platform.risk.dto.req;

public class RiskPushExtraInfo {

	/**
	 * 借款额度(只有 accept 才有)单位:元
	 */
	private Integer amount;
	/**
	 * 利率 如果利率是 20%, 那么这个字段的值就 20 (只有 accept 才有 )
	 */
	private Float interest;
	/**
	 * 模型分类型:0 默认，1 盘宝模型，2 其他模 型，3 自有模型，4 新颜模型
	 */
	private String model_type;
	/**
	 * 拒绝原因 (当 result=refuse 才有)
	 */
	private String reason;

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Float getInterest() {
		return interest;
	}

	public void setInterest(Float interest) {
		this.interest = interest;
	}

	public String getModel_type() {
		return model_type;
	}

	public void setModel_type(String model_type) {
		this.model_type = model_type;
	}
}
