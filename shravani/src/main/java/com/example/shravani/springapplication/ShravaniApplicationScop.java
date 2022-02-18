package com.example.shravani.springapplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import com.example.shravani.springtutorial.ManDao;



@SpringBootApplication
@ComponentScan(basePackages = "com.example.shravani.springtutorial")
public class ShravaniApplicationScop {
private static Logger logger=LoggerFactory.getLogger(ShravaniApplicationScop.class);


	public static void main(String[] args) {
		ApplicationContext ap=	SpringApplication.run(ShravaniApplicationScop.class, args);
		ManDao m1=ap.getBean(ManDao.class);
		ManDao m2=ap.getBean(ManDao.class);
logger.info(""+m1);
logger.info(""+m1.getSqlConnection());
logger.info(""+m2);
logger.info(""+m2.getSqlConnection());
	}

}
