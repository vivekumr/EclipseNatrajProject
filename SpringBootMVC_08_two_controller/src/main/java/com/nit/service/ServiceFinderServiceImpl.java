package com.nit.service;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

@Service("seasonService")
public class ServiceFinderServiceImpl implements IServiceFinderService{

	@Override
	public String findSeasion() {
		//get System date
		LocalDate Id=LocalDate.now();
		//get current month
		int month=Id.getMonthValue();
		//find season
		if(month>=7 && month<=9) {
			return "Rainy Season";
		}
		else if(month>=3 && month<=6) {
			return "Summer Season";
		}
		else
			return "Winter Season";
		
	}

}
