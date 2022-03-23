package com.xworkz.water;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Fish {

	@Value(value = "cementBlack")
	private String color;
	@Value(value = "2.56")
	private float weight;
	
	public Fish(@Value(value = "orange") String color, @Value(value = "5.65") float weight) {
		this.color=color;
		this.weight=weight;
		System.out.println("fish with color\t"+ color+"\thaving a weight\t"+weight);
	}
		
	@Autowired
	public Fish( Water water) {
		System.out.println("fish is depend upon water for survival \t");
		
	}
}
