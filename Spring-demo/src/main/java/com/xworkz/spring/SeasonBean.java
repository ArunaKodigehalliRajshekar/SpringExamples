package com.xworkz.spring;

public class SeasonBean {
	
	public String seasonName;
	
	
	public String getSeasonName() {
		return seasonName;
	}


	public void setSeasonName(String seasonName) {
		this.seasonName = seasonName;
	}


	public void provideClimate() {
		System.out.println("season changes drastically");
	}

}
