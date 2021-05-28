package com;

public class Parent {
	String name;
	int age;
	Parent(){
		System.out.println("Default of Parent");
		}
	public Parent(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	 void walk()
	{
		System.out.println("Parent is walking");
	}
	 public static void show() {
		 System.out.println("Inside show of static Parent");
	 }
	public static void main(String[] args) {
		//Parent p=new Parent();
		//p.walk();

	}

}
