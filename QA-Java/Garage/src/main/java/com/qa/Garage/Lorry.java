package com.qa.Garage;

public class Lorry extends Vehicle{
	private int weightCapacity;

	public Lorry(int numberOfWheels, String name, int numOfDoors, int weightCapacity) {
		super(numberOfWheels, name, numOfDoors);
		this.weightCapacity = weightCapacity;

	}

	public int getweightCapacity() {
		return weightCapacity;
	}

	public void setweightCapacity(int weightCapacity) {
		this.weightCapacity = weightCapacity;
	}

}