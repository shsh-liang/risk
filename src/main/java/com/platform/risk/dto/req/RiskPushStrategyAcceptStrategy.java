package com.platform.risk.dto.req;

public class RiskPushStrategyAcceptStrategy {

	/**
	 * 节点编码
	 */
	private String code;
	/**
	 * 节点名称
	 */
	private String name;
	/**
	 * 节点结果
	 */
	private Integer outcome;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getOutcome() {
		return outcome;
	}

	public void setOutcome(Integer outcome) {
		this.outcome = outcome;
	}
}
