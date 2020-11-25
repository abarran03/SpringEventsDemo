package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;

@Configuration
@EnableAsync
@SpringBootApplication
@ComponentScan(basePackages = "com.example.demo")

public class DemoApplication {

	public static void main(String[] args) throws InterruptedException {

		SpringApplication.run(DemoApplication.class, args);


	}

}
