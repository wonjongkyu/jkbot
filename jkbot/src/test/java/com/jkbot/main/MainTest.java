package com.jkbot.main;
import java.util.HashMap;

import com.google.gson.Gson;
import com.jkbot.common.util.http.Api_Client;
import com.jkbot.rest.bithumb.model.ticker.BithumbTickerListVO;
import com.jkbot.rest.bithumb.model.ticker.BithumbTickerResultVO;

public class MainTest {
    public static void main(String args[]) {
    	String apiConnectKey = "353493cb9695210c2bb81c5018b61fb2";
    	String apiSecretKey = "e25f62ca71754c6e2e083b4345a0df23";
		Api_Client api = new Api_Client(apiConnectKey, apiSecretKey);
	
		HashMap<String, String> rgParams = new HashMap<String, String>();
		rgParams.put("order_currency", "BTC");
		rgParams.put("payment_currency", "KRW");
	
		
		// 큐텀 시세 가져오기 https://api.bithumb.com/public/ticker/QTU
		try {
		    /*String result = api.callApi("/info/balance", rgParams);
		    System.out.println(result);*/
		    String result2 = api.callApi("/public/ticker/ALL", null);
		    System.out.println(result2);
		    
		    Gson gson = new Gson();
			BithumbTickerResultVO bithumbVO = gson.fromJson(result2, BithumbTickerResultVO.class);
			BithumbTickerListVO test =  bithumbVO.getData();
			System.out.println(test.getBCH().getBuy_price() );
 
			 
		} catch (Exception e) {
		    e.printStackTrace();
		}
		
    }
}

