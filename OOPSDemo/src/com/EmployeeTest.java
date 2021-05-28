package com;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Address address=new Address("Mumbai", "MH","INDIA");
		
		//Employee emp=new Employee(1001, "Asrith", 12500, address);
		
		Employee emp=new Employee();
		emp.setAddress(address);
		emp.setEid(1001);
		emp.setEname("Divya");
		emp.setSalary(40000);
		
		System.out.println(emp);
		
		System.out.println(emp.getEid()+"  "+emp.getEname()+" "+emp.getSalary());

	}

}
