package com.nt.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/actor")
public class ActorRestController {
	//http://localhost:2020/SpringBootProjRest-13_ProducerAppWithPathvarible2/actor/wish/2/raja
	@GetMapping("/wish/{id}/{name}")
	ResponseEntity<String> displayWishMessage(@PathVariable Integer id,@PathVariable String name){
		return new ResponseEntity<String>("Hi "+name+", Good Morning :: "+id,HttpStatus.OK);
	}

}
