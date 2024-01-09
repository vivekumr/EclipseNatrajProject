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
//http://localhost:2525/SpringBootMVC_05_Data_Rendering_Options/wish-maping/
@RequestMapping("/wish-maping")
@Controller
public class DataRenderingController2 {

	@Autowired
	IServiceFinderService seasonFinder;

	//@RequestMapping(value="/",method=RequestMethod.GET)
	@GetMapping("/")
	public String showHome() {
		return "show_data";
	}

	//@RequestMapping(value="/season",method=RequestMethod.GET)
	@GetMapping("/season")
	public String showSeason(Map<String, Object> map) { // use service
		String msg = seasonFinder.findSeasion();
		System.out.println(msg);
		map.put("result", msg);
		// return LVN
		return "desplay";
	}
	//@RequestMapping(value="/report",method=RequestMethod.POST)
	@PostMapping("/report")
	public String showHome1() throws Exception {
		System.out.println("DataRenderingController.showHome1() POST maping");
		return "welcome";
	}

}
