package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//程序的主入口
@SpringBootApplication
public class HelloSpringBootApplication {

	public static void main(String[] args) {
		//SpringApplication
		SpringApplication.run(HelloSpringBootApplication.class, args);
	}

}
