package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.model.Student;
import com.nt.repository.StudentRepository;


@Service("studentserv")
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepo;
	
	@Override
	public List<Student> fethAllStudents() {
	List<Student>studentList=studentRepo.findAll();	
		return studentList;
	}

}
