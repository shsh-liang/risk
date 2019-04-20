package com.platform.risk.service;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.platform.risk.constans.CommonConstans;
import com.platform.risk.dto.req.AccessTokenReq;
import com.platform.risk.dto.req.BaseReq;
import com.platform.risk.dto.resp.AccessTokenResp;
import com.platform.risk.dto.resp.BaseResp;
import com.platform.risk.dto.resp.RespCode;
import com.platform.risk.utils.CheckFieldRequiredUtils;
import com.platform.risk.utils.RespUtils;

@Service
public class AccessTokenService {

	@Autowired
	private AuthService authService;
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	public void createAccessToken(BaseReq<AccessTokenReq> req, BaseResp<AccessTokenResp> baseResp) {
		if (req == null || req.getData() == null) {
			logger.error("生成accessToken检验参数错误【请求头为空】");
			RespUtils.initErrorResp(RespCode.ERR_SYSTEM_PARAM_CHECK.code(), RespCode.ERR_SYSTEM_PARAM_CHECK.msg(), null,
					baseResp);
		} else {
			String str = CheckFieldRequiredUtils.checkRequestParamRequired(req);
			if (!StringUtils.isEmpty(str)) {
				logger.error("生成accessToken检验参数错误【" + str + "】");
				RespUtils.initErrorResp(RespCode.ERR_SYSTEM_PARAM_CHECK.code(), RespCode.ERR_SYSTEM_PARAM_CHECK.msg(),
						str, baseResp);
			} else {
				if (CommonConstans.CHANNEL_MAP.containsKey(req.getData().getChannelCode())) {
					logger.info("获取accessToken请求接口处理中，【channelCode：" + req.getData().getChannelCode() + "】");
					// 登陆
					String token = authService.getAccessToken(req.getData().getChannelCode());
					AccessTokenResp respData = new AccessTokenResp();
					respData.setToken(token);
					baseResp.setData(respData);
					baseResp.setTime(new Date().getTime());
					logger.info("获取accessToken请求接口处理完成，【channelCode：" + req.getData().getChannelCode() + "，token："
							+ token + "】");
				} else {
					logger.error("获取accessToken请求接口失败，渠道码不存在【channelCode：" + req.getData().getChannelCode() + "】");
					RespUtils.initErrorResp(RespCode.ERR_NOT_CHANNEL_CODE.code(), RespCode.ERR_NOT_CHANNEL_CODE.msg(),
							null, baseResp);
				}
			}
		}
	}
}
