package com.qa.Garage;

public class Vehicle {

	private int numberOfWheels;
	private String name;
	private boolean isRaceCar;

	public Vehicle(int numberOfWheels, String name, boolean isRaceCar) {
		this.isRaceCar = isRaceCar;
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

	public boolean isRaceCar() {
		return isRaceCar;
	}

	public void setRaceCar(boolean isRaceCar) {
		this.isRaceCar = isRaceCar;
	}

}