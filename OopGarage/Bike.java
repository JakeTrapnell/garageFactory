package com.qa.OopGarage;

public class Bike extends Vehicle implements Bill {
	
	private boolean hasKickstand;
	
	public Bike (boolean hasKickStand, String type, int numOfWheels, int speed, String modelName )
	{
		super(type, numOfWheels, speed, modelName);
		this.hasKickstand = hasKickStand;
		
	}

	public boolean isHasKickstand() {
		return hasKickstand;
	}

	public void setHasKickstand(boolean hasKickstand) {
		this.hasKickstand = hasKickstand;
	}

	@Override
	public float calculateBill() {
		
	
		String name = this.getModelName();
		float bill=  0;
		float speed = this.getSpeed();
		if (((Bike) this).isHasKickstand())
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

	

}
