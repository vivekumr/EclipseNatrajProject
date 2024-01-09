package com.nit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nit.model.Employee;


@Repository("empDAO")
public class EmployeeDAOImpl implements IEmployeeDAO {
	
	@Autowired
	DataSource ds;
	
	private static final String GET_EMP_BY_DESG= "SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM ADI_RPTG.EMP WHERE JOB IN (?,?,?) ORDER BY JOB";
	
	
	@Override
	public List<Employee> getEmployeeListByDesg(String desg1, String desg2, String desg3) throws Exception {
		System.out.println("EmployeeDAOImpl.getEmployeeListByDesg() ::"+ds.getClass());
		
		
		List<Employee> list =null;
		//get pooled jdbc connection object
		try(Connection con =ds.getConnection();
				//create prepared statement obj
				PreparedStatement ps=con.prepareStatement(GET_EMP_BY_DESG)){
			//set values to the query param
			ps.setString(1, desg1);
			ps.setString(2, desg2);
			ps.setString(3, desg3);
			
			//execute the query
			try(ResultSet rs=ps.executeQuery()){
				//copy the records of resultSet obj to List<Employee> obj
				list=new ArrayList();
				
				while(rs.next()) {
					//copy the each records pf RS Employee obj
					Employee emp=new Employee();
					
					emp.setENo(rs.getInt(1));
					emp.setEName(rs.getString(2));
					emp.setDesg(rs.getString(3));
					emp.setSalary(rs.getDouble(4));
					emp.setDeptno(rs.getInt(5));
					list.add(emp);
				}//while
				
			}//try with resource
		}//try with resource
		
		
		return list;
	}//getEmployeeListByDesg method

}//class
