package com.qa.OopGarage;

public class Runner {
	
	public static void main(String[] args) {
		
		Garage garage1 = new Garage();
		Car car1 = new Car(3, "Car", 4,60,"Fiat");
		Car car2 = new Car(5, "Car", 4,160, "Audi");
		Bike bike1 = new Bike(true, "Bike",  2, 140, "Yamaha");
		Bike bike2 = new Bike(false, "Bike",  2, 30, "Suzuki");
		Helicopter heli1 = new Helicopter(4, 6000, "Helicopter", 0, 500, "King Pin");
		Helicopter heli2 = new Helicopter(2, 2000, "Helicopter", 2, 200, "Whirly");
		
		VehicleFactory factory = new VehicleFactory();
		
		Vehicle carA = factory.getVehicle("Car");
		carA.calculateBill();
		
		Vehicle heliA = factory.getVehicle("helicopter");
		heliA.calculateBill();
		
		Vehicle bikeA = factory.getVehicle("bike");
		bikeA.calculateBill();
		
		garage1.addToVehicleList(heli2);
		garage1.addToVehicleList(heli1);
		garage1.addToVehicleList(bike2);
		garage1.addToVehicleList(bike1);
		garage1.addToVehicleList(car2);
		garage1.addToVehicleList(car1);
		
		
		//calculate bill
		//garage1.calaculateBill(garage1.list);
		
		//remove by type
		//garage1.removeVehicle(garage1.list, Helicopter.class);
		
		//remove by name
		//garage1.removeVehicle(garage1.list, "king Pin");
		
		//fix Vehicle
		//garage1.fixVehicle("Whirly");
		
		//empty the list
		//garage1.emptyList(garage1.list);
		
		//print list
		//System.out.println(garage1.list);
		
		
	}

}
