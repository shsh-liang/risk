package com.platform.risk.dto.resp;

;

public enum RespCode {
	OK("OK", "调用成功"), ERR_NOT_CHANNEL_CODE("ERR_NOT_CHANNEL_CODE", "渠道码不存在"), ERR_NOT_TOKEN("ERR_NOT_TOKEN", "参数中未上送token"),
	ERR_TOKEN_TIMEOUT("ERR_TOKEN_TIMEOUT", "token超时，请重新获取"), ERR_SYSTEM_PARAM_CHECK("ERR_SYSTEM_PARAM_CHECK", "参数校验失败"),
	ERR_SIGN_FAIL("ERR_SIGN_FAIL", "签名错误"), ERR_MNS_ERRO("ERR_MNS_ERRO", "消息队列异常"),
	ERR_ADD_GREY_LIST_UPLOAD("ERR_ADD_GREY_LIST_UPLOAD", "上传多次"),
	ERR_LOAN_RECORD_UPLOAD("ERR_LOAN_RECORD_UPLOAD", "数据已经上传过"), ERR_SYSTEM_ERROR("ERR_SYSTEM_ERROR", "喵不小心睡着了，稍后重试");

	private final String code;
	private final String msg;

	RespCode(String code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public String code() {
		return code;
	}

	public String msg() {
		return msg;
	}

}
