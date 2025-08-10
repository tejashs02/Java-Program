package com.mi.streamtasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringUpper 
{
	
		public static void main(String[] args) {
			List<String> names=Arrays.asList("nataraz","kishan","hari kishan","jagannath","ajay");
			names.stream().map(String::toUpperCase).forEach(System.out::println);
		}
}
