package com.mi.streamQues;

import java.util.Arrays;
import java.util.Comparator;
//Write a Java 8 program to sort an array and then convert the sorted array into Stream?
public class SortArrayAndConvertStream 
{
	public static void main(String[] args) 
	{
		int arr[]= {5,2,1,66,22,3,6};
		Arrays.sort(arr);
		Arrays.stream(arr).forEach(System.out::println);
		Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}
}
