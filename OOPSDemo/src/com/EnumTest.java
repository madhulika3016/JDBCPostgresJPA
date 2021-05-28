package com;

enum Color
{
	RED,BLUE,GREEN;
}
public class EnumTest {
	
	enum Season
	{
		SUMMER,WINTER,RAINY,SPRING;
	}
	
	public static void test()
	{
		/*
		 * enum Season1 { SUMMER,WINTER,RAINY,SPRING; }
		 */
		
	}

	public static void main(String[] args) {
		System.out.println(Color.BLUE);
		//Color.RED="PINK"; NOT ALLOWED
		
		System.out.println(Season.SPRING);

	}

}
