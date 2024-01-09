package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
