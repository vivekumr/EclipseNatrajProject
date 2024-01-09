package com.nit.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="DEPT")
@Data
public class DepartmentModel {
	@Id
	private Integer deptno;
	private String dname;
	private String loc;
}
