package com.nit.company;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Setter;

@ConfigurationProperties(prefix ="org.nit" )
@Component("comp")
//@ToString
@Data
@Setter
@PropertySource("App.properties")
public class Company {
	private String name;
	private  String addrs;
	private  Long pincode;
	@Value("${nit.phone}")
	private Long phoneNumber;
	@Value("${nit.size}")
	private Integer size;//getting override by application.properties value
	
}
