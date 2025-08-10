package com.mi.streamQues;

import java.util.Arrays;
import java.util.List;
// Given the list of integers, find the first element of the list using Stream functions?
public class FindFirstElement 
{
	public static void main(String[] args) 
	{
		 List<Integer> nos=Arrays.asList(4,5,6,1,5,7);
		 
		 nos.stream().findFirst().ifPresent(n->System.out.println("First Element : "+n));
		 nos.stream().findAny().ifPresent(n->System.out.println("Any Element : "+n));

		 int last=nos.stream().reduce((first,second)->second).orElse(null);
		 System.out.println("Last element: "+last);
	}
}
