package com.dsobolev.servletdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class ServletsDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServletsDemoApplication.class, args);
	}

}
