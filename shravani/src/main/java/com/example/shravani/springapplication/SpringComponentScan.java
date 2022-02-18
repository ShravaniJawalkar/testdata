package com.example.shravani.springapplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.example.shravani.SpringComponentScan.ComponentDao;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.shravani.SpringComponentScan")
public class SpringComponentScan {
	private static Logger logger=LoggerFactory.getLogger(SpringComponentScan.class);
public static void main(String args[]) {
	ApplicationContext ap=SpringApplication.run(SpringComponentScan.class, args);
	ComponentDao c1=ap.getBean(ComponentDao.class);
	ComponentDao c2=ap.getBean(ComponentDao.class);
	logger.info("{}"+c1);
	logger.info("{}"+c1.getSqlComponentConnection());
	logger.info("{}"+c2);
	logger.info("{}"+c2.getSqlComponentConnection());
	
}
}
