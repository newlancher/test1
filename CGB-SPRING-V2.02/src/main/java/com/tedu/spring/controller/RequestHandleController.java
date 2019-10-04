package com.tedu.spring.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class RequestHandleController {
	@RequestMapping("doHandleRequest")
	@ResponseBody
	public Map<String, Object>doHandleRequest(Integer id,String msg){
		Map<String, Object> map=new HashMap<>();
		map.put("id",id);
		map.put("msg",msg);
		return map;
		
	}
}
