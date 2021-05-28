package com;

public class Student extends Person{

	public static void main(String[] args) {
		Student s1=new Student();
		s1.name("Arun");
		s1.work();
		System.out.println(Person.a);
		System.out.println(s1.b);
		
		Person p=new Student();
		p.name("Tarun");
		//p.display(); not  allowed
	}

	@Override
	public void work() {
		System.out.println("I AM Studying");
		
	}
	
	public void display()
	{
		System.out.println("display of student");
	}

}
