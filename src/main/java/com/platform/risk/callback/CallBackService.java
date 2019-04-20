package com.platform.risk.callback;

import com.platform.risk.dto.req.BaseReq;
import com.platform.risk.dto.resp.BaseResp;

public interface CallBackService {

	void riskCallBack(BaseReq req, BaseResp resp);
}
