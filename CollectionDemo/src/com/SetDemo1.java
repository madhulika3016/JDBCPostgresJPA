package com;

import java.util.HashSet;
import java.util.Set;

public class SetDemo1 {

	public static void main(String[] args) {
		Set s=new HashSet();
		
		s.add(10);
		s.add(20.567f);
		s.add("Java");
		s.add('c');
		System.out.println(s);
		s.remove('c');
		System.out.println(s);
		System.out.println(s.size());
		
		Set s1=new HashSet();
		s1.add("Pyhthon");
		s1.add("php");
		s1.addAll(s);
		System.out.println(s1);
		s.clear();
		System.out.println(s);
	
		

	}

}
