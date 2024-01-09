package com.nit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nit.model.Employee;
import com.nit.service.IEmployeeService;

@Controller("payroll")
public class PayrollOperationController {

	@Autowired
	private IEmployeeService empService;
	
	public List<Employee> showEmployeeByDesg(String degs1,String desg2,String desg3) throws Exception{
		//use Service
		List<Employee> list =empService.fetchEmployeeByDesg(degs1, desg2, desg3);
		
		return list;
		
	}
	
}
