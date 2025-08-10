package com.mi.streamBasics;

import java.util.stream.Stream;

public class Test6 
{	
	public static void main(String[] args) 
	{
//		Stream.iterate(1, n->n+2).limit(5).forEach(System.out::println);
//		System.out.println();
//		Stream.iterate(1, n->n+1).limit(10).forEach(System.out::println);
		// code update after Java 9 without limit()
		
		Stream.iterate(1,n->n<=10,n->n+2).forEach(System.out::println);
	
		
		
	}
}
