package com.mi.streamQues;

import java.util.Arrays;
import java.util.List;

// Given a list of integers, find the maximum value element present in it using Stream functions?
public class FindMax {

	public static void main(String[] args) 
	{
			List<Integer> nos=Arrays.asList(1,4,56,8,6,2,0);
			nos.stream().max(Integer::compare).ifPresent(System.out::print);
	}

}
