package com.nit.sbeans;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Setter;

@Data
@ConfigurationProperties("org.nit")
@PropertySource("company.properties")
@Setter
@Component("emp")
public class Employee {
	// simple properties
	private Integer eno;
	private String ename;
	// array type
	private String[] favColors;
	// Collection type
	private List<String> nickNames;
	private Set<Long> phoneNumbers;
	private Map<String, Object> idDetails;
	// HAS- A property
	private Company company;

}
