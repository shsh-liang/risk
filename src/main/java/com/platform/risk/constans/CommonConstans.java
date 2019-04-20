package com.platform.risk.constans;

import java.util.HashMap;
import java.util.Map;

public class CommonConstans {

	public static final Map<String, String> CHANNEL_MAP = new HashMap<String, String>();
	static {
		CHANNEL_MAP.put("test", "test");
	}
	public static final long ACCESS_TOKEN_EXPIRE = 7200000l;
}
