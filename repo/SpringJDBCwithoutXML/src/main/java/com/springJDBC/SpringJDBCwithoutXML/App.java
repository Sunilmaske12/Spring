package com.springJDBC.SpringJDBCwithoutXML;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.springJDBC.dao.StudentDao;
import com.springJDBC.entity.Student;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new AnnotationConfigApplicationContext(com.springJDBC.configuration.ConfigurationData.class) ;
    	StudentDao studentdao=context.getBean("StudentDao", StudentDao.class);
    	
    	Student student=new Student();
    	student.setName("Radha");
    	student.setVillage("Lanka");
    	student.setAge(500);
    	
    	int result = studentdao.insert(student);
    	System.out.println("data insert :"+result);

    	int delete= studentdao.delete("");
    	System.out.println("data delete :"+delete);
    	
    	Student studentRow = studentdao.getOneStudent("Radha");
    	System.out.println(studentRow);
    	
    	List<Student> studentList = studentdao.getAllStudent();
    	for(Student st:studentList) {
    		System.out.println(st);
    	}
    	
    	//jhjj
    	((AbstractApplicationContext) context).close();
    }
}
