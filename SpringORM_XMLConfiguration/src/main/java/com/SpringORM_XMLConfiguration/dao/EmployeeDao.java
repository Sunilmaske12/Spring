package com.SpringORM_XMLConfiguration.dao;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.SpringORM_XMLConfiguration.entity.Employee;

public class EmployeeDao {
	
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	@Transactional
	public int saveData(Employee emp) {
		int id = (int) this.hibernateTemplate.save(emp);
		return id;
	}
}
