package com.tmo.pt.controller;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArithmeticOperationController {
	
	@GetMapping("/square/{param}")
	@ResponseBody
    public Object getSquareOfNumber(@PathVariable("param") String param) 
    {
		long number = Integer.parseInt(param);
		long result = number * number;
		
		HashMap<String, Long> map = new HashMap<String, Long>();
		map.put("result", result);
		
		return map;
    }

}
