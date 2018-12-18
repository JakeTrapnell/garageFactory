package com.qa.OopGarage;

public class Helicopter extends Vehicle implements Bill {
	
	private int rotorBlades;
	private float maxAltitude;
	
	public Helicopter (int rotorBlades, float maxAltitude, String type, int numOfWheels, int speed, String modelName)
	{
		super(type, numOfWheels, speed, modelName);
		this.rotorBlades = rotorBlades;
		this.maxAltitude = maxAltitude;		
	}

	public int getRotorBlades() {
		return rotorBlades;
	}

	public void setRotorBlades(int rotorBlades) {
		this.rotorBlades = rotorBlades;
	}
	
	public float getMaxAltitude()
	{
		return maxAltitude;
	}
	
	public void setMaxAltitude(float maxAltitude)
	{
		this.maxAltitude =  maxAltitude;
	}

	@Override
	public float calculateBill() {
		
		String name = this.getModelName();
		float alt = ((Helicopter) this).getMaxAltitude();
		int blades = ((Helicopter) this).getRotorBlades();
		float bill = alt + blades;
		
		System.out.println(name +" "+"BILL "+"£"+ bill);
		return bill;
		
	}
	

	
}
