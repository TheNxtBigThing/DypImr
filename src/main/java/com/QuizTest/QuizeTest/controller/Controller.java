package com.QuizTest.QuizeTest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.QuizTest.QuizeTest.entity.Dpu;
import com.QuizTest.QuizeTest.service.Service;

@RestController
public class Controller {
	
	@Autowired
	Service service;
	
	@GetMapping("/get")
	public void getalldata() {
		List<Dpu>list=service.getalldata();
	System.out.println(list);
	}

@PostMapping("/insert")
public void insertdata() {
	List<Dpu>list=service.insertdata();
System.out.println(list);
}
}
