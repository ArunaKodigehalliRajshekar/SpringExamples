package com.xworkz.bytype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBird {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
	    Bird bird=	context.getBean(Bird.class);
	   
	   System.out.println(bird.getName());
	   System.out.println(bird.getWing());
	   System.out.println(bird.getWeight());
	  
		
	}

}
