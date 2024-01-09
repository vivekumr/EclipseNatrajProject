package com.nit.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.model.DepartmentModel;
import com.nit.model.EmployeeModel;
import com.nit.repository.IDepartmentRepository;
import com.nit.repository.IEmployeeRepository;

@Service("empService")
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private IEmployeeRepository empRepo;
	
	private IDepartmentRepository depRepo;
	@Override
	public Iterable<EmployeeModel> getAllEmployee() {
		return empRepo.findAll();
	}
	
	@Override
	public String saveEmployee(EmployeeModel emp) {
		return "Employee saved with id :: "+empRepo.save(emp).getEmpno();
	}

	@Override
	public EmployeeModel getEmpbyEno(Integer eno) {
		EmployeeModel employee = empRepo.findById(eno).orElseThrow(() ->new IllegalArgumentException());
		return employee;
	}

	@Override
	public String deleteEmpByEno(Integer eno) {
		empRepo.deleteById(eno);
		return eno+" employee ID deleted";
	}

	@Override
	public List<Integer> getAllDeptNo() {
		// TODO Auto-generated method stub
		return (List<Integer>) depRepo.getAllDeptNo();
	}


}
