package com;

public class Audi extends Car{
	
	String carname="Audi";
	String color="black";
	public void autopilot() {
		System.out.println("Car is on autopilot mode");
		System.out.println(super.carname);
		System.out.println(super.color);
		super.register();
		super.register();
		}
	public static void main(String[] args) {
		Audi audi=new Audi();
		System.out.println(audi.carname);
		System.out.println(audi.color);
		audi.register();
		audi.applyBrake();
		audi.autopilot();
		//applyBrake(); not possible
		//System.out.println(super.color); can not use in static context

	}

}
