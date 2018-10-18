package com.qa.Garage;

public class Motorcycle extends Vehicle{
	private int numberOfDials;
	
	public Motorcycle(int numberOfWheels, String name, int numOfDoors, int numberOfDials) {
		super(numberOfWheels, name, numOfDoors);
		this.setNumberOfDials(numberOfDials);

	}

	public int getNumberOfDials() {
		return numberOfDials;
	}

	public void setNumberOfDials(int numberOfDials) {
		this.numberOfDials = numberOfDials;
	}


	

}
