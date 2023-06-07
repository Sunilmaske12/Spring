package com.springJDBC.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.springJDBC.dao.StudentDaoImpl;

@Configuration
public class ConfigurationData {
	
	@Bean("dataSource")
	public DriverManagerDataSource getDataSource() {
		DriverManagerDataSource dmds=new DriverManagerDataSource();
		dmds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dmds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		dmds.setUsername("root");
		return dmds;
	}
	
	@Bean("jdbcTemplate")
	public JdbcTemplate getjdbcTemplate() {
		JdbcTemplate jt=new JdbcTemplate();
		jt.setDataSource(getDataSource());
		return jt;
	}
	
	@Bean("StudentDao")
	public StudentDaoImpl getStudentDaoImpl() {
		StudentDaoImpl sd=new StudentDaoImpl();
		sd.setJdbcTemplate(getjdbcTemplate());
		return sd;
	}

}
