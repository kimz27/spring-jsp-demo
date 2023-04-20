package com.example.springjspdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication 
@ComponentScan("com.example.springjspdemo.controller," + "com.example.springjsdemo," + "com.example.springjspdemo.service," + "com.example.springjspdemo.dao")
public class SpringJspDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJspDemoApplication.class, args);
		
		
	}

}
