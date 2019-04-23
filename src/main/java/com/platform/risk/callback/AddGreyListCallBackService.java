package com.platform.risk.callback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.platform.risk.dto.req.BaseReq;
import com.platform.risk.dto.resp.BaseResp;

@Service
public class AddGreyListCallBackService implements CallBackService {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	public void riskCallBack(BaseReq req, BaseResp resp) {
	}

}
