package com.mi.streamtasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FirstLetterCaptital 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of String: ");
		int no=sc.nextInt();
		List<String> wor=new ArrayList<String>();
		for(int i=1;i<=no;i++)
		{
			System.out.print ("Enter String "+i+": ");
			String word=sc.next();
			wor.add(word);
		}
		wor.stream().map(s->s.substring(0,1).toUpperCase()+s.substring(1)).collect(Collectors.toList()).forEach(System.out::println);
	}
}
