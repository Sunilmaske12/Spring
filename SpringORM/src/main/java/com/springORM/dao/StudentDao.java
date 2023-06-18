package com.springORM.dao;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.springORM.entity.Student;

public class StudentDao {
	
	private HibernateTemplate hibernateTemplate;
	
	
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}



	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}



	@Transactional
	public int insertData(Student student) {
		int result =(Integer) this.hibernateTemplate.save(student);
		return result;
	}

}
