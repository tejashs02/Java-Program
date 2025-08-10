package com.mi.streamtasks;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DuplicatesEle 
{
	public static void main(String[] args) 
	{
		List<String> names=Arrays.asList("nataraz","kishan","hari kishan","jagannath","nataraz","kishan","Mihir");
		System.out.println(names);
		names.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);
		
	}
}
