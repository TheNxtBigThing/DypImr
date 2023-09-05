package com.QuizTest.QuizeTest.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Dpu {
	int id;
	String name;
	String course;
	String club;
	
	
	@Id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public String getClub() {
		return club;
	}
	public void setClub(String club) {
		this.club = club;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Question [id=" + id + ", name=" + name + ", course=" + course + ",club"+club+"]";
	}
	
	

}
