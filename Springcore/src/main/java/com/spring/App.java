package com.spring;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext Context  = new ClassPathXmlApplicationContext("config.xml");
        System.out.println("=========");
        Student student6 = (Student) Context.getBean("student6");
        Student student2 = (Student) Context.getBean("student2");
        Student student3 = (Student) Context.getBean("student3");
        System.out.println(student6);
        System.out.println(student2);
        System.out.println(student3);
    }
}
