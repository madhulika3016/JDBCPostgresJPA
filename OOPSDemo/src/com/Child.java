package com;

public class Child extends Parent
{
	Child()
	{
		super();
		System.out.println("Default of Child");
		//super(); not allowed
	}
	
	Child(String name,int age)
	{
		super(name,age);
	}
	
	@Override
	 protected void walk()
	{
		System.out.println("Child is walking");
		super.walk();
	}
	public void test()
	{
		super.walk();
	}
	
	//static methods are not overriden they are hidden so this is method hidding
	//@Override
	 public static void show() {
		 System.out.println("Inside show of static Child");
	 }
	public static void main(String[] args) 
	{
		Child c=new Child();
		//c.walk();
		c.test();
		c.show();
		
		//Upcasting 
		//Parent p=new Child();
		//p.walk();
		//p.test(); not allowed
		
		
		//Child c1=new Child("Ajay",55);
		//System.out.println(c1.name+"  "+c1.age);
			
	}
}
