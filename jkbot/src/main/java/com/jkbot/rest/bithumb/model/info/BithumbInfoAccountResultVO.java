/*
 * Copyright yysvip.tistory.com.,LTD.
 * All rights reserved.
 * 
 * This software is the confidential and proprietary information
 * of yysvip.tistory.com.,LTD. ("Confidential Information").
 */
package com.jkbot.rest.bithumb.model.info; 

import org.codehaus.jackson.annotate.JsonProperty;

public class BithumbInfoAccountResultVO {
	@JsonProperty("created")
	private String created;		// 회원가입 일시 Timestamp
	@JsonProperty("account_id")
	private String account_id;	// 회원ID
	@JsonProperty("trade_fee")
	private String trade_fee;	// 거래 수수료
	@JsonProperty("balance")
	private String balance;		// 1Currency 잔액 (BTC, ETH, DASH, LTC, ETC, XRP, BCH, XMR, ZEC, QTUM, BTG, EOS)
	
	public String getCreated() {
		return created;
	}
	public String getAccount_id() {
		return account_id;
	}
	public String getTrade_fee() {
		return trade_fee;
	}
	public String getBalance() {
		return balance;
	}
}
