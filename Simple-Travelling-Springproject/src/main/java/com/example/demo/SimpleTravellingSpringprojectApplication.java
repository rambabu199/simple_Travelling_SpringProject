package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.controller.Travelling_controller;

@SpringBootApplication
public class SimpleTravellingSpringprojectApplication {

	public static void main(String[] args) {
		ApplicationContext applicationcontext= SpringApplication.run(SimpleTravellingSpringprojectApplication.class, args);
		Travelling_controller tc=applicationcontext.getBean(Travelling_controller.class);
		System.out.println(tc.travelby());
	}

}
