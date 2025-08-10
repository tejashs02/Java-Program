package com.mi.streamtasks;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNo 
{
	public static void main(String[] args) {
		List<Integer> nos=Arrays.asList(101,302,701,404,507,402);

		nos.stream().filter(n->n%2==0).collect(Collectors.toList()).forEach(System.out::println);
	}
}
