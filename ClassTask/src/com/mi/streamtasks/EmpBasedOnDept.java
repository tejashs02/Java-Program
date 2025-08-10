package com.mi.streamtasks;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmpBasedOnDept
{
	public static void main(String[] args) 
	{
		List<Employe> emp=Arrays.asList(new Employe("Smith","Java", 120000.0),
				new Employe("Allen","AWS", 140000.0),
				new Employe("Miller","Oracle", 160000.0),
				new Employe("John","Python", 180000.0),
				new Employe("James","Java", 130000.0));
	
		 Map<String,List<Employe>> group=emp.stream().collect(Collectors.groupingBy(Employe::getDept));
		 
//		 System.out.println(group);
		 group.forEach((dept,emps) -> System.out.println(dept+" : "+emps));
	}
}
class Employe
{
	private String name;
	private String dept;
	private double salary;
	
	public String getName() {
		return name;
	}
	public String getDept() {
		return dept;
	}
	public double getSalary() {
		return salary;
	}
	public Employe(String name, String dept, double salary) {
		super();
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return  name	;
	}
	
	
	
}
