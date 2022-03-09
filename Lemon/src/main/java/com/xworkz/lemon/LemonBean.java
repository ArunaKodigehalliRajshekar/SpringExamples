package com.xworkz.lemon;

import java.util.ArrayList;

public class LemonBean {
	
	private String mantravadiName;
	private  String location;
	private ArrayList<String> mantravadies;
	
	ArrayList<String> list = mantravadies;
	
	public String getMantravadiName() {
		return mantravadiName;
	}
	public void setMantravadiName(String mantravadiName) {
		this.mantravadiName = mantravadiName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public void matamantra() {
		System.out.println("lemon is used for mata mantra purpose by");
		System.out.println(list);
	}
	

}
