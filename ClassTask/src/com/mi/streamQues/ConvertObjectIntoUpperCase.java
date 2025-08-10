package com.mi.streamQues;

import java.util.Arrays;
import java.util.List;

public class ConvertObjectIntoUpperCase 
{
	public static void main(String[] args) 
	{
		List<String> names=Arrays.asList("isha","mihir","janvi","kadambari","pratik");
		names.stream().map(String::toUpperCase).sorted()
		.forEach(System.out::println);
	}
}
