/*
 * Copyright yysvip.tistory.com.,LTD.
 * All rights reserved.
 * 
 * This software is the confidential and proprietary information
 * of yysvip.tistory.com.,LTD. ("Confidential Information").
 */
package com.jkbot.rest.bithumb.model.info; 

import org.codehaus.jackson.annotate.JsonProperty;

import com.jkbot.rest.common.model.RestCommonVO;

public class BithumbInfoBalanceResultVO extends RestCommonVO{
	@JsonProperty("total_btc")
	private String total_btc;
	@JsonProperty("total_krw")
	private String total_krw;
	@JsonProperty("in_use_btc")
	private String in_use_btc;
	@JsonProperty("in_use_krw")
	private String in_use_krw;
	@JsonProperty("available_btc")
	private String available_btc;
	@JsonProperty("available_krw")
	private String available_krw;
	@JsonProperty("xcoin_last")
	private String xcoin_last;
	public String getTotal_btc() {
		return total_btc;
	}
	public String getTotal_krw() {
		return total_krw;
	}
	public String getIn_use_btc() {
		return in_use_btc;
	}
	public String getIn_use_krw() {
		return in_use_krw;
	}
	public String getAvailable_btc() {
		return available_btc;
	}
	public String getAvailable_krw() {
		return available_krw;
	}
	public String getXcoin_last() {
		return xcoin_last;
	}
	
	
	 
}
