package com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class BasicStream {

	public static void main(String[] args) {
		
		//stream can be created with static data
		Stream<String> stream1 = Stream.of("I","G","A","T","E","\n");	
		stream1.forEach((location)->System.out.print(location));
		/*
		 * Object[] arr=stream1.toArray(); for(Object location:arr) {
		 * System.out.print(location); }
		 */
		//stream can be acquired from array or collections
		
		String[] loc=new String[]{"Pune","Mumbai","Chennai","Banglore","Noida"};
		List<String> locations = Arrays.asList(loc);
		stream1 = locations.stream();
		stream1.forEach(System.out::println);
		
	}
}
