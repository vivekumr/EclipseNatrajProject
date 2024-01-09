package com.nit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="Employee")
@Data
public class EmployeeModel {

	@Id
	@SequenceGenerator(name="gen1",sequenceName="emp_id_seq",initialValue=1,allocationSize = 1)
	@GeneratedValue(generator="gen1",strategy = GenerationType.SEQUENCE)
	private Integer empno;
	@Column(length=20)
	private String ename;
	@Column(length = 20)
	private String job;
	private Float sal;
	private Integer deptno;
}
