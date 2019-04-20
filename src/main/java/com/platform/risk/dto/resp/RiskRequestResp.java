package com.platform.risk.dto.resp;

public class RiskRequestResp {
	/**
	 * 结果状态
	 */
	private String result = "SUCCESS";
	/**
	 * 业务请求订单号
	 */
	private String order_no;

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getOrder_no() {
		return order_no;
	}

	public void setOrder_no(String order_no) {
		this.order_no = order_no;
	}
}
