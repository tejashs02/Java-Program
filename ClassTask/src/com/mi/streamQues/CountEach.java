package com.mi.streamQues;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
//How to count each element/word from the String ArrayList in Java8?
public class CountEach 
{
	 public static void main(String[] args) 
	 {
		 List<String> al=Arrays.asList("Smith","Jagannath","Natraz","Smith","Mihir","James","Jagannath","Natraz");
		 
		 al.stream().collect(Collectors.groupingBy(w ->w,Collectors.counting()))
		 					.forEach((w,c)->System.out.println(w+" : "+c));
	 }
}
