package com.mi.streamtasks;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmpSalGreaterthan50 
{
	public static void main(String[] args) 
	{
		List<Employee> emp=Arrays.asList(new Employee("Smith",20000.0),
				new Employee("Miller",50000.0),
				new Employee("Allen",40000.0),
				new Employee("John",80000.0),
				new Employee("Killer",60000.0));
		
		emp.stream().filter(n->n.getSalary()>50000.0)
		.map(Employee::getName)
								.collect(Collectors.toList()).forEach(System.out::println);
	}
}
class Employee{
	private String name;
	private double salary;
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
	
	
	
	
}
