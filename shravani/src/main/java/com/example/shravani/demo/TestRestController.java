package com.example.shravani.demo;



import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("test")
public class TestRestController {
@Autowired
RestService restService;
@Autowired
ValidationUserData validationUserData;

@PostMapping("getSaveData")
public Student getSaveData(@Valid @RequestBody Student restEntity) {
	Student stud=null;
	try {
	validationUserData.validateId(restEntity.getId());
	stud= restService.save(restEntity);
	}catch(Exception e){
		System.out.print(e);}
	return stud;
	
}
@GetMapping("getStudentData/{id}")
public Student getStudentData(@Valid @PathVariable("id") int id)
{
return restService.findById(id);	
}
}
