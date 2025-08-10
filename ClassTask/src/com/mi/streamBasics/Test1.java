package com.mi.streamBasics;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Test1 
{
	public static void main(String[] args) 
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("Java");
		al.add("python");
		al.add("AWS");
		al.add("devOps");
		al.add("HTML");
	
		//Stream<String> stream=al.stream();
//		stream.forEach(inp->System.out.println(inp));
		al.stream().forEach(System.out::println);
		
	}
}
