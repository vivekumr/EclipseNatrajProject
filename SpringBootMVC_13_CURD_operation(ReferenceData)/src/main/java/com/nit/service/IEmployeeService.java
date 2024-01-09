package com.nit.service;

import java.util.List;

import com.nit.model.DepartmentModel;
import com.nit.model.EmployeeModel;

public interface IEmployeeService {
	public Iterable<EmployeeModel> getAllEmployee();
	public String saveEmployee(EmployeeModel emp);
	public EmployeeModel getEmpbyEno(Integer eno);
	public String deleteEmpByEno(Integer eno);
	public List<Integer> getAllDeptNo();
}
