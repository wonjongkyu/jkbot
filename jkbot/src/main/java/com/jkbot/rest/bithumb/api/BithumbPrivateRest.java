/*
 * Copyright yysvip.tistory.com.,LTD.
 * All rights reserved.
 * 
 * This software is the confidential and proprietary information
 * of yysvip.tistory.com.,LTD. ("Confidential Information").
 */
package com.jkbot.rest.bithumb.api; 

import java.io.File;
import java.io.IOException;
import java.util.Locale;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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
@RequestMapping("/main2")
@Controller
public class BithumbPrivateRest {
	private static final Logger logger = LoggerFactory.getLogger(BithumbPrivateRest.class);
	 
	@RequestMapping(value = "", method = RequestMethod.GET)
	public ModelAndView getTicker(Locale locale, Model model) {
		ModelAndView mav = new ModelAndView();

		try {
			ObjectMapper mapper = new ObjectMapper(); // can reuse, share globally 
			BithumbTickerResultVO bithumbVO = mapper.readValue(new File("user.json"), BithumbTickerResultVO.class);
			
			
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		mav.setViewName("/main/main");
		return mav;
	}

}
