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

public class BithumbInfoBalance extends RestCommonVO{
	@JsonProperty("data")
	private BithumbInfoBalance data;

	public BithumbInfoBalance getData() {
		return data;
	}
}
