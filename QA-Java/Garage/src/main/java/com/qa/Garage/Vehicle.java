package com.qa.Garage;

public class Vehicle {

	private int numberOfWheels;
	private String name;
	private int numOfDoors;

	public Vehicle(int numberOfWheels, String name, int numOfDoors) {
		this.numOfDoors = numOfDoors;
		this.name = name;
		this.numberOfWheels = numberOfWheels;
	}

	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumOfDoors() {
		return numOfDoors;
	}

	public void setNumOfDoors(int numOfDoors) {
		this.numOfDoors = numOfDoors;
	}

}
