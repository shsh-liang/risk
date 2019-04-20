package com.platform.risk.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.platform.risk.dto.req.AddGreyListReq;
import com.platform.risk.dto.req.BaseReq;
import com.platform.risk.dto.req.RiskRequestReq;
import com.platform.risk.dto.req.UploadRecordReq;
import com.platform.risk.dto.resp.AddGreyListResp;
import com.platform.risk.dto.resp.BaseResp;
import com.platform.risk.dto.resp.RiskRequestResp;
import com.platform.risk.dto.resp.UploadRecordResp;
import com.platform.risk.service.RiskService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(description = "风控接口")
public class RiskController {

	@Autowired
	private RiskService riskService;
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	/**
	 * 风控请求接口
	 * 
	 * @param req
	 * @return
	 */
	@ApiOperation("风控请求接口")
	@RequestMapping(value = { "/service/decision" }, produces = "application/json;charset=utf-8", method = {
			RequestMethod.POST })
	@ResponseBody
	public BaseResp<RiskRequestResp> decision(@RequestBody BaseReq<RiskRequestReq> req) {
		BaseResp<RiskRequestResp> baseResp = new BaseResp<RiskRequestResp>();
		logger.info("******收到风控请求接口******");
		riskService.decision(req, baseResp);
		logger.info("******风控请求接口结束******");
		return baseResp;
	}

	/**
	 * 风控贷后灰名单数据上传接口
	 * 
	 * @param req
	 * @return
	 */
	@ApiOperation("风控贷后灰名单数据上传接口")
	@RequestMapping(value = { "/service/addGreyLis" }, produces = "application/json;charset=utf-8", method = {
			RequestMethod.POST })
	@ResponseBody
	public BaseResp<AddGreyListResp> addGreyLis(@RequestBody BaseReq<AddGreyListReq> req) {
		BaseResp<AddGreyListResp> baseResp = new BaseResp<AddGreyListResp>();
		logger.info("******收到风控贷后灰名单数据上传请求接口******");
		riskService.addGreyLis(req, baseResp);
		logger.info("******风控贷后灰名单数据上传请求接口结束******");
		return baseResp;
	}

	/**
	 * 风控贷后记录数据上传接口
	 * 
	 * @param req
	 * @return
	 */
	@ApiOperation("风控贷后记录数据上传接口")
	@RequestMapping(value = { "/service/loanRecord" }, produces = "application/json;charset=utf-8", method = {
			RequestMethod.POST })
	@ResponseBody
	public BaseResp<UploadRecordResp> uploadRecord(@RequestBody BaseReq<UploadRecordReq> req) {
		BaseResp<UploadRecordResp> baseResp = new BaseResp<UploadRecordResp>();
		logger.info("******收到风控贷后记录数据上传请求接口******");
		riskService.uploadRecord(req, baseResp);
		logger.info("******风控贷后记录数据上传请求接口结束******");
		return baseResp;
	}

}
