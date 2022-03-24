package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		 ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/collections/collectionsconfig.xml");
		 Employee emp1 =context.getBean("emp1",Employee.class);
		 System.out.println("name" +"-" +emp1.getName());
		 System.out.println("phones" +"-" +emp1.getPhones());
		 System.out.println("address" +"-" +emp1.getAddress());
		 System.out.println("courses" +"-" +emp1.getCourses());

		
		 
		 
		

	}

}
