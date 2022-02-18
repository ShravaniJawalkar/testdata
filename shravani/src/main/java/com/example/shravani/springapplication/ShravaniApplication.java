package com.example.shravani.springapplication;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.example.shravani.demo.RestInterface;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.shravani.demo")
public class ShravaniApplication {
public static Logger logger=LoggerFactory.getLogger(ShravaniApplication.class);
	public static void main(String[] args) {
	SpringApplication.run(ShravaniApplication.class, args);
	ApplicationContext app= new AnnotationConfigApplicationContext();
	RestInterface r=app.getBean(RestInterface.class);
	logger.info(""+r);
		}

}
