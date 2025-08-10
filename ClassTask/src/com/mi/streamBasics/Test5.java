package com.mi.streamBasics;

import java.util.regex.Pattern;

public class Test5 
{
	public static void main(String[] args) 
	{
		String sen="Java is easy to learn only if you visualize";
		Pattern.compile(" ").splitAsStream(sen).forEach(System.out::println);
	}
}
