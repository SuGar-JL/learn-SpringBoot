package com.example.sugar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Demo01Application {

	@RequestMapping("/")
	public String index(){
		return "Hello Spring boot!";
	}

	public static void main(String[] args) {
		SpringApplication.run(Demo01Application.class, args);
	}

}
