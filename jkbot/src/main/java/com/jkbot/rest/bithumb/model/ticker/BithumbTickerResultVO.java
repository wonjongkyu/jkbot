/*
 * Copyright yysvip.tistory.com.,LTD.
 * All rights reserved.
 * 
 * This software is the confidential and proprietary information
 * of yysvip.tistory.com.,LTD. ("Confidential Information").
 */
package com.jkbot.rest.bithumb.model.ticker; 

import org.codehaus.jackson.annotate.JsonProperty;

import com.jkbot.rest.common.model.RestCommonVO;


/**
 * <pre>
 * com.jkbot.bithumb.RestAPI.domain 
 *    |_ BithumbRestVO.java
 * 
 * </pre>
 * @date : 2018. 1. 20. 오후 8:56:56
 * @version : 
 * @author : jongkyu
 */

public class BithumbTickerResultVO extends RestCommonVO{
	@JsonProperty("data")
	private BithumbTickerListVO data;
	@JsonProperty("date")
	private String date;
	 
	public BithumbTickerListVO getData() {
		return data;
	}
	public void setData(BithumbTickerListVO data) {
		this.data = data;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	 
	 
	
	
}
