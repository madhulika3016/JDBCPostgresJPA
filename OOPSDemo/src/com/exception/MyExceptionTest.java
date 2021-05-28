package com.exception;

public class MyExceptionTest {

	public static void main(String[] args) throws MyException 
	{
		int age=16;
		
		if(age<18)
		{
			throw new MyException();
		}
		else
			System.out.println(age);
	}

}
