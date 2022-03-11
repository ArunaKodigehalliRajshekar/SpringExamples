package com.xworkz.dto;

import lombok.Data;

@Data
public class EngineDTO {

	private int stroke;
	private int noOfCylinders;
	private double capacity;
	
	public EngineDTO(){
		System.out.println("envoking default counstructor");
	}
	
	public EngineDTO(int stroke,int noOfCylinders,double capacity) {
		this.stroke=stroke;
		this.noOfCylinders=noOfCylinders;
		this.capacity=capacity;
		System.out.println("engine having stroke of\t"+stroke+"\t with cylinder of\t"
				+ noOfCylinders+"\t with capacity \t"+capacity);
	}
}
