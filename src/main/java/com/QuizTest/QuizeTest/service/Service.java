package com.QuizTest.QuizeTest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.QuizTest.QuizeTest.dao.Dao;
import com.QuizTest.QuizeTest.entity.Dpu;

@org.springframework.stereotype.Service

public class Service {
	
	@Autowired
	Dao dao;

	public List<Dpu> getalldata() {
List<Dpu>list=dao.getalldata();
		return list;
	}

	public List<Dpu> insertdata() {
		List<Dpu>list=dao.insertdata();
		return list;
	}

}
