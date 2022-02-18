package com.example.shravani.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class ValidationUserData {
	@Autowired
	RestService restService;
	public void validateId(int id)throws UserException {
		List<Integer> userId=restService.findByUniqueId(id);
		for(int eachId:userId){
			if(eachId == id)
				 throw new UserException("duplicate data entry");
		else
			System.out.println("smooth flow");	
		}
			
			
	}

}
