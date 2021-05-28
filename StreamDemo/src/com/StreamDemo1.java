package com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo1 {

	public static void main(String[] args) {
		
		Stream<String> stream1=Stream.of("J","A","V","A"); 
		
		//stream1.forEach(System.out::println);
		
		stream1.forEach((str)->System.out.println(str));
		
		Stream<Integer> stream2=Stream.of(10,20,30); 
		
		//stream1.forEach(System.out::println);
		
		stream2.forEach((i)->System.out.println(i));
		
		List<String> ls=new ArrayList<>();
		ls.add("Mumbai");
		ls.add("Pune");
		ls.add("Rachi");
		ls.add("Goa");
		
		Stream<String> stream3=ls.stream();
		
		//List<String> ls2=stream3.filter((s)->s.length()>4).collect(Collectors.toList());
		//System.out.println(ls2);
		
		List<String> ls3=stream3.filter((s)->s.length()>3).collect(Collectors.toList());
		Object[] strArr= ls3.toArray();
		for(Object s:strArr)
		{
			System.out.println(s);
		}

	}

}
