package com.binr.test;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class testController {
	
	@RequestMapping(value="/test1.do")
	public String test(){
		return "jsp/test";
	}
	
	@RequestMapping("/test.do")
	public void hello(@RequestParam Map<String, Object> paramMap, ModelMap model) throws Throwable{
		model.put("title", "test");
	}
}
