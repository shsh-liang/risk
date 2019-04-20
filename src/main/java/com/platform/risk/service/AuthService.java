package com.platform.risk.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.platform.risk.constans.CommonConstans;

@Service
public class AuthService {

	@Autowired
	RedisBaseService redisBaseService;

	public String getAccessToken(String userName) {
		String accessToken = UUID.randomUUID().toString();
		redisBaseService.setString(accessToken, userName, CommonConstans.ACCESS_TOKEN_EXPIRE);
		return accessToken;
	}

	public boolean existAccessToken(String accessToken) {
		return redisBaseService.exist(accessToken);
	}
}
