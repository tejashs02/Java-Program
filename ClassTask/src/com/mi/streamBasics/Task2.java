package com.mi.streamBasics;

import java.util.Arrays;
import java.util.List;

/*
 * You are developing a HR module. Each employe has some details such as name ,age, desg
 * ,performance .Employee whose performance rating is 4.5
 */
public class Task2 
{	
	private String name;
	private int age;
	private String desg;
	private double performance;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDesg() {
		return desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}

	public double getPerformance() {
		return performance;
	}

	public void setPerformance(double performance) {
		this.performance = performance;
	}

	public Task2(String name, int age, String desg, double performance) {
		super();
		this.name = name;
		this.age = age;
		this.desg = desg;
		this.performance = performance;
	}

	@Override
	public String toString() {
		return "Name=" + name + "\nAge=" + age + "\nDesg=" + desg + "\nperformance=" + performance + "\n";
	}
 
	public static void main(String[] args) 
	{
		List<Task2> l=Arrays.asList(new Task2("Miller",50,"Jasva",6.5),new Task2("Smith",40,"Oracle",5.5),new Task2("Allen",50,"AWS",3.5));
		l.stream().filter(n->n.getPerformance()>4.5).forEach(System.out::println);
	}
}
