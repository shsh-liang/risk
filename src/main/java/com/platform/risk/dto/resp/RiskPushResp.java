package com.platform.risk.dto.resp;

public class RiskPushResp {

	/**
	 * 状态码 0 表示请求成功，1 表示是有错误信息
	 */
	private String code;
	/**
	 * 状态信息 错误的时候，这就是错误信息
	 */
	private String msg;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
