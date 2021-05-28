package com;

public  class MyClass implements MyInterface,MyInterface2 {

	public static void main(String[] args) {
		MyClass myclass=new MyClass();
		myclass.add(20, 30);
		myclass.show("Hello Java");
		System.out.println(myclass.b);
		System.out.println(MyInterface.b);
		//MyInterface.b=200; final variable cant be reassigned
		myclass.display();
		myclass.test();
		MyInterface2.test2();
		
		MyInterface2 i2=new MyClass();
		i2.test();
		//i2.test2();

	}
	@Override
	public int add(int a, int b) {
		int c=a+b;
		System.out.println(c);
		return c;
	}

	@Override
	public String show(String msg) {
		System.out.println(msg);
		return msg;
	}
	@Override
	public void display() {
		System.out.println("display of MyInterface2");
		}

}
