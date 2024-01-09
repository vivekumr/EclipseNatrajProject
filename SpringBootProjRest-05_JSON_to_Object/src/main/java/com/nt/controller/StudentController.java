package com.nt.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.School;
import com.nt.model.StudentModel;

@RestController
@RequestMapping("/student")//global path (optional)
public class StudentController {
	
	@PostMapping("/registerSchool")
	public ResponseEntity<String> showSchool(@RequestBody School sch){
		HttpStatus status=HttpStatus.OK;
		return new ResponseEntity<String>(sch.toString(),status);
	}
	
	@PostMapping("/registerStudent")
	public ResponseEntity<String> showStudent(@RequestBody StudentModel stdM){
		HttpStatus status=HttpStatus.OK;
		return new ResponseEntity<String>(stdM.toString(),status);
	}

}
