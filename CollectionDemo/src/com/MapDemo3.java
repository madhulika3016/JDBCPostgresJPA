package com;

import java.util.Map;
import java.util.TreeMap;

public class MapDemo3 {

	public static void main(String[] args) {
		Map m1=new TreeMap();
		m1.put(104,"Arun");
		m1.put(212,"Tarun");
		m1.put(103,"Anief");
		//m1.put("stud","Aarif"); same type of key for sorting
		//m1.put(null,null); null key not allowed
		m1.put(101,null);
		//m1.put(null,"kriti");
		System.out.println(m1);
		System.out.println(m1.keySet());
		System.out.println(m1.values());
		m1.remove(212);
		System.out.println(m1);
		m1.replace(104, "Divya");
		System.out.println(m1);
		//convert map into set
		System.out.println(m1.entrySet());
		m1.putAll(m1);
		System.out.println(m1);}}
