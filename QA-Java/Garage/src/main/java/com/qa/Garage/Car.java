package com.qa.Garage;

public class Car extends Vehicle {
	
	private String color;
	

	public Car(int numberOfWheels, String name, boolean isRaceCar, String color) {
		super(numberOfWheels, name, isRaceCar);
		this.setColor(color);

	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}

}
