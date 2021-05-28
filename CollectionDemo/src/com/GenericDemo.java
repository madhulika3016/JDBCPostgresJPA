package com;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericDemo {

	public static void main(String[] args) {
		ArrayList<String> l1=new ArrayList<String>();
		
		l1.add("c");
		l1.add("c++");
		l1.add("java");
		//l1.add(10); not allowed
		
		System.out.println(l1);
		
		Iterator i=l1.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		for(String s:l1)
		{
			System.out.println(s);
		}
		
		for(int j=0;j<l1.size();j++)
		{
			if(j==2)
			{
				break;
			}
			else
			System.out.println(l1.get(j));
		}
		

	}

}
