package com.phoenix.demos;

public class Fan implements Confort {
	String deviceName;
	boolean on;
	boolean status;
	float consumption;
	public Fan() {
		// TODO Auto-generated constructor stub
		deviceName="Fan";
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

	@Override
	public void increaseSpeed() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void decreaseSpeed() {
		// TODO Auto-generated method stub
		
	}

}
