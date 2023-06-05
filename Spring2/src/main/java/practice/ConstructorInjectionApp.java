package practice;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorInjectionApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("practice/constructorInjection.xml");
		ConstructorInjectionPara cip1= (ConstructorInjectionPara)context.getBean("constructor1");
		System.out.println(cip1);
		context.close();
	}

}
