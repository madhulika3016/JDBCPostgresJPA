package com;

public class C extends B{
	
	int c=100;
	C()
	{
		System.out.println("Default of C");
		}
	public void testC()
	{
		System.out.println("Test of C");
	}

	public static void main(String[] args) {
		
		C cobj=new C();
		
		cobj.testA();
		cobj.testB();
		cobj.testC();
		
		System.out.println(cobj.a+"  "+cobj.b+"  "+cobj.c);
		
		if(cobj instanceof C)
		{
			System.out.println("it is an object of C");
		}
		

	}

}
