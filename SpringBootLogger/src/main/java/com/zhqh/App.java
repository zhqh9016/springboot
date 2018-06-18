package com.zhqh;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class App {
	
	Logger LOG = LoggerFactory.getLogger(App.class);
	
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	@RequestMapping("/greeting")
	public String greeting(){
		LOG.warn("hello logger converter");
		return "hello logger converter";
	}
	
}
