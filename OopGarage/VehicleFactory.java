package com.qa.OopGarage;

public class VehicleFactory {


	public Vehicle getVehicle(String type)
	{
		if (type == null)
		{
			return null;
		}
		else if (type.equalsIgnoreCase("car"))
		{
			return new Car(5, "Car", 4, 300, "BMW m4");
		}
		else if (type.equalsIgnoreCase("helicopter"))
		{
			return new Helicopter(2, 2000, "Helicopter", 0, 200, "Whirly");
		}
		else if (type.equalsIgnoreCase("bike"))
		{
			return new Bike(false, "Bike", 2, 20, "Yamaha");
		}
		
		return null;
		
	}
	
}
