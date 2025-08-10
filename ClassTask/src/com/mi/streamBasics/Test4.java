package com.mi.streamBasics;

import java.util.stream.Stream;

public class Test4 
{
	public static void main(String[] args)
	{
		Stream<Double> stream=Stream.generate(Math::random).limit(10);
		stream.forEach(System.out::println);
	}
}
