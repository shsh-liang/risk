package com.platform.risk.service;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class RedisBaseService {

	@Autowired
	protected StringRedisTemplate stringRedisTemplate;

	public void setString(String key, String value, long expire) {
		stringRedisTemplate.opsForValue().set(key, value, expire, TimeUnit.SECONDS);
	}

	public String getString(String key) {
		return stringRedisTemplate.opsForValue().get(key);
	}

	public boolean exist(String key) {
		return stringRedisTemplate.hasKey(key);
	}

	public void del(String key) {
		stringRedisTemplate.delete(key);
	}
}
