package com.nt.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class School {

	private String schoolName;
	private String addrs;
	private String board;
	private Integer studentStrength;
	
}
