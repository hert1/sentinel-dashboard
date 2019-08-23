package com.alibaba.csp.sentinel.dashboard.constant;



/**
 * 通用常量
 *
 * @author Chill
 */
public interface CommonConstant {


	//超时
	Long TIME_OUT = 3000L;

	// 分组
	String FLOW_GROUP = "FLOW_GROUP";
	String SYSTEM_GROUP = "SYSTEM_GROUP";
	String AUTHORITY_GROUP = "AUTHORITY_GROUP";
	String PARAM_FLOW_GROUP = "PARAM_FLOW_GROUP";
	String DEGRADE_GROUP = "DEGRADE_GROUP";
	String NACOS_DEFAULT_GROUP = "DEFAULT_Group";

	// 流控规则空间
	String SENTINEL_ROLE = "9dfce552-fda6-4c51-a4af-e56102850b4d";

	/**
	 * nacos 地址
	 */
	String NACOS_ADDR = "47.101.172.209";

	/**
	 * nacos  地址
	 */
	String NACOS_ALL_ADDR = "47.101.172.209:8848";

	/**
	 * sentinel  地址
	 */
	String SENTINEL_ADDR = "localhost:8080";

}
