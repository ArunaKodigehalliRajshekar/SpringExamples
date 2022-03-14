package com.xworkz.bytype;

import lombok.Data;

@Data
public class Bird {
	
	private String name;
	private float weight;
	
	private Wings wing;
	
	public void fly(String name, float weight) {
		System.out.println("all birds having wings for fly");
		System.out.println("birds having name\t"+name+" \tand their repective weight\t"+weight);
	}
}
