package com;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		Set s=new TreeSet();
		s.add(20);
		s.add(30);
		s.add(10);
		s.add(40);
		//s.add(null); null not allowed
		//s.add("java");
		Object[] sarr=s.toArray();
		List<Object> l1=Arrays.asList(sarr);
		System.out.println(s);
		Collections.reverse(l1);
		System.out.println(l1);
		System.out.println(s);
		
		Set s1=new TreeSet();
		s1.add("pqr");
		s1.add("xyz");
		s1.add("abc");
		s1.add("Gtd");
		s1.add("java");
		System.out.println(s1);
		
		
		

	}

}
