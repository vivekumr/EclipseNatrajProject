package com.nt.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.model.School;
import com.nt.model.StudentModel;

@Controller
@RequestMapping("/student")//Global pat(optional)
public class StudentController {
	
	@PostMapping("/registerSchool")
	public ResponseEntity<String> registerSchool(@RequestBody School sch){
		HttpStatus status=HttpStatus.OK;
		return new ResponseEntity<String>(sch.toString(),status); 
	}
	@PostMapping("/registerStudent")
	public ResponseEntity<String> registerStudentß(@RequestBody StudentModel std){
		HttpStatus status=HttpStatus.OK;
		return new ResponseEntity<String>(std.toString(),status); 
	}
}
