package com.nt.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//@Controller+@ResponseBody
@RequestMapping("/customer")//for Golbal path(Optional)
public class TestController {

	@GetMapping("/report")
	public ResponseEntity<String> showCustomerController(){
		return new ResponseEntity<String>("From GET-Controller",HttpStatus.OK);
	}
	
	@PostMapping("/register")
	public ResponseEntity<String> registerController(){
		return new ResponseEntity<String>("From POST-Controller",HttpStatus.OK);
	}
	
	@PutMapping("/modify")
	public ResponseEntity<String> modifyController(){
		return new ResponseEntity<String>("From MODITY-Controller",HttpStatus.OK);
	}
	@PatchMapping("/patch")
	public ResponseEntity<String> patchController(){
		return new ResponseEntity<String>("From PATCH-Controller",HttpStatus.OK);
	}
	@DeleteMapping("/delete")
	public ResponseEntity<String> deleteMaping(){
		return new ResponseEntity<String>("From DELETE-Controller",HttpStatus.OK);
	}
}
