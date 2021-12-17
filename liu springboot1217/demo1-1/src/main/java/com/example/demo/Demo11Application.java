package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;


@SpringBootApplication
public class Demo11Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo11Application.class, args);
//		SpringApplication application = new SpringApplication(ShutdowndemoApplication.class);
//      application.addListeners(new ApplicationPidFileWriter("/Users/Aexs/app.pid"));
//      application.run();
	}

}
