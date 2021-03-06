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
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.google.gson.Gson;
import com.jkbot.common.util.http.Api_Client;
import com.jkbot.rest.bithumb.model.ticker.BithumbTickerResultVO;

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
@RequestMapping("/bithumb/privateapi")
@Controller
public class BithumbPrivateRestTest {
	private static final Logger logger = LoggerFactory.getLogger(BithumbPrivateRest.class);
	
	 @Value("${bithumb.apiUrl}")
	 static private String apiUrl ;
	 @Value("${bithumb.apiConnectKey}")
	 static  private String apiConnectKey ;
	 @Value("${bithumb.apiSecretKey}")
	 static private String apiSecretKey;
    
	
	public static void main(String[] args) {
		BithumbTickerResultVO bithumbVO = null;

		Api_Client api = new Api_Client(apiUrl, apiConnectKey, apiSecretKey);
		
		HashMap<String, String> rgParams = new HashMap<String, String>();
		rgParams.put("currency", "QTUM");
		
		try {
		    String result = api.callApi("/info/account", rgParams);
		    System.out.println(result);
		    
		    Gson gson = new Gson();
			bithumbVO = gson.fromJson(result, BithumbTickerResultVO.class);
			
			
		} catch (Exception e) {
		    e.printStackTrace();
		}
	}
}
