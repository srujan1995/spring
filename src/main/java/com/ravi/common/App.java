package com.ravi.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 i am updating this file
 one more time
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
    	 
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        obj.printHello();
        
    }
}
