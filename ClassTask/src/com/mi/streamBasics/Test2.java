package com.mi.streamBasics;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;
// We can use same stream reference once it is closed
public class Test2 
{
	public static void main(String[] args) 
	{
		int arr[]= {10,20,50,30,10,40,90};
		IntStream s=Arrays.stream(arr);
		s.forEach(System.out::println);
//		Arrays.stream(arr).forEach(System.out::println);
		
		String str[]= {"Java","AWS","C","DSA","Devops"};
		Stream<String> a=Arrays.stream(str);
		a.forEach(System.out::println);
//		Arrays.stream(str).forEach(System.out::println);
		
	}
}
