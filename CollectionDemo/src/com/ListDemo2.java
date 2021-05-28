package com;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListDemo2 {
		public static void main(String[] args) 
		{
			List l1=new LinkedList();
			
			l1.add("java");
			l1.add(".net");
			l1.add(".python");
			l1.add("php");
			l1.add("php");
			//l1.add(10);
			//l1.add(null);
			//l1.add(null);
			l1.add(4, "AI");
			l1.remove(5);
			System.out.println(l1);
			Collections.sort(l1);
			System.out.println(l1);

		}

	}



