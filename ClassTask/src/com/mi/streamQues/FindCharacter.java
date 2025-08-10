package com.mi.streamQues;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
// Given a String, find the first non-repeated character in it using Stream functions?
public class FindCharacter 
{
	public static void main(String[] args) {
		String str = "seccess";
//		Character result=
                IntStream.range(0, str.length())
                .mapToObj(i -> str.charAt(i))
                .filter(c -> str.indexOf(c) == str.lastIndexOf(c))
                .findFirst()
                .ifPresentOrElse(System.out::println,() -> System.out.println("All Characters are repeated "));
//                .forEach(System.out::println);
//                .orElse(null).ifPresent(System.out::println);
//        System.out.println(result);
        
 // Given a String, find the first repeated character in it using Stream functions?
	/* IntStream.range(0,str.length())
	.mapToObj(i -> str.charAt(i))
	.filter(c -> str.indexOf(c) != str.lastIndexOf(c))
	.findFirst().ifPresent(System.out::println);
	
	// All repeated characters     
	List<Character> repeted=IntStream.range(0,str.length())
	.mapToObj(i -> str.charAt(i))
	.filter(c -> str.indexOf(c) != str.lastIndexOf(c)).distinct()
	.collect(Collectors.toList());
	System.out.println("Repeated characters "+repeted);*/
	}
}
