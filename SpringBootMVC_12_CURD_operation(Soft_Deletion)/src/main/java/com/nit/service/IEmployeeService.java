package com.nit.service;

import com.nit.model.EmployeeModel;

public interface IEmployeeService {
	public Iterable<EmployeeModel> getAllEmployee();
	public String saveEmployee(EmployeeModel emp);
	public EmployeeModel getEmpbyEno(Integer eno);
	public String deleteEmpByEno(Integer eno);
}
