package com.springJDBC.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.springJDBC.entity.Student;


public class StudentDaoImpl implements StudentDao {

	private JdbcTemplate jdbcTemplate;
	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int insert(Student student) {
		String insertQuery="insert into student(name, village, age) values (?,?,?)";
		int result=this.jdbcTemplate.update(insertQuery, student.getName(), student.getVillage(), student.getAge());
	
		return result;
	}

	@Override
	public int delete(String name) {
		String deleteQuery="delete from Student where name=?";
		int result=this.jdbcTemplate.update(deleteQuery, name);
		return result;
	}

	@Override
	public Student getStudentByName(String name) {
		String selectQuery="select * from Student where name=?";
		RowMapper<Student> rowMapper=new RowMapperImpl();
		Student student=this.jdbcTemplate.queryForObject(selectQuery, rowMapper, name);
		return student;
	}

	@Override
	public List<Student> getAllStudent() {
		String selectAll="select * from Student";
		//instead of direct writing 'new RowMapperImpl()' we can create object and give refernce name and passed it
		List<Student> allStudent = this.jdbcTemplate.query(selectAll, new RowMapperImpl());
		return allStudent;
	}
	
	

}
