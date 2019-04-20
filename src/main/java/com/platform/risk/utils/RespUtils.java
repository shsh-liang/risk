package com.platform.risk.utils;

import java.util.Date;

import com.platform.risk.dto.resp.BaseResp;

public class RespUtils {

	public static void initErrorResp(String code, String msg, String desc, BaseResp resp) {
		resp.setCode(code);
		resp.setDesc(desc);
		resp.setMsg(msg);
		resp.setTime(new Date().getTime());
	}
}
