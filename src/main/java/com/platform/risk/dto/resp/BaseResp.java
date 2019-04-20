package com.platform.risk.dto.resp;

public class BaseResp<T> {
	/**
	 * 状态码 OK 表明请求成功 非 OK 之外的表示是有 误信息
	 */
	private String code = RespCode.OK.code();
	/**
	 * 状态信息 错误的时候，这就是错误信息
	 */
	private String msg = RespCode.OK.msg();
	/**
	 * 时间戳
	 */
	private Long time;
	private String desc;
	private T data;

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

	public Long getTime() {
		return time;
	}

	public void setTime(Long time) {
		this.time = time;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}
