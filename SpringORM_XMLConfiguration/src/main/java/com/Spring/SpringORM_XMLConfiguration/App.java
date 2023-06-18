package com.Spring.SpringORM_XMLConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SpringORM_XMLConfiguration.dao.EmployeeDao;
import com.SpringORM_XMLConfiguration.entity.Employee;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("Configuration.hbm.xml");
       EmployeeDao empDao = context.getBean("empDao", EmployeeDao.class );
       Employee emp = new Employee("Ajay" , 30000);
       int id = empDao.saveData(emp);
       System.out.println(id);
       ((AbstractApplicationContext) context).close();
    }
}
