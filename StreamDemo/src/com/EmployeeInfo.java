package com;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
class Employee {
    String name;
	int salary;

    Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
    
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append("name: ");
        sb.append(name);
        sb.append(" salary: ");
        sb.append("" + salary+">");
        return sb.toString();

    }
}
class EmployeeInfo{
    enum SortMethod {
        BYNAME, BYSALARY;
    }
     List<Employee> sort(List<Employee> emps, final SortMethod method){
        List<Employee> empl= new ArrayList<>();
    	if(method==SortMethod.BYNAME) {
    		empl= emps.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
    	}else if(method==SortMethod.BYSALARY) {
    		Comparator<Employee> employeeSalaryComparator= Comparator.comparing(Employee::getSalary, (s1, s2) -> {
                return s1.compareTo(s2);
            });
                empl= emps.stream().sorted(employeeSalaryComparator).collect(Collectors.toList());
                Collections.reverse(empl);
            }
    	return empl;
    }
 boolean isCharacterPresentInAllNames(Collection<Employee> entities,String  character){
         boolean matched= entities.stream().allMatch(s->s.getName().contains(character));
        return matched;
     }
     public static void main(String ar[])
     {
         List<Employee> emps = new ArrayList<>();
emps.add(new Employee("Mickey", 100000));
emps.add(new Employee("Timmy", 50000));
emps.add(new Employee("Annny", 40000));

EmployeeInfo employeeInfo=new EmployeeInfo();
List<Employee> emp=employeeInfo.sort(emps,SortMethod.BYNAME);
      boolean b=   employeeInfo.isCharacterPresentInAllNames(emps,"y");
      System.out.println(emp);
      System.out.println(b);
     }

}
/*
 * .sorted((e) -> {new Comparator(){ public int compare(String s1,String s2){
 * return s1.compare(S2); } }};
 */
