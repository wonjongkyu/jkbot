/*
 * Copyright yysvip.tistory.com.,LTD.
 * All rights reserved.
 * 
 * This software is the confidential and proprietary information
 * of yysvip.tistory.com.,LTD. ("Confidential Information").
 */
package com.jkbot.rest.bithumb.model.ticker; 

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
public class BithumbTickerListVO {
	@JsonProperty("BTC")
	private BithumbTicker BTC;	// 비트코인
	@JsonProperty("ETH")
	private BithumbTicker ETH;	// 이더리움
	@JsonProperty("DASH")
	private BithumbTicker DASH;	// 대시
	@JsonProperty("LTC")
	private BithumbTicker LTC;	// 라이트 코인
	@JsonProperty("ETC")
	private BithumbTicker ETC;	// 이더리움 클래식
	@JsonProperty("XRP")
	private BithumbTicker XRP;	// 리플
	@JsonProperty("BCH")
	private BithumbTicker BCH;	// 비트코인 캐시
	@JsonProperty("XMR")
	private BithumbTicker XMR;	// 모네로
	@JsonProperty("ZEC")
	private BithumbTicker ZEC;	// 제트캐시
	@JsonProperty("QTUM")
	private BithumbTicker QTUM;	// 퀀텀
	@JsonProperty("BTG")
	private BithumbTicker BTG;	// 비트코인 골드
	@JsonProperty("EOS")
	private BithumbTicker EOS;	// 이오스
	
	
	
	public BithumbTicker getBTC() {
		BTC.setCurrency_name("비트코인");
		return BTC;
	}
	public void setBTC(BithumbTicker bTC) {
		BTC = bTC;
	}
	public BithumbTicker getETH() {
		ETH.setCurrency_name("이더리움");
		return ETH;
	}
	public void setETH(BithumbTicker eTH) {
		ETH = eTH;
	}
	public BithumbTicker getDASH() {
		DASH.setCurrency_name("대시");
		return DASH;
	}
	public void setDASH(BithumbTicker dASH) {
		DASH = dASH;
	}
	public BithumbTicker getLTC() {
		LTC.setCurrency_name("라이트코인");
		return LTC;
	}
	public void setLTC(BithumbTicker lTC) {
		LTC = lTC;
	}
	public BithumbTicker getETC() {
		ETC.setCurrency_name("이더리움 클래식");
		return ETC;
	}
	public void setETC(BithumbTicker eTC) {
		ETC = eTC;
	}
	public BithumbTicker getXRP() {
		XRP.setCurrency_name("리플");
		return XRP;
	}
	public void setXRP(BithumbTicker xRP) {
		XRP = xRP;
	}
	public BithumbTicker getBCH() {
		BCH.setCurrency_name("비트코인 캐시");
		return BCH;
	}
	public void setBCH(BithumbTicker bCH) {
		BCH = bCH;
	}
	public BithumbTicker getXMR() {
		XMR.setCurrency_name("모네로");
		return XMR;
	}
	public void setXMR(BithumbTicker xMR) {
		XMR = xMR;
	}
	public BithumbTicker getZEC() {
		ZEC.setCurrency_name("제트캐시");
		return ZEC;
	}
	public void setZEC(BithumbTicker zEC) {
		ZEC = zEC;
	}
	public BithumbTicker getQTUM() {
		QTUM.setCurrency_name("퀀텀");
		return QTUM;
	}
	public void setQTUM(BithumbTicker qTUM) {
		QTUM = qTUM;
	}
	public BithumbTicker getBTG() {
		BTG.setCurrency_name("비트코인 골드");
		return BTG;
	}
	public void setBTG(BithumbTicker bTG) {
		BTG = bTG;
	}
	public BithumbTicker getEOS() {
		EOS.setCurrency_name("이오스");
		return EOS;
	}
	public void setEOS(BithumbTicker eOS) {
		EOS = eOS;
	}
	
}
