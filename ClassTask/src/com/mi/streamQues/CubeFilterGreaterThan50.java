 package com.mi.streamQues;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
// Java 8 program to perform cube on list elements and filter numbers greater than 50.
public class CubeFilterGreaterThan50
{
	public static void main(String[] args)
	{
		List<Integer> nos=Arrays.asList(2,4,1,6,7,3);
		
		List<Integer> greater=nos.stream().map(n-> n*n*n)
							   .filter(n-> n > 50)
							   .collect(Collectors.toList());
		
		System.out.println("Cube greater than 50: "+greater);
	}
}
