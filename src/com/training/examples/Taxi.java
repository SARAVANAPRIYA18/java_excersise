package com.training.examples;

public class Taxi extends Car {
	int i = 18;

	public void brake() {
		System.out.println("Brake in Taxi");

	}

	public static void main(String[] args) {
		Car car = new Taxi();
		car.brake();
		System.out.println(car.i);
		System.out.println(car instanceof Car);
	}
}
