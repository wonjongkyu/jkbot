package com.jkbot.main;
import java.util.HashMap;

import com.jkbot.common.util.http.Api_Client;

public class MainTest {
    public static void main(String args[]) {
    	String apiConnectKey = "";
    	String apiSecretKey = "";
		Api_Client api = new Api_Client(apiConnectKey, apiSecretKey);
	
		HashMap<String, String> rgParams = new HashMap<String, String>();
		rgParams.put("order_currency", "BTC");
		rgParams.put("payment_currency", "KRW");
	
		
		// 큐텀 시세 가져오기 https://api.bithumb.com/public/ticker/QTU
		try {
		    /*String result = api.callApi("/info/balance", rgParams);
		    System.out.println(result);*/
		    String result2 = api.callApi("/public/ticker/qtum", null);
		    System.out.println(result2);
		} catch (Exception e) {
		    e.printStackTrace();
		}
		
    }
}

