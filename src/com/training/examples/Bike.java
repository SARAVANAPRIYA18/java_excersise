package com.training.examples;

public class Bike implements Travel,Owner{

	@Override
	public void getspeed() {
		System.out.println("Bike speed");
		
	}

	@Override
	public void ownerName() {
		System.out.println("Bike owner");
		
	}
	
      
}
