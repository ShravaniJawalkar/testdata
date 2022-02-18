package com.example.shravani.springapplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.example.shravani.basicspring.BasicImplemantation;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.shravani.basicspring")
public class SpringApplicationBasic {
private static Logger logger=LoggerFactory.getLogger(SpringApplicationBasic.class);
public static void main(String args[]) {
	ApplicationContext ap=SpringApplication.run(SpringApplicationBasic.class, args);
	BasicImplemantation base=ap.getBean(BasicImplemantation.class);
	logger.info("{}"+base);
	logger.info("{ }"+ base.getSort());
}
}
