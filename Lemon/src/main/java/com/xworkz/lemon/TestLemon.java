package com.xworkz.lemon;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLemon {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		LemonBean bean = context.getBean("bean",LemonBean.class);
	
		
		bean.matamantra();
		System.out.println(bean.getMantravadiName());
		System.out.println(bean.getLocation());
		
	}

}
