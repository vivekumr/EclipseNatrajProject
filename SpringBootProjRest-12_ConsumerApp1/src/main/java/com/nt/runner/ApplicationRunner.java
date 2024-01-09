package com.nt.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ApplicationRunner implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		//create RestTemplate
		RestTemplate template=new RestTemplate();
		//prepare base url
		//String baseUrl="http://localhost:9090/producer/wish/me";
		String baseUrl="http://localhost:2020/SpringBootProjRest-11_ProducerApp1/wish/me";
		//invoke the service/operation of provider app
		ResponseEntity<String> response=template.getForEntity(baseUrl,String.class);
		System.out.println("Result Body :: "+response.getBody());
		System.out.println("Result Status :: "+response.getStatusCode());
		System.out.println(response.getStatusCodeValue());
		
		System.out.println("==================================");
		
		String result=template.getForObject(baseUrl,String.class);
		System.out.println("result is :: "+result);
	}

}
