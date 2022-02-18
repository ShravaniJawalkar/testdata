package com.example.shravani.appprop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource("classpath:application1.properties")
public class SprinAppPropApplication {
	private static Logger logger=LoggerFactory.getLogger(SprinAppPropApplication.class);
	public static void main(String args[]) {
AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(SprinAppPropApplication.class);
PersonUrl personUrl=applicationContext.getBean(PersonUrl.class);
logger.info("{}"+personUrl);
logger.info("{}"+personUrl.getUrl());
applicationContext.close();
	}
}
