package com.example.shravani.basicspring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BasicImplemantation {
	private static Logger logger=LoggerFactory.getLogger(BasicImplemantation.class);
	
@Autowired
@Qualifier("QuickSort")
SortAlgorithm sortAlgorithm;

public String getSort() {
	return sortAlgorithm.getSortAlgorith();
}
@PostConstruct
public void getPostCreate() {
//	System.out.println("this is post construct");
	logger.info("this is postConstruct");
}
@PreDestroy
public void getPreDestroy() {
logger.info("this is preDestroy");	
}
}
