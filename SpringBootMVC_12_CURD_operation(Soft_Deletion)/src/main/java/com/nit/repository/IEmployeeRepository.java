package com.nit.repository;

import org.springframework.data.repository.CrudRepository;

import com.nit.model.EmployeeModel;

public interface IEmployeeRepository extends CrudRepository<EmployeeModel, Integer> {

}
