package com.exception;

public class ExceptionDemo2 {
	
	public void devide() throws RuntimeException
	{
		int a=20;
		int b=0;
		int c=a/b;
		System.out.println(c);
		System.out.println("After exception");
	}

	public static void main(String[] args) throws Exception
	{
		ExceptionDemo2 obj=new ExceptionDemo2();
		
		/*
		 * try { obj.devide(); } catch(Exception e) {
		 * System.out.println("this is a exception  "+e); }
		 */
		 
		obj.devide();
		System.out.println("After Exception");

	}

}
