package com.qa.OopGarage;

public class Car extends Vehicle implements Bill {
	
	private int numOfDoors;
	
	public Car (int numOfDoors, String type, int numOfWheels, int speed, String modelName )
	{
		super(type, numOfWheels, speed, modelName);
		this.numOfDoors = numOfDoors;		
	}

	public int getNumOfDoors() {
		return numOfDoors;
	}

	public void setNumOfDoors(int numOfDoors) {
		this.numOfDoors = numOfDoors;
	}

	@Override
	public float calculateBill() {
		
	
		String name = this.getModelName();
		float speed = this.getSpeed();
		int doors = ((Car) this).getNumOfDoors();
		float bill = speed*doors; 
		
		System.out.println(name +" "+"BILL "+"£"+ bill);
		return bill;
	}

	

}
