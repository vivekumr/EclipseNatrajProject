package com.nt.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.Student;
import com.nt.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentRestController {
	
	@Autowired
	StudentService service;
	
	@GetMapping("/getStudent")
	public ResponseEntity<?> fetchAllStudents(){
		List<Student> student=service.fethAllStudents();
		System.out.println(student);
		return new ResponseEntity<List<Student>>(student,HttpStatus.OK);
	}

}
