package com.nit.controller;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nit.service.IServiceFinderService;

@Controller
public class DataRenderingController {

	@Autowired
	IServiceFinderService seasonFinder;

	@RequestMapping("/")
	public String showHome() {
		return "welcome";
	}

	@RequestMapping("/season")
	public String showSeason(Map<String, Object> map) { // use service
		String msg = seasonFinder.findSeasion();
		System.out.println(msg);
		map.put("result", msg);
		// return LVN
		return "desplay";
	}

}
