package com.mi.streamtasks;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DisplaynamesStartwithA 
{
	
public static void main(String[] args) {
	List<String> names=Arrays.asList("Aladin","ak","Anild","agannath","Ajay");
	names.stream().filter(n->n.startsWith("A")&&n.length()>4).collect(Collectors.toList()).forEach(System.out::println);
}
}
