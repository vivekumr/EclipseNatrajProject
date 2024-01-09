package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nit.sbeans.Company;
import com.nit.sbeans.Employee;

@SpringBootApplication
public class BootProject06ConfigurationPropertiesOnArrayListSetHasApropertiesApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(BootProject06ConfigurationPropertiesOnArrayListSetHasApropertiesApplication.class, args);
		Employee emp=ctx.getBean("emp",Employee.class);
		System.out.println(emp);
		//close container
		((ConfigurableApplicationContext) ctx).close();
		
	}

}
