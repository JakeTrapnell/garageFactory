package com.qa.OopGarage;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class Garage {
	
	protected List<Vehicle> list = new ArrayList<Vehicle>();
	
	public Garage()
	{
		
	}
	
	
	public void calaculateBill(List<Vehicle> list)
	{
		for(Vehicle i : list)
		{
			if(i instanceof Car)
			{
				carBill((Car) i);
			}
			if(i instanceof Bike)
			{
				bikeBill((Bike) i);
			}
			if(i instanceof Helicopter)
			{
				heliBill((Helicopter) i);
			}		
		}
	}	
	
	public float carBill(Car car)
	{
		String name = car.getModelName();
		float speed = car.getSpeed();
		int doors = car.getNumOfDoors();
		float bill = speed*doors; 
		
		System.out.println(name +" "+"BILL "+"£"+ bill);
		return bill;
	}
	
	public float bikeBill (Bike bike)
	{
		String name = bike.getModelName();
		float bill=  0;
		float speed = bike.getSpeed();
		if (bike.isHasKickstand())
		{
			bill = speed + 50;
		}
		else
		{
			bill = speed;
		}
		
		System.out.println(name +" "+"BILL "+"£"+ bill);
		return bill;
	}
	
	public float heliBill(Helicopter heli)
	{
		String name = heli.getModelName();
		float alt = heli.getMaxAltitude();
		int blades = heli.getRotorBlades();
		float bill = alt + blades;
		
		System.out.println(name +" "+"BILL "+"£"+ bill);
		return bill;
	}
	
	public List<Vehicle> addToVehicleList(Vehicle vehicle) {

		list.add(vehicle);

		return list;
	}
	
	public void removeVehicle(List<Vehicle> list, String name)
	{
		//list.stream().filter(n -> !n.getModelName().equals(name)).forEach(System.out::println);	
		List<Vehicle> newList = list.stream().filter(n -> !n.getModelName().equals(name)).collect(Collectors.toList());
		System.out.println(newList);
	}
	
	public void removeVehicle(List<Vehicle> list, Class type)
	{
		//list.stream().filter(n -> !n.getClass().equals(type)).forEach(System.out::println);
		List<Vehicle> newList = list.stream().filter(n -> !n.getClass().equals(type)).collect(Collectors.toList());
		System.out.println(newList);
	}
	
	public void emptyList(List<Vehicle> list)
	{
		list.clear();
	}
	
	public void fixVehicle (String name)
	{
		List<Vehicle> newList = list.stream().filter(n -> n.getModelName().equals(name)).collect(Collectors.toList());
		calaculateBill(newList);
	}

}
