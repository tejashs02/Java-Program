package com.mi.streamtasks;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted 
{
	public static void main(String[] args) {
		List<Integer> nos=Arrays.asList(101,302,701,404,507,402);
		nos.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);
		System.out.println();
		nos.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).forEach(System.out::println);

	
	}
}
