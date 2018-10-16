package com.qa.Garage;

public class Motorcycle extends Vehicle{
	private int numberOfDials;
	
	public Motorcycle(int numberOfWheels, String name, boolean isRaceCar, int numberOfDials) {
		super(numberOfWheels, name, isRaceCar);
		this.setNumberOfDials(numberOfDials);

	}

	public int getNumberOfDials() {
		return numberOfDials;
	}

	public void setNumberOfDials(int numberOfDials) {
		this.numberOfDials = numberOfDials;
	}


	

}
