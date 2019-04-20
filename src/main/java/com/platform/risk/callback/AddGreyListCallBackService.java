package com.platform.risk.callback;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.platform.risk.dto.req.BaseReq;
import com.platform.risk.dto.resp.BaseResp;
import com.platform.risk.service.RiskService;

@Service
public class AddGreyListCallBackService implements CallBackService {

	@Autowired
	private RiskService riskService;
	
	@Override
	public void riskCallBack(BaseReq req, BaseResp resp) {
		riskService.riskPush(null);
	}

}
