package com.nt.controller;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.School;
import com.nt.model.StudentModel;

@RestController
@RequestMapping("/student")//global path (optional)
public class StudentController {
	/*
	 ResponseEntity<> is a generic class with a type parameter, you can specify what type of object to be serialized into the response body.

	 @ResponseBody is an annotation, indicates that the return value of a method will be serialized into the body of the HTTP response.
	 */
	@GetMapping("/showSchool")
	public ResponseEntity<School> showSchool(){
		School std=new School("RTC","Ranchi","JAC",900);
		HttpStatus status=HttpStatus.OK;
		return new ResponseEntity<School>(std,status);
	}
	
	@GetMapping("/showStudent")
	public ResponseEntity<StudentModel> showStudent(){
		StudentModel std=new StudentModel(101,"vivek","DAV",
				new String[] {"reading","cooking"},
				9,
				List.of("Eng","Hin","Sci"),
				Set.of(9897897L,898678988L),
				Map.of("aadhar",897898788),
				new School("RTC","Ranchi","JAC",900));
		HttpStatus status=HttpStatus.OK;
		return new ResponseEntity<StudentModel>(std,status);
	}

}
