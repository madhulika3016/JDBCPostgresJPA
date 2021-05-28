package com;

public class Employee {
	
	private int eid;
	private String ename;
	private float salary;
	
	//Employee has a Address
	private Address address;

	/*
	 * public Employee(int eid, String ename, float salary, Address address) {
	 * super(); this.eid = eid; this.ename = ename; this.salary = salary;
	 * this.address = address; }
	 */
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ","
				+ " address=" + address + "]";
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}
