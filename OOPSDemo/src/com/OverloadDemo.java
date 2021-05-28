package com;

public class OverloadDemo {
	
	public int add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
		return c;
	}
	
	//can change access specifiers ,return type,number and type of parameters
	 float add(float a,float b)
	{
		float c=a+b;
		System.out.println(c);
		return c;
	}
	
	public String add(String s1,String  s2,String s3)
	{
		String s4=s1+s2+s3;
		System.out.println(s4);
		return s4;
	}
	
	public String add(String s1,String  s2)
	{
		String s4=s1+s2;
		System.out.println(s4);
		return s4;
	}

	public static void main(String[] args) {
		OverloadDemo demo=new OverloadDemo();
		demo.add(10, 20);
		demo.add(12.5f, 40.6f);
		demo.add("Hello", "Core", "Java");

	}

}
