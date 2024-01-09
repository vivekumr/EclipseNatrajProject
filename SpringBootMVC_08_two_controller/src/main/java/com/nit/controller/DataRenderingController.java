package com.nit.controller;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.nit.service.IServiceFinderService;
//global path or global request path
//http://localhost:2525/SpringBootMVC_05_Data_Rendering_Options/test-operation/all
@RequestMapping("/test-operation")
@Controller
public class DataRenderingController {

	@Autowired
	IServiceFinderService seasonFinder;

	@GetMapping("/all")
	public String showHome() {
		return "welcome";
	}

	@GetMapping("/season")
	public String showSeason(Map<String, Object> map) { // use service
		String msg = seasonFinder.findSeasion();
		System.out.println(msg);
		map.put("result", msg);
		// return LVN
		return "desplay";
	}

}
