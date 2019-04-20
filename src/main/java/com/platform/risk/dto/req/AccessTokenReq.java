package com.platform.risk.dto.req;

import com.platform.risk.annotation.FieldRequired;

public class AccessTokenReq {

	private String channelCode;

	@FieldRequired(value = "[ data.channelCode : may not be empty ];")
	public String getChannelCode() {
		return channelCode;
	}

	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}
}
