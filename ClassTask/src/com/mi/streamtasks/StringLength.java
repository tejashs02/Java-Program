package com.mi.streamtasks;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringLength 
{
	public static void main(String[] args) 
	{
		List<String> names=Arrays.asList("nataraz","kishan","hari kishan","jagannath","ajay");
		names.stream().map(String::length).collect(Collectors.toList()).forEach(System.out::println);
	}
}
