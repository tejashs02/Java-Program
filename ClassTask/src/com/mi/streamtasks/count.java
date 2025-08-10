package com.mi.streamtasks;

import java.util.Arrays;
import java.util.List;

public class count 
{
	public static void main(String[] args) 
	{
		List<Integer> nos=Arrays.asList(10,20,75,90,15,80);
		long no=nos.stream().filter(n->n>50).count();
		System.out.println("No of element that 50 : "+no);
	}
}
