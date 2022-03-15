package com.phoenix.demos;

public class Ac implements Device,Confort {
	String deviceName;
	float temp;
	boolean on;
	public Ac()
	{
		temp=20.9f;
		deviceName="AC";
	}
	
	@Override
	public void increaseSpeed() {
		// TODO Auto-generated method stub
		temp=temp+0.5f;
	}

	@Override
	public void decreaseSpeed() {
		// TODO Auto-generated method stub
		temp=temp-0.5f;
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		on=true;
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		on=false;
	}

	@Override
	public void getConsumption() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean getStatus() {
		// TODO Auto-generated method stub
		return on;
	}

}
