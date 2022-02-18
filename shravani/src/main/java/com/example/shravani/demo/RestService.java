package com.example.shravani.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RestService {
	
@Autowired
private RestInterface restInterface;

public Student save(Student restEntity) {
	return restInterface.save(restEntity);
	
}
public Student findById(int id) {
	return restInterface.findById(id);
}
public List<Integer> findByUniqueId(int id){
	return restInterface.findByUniqueId(id);
}
}
