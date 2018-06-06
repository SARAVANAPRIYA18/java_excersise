package com.training.examples;

public class PolyTest {

	public void brake(Car car) {
		System.out.println("Testing car brake ");
		car.brake();
	}

	public static void main(String[] args) {
		/*
		 * PolyTest pt=new PolyTest(); PoliceCar pc=new PoliceCar(); AudiCar ac=new
		 * AudiCar(); Taxi taxi=new Taxi();
		 */
		Car car[] = { new Taxi(), new AudiCar(), new PoliceCar() };
		int i = 0;
		for (i = 0; i < car.length; i++) {
			car[i].brake();

		}

	}

}
