package com.nit.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.nit.model.DepartmentModel;


public interface IDepartmentRepository extends CrudRepository<DepartmentModel, Integer> {
	@Query("select deptno from Department")
	public Object getAllDeptNo();
}
