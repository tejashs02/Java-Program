package com.mi.streamQues;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
// 1. Given a list of integers, find out all the even numbers that exist in the list using
public class FindEvenInGivenInteger
{
	public static void main(String[] args) 
	{
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> even=numbers.stream().filter(n -> n % 2==0).collect(Collectors.toList());
		System.out.println("Even Numbers :"+even);
		 
//		  Stream.iterate(1, n->n+2).limit(5).forEach(System.out::println); // ODDS no.
		  Stream.iterate(2, n->n+2).limit(5).forEach(System.out::println); // Even No.
	}
}
