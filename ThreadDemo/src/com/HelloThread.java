package com;

public class HelloThread extends Thread
{
	
	public void run()
	{
		System.out.println("Hello Welcome to MultiThreading.... ");
	}
	
	public static void main(String ar[])
	{
		HelloThread t1=new HelloThread();
		t1.start();
		
		HelloThread t2=new HelloThread();
		t2.start();
		//t1.start(); cannot be started again
		
		t1.stop();
		//t1.start();
		t1.resume();
		
		//t1.suspend();
		//t1.resume();
	}

}
