package com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Mapping {

	public static void main(String[] args) {
		
		List<String> locations = Arrays.asList(new String[]{"Pune","Mumbai","Chennai",
				"Banglore","Noida"});
		System.out.println("Word legnth for locations:");
		//locations.stream().map(String::length).forEach(System.out::println);
		Stream<String> lstream=locations.stream();
		lstream.map((s)->s.length()+1).forEach((s1)->System.out.println(s1));
		
		List<Integer> numbers=Arrays.asList(new Integer[]{7,8,4,2,6});
		System.out.println("Map to Cube of Numbers");
		Stream<Integer> num=numbers.stream();
		Stream<Integer> cubeofnum=num.map((n)->n*n*n).sorted();
		//cubeofnum.forEach(System.out::println);
		List<Integer> list=cubeofnum.collect(Collectors.toList());
		System.out.println(list);	
	}
}
