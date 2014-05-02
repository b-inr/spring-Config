package com.binr.test.web;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.binr.common.util.Constant;
import com.binr.test.service.testService;

@Controller
public class testController {
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	testService testService;
	
	@RequestMapping("/test.do")
	public void hello(@RequestParam Map<String, Object> paramMap, ModelMap model) throws Throwable{
		logger.debug("testPath =="+Constant.testPath);
		model.put("title", testService.selectUserInfo());
	}
}
