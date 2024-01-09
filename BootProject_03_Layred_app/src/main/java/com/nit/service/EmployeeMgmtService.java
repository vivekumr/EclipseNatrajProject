package com.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.dao.IEmployeeDAO;
import com.nit.model.Employee;

@Service("empService")
public class EmployeeMgmtService implements IEmployeeService{

	@Autowired
	private IEmployeeDAO empDAO;
	
	@Override
	public List<Employee> fetchEmployeeByDesg(String desg1, String desg2, String desg3) throws Exception {
		// use DAO
		
		List<Employee> list=empDAO.getEmployeeListByDesg(desg1, desg2, desg3);
		
		return list;
	}//method

	
}//class
