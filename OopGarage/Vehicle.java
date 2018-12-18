package com.qa.OopGarage;

public abstract class Vehicle {
	
	private String type;
	private int numOfWheels;
	private float speed;
	private String modelName;
	
	public Vehicle(String type, int numOfWheels, float speed, String modelName)
	{
		this.setType(type);
		this.setNumOfWheels(numOfWheels);
		this.setSpeed(speed);
		this.setModelName(modelName);
	}

	public String getType()
	{
		return type;
	}
	
	public void setType(String type)
	{
		this.type = type;
	}
	
	public int getNumOfWheels() {
		return numOfWheels;
	}

	public void setNumOfWheels(int numOfWheels) {
		this.numOfWheels = numOfWheels;
	}

	public float getSpeed() {
		return speed;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}


	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	@Override
	public String toString() {
		return "Vehicle [Type: "+ type + ", numOfWheels: " + numOfWheels + ", speed: " + speed + ", modelName: " + modelName + "]";
	}

	public float calculateBill() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
