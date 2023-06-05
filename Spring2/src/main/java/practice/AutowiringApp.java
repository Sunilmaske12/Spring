package practice;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiringApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("practice/autowiring.xml");
		AutowiringPara AP=(AutowiringPara) context.getBean("autowiring1");
		System.out.println(AP);
		context.close();
	}

}
