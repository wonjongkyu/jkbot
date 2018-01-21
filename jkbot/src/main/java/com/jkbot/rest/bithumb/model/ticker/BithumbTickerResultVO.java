/*
 * Copyright yysvip.tistory.com.,LTD.
 * All rights reserved.
 * 
 * This software is the confidential and proprietary information
 * of yysvip.tistory.com.,LTD. ("Confidential Information").
 */
package com.jkbot.rest.bithumb.model.ticker; 

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;


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

public class BithumbTickerResultVO {
	@JsonProperty("status")
	private String status;				// 결과 상태 코드 (정상 : 0000, 정상이외 코드는 에러 코드 참조)
	@JsonProperty("data")
	private BithumbTickerListVO data;
	@JsonProperty("date")
	private String date;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
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
