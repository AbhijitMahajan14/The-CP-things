package com.phoenix.demos;

import java.io.Serializable;

public class Coin implements Serializable {
	String country;
	float domination;
	int minting;
	float value;
	String date;
	
	public Coin(String country,float domination,int minting,float value,String date) {
		this.country=country;
		this.domination=domination;
		this.minting=minting;
		this.value=value;
		this.date=date;
	}
	public Float getValue()
	{
		return this.value;
	}
}
