package com.Mtech.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Epsm {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Rno;
	private String teacher;
	private String subject;
	public int getRno() {
		return Rno;
	}
	public void setRno(int rno) {
		Rno = rno;
	}
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	

}
