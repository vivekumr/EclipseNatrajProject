package com.nit.sbeans;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component("company")
public class Company {
	private  Integer id;
	private  String  name;
	private  String addrs;
	private  String  size;
}
