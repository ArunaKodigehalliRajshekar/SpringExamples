package com.xworkz.autowire;

import lombok.Data;

@Data
public class Human {
	private String name;
	private double weight;
	
	private Heart heart;
	
	public Human() {
		System.out.println("inside default constructor");
	}
	
	public Human(String name , double weight, Heart heart){
		this.name=name;
		this.weight=weight;
		this.heart=heart;
		
		System.out.println("the name of human \t"+name+"\t with a weight of \t"+weight);
	}

}
