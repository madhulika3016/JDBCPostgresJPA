package com.exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionDemo {

	public static void main(String[] args) throws IOException {
		try
		{
		int a=10;
		int b=0;
		int c=a/b;
		System.out.println(c);
		String str=null;
		String s1="java";
		s1.compareTo(str);
		}
		catch(ArithmeticException e) 
		{ 
		System.out.println("this is arithmetic exception  "+e); 
		} 
		catch(Exception e) 
		{ 
			  System.out.println("this is a exception  "+e);
		  } 
		finally
		{
			System.out.println("finally block1");
			}
		
			/* finally { System.out.println("finally block2"); } */
		 
		try(FileReader fr=new FileReader("D:\\Capg2\\OOPSDemo\\src\\com\\exception\\demo.txt"))
		{
		//int i=Integer.parseInt("abc");
		//System.out.println(i);
			BufferedReader br=new BufferedReader(fr);
			String str=br.readLine();
			System.out.println(str);
			
		}
		/*
		 * finally { System.out.println("Finally Block 2"); }
		 */
		
		System.out.println("After Exception");	
	}

}
