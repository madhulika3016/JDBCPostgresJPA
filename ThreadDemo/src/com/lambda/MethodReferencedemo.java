package com.lambda;

interface MyInterface   {  
	    void show();  
	}  
	public class MethodReferencedemo 
	{  
	    public void  showinstance(){  
	        System.out.println("Hello   I am  instance  method.");  
	    }  
	    public static void main(String  ar[]) {  
	MethodReferencedemo obj=new MethodReferencedemo();
	        // Reference to  instance  method  
	         MyInterface  mi= obj::showinstance;  
	        // Call  to  interface method  
	        mi.show();  
	//reference by anonymous object.
	   MyInterface  mi1= new MethodReferencedemo()::showinstance;  
	   } } 



