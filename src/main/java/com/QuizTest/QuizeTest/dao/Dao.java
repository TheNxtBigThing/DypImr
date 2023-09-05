package com.QuizTest.QuizeTest.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.QuizTest.QuizeTest.entity.Dpu;

@Repository
public class Dao {

	@Autowired
	SessionFactory sf;
	public List<Dpu> getalldata() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Dpu.class);
		List<Dpu> list = criteria.list();
		session.close();
		return list;

	}
	public List<Dpu> insertdata() {
 Session session=sf.openSession();
 Transaction transact=session.beginTransaction();
 Dpu dp=new Dpu();
 dp.setId(5);
 dp.setName("Vishal");
 dp.setCourse("Mca");
 session.save(dp);
transact.commit();
session.close();
		return null;
	}

}
