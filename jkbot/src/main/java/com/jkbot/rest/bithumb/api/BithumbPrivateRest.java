/*
 * Copyright yysvip.tistory.com.,LTD.
 * All rights reserved.
 * 
 * This software is the confidential and proprietary information
 * of yysvip.tistory.com.,LTD. ("Confidential Information").
 */
package com.jkbot.rest.bithumb.api; 

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.jkbot.common.util.http.Api_Client;
import com.jkbot.rest.bithumb.model.info.BithumbInfoAccount;
import com.jkbot.rest.bithumb.model.info.BithumbInfoBalance;

/**
 * <pre>
 * com.jkbot.bithumb.RestAPI 
 *    |_ BithumbRestAPI.java
 * 
 * </pre>
 * @date : 2018. 1. 20. 오후 8:54:04
 * @version : 
 * @author : jongkyu
 */
@ResponseBody
@RequestMapping("/bithumb/privateapi")
@Controller
public class BithumbPrivateRest {
	private static final Logger logger = LoggerFactory.getLogger(BithumbPrivateRest.class);
	 
	
	/**
	 * <pre>
	 * 1. 개요 : bithumb 거래소 회원 정보
	 * 2. 처리내용 : 
	 * </pre>
	 * @Method Name : getInfoAccount
	 * @date : 2018. 1. 21.
	 * @author : jongkyu
	 * @history : 
	 *	-----------------------------------------------------------------------
	 *	변경일				작성자						변경내용  
	 *	----------- ------------------- ---------------------------------------
	 *	2018. 1. 21.		jongkyu				최초 작성 
	 *	-----------------------------------------------------------------------
	 * @param currency :BTC, ETH, DASH, LTC, ETC, XRP, BCH, XMR, ZEC, QTUM, BTG, EOS (기본값: BTC), ALL(전체 )
	 * @return
	 */ 	
	@RequestMapping(value = "/info/account/{currency}", method = RequestMethod.GET)
	public BithumbInfoAccount getInfoAccount(@PathVariable String currency) {
		BithumbInfoAccount bithumbVO = null;
		
		String apiConnectKey = "601748af2ab68a0c155ef693d253a899";
    	String apiSecretKey = "d9f965e15b4f93ac5b1f547237847247";
		Api_Client api = new Api_Client(apiConnectKey, apiSecretKey);
		
		HashMap<String, String> rgParams = new HashMap<String, String>();
		rgParams.put("currency", currency);
		
		try {
		    String result = api.callApi("/info/account/", rgParams);
		    System.out.println(result);
		    
		    Gson gson = new Gson();
			bithumbVO = gson.fromJson(result, BithumbInfoAccount.class);
			
		} catch (Exception e) {
		    e.printStackTrace();
		}
		return bithumbVO;
	}

	/**
	 * <pre>
	 * 1. 개요 : bithumb 거래소 회원 지갑 정보
	 * 2. 처리내용 : 
	 * </pre>
	 * @Method Name : getInfoBalance
	 * @date : 2018. 1. 21.
	 * @author : jongkyu
	 * @history : 
	 *	-----------------------------------------------------------------------
	 *	변경일				작성자						변경내용  
	 *	----------- ------------------- ---------------------------------------
	 *	2018. 1. 21.		jongkyu				최초 작성 
	 *	-----------------------------------------------------------------------
	 * 
	 * @param currency :BTC, ETH, DASH, LTC, ETC, XRP, BCH, XMR, ZEC, QTUM, BTG, EOS (기본값: BTC), ALL(전체 )
	 * @return
	 */ 	
	@RequestMapping(value = "/info/balance/{currency}", method = RequestMethod.GET)
	public BithumbInfoBalance getInfoBalance(@PathVariable String currency) {
		BithumbInfoBalance bithumbVO = null;
		
		String apiConnectKey = "";
    	String apiSecretKey = "";
		Api_Client api = new Api_Client(apiConnectKey, apiSecretKey);
		
		HashMap<String, String> rgParams = new HashMap<String, String>();
		rgParams.put("currency", currency);
		
		try {
		    String result = api.callApi("/info/balance/", rgParams);
		    System.out.println(result);
		    
		    Gson gson = new Gson();
			bithumbVO = gson.fromJson(result, BithumbInfoBalance.class);
			
		} catch (Exception e) {
		    e.printStackTrace();
		}
		return bithumbVO;
	}
}
