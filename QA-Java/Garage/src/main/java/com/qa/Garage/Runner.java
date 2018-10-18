package com.qa.Garage;

/**
 * 
 *
 */
public class Runner {
	public static void main(String[] args) {

		Vehicle AbidsMotorcycle = new Motorcycle(2, "Honda CBR", 0, 3);
		Vehicle AhmedsCar = new Car(4, "Lamborghini Aventador", 5, "Black");
		Vehicle RobsLorry = new Lorry(4, "Eddie Stobart", 3, 10);
		Vehicle AdonaysCar = new Car(4, "Nissan Micra", 3, "Red");

		Garage Garage = new Garage();

		System.out.println("Vehicles added to Garage:" + "\n");

		Garage.addVehicle(AbidsMotorcycle);
		Garage.addVehicle(AhmedsCar);
		Garage.addVehicle(AdonaysCar);
		Garage.addVehicle(RobsLorry);

		System.out.println("-------------------------");
		Garage.fixVehicle(AbidsMotorcycle);
		System.out.println("-------------------------");

		System.out.println("Remaining Vehicles in Garage:" + "\n");

		Garage.getVehicleList().forEach(i -> System.out.print(" - " + i.getName()));
		System.out.println();
		System.out.println("-------------------------");
		int totalCost = Garage.calculateBill(Garage.getVehicleList());
		System.out.println("Total cost of Vehicles in Garage: " + totalCost);

	}
}
