package com.mi.streamBasics;

import java.util.Arrays;
import java.util.List;
/*
 * filter() 
 * - It filter elements based on condition
 * - Method prototype of filter(): Stream<T> filter(Predicate<? super T> predicate);
 * - It returns a Stream of elements filtered out from a memory based on condition
 */
public class Test7 
{
	public static void main(String[] args) 
	{

		List<Integer> l = Arrays.asList(103,200,19);
		l.stream().filter(n -> n >100).forEach(System.out::println);	
 	}
}
