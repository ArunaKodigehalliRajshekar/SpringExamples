package com.xworkz.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		SeasonBean bean = context.getBean("bean",SeasonBean.class);
		System.out.println(bean);
//		bean.setSeasonName("winter");
//		bean.provideClimate();
		
		SeasonBean bean2 = context.getBean("season",SeasonBean.class);
		System.out.println(bean2);
		
		System.out.println(bean.getSeasonName());
	}

}
