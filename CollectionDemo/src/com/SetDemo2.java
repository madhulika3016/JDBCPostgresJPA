package com;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo2 {

	public static void main(String[] args) {
		Set s=new LinkedHashSet();
		
		s.add(10);
		s.add(20.567f);
		s.add("Java");
		s.add("Java");
		s.add('c');
		s.add(null);
		System.out.println(s);
		s.remove('c');
		System.out.println(s);
		System.out.println(s.size());
		
		Set s1=new LinkedHashSet();
		s1.add("Python");
		s1.add("php");
		s1.addAll(s);
		System.out.println(s1);
		s.clear();
		System.out.println(s);

	}

}
