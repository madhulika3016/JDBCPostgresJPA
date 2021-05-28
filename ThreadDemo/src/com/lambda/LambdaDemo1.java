package com.lambda;

public class LambdaDemo1 {
	
	public void drink()
	{
		System.out.println("Drink Water");
	}

	public static void main(String[] args) {
		
		Eatable e=new Eatable() {
			@Override
			public void eat() {
				System.out.println("Eat your Food  ..");
				}};
		
		e.eat();
		
		Eatable e1=()->System.out.println("Eat your Lunch ..");
		e1.eat();
		
		Walkable w=(String s)->{
			System.out.println(s+  "  is Walking");
			return s;
		};
		w.walk("Madhu");
		
		LambdaDemo1 demo=new LambdaDemo1();
		
		Eatable e2=demo::drink;
		demo.drink();
	}}
