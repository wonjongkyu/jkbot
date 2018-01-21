/*
 * Copyright yysvip.tistory.com.,LTD.
 * All rights reserved.
 * 
 * This software is the confidential and proprietary information
 * of yysvip.tistory.com.,LTD. ("Confidential Information").
 */
package com.jkbot.rest.bithumb.model.ticker; 


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
public class BithumbTicker {
	private String currency_name;	// 코인 종류
	private String opening_price;	// 최근 24시간 내 시작 거래금액
	private String closing_price;	// 최근 24시간 내 마지막 거래금액
	private String min_price;		// 최근 24시간 내 최저 거래금액
	private String max_price;		// 최근 24시간 내 최고 거래금액
	private String average_price;	// 최근 24시간 내 평균 거래금액
	private String units_traded;	// 최근 24시간 내 Currency 거래량
	private String volume_1day;		// 최근 1일간 Currency 거래량
	private String volume_7day;		// 최근 7일간 Currency 거래량
	private String buy_price;		// 거래 대기건 최고 구매가
	private String sell_price;		// 거래 대기건 최소 판매가
	private String date;			// 현재 시간 Timestamp
	
	
	public String getCurrency_name() {
		return currency_name;
	}
	public void setCurrency_name(String currency_name) {
		this.currency_name = currency_name;
	}
	public String getOpening_price() {
		return opening_price;
	}
	public String getClosing_price() {
		return closing_price;
	}
	public String getMin_price() {
		return min_price;
	}
	public String getMax_price() {
		return max_price;
	}
	public String getAverage_price() {
		return average_price;
	}
	public String getUnits_traded() {
		return units_traded;
	}
	public String getVolume_1day() {
		return volume_1day;
	}
	public String getVolume_7day() {
		return volume_7day;
	}
	public String getBuy_price() {
		return buy_price;
	}
	public String getSell_price() {
		return sell_price;
	}
	public String getDate() {
		return date;
	}
 
	
}
