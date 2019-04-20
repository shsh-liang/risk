package com.platform.risk.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.platform.risk.dto.req.AccessTokenReq;
import com.platform.risk.dto.req.BaseReq;
import com.platform.risk.dto.resp.AccessTokenResp;
import com.platform.risk.dto.resp.BaseResp;
import com.platform.risk.service.AccessTokenService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(description = "访问控制接口")
public class AccessTokenController {

	@Autowired
	private AccessTokenService accessTokenService;

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	/**
	 * 渠道登录，获取accessToken
	 * 
	 * @param channelId
	 * @return
	 */
	@ApiOperation("渠道登录接口")
	@RequestMapping(value = { "/service/login" }, produces = "application/json;charset=utf-8", method = {
			RequestMethod.POST })
	@ResponseBody
	public BaseResp<AccessTokenResp> login(@RequestBody BaseReq<AccessTokenReq> req) {
		BaseResp<AccessTokenResp> baseResp = new BaseResp<AccessTokenResp>();
		logger.info("******收到获取accessToken请求接口******");
		accessTokenService.createAccessToken(req, baseResp);
		logger.info("******获取accessToken请求接口结束******");
		return baseResp;
	}
}
