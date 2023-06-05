package practice;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		System.out.println(" IN A MAIN CLASS");
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("practice/practice.xml");
		Practice1 p=context.getBean("practice1",Practice1.class);
		System.out.println(p);
		System.out.println(p.getPractice2().getSubject());
		context.close();
	}

}
