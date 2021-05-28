package com;

public interface MyInterface2 {
	
	void display();
	
	default void test()
	{
		System.out.println("Default of MyInterface 2");
	}
	
	static void test2()
	{
		System.out.println("static of MyInterface 2");
	}

}
