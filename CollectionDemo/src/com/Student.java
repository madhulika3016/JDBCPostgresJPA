package com;

public class Student //implements Comparable<Student>
{
	private int sid;
	private String sname;
	private String tech;
	public Student(int sid, String sname, String tech) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.tech = tech;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", tech=" + tech + "]";
	}
	/*
	 * @Override public int compareTo(Student s) { //int i=this.sid-s.sid; //return
	 * i;
	 * 
	 * int i=this.sname.compareTo(s.sname); return i; }
	 */
	
	

}
