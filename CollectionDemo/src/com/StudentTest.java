package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentTest  implements Comparator<Student>
{
	public static void main(String[] args) {
		StudentTest st=new StudentTest();
		Student s1=new Student(101,"Ajay","Java");
		Student s2=new Student(104,"Arun","JavaFS");
		Student s3=new Student(102,"Tarun","AI");
		Student s4=new Student(105,"SAI","ML");
		Student s5=new Student(103,"Ravi","Python");
		
		ArrayList<Student> ls=new ArrayList<>();
		ls.add(s1);
		ls.add(s2);
		ls.add(s3);
		ls.add(s4);
		ls.add(s5);
		System.out.println(ls);
		
		Collections.sort(ls, st);
		System.out.println(ls);
	}

	@Override
	public int compare(Student s1, Student s2) {
		int i=s1.getSid()-s2.getSid();
		return i;
	}

}
