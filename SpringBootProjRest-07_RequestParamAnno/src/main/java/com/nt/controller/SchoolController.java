package com.nt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SchoolController {

	@GetMapping("/showSchool")
	public String schoolDetails(@RequestParam(required = false) String name,@RequestParam("id") Integer id) {
		
		return name+"   "+id;
	}
}
