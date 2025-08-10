package com.mi.streamtasks;

import java.util.Arrays;
import java.util.List;

public class NegativeNo 
{
	public static void main(String[] args) 
	{
		List<Integer> nos=Arrays.asList(10,90,40,40,-20,-10);
	    boolean	 res=nos.stream().anyMatch(n->n<0);
	    System.out.println("Negative nos availables: "+res);
	}
}
