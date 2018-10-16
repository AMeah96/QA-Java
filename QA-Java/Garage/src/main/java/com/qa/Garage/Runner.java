package com.qa.Garage;

/**
 * Characters from cars in a garage
 *
 */
public class Runner {
	public static void main(String[] args) {
		
		Vehicle AbidsMotorcycle = new Motorcycle(2, "Abid's Motorcycle", false, 3);
		Vehicle AhmedsCar = new Car(4, "Ahmed's Car", false, "purple");
		Vehicle AdonaysCar = new Car(4, "Adonays Car", true, "red");
		Vehicle RobsLorry = new Lorry(4, "Robs Lorry", false, 10);
		
		
		Garage Garage = new Garage();
		System.out.println(AbidsMotorcycle.isRaceCar());
		
		Garage.addVehicle(AbidsMotorcycle);
		Garage.addVehicle(AhmedsCar);
		Garage.addVehicle(AdonaysCar);
		Garage.addVehicle(RobsLorry);
		
		
		Garage.fixVehicle(AhmedsCar);
		
		
		System.out.println("Remaining cars in the vehicle list from the Garage class");
		Garage.getVehicleList().forEach(i -> System.out.print(" " + i.getName()));
		System.out.println();
		
		int totalCost = Garage.calculateBill(Garage.getVehicleList());
		System.out.println("Total cost: " + totalCost);


		
	}
}
