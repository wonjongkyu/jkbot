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
public class BithumbTickerListVO {
	@JsonProperty("BTC")
	private BithumbTickerVO BTC;	// 비트코인
	@JsonProperty("ETH")
	private BithumbTickerVO ETH;	// 이더리움
	@JsonProperty("DASH")
	private BithumbTickerVO DASH;	// 대시
	@JsonProperty("LTC")
	private BithumbTickerVO LTC;	// 라이트 코인
	@JsonProperty("ETC")
	private BithumbTickerVO ETC;	// 이더리움 클래식
	@JsonProperty("XRP")
	private BithumbTickerVO XRP;	// 리플
	@JsonProperty("BCH")
	private BithumbTickerVO BCH;	// 비트코인 캐시
	@JsonProperty("XMR")
	private BithumbTickerVO XMR;	// 모네로
	@JsonProperty("ZEC")
	private BithumbTickerVO ZEC;	// 제트캐시
	@JsonProperty("QTUM")
	private BithumbTickerVO QTUM;	// 퀀텀
	@JsonProperty("BTG")
	private BithumbTickerVO BTG;	// 비트코인 골드
	@JsonProperty("EOS")
	private BithumbTickerVO EOS;	// 이오스
	
	
	
	public BithumbTickerVO getBTC() {
		BTC.setCurrency_name("비트코인");
		return BTC;
	}
	public void setBTC(BithumbTickerVO bTC) {
		BTC = bTC;
	}
	public BithumbTickerVO getETH() {
		ETH.setCurrency_name("이더리움");
		return ETH;
	}
	public void setETH(BithumbTickerVO eTH) {
		ETH = eTH;
	}
	public BithumbTickerVO getDASH() {
		DASH.setCurrency_name("대시");
		return DASH;
	}
	public void setDASH(BithumbTickerVO dASH) {
		DASH = dASH;
	}
	public BithumbTickerVO getLTC() {
		LTC.setCurrency_name("라이트코인");
		return LTC;
	}
	public void setLTC(BithumbTickerVO lTC) {
		LTC = lTC;
	}
	public BithumbTickerVO getETC() {
		ETC.setCurrency_name("이더리움 클래식");
		return ETC;
	}
	public void setETC(BithumbTickerVO eTC) {
		ETC = eTC;
	}
	public BithumbTickerVO getXRP() {
		XRP.setCurrency_name("리플");
		return XRP;
	}
	public void setXRP(BithumbTickerVO xRP) {
		XRP = xRP;
	}
	public BithumbTickerVO getBCH() {
		BCH.setCurrency_name("비트코인 캐시");
		return BCH;
	}
	public void setBCH(BithumbTickerVO bCH) {
		BCH = bCH;
	}
	public BithumbTickerVO getXMR() {
		XMR.setCurrency_name("모네로");
		return XMR;
	}
	public void setXMR(BithumbTickerVO xMR) {
		XMR = xMR;
	}
	public BithumbTickerVO getZEC() {
		ZEC.setCurrency_name("제트캐시");
		return ZEC;
	}
	public void setZEC(BithumbTickerVO zEC) {
		ZEC = zEC;
	}
	public BithumbTickerVO getQTUM() {
		QTUM.setCurrency_name("퀀텀");
		return QTUM;
	}
	public void setQTUM(BithumbTickerVO qTUM) {
		QTUM = qTUM;
	}
	public BithumbTickerVO getBTG() {
		BTG.setCurrency_name("비트코인 골드");
		return BTG;
	}
	public void setBTG(BithumbTickerVO bTG) {
		BTG = bTG;
	}
	public BithumbTickerVO getEOS() {
		EOS.setCurrency_name("이오스");
		return EOS;
	}
	public void setEOS(BithumbTickerVO eOS) {
		EOS = eOS;
	}
	
}
