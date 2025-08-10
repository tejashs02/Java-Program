package com.mi.streamQues;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
// 2. Given a list of integers, find out all the numbers starting with 1 using Stream functions?
public class StratingWithStream 
{
	public static void main(String[] args) 
	{
		List<Integer> numbers = Arrays.asList(123, 456, 101, 11, 19, 200, 1234, 10);
		
		List<Integer> noStartingWith1=numbers.stream()
																.filter(n->String.valueOf(n).startsWith("1"))
																.collect(Collectors.toList());
		System.out.println("No Starting with 1 are : "+noStartingWith1);
	}
}
