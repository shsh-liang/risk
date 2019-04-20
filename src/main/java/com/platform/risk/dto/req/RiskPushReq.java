package com.platform.risk.dto.req;

public class RiskPushReq {

	/**
	 * 决策结果:通过 accept，拒绝 refuse，异 error 三种结果类型
	 */
	private String result;
	/**
	 * 业务请求订单号
	 */
	private String order_no;
	/**
	 * 结果信息(当 result=accept/refuse 才有
	 */
	private RiskPushExtraInfo extra_info;
	/**
	 * 重要节点规则结果展示(当 result=accept/refuse 才有)
	 */
	private RiskPushAcceptResultLabel result_label;
	/**
	 * 风控策略结果统计信息 当 result=accept/refuse 才有
	 */
	private RiskPushStrategy strategy;
	/**
	 * 风控序列号(当 result=error 时可能为空
	 */
	private String serial_no;
	/**
	 * 异常编码 (当 result=error 才有)
	 */
	private String errorCode;
	/**
	 * 异常原因 (当 result=error 才有)
	 */
	private String errorMessage;

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public RiskPushAcceptResultLabel getResult_label() {
		return result_label;
	}

	public void setResult_label(RiskPushAcceptResultLabel result_label) {
		this.result_label = result_label;
	}

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

	public RiskPushExtraInfo getExtra_info() {
		return extra_info;
	}

	public void setExtra_info(RiskPushExtraInfo extra_info) {
		this.extra_info = extra_info;
	}

	public RiskPushStrategy getStrategy() {
		return strategy;
	}

	public void setStrategy(RiskPushStrategy strategy) {
		this.strategy = strategy;
	}

	public String getSerial_no() {
		return serial_no;
	}

	public void setSerial_no(String serial_no) {
		this.serial_no = serial_no;
	}
}
