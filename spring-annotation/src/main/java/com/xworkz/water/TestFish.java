package com.xworkz.water;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestFish {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		 Water water= context.getBean(Water.class);
		 System.out.println(water.getColor());
		 System.out.println(water.isTransparent());
		 System.out.println(water.getDensity());
	}

}
