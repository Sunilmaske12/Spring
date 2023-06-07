package com.springJDBC.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springJDBC.entity.Student;

public class RowMapperImpl implements RowMapper<Student> {

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student student=new Student();
		student.setName(rs.getString(1));
		student.setVillage(rs.getString(2));
		student.setAge(rs.getInt(3));
		return student;
	}

}
