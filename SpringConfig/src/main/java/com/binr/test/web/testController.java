package com.binr.test;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class testController {
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping("/test.do")
	public void hello(@RequestParam Map<String, Object> paramMap, ModelMap model) throws Throwable{
		System.out.println("log test");
		logger.debug("aa");
		model.put("title", "test");
	}
}
