package com.nt.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//http://localhost:2020/SpringBootProjRest-11_ProducerApp1/wish/me
@RestController
@RequestMapping("/wish")
public class OperationController {

	@GetMapping("/me")
	public ResponseEntity<String> getWish(){
		return new ResponseEntity<String>("Good Morning",HttpStatus.OK);
	}
}
