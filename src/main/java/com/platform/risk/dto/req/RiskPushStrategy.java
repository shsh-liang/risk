package com.platform.risk.dto.req;

import java.util.List;

public class RiskPushStrategy {

	/**
	 * 节点结果为 0(通过)的节点集合
	 */
	private List<RiskPushStrategyAcceptStrategy> acceptStrategy;
	/**
	 * 节点结果不为 0(拒绝)的节点集合
	 */
	private List<RiskPushStrategyAcceptStrategy> refuseStrategy;

	public List<RiskPushStrategyAcceptStrategy> getAcceptStrategy() {
		return acceptStrategy;
	}

	public void setAcceptStrategy(List<RiskPushStrategyAcceptStrategy> acceptStrategy) {
		this.acceptStrategy = acceptStrategy;
	}

	public List<RiskPushStrategyAcceptStrategy> getRefuseStrategy() {
		return refuseStrategy;
	}

	public void setRefuseStrategy(List<RiskPushStrategyAcceptStrategy> refuseStrategy) {
		this.refuseStrategy = refuseStrategy;
	}
}
