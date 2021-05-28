package com;

public abstract class Person {
	
	static int a=100;
	int b=200;
	//cant create object so wont be executed
	Person()
	{
		System.out.println("default constructor");
	}
	public abstract void work();
	public void name(String name)
	{
		System.out.println("My NAME IS "+name);
	}
	public static void eat()
	{
		System.out.println("Person is eating");
		//name("Madhu"); not possible
	}
	public static void main(String ar[])
	{
		//Person p=new Person(); cant create object of abstract class
		System.out.println("It is an abstract class");
		eat();
		System.out.println(a);
		//System.out.println(b); not possible
	}

}
