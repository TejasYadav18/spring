package com.springcore.SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        
        Student student1=context.getBean("student1", Student.class);
        
        //Student student1=(Student) context.getBean("student1");  //or
        
        System.out.println(student1);
        System.out.println(student1.hashCode());
        
       Student student2= context.getBean("student1", Student.class);
       
       //Student student2=(Student) context.getBean("student2");  //or
       
       System.out.println(student2);
       System.out.println(student2.hashCode());  //singleton scope
       
    }
}
