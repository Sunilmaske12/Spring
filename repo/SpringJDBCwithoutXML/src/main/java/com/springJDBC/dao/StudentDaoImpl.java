package com.springJDBC.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.springJDBC.entity.Student;

public class StudentDaoImpl implements StudentDao {

	JdbcTemplate jdbcTemplate;
	
	public StudentDaoImpl() {
		super();
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int delete(String name) {
		String delete="delete from Student where name=?";
		int result = this.jdbcTemplate.update(delete, name);
		return result;
	}

	public int insert(Student student) {
		String insert="insert into Student (name, village, age) values (?,?,?)";
		int result = this.jdbcTemplate.update(insert, student.getName(), student.getVillage(), student.getAge());
		return result;
	}

	public Student getOneStudent(String name) {
		String select = "select * from Student where name=?";
		RowMapper<Student> rm=new RowMapperImpl();
		Student student=this.jdbcTemplate.queryForObject(select,rm , name);
		return student;
	}

	public List<Student> getAllStudent() {
      String select = "select * from Student";
      RowMapper<Student> rm=new RowMapperImpl();
		List<Student> student=this.jdbcTemplate.query(select, rm);
		return student;
	}

	
}
