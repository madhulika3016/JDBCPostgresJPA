package com;

public class Employee implements Comparable<Employee>{
	int eid;
	String ename;
	float salary;
	public Employee(int eid, String ename, float salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Employee e) {
		int i=this.eid-e.eid;
		return i;
	}
	
	  @Override 
	  public int hashCode() 
	  { 
		  final int prime = 31;
		  int result = 1;
	  result = prime * result + eid; 
	  return result; 
	  }
	  
	  @Override 
	  public boolean equals(Object obj) 
	  { if (this == obj) return true;
	  if (obj == null) return false; 
	  if (getClass() != obj.getClass()) 
		  return false; 
	  Employee other = (Employee) obj; 
	  if (eid != other.eid) 
		  return false;
	  return true; 
	  }
	 	
}
