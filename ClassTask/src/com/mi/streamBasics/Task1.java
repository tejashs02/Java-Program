package com.mi.streamBasics;

// WAP to display all the student details who have scored more than 80% 
import java.util.Arrays;
import java.util.List;

public class Task1 {

	public static void main(String[] args) {

		List<Student> stud = Arrays.asList(new Student(101, "Smith", 100), new Student(102, "Miller", 80));
		stud.stream().filter(n -> n.getPer() > 80).forEach(System.out::println);
	}
}

class Student {

	private int rollNo;
	private String name;
	private double per;

	public int getRollNo() {
		return rollNo;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", per=" + per + "]";
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPer() {
		return per;
	}

	public void setPer(double per) {
		this.per = per;
	}

	public Student(int rollNo, String name, double per) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.per = per;
	}

}
