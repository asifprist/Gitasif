package com.spring.orm.dao;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.entities.Student;

public class StudentDao {
	
	
	private HibernateTemplate hibernateTemplete;
	
	//save student
	@Transactional
	public int insert(Student student) {
		
		Integer i = (Integer)this.hibernateTemplete.save(student);
		
		return 1;
		
	}

	public HibernateTemplate getHibernateTemplete() {
		return hibernateTemplete;
	}

	public void setHibernateTemplete(HibernateTemplate hibernateTemplete) {
		this.hibernateTemplete = hibernateTemplete;
	}

}