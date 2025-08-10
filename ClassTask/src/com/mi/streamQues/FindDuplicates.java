package com.mi.streamQues;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

// How to find duplicate elements in a given integers list in java using Stream functions?
public class FindDuplicates 
{
	public static void main(String[] args) 
	{
		List<Integer> nos=Arrays.asList(1,5,6,6,2,5,1);
		List<Integer> dup=nos.stream()
										.filter(n-> Collections.frequency(nos,n)>1)
										.distinct().collect(Collectors.toList());
		System.out.println("Duplicates are: "+dup);
	}
}
