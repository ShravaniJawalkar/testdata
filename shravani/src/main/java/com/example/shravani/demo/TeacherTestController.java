package com.example.shravani.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("teacherApi")
public class TeacherTestController {
	@Autowired
	RestService service;

@GetMapping(value="saveTeacher/{id}")
public Student saveTeacher(@PathVariable("id") int id){
	return service.findById(id);
}	
}
