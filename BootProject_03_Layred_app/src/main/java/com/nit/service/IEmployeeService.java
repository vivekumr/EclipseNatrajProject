package com.nit.service;

import java.util.List;

import com.nit.model.Employee;

public interface IEmployeeService {

	public List<Employee> fetchEmployeeByDesg(String desg1, String desg2, String desg3) throws Exception;
	
}
