package com.nt.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

	@GetMapping("/report/{no}/{cname}")
	public String fetchData(@PathVariable("cname") String name,@PathVariable Integer no) {
		return name+"<------>"+no;
	}
	@GetMapping("/reports/{no}/{cname}")
	public ResponseEntity<String> getData(@PathVariable("cname") String name,@PathVariable Integer no) {
		return new ResponseEntity<String>(name+"<------>"+no,HttpStatus.OK);
	}
}
