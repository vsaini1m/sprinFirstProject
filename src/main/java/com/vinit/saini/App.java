package com.vinit.saini;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
    	
    	ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
    	
    	
    	vehical obj=(vehical)context.getBean("vehical");
    	obj.drive();
    	
    }
}
