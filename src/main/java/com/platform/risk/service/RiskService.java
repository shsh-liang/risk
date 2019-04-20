package com.platform.risk.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.alibaba.fastjson.JSON;
import com.platform.risk.callback.AddGreyListCallBackService;
import com.platform.risk.callback.CallBackService;
import com.platform.risk.callback.RiskRequestCallBackService;
import com.platform.risk.callback.UploadRecordCallBackService;
import com.platform.risk.dto.req.AccessTokenReq;
import com.platform.risk.dto.req.AddGreyListReq;
import com.platform.risk.dto.req.BaseReq;
import com.platform.risk.dto.req.RiskPushReq;
import com.platform.risk.dto.req.RiskRequestReq;
import com.platform.risk.dto.req.UploadRecordReq;
import com.platform.risk.dto.resp.AddGreyListResp;
import com.platform.risk.dto.resp.BaseResp;
import com.platform.risk.dto.resp.RespCode;
import com.platform.risk.dto.resp.RiskRequestResp;
import com.platform.risk.dto.resp.UploadRecordResp;
import com.platform.risk.utils.CheckFieldRequiredUtils;
import com.platform.risk.utils.HttpUtils;
import com.platform.risk.utils.RespUtils;

@Service
public class RiskService {

	@Autowired
	private RiskRequestCallBackService riskRequestCallBackService;
	@Autowired
	private AddGreyListCallBackService addGreyListCallBackService;
	@Autowired
	private UploadRecordCallBackService uploadRecordCallBackService;
	@Autowired
	AuthService authService;
	@Value("${auth.flag}")
	private boolean authFlag;
	@Value("${riskPushUrl}")
	private String riskPushUrl;

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	/**
	 * 风控请求
	 * 
	 * @param req
	 * @param baseResp
	 */
	public void decision(BaseReq<RiskRequestReq> req, BaseResp<RiskRequestResp> baseResp) {
		riskHandle(req, baseResp, "风控请求", riskRequestCallBackService);
	}

	/**
	 * 风控贷后灰名单数据上传
	 * 
	 * @param req
	 * @param baseResp
	 */
	public void addGreyLis(BaseReq<AddGreyListReq> req, BaseResp<AddGreyListResp> baseResp) {
		riskHandle(req, baseResp, "风控贷后灰名单数据上传", addGreyListCallBackService);
	}

	/**
	 * 风控贷后记录数据
	 * 
	 * @param req
	 * @param baseResp
	 */
	public void uploadRecord(BaseReq<UploadRecordReq> req, BaseResp<UploadRecordResp> baseResp) {
		riskHandle(req, baseResp, "风控贷后记录数据", uploadRecordCallBackService);
	}

	private void riskHandle(BaseReq req, BaseResp baseResp, String remark, CallBackService callBackService) {
		if (req == null || req.getData() == null) {
			RespUtils.initErrorResp(RespCode.ERR_SYSTEM_PARAM_CHECK.code(), RespCode.ERR_SYSTEM_PARAM_CHECK.msg(), null,
					baseResp);
		} else {
			String str = CheckFieldRequiredUtils.checkRequestParamRequired(req);
			if (!StringUtils.isEmpty(str)) {
				logger.error(remark + "接口检验参数错误【" + str + "】");
				RespUtils.initErrorResp(RespCode.ERR_SYSTEM_PARAM_CHECK.code(), RespCode.ERR_SYSTEM_PARAM_CHECK.msg(),
						str, baseResp);
			} else {
				if (authFlag) {
					logger.info("校验" + remark + "接口是否登录");
					String accessToken = req.getAccessToken();
					if (StringUtils.isEmpty(accessToken)) {
						logger.error(remark + "接口accessToken未上送");
						RespUtils.initErrorResp(RespCode.ERR_NOT_TOKEN.code(), RespCode.ERR_NOT_TOKEN.msg(), str,
								baseResp);
					} else {
						if (authService.existAccessToken(accessToken)) {
							logger.info("调用" + remark + "接口回调方法");
							callBackService.riskCallBack(req, baseResp);
						} else {
							logger.error(remark + "接口accessToken超时");
							RespUtils.initErrorResp(RespCode.ERR_TOKEN_TIMEOUT.code(), RespCode.ERR_TOKEN_TIMEOUT.msg(),
									str, baseResp);
						}
					}
				} else {
					logger.info("调用" + remark + "接口回调方法");
					callBackService.riskCallBack(req, baseResp);
				}
			}
		}
	}
	
	/**
	 * 风控结果推送
	 * 
	 * @param req
	 */
	public void riskPush(BaseReq<RiskPushReq> req) {
		logger.info("调用风控结果推送接口");
		BaseReq<AccessTokenReq> req1 = new BaseReq<AccessTokenReq>();
		AccessTokenReq req11 = new AccessTokenReq();
		req11.setChannelCode("test");
		req1.setData(req11);
		String resp = HttpUtils.doPost(riskPushUrl, JSON.toJSONString(req1));
		System.out.println(resp);
		logger.info("调用风控结果推送接口结束");
	}

}
