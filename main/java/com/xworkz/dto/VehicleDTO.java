package com.xworkz.dto;

import lombok.Data;

@Data
public class VehicleDTO {
	private String vehicleName;
	private int vehiclePrice;
	private  EngineDTO engine;
	
	public VehicleDTO(){
		System.out.println("invoking default constructor");
	}
	
	public VehicleDTO(String vehicleName,int vehiclePrice,EngineDTO engine) {
		this.vehicleName=vehicleName;
		this.vehiclePrice=vehiclePrice;
		this.engine=engine;
		System.out.println("vehicle having name\t"+ vehicleName +"\twith price of\t "
				+ vehiclePrice+"\twith engine details\t"+engine);
	}

}
