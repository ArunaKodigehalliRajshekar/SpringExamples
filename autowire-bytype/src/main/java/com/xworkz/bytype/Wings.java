package com.xworkz.bytype;

import lombok.Data;

@Data
public class Wings {
	
	private String color;
	private float length;
	
	
	public void action(String color,float length) {
		System.out.println("wings having \t"+color+"\t and respective length\t"+length);
	}

}
