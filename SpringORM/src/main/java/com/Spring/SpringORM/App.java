package com.Spring.SpringORM;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springORM.dao.StudentDao;
import com.springORM.entity.Student;

public class App 
{
    public static void main( String[] args )
    {

    	ApplicationContext context=new ClassPathXmlApplicationContext("Configuration.hbm.xml");
    	StudentDao studentDao=context.getBean("studentDao", StudentDao.class);
    	Student student = new Student(3, "Raj Maske", 23);
    	
    	int id = studentDao.insertData(student);
    	System.out.println(id);
    	((AbstractApplicationContext) context).close();
    }
}
