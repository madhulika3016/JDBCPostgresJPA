package com;

import java.util.HashSet;

public class HashCodeEqualDemo {
		public static void main(String[] args) {
			Employee e1=new Employee(1004,"Ajay",30000);
			Employee e2=new Employee(1003,"Vijay",20000);
			Employee e3=new Employee(1002,"jay",40000);
			Employee e4=new Employee(1001,"Raj",10000);
			Employee e5=new Employee(1001,"david",15000);
			
			HashSet<Employee> s=new HashSet<>();
			s.add(e1);
			s.add(e2);
			s.add(e3);
			s.add(e4);
			s.add(e4);
			s.add(e5);
			for(Employee e:s)
			{
				System.out.println(e);
			}
			
		}

		

	}



