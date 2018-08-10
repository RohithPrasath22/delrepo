package com.del.spring;

public class Car implements Vehicle {
	private Wheel wheel;

	public Car() {
		super();
		
	}
	public void init() {
		System.out.println("init called");
	}
	public void destroy() {
		System.out.println("destroy called");
	}

	public Car(Wheel wheel) {
		super();
		this.wheel = wheel;
		System.out.println("car constructor");
	}


	public Wheel getWheel() {
		return wheel;
	}

	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
		System.out.println("wheel is setting");
	}

	@Override
	public void move() {
		wheel.rotate();
		System.out.println("car is moving");
	}
	@Override
	public void setTyre(int i) {
		System.out.println("tyres in car is "+i);
		
	}

}
