package com.nt.controller;

import java.time.LocalDateTime;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DataRendringOptions {

	/*@RequestMapping("/process")
	public String Process(Map<String,Object> map) {
		System.out.println("DataRendringOptions.Process()");
		//add model attribute to shared memory
		map.put("attr1","val1");
		map.put("sysDt",LocalDateTime.now());
		return "show_data";
	}*/
	@GetMapping("/")
	public String Process(Map<String,Object> map) {
		System.out.println("DataRendringOptions.Process()");
		//add model attribute to shared memory
		map.put("attr1","val1");
		map.put("sysDt",LocalDateTime.now());
		return "show_data";
	}
	
	
}
