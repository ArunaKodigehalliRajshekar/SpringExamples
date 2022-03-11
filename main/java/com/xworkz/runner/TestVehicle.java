package com.xworkz.runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.dto.EngineDTO;
import com.xworkz.dto.VehicleDTO;

public class TestVehicle {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		context.getBean("bean",VehicleDTO.class);
		//context.getBean(EngineDTO.class);
	}

}
