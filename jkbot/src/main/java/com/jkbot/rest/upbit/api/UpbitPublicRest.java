/*
 * Copyright yysvip.tistory.com.,LTD.
 * All rights reserved.
 * 
 * This software is the confidential and proprietary information
 * of yysvip.tistory.com.,LTD. ("Confidential Information").
 */
package com.jkbot.rest.upbit.api; 

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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
// /v1/crix/candles/minutes/1?code=CRIX.UPBIT.KRW-
@ResponseBody
@RequestMapping("/upbit/publicapi")
@Controller
public class UpbitPublicRest {
	private static final Logger logger = LoggerFactory.getLogger(UpbitPublicRest.class);
    
	@Value("${upbit.apiUrl}")
    private String apiUrl ;
    @Value("${upbit.apiConnectKey}")
    private String apiConnectKey ;
    @Value("${upbit.apiSecretKey}")
    private String apiSecretKey;
	 
	@RequestMapping(value = "/ticker/{currency}", method = RequestMethod.GET)
	public BithumbTickerResultVO getTicker(@PathVariable String currency) {
		BithumbTickerResultVO bithumbVO = null;
		Api_Client api = new Api_Client(apiUrl,apiConnectKey, apiSecretKey);
		
		try {
		    String result = api.callApi("/public/ticker/"+currency, null);
		    System.out.println(result);
		    
		    Gson gson = new Gson();
			bithumbVO = gson.fromJson(result, BithumbTickerResultVO.class);
			System.out.println(bithumbVO.getData().getBTC().getClosing_price());
			
		} catch (Exception e) {
		    e.printStackTrace();
		}
		return bithumbVO;
	}
	
}
