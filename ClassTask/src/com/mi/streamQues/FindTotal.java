package com.mi.streamQues;

import java.util.Arrays;
import java.util.List;

//Given a list of integers, find the total number of elements present in the list using
//Stream functions?
public class FindTotal 
{
	public static void main(String[] args) 
	{
		List<Integer> nos=Arrays.asList(1,4,4,6,9,3,1,3);
		System.out.println(nos.stream().distinct().count()); //can't count duplicates elements
		System.out.println(nos.stream().count()); // Count duplicates also	
	
//		List<String> names=Arrays.asList("pear","banana","apple","grape");
//		names.stream().limit(2).sorted().forEach(System.out::println);
	
	}
}
