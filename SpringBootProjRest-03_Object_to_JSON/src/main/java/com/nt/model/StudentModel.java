package com.nt.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentModel {

	
	
	private int rollNo;
	private String name;
	private String school;
	private String[] hobbies;
	private int section;
	private List<String> subject;
	private Set<Long> phoneNumbers;
	private Map<String,Object> idDetails;
	//HAS-A property
	private School schools;
	
	
}
