package com.mi.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.stream.Stream;

public class RetrivingElements 
{
	public static void main(String[] args) {
	ArrayList<String> al =new ArrayList<String>();	
	al.add("Tiger");
	al.add("Lion");
	al.add("Elephant");
	al.add("Giraffe");
	al.add("Dog");
	System.out.println("1.Retriving directly: ");
	System.out.print(al);
	
	System.out.println("\n\n2.Retriving By using iterator: ");
	Iterator<String> i=al.iterator();
	while(i.hasNext())
		System.out.print(i.next()+" ");
	
	System.out.println("\n\n3.Retriving By using forEach: ");
	
	for(String s:al)
		System.out.print(s+" ");

	System.out.println("\n\n4.Retriving using list iterator: ");
	ListIterator<String> ll=al.listIterator();
	while(ll.hasNext())
		System.out.print(ll.next()+" ");
	
	System.out.println("\n\n5Retriving using for loop: ");
	
	for(int j=0;j<al.size();j++)
		System.out.print(al.get(j)+" ");
	
	System.out.println("\n\n6.Using Foreach");
	al.forEach(n-> System.out.print(n+" "));

	System.out.println("\n\n7.Using Foreach");
	Stream<String> s=al.stream();
	s.forEach(n->System.out.print(n+" "));
	
	System.out.println("\n\n8.Retriving with support of splitIterator");
	
	Spliterator<String> sl=al.spliterator();
	sl.forEachRemaining(a->System.out.print(a+" "));
	
	System.out.println("\n\n9.Printing by taking support of splititerator -tryadvance()");
	Spliterator<String> sll=al.spliterator();
	while(sll.tryAdvance(a->System.out.print(a+" ")));
	
	}
	
}


