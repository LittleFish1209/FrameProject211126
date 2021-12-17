package com.example.demo;

import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ShutdowndemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(ShutdowndemoApplication.class, args);

		System.out.println("Shutdown Demo Application started");
	}

	public static void exitApplication(ConfigurableApplicationContext context) {
		int exitCode = SpringApplication.exit(context, (ExitCodeGenerator) () -> 0);
		System.exit(exitCode);
	}
}
