package com.nit;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;

import com.nit.controller.PayrollOperationController;
import com.nit.model.Employee;

@SpringBootApplication
public class BootProject_03_Layred_app {
	
	
	public static void main(String[] args) {
		//get IOC container
		ApplicationContext ctx=SpringApplication.run(BootProject_03_Layred_app.class, args);
		//get Controller class object
		PayrollOperationController controller=ctx.getBean("payroll",PayrollOperationController.class);
		//invoke the b.method
		try {
			List<Employee> list =controller.showEmployeeByDesg("CLERK", "MANAGER", "SALESMAN");
			list.forEach(emp->{
				System.out.println(emp);
			});
			
		}catch(Exception e) {
			e.printStackTrace();
			System.err.println("Internal Problem -- try again ::"+e.getMessage());
			
		}
		
		
		
		
		
	}

}
