package com.sit.model;

public class Address {
	
	private String cityName;
	private String areaName;
	public Address(String cityName, String areaName) {
		super();
		this.cityName = cityName;
		this.areaName = areaName;
	}
	@Override
	public String toString() {
		return "Address [cityName=" + cityName + ", areaName=" + areaName + "]";
	}
	
	

}
