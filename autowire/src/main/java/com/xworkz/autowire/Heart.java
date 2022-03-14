package com.xworkz.autowire;

import lombok.Data;

@Data
public class Heart {
	
	private byte noOfChambers;
	private int noOfCountPerDay;
	
	public Heart() {
		System.out.println("functionality of heart is pumping the blood");
	}
	
	public Heart(byte noOfChambers , int noOfCountPerDay) {
		this.noOfChambers=noOfChambers;
		this.noOfCountPerDay = noOfCountPerDay;
		
		System.out.println("heart consist of\t"+noOfChambers+"\t chambers and beats upto\t"+noOfCountPerDay);
	}

}
