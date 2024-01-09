package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nit.sbeans.Hotel;

import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BootProject04ValueAnnotationsSpelFiledLevelApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootProject04ValueAnnotationsSpelFiledLevelApplication.class, args);
		
		Hotel hotel=ctx.getBean("hotel",Hotel.class);
		
		System.out.println("Result :: "+hotel);
		
		//close the IOC container
		((ConfigurableApplicationContext) ctx).close();
		
	}

}
