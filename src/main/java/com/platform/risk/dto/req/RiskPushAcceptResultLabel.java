package com.platform.risk.dto.req;

public class RiskPushAcceptResultLabel {

	/**
	 * 共债标签 0 未命中 1 命中
	 */
	private String gongzhai;
	/**
	 * 用户的类型: 0 老户 1 新户 2 老变新
	 */
	private String user_type;
	/**
	 * 用户是否通过在途(在途订单数,不包括在途 金方): 0.未命中 1.命中
	 */
	private String transit_order;

	public String getGongzhai() {
		return gongzhai;
	}

	public void setGongzhai(String gongzhai) {
		this.gongzhai = gongzhai;
	}

	public String getUser_type() {
		return user_type;
	}

	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}

	public String getTransit_order() {
		return transit_order;
	}

	public void setTransit_order(String transit_order) {
		this.transit_order = transit_order;
	}

}
