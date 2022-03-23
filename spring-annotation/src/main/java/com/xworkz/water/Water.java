package com.xworkz.water;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Water {
	
	@Value(value = "true")
	private boolean isTransparent;
	@Value(value = "shallowBlue")
	private String color;
	@Value(value = "999")
	private int density;
	
	private Fish fish;
	

}
