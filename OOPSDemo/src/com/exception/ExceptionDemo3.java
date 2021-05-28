package com.exception;

public class ExceptionDemo3 extends ExceptionDemo2
{
	//Exception handling with method overriding
	//child can not throw parent Exception 
	public void devide() throws NullPointerException
	{
		String str=null;
		String str2="java";
		System.out.println(str2.compareTo(str));
		
	}
	public static void main(String ar[]) throws NullPointerException,Exception
	{
		ExceptionDemo3 obj=new ExceptionDemo3();
		obj.devide();	
	}

}
