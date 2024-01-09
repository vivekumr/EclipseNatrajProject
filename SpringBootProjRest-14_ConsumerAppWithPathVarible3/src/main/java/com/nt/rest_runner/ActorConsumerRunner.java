package com.nt.rest_runner;

import java.util.Map;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ActorConsumerRunner implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		String baseUrl="http://localhost:2020/SpringBootProjRest-13_ProducerAppWithPathvarible2/actor/wish/{id}/{name}";
		
		//create RestTemplate
		
		RestTemplate template=new RestTemplate();
		//ResponseEntity<String> result= template.getForEntity(baseUrl,String.class,2,"Raja");//order is required
		ResponseEntity<String> result=template.getForEntity(baseUrl, String.class,Map.of("name","Raja","id",900));//order is not required
		System.out.println("Response Body (Output) "+result.getBody());
		System.out.println("Response Headers "+ result.getHeaders());
		System.out.println("Response status code "+ result.getStatusCode());
		System.out.println("Response code "+ result.getStatusCodeValue());
	}

}
