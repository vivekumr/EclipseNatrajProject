package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component("hotel")
public class Hotel {
	@Value("12345")   //Direct value injection
	private  Integer  hotelId;
	@Value("${hotel.name}")
	private  String  hotelName;
	@Value("${hotel.addrs}")
	private String  hotelAddrs;
	@Value("${hotel.contactno}")
	private  String  mobileNo;
}
