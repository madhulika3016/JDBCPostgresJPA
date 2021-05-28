package com;

public class MyRunnable implements Runnable {

	/*
	 * @Override public void run() {
	 * 
	 * Thread.currentThread().setName("MyThread");
	 * System.out.println("Thread start:::"+Thread.currentThread().getName());
	 * for(int row=2;row<5;row++){ for(int num=1;num<=10;num++)
	 * System.out.print(row*num+" ");
	 * 
	 * System.out.println(""); }
	 * System.out.println("Thread ended:::"+Thread.currentThread().getName()); }
	 */
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(i);
			}	
	}
}
