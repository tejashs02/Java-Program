package com.mi.streamBasics;

import java.util.stream.Stream;

public class Test3 
{
	public static void main(String[] args) 
	{
		Stream<String> stream=Stream.of("Alto800","Nano","Swift");
		stream.forEach(System.out::println);
	}
}
