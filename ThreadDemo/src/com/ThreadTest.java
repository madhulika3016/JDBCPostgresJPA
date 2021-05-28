package com;

public class ThreadTest {

	public static void main(String[] args) {
		
		Thread1 th1=new Thread1();
		
		Thread2 th2=new Thread2();
		
		Thread t1=new Thread(th1);
		
		Thread t2=new Thread(th2);
		t1.setName("MyThread");
		t1.start();
		t2.start();
		System.out.println(t1.getPriority());
		System.out.println(t1.getId());
		System.out.println(t1.getName());
	}}
