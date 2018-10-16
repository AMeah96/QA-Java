package com.qa.Garage;

public class Lorry extends Vehicle{
	private int weightCapacity;

	public Lorry(int numberOfWheels, String name, boolean isRaceCar, int weightCapacity) {
		super(numberOfWheels, name, isRaceCar);
		this.weightCapacity = weightCapacity;

	}

	public int getweightCapacity() {
		return weightCapacity;
	}

	public void setweightCapacity(int weightCapacity) {
		this.weightCapacity = weightCapacity;
	}

}