package com.springJDBC.SpringJDBC;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springJDBC.dao.StudentDao;
import com.springJDBC.entity.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Spring JDBC" );
        ApplicationContext context=new ClassPathXmlApplicationContext("com/springJDBC/SpringJDBC/config.xml");
        StudentDao studentdao=(StudentDao) context.getBean("studentDao");
         
        Student student=new Student();
        student.setAge(34);
        student.setName("Vijay");
        student.setVillage("MH");
      
       // int result=studentdao.insert(student);
       //  System.out.println("Number of record inserted :"+result);

       //   int result2=studentdao.delete("Anil");
       //  System.out.println("Number of record deleted :"+result2);
   
       //  Student studentRow = studentdao.getStudentByName("Vijay");
       //  System.out.println("Select operation :"+studentRow);

        List<Student> studentList = studentdao.getAllStudent();
         System.out.println("Select all operation :");
         for(Student s:studentList) {
        	 System.out.println(s);
         }
         
         
        ((AbstractApplicationContext) context).close();
    }
}
