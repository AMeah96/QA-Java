package com.qa.Garage;

public class Car extends Vehicle {
	
	private String color;
	

	public Car(int numberOfWheels, String name, int numOfDoors, String color) {
		super(numberOfWheels, name, numOfDoors);
		this.setColor(color);

	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}

}
