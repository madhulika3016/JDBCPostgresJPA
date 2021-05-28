package com;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {

	public static void main(String[] args) {
		Map m1=new HashMap();
		
		m1.put(104,"Arun");
		m1.put(212,"Tarun");
		m1.put(103,"Anief");
		m1.put("stud","Aarif");
		m1.put(null,null);
		m1.put(101,null);
		m1.put(null,"kriti");
		System.out.println(m1);
		
		System.out.println(m1.keySet());
		
		System.out.println(m1.values());
		
		m1.remove(212);
		System.out.println(m1);
		m1.replace(104, "Divya");
		System.out.println(m1);

	}}
