package com.nt.controller;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
//http://localhost:2020/SpringBootProjRest-01_First_project/customer/report
@RestController//@Controller+@ResponseBody for All handler methods
@RequestMapping("/customer")//Global path (Optional)
public class WelcomeController {
	
	@GetMapping("/report")
	public ResponseEntity<String> show_controller() {
		//get Sys date and time
		LocalDateTime ldt =LocalDateTime.now();
		//get current hour of the day
		int hour=ldt.getHour();
		String body=null;
		if(hour < 12) {
			body="Good Morning";
		}
		else if(hour < 16) {
			body="Good Afternoon";
		}
		else if(hour < 20) {
			body="Good Evening";
		}
		else {
			body="Good Night";
		}
		//response entity
		HttpStatus status=HttpStatus.OK;
		ResponseEntity<String> response= new ResponseEntity<String>(body,status);
		return response;
	}
	
}
