package practice;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjectionApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("practice/setterInjection.xml");
		SetterInjectionPara si=(SetterInjectionPara) context.getBean("setterInjection1");
		System.out.println(si.getAddress()+" "+si.getId()+" "+si.getName());
		SetterInjectionPara si2=(SetterInjectionPara) context.getBean("setterInjection2");
		System.out.println(si2.getAddress()+" "+si2.getId()+" "+si2.getName());
		SetterInjectionPara si3=(SetterInjectionPara) context.getBean("setterInjection3");
		System.out.println(si3.getAddress()+" "+si3.getId()+" "+si3.getName());
		SetterInjectionPara si4=(SetterInjectionPara) context.getBean("marks");
		System.out.println("Marks "+si4.getMarks());
		SetterInjectionPara si5=(SetterInjectionPara) context.getBean("subject");
		System.out.println("Subject "+si5.getSubject());
		SetterInjectionPara si6=(SetterInjectionPara) context.getBean("students");
		System.out.println("Students "+si6.getStudents());
		
		context.close();
	}

}
