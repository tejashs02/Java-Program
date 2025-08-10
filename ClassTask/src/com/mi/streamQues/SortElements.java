package com.mi.streamQues;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//  Given a list of integers, sort all the values present in it using Stream functions?
public class SortElements 
{
	public static void main(String[] args) 
	{
		// Sorting in Ascending Order
		System.out.println("Ascending order");
		List<Integer> nos=Arrays.asList(1,10,9,5,3,8);
		nos.stream().sorted().forEach(n->System.out.print(n+" "));
	
		//Sorting in Descending Order
		System.out.println("\nDescending Order");
		nos.stream().sorted(Comparator.reverseOrder()).forEach(n->System.out.print(n+" "));
	}
}
