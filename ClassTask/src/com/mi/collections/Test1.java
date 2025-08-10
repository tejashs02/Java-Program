package com.mi.collections;

import java.util.ArrayList;
import java.util.Iterator;
//Hello
public class Test1 
{
	public static void main(String[] args) 
	{
		/*ArrayList<Integer> al=new ArrayList<Integer>();
		System.out.println("Collection Created ");
		System.out.println("Collection is empty "+al.isEmpty());
		al.add(100);
		al.add(200);
		al.add(190);
		al.add(800);
		
		System.out.println("Elements are added into collection : ");
		// size() check the number of element in collection
		System.out.println("No of elements :"+al.size());
		// isEmpty(): check whether collection contains any elements
		System.out.println("Collection is empty : "+al.isEmpty());
		// contains checks wheather the passed object is available in empty
		System.out.println("Element 60 is availble "+al.contains(800));
		System.out.println("Element 60 is availble "+al.contains(10));
		
		// iterator: used to create cursor object and traverse through the collection
		@SuppressWarnings("rawtypes")
		Iterator itr=al.iterator();
		System.out.println("Elements in collection are: ");
		while(itr.hasNext())
		{
			Integer obj=(Integer)itr.next();
			System.out.println(obj);
		}
		
		Object arr[]=al.toArray();
		for(Object o:arr)
		{
			System.out.println(o);
		}*/
		
		//remove(int index): remove object from collection based on index if available 
		
		/*System.out.println("Removing elements at index 0");
		al.remove(0);
		//		al.remove(9); //IOBE
		System.out.println(al);
		
		//remove(Object o): remove object from collection based on passed object of available 
		System.out.println("Removing object 800: ");
		al.remove(new Integer(800));
		System.out.println(al);
		*/
		//addAll(): Add all the elements of a collection into another
		/*ArrayList<Integer> al2=new ArrayList<Integer>();
		al2.add(100);
		al2.add(20);
		al2.add(90);
		al2.add(800);
		System.out.println("Elements in al: "+al);
		System.out.println("Elements in al2: "+al2);
		System.out.println("Adding all elements of al2 to al");
		al.addAll( al2);
		System.out.println("Elements in al : "+al);
		System.out.println("Elemetns in al2: "+al2);
		*/
		//contains(): checks whether a collection contains all elements of another collection 
		/*System.out.println("al contains all elements of al2: "+al.containsAll(al2));
		System.out.println("Removing an elements (90) of al2 from al. ");
		al.remove(new Integer(90));
		System.out.println("Elements in al: "+al);
		System.out.println("al contains all elemts of al2 : "+al.containsAll(al2));
		System.out.println("Elements in al : "+al);
		System.out.println("Elemetns in al2: "+al2);
		*/
		
		//retainsAll(): keeps the matching elements and remove the other (but not the copy of collection got from addAll()
		/*System.out.println("Retaining elements in al: ");
		al.retainAll(al2);
		System.out.println("Elements in al : "+al);
		System.out.println("Elemetns in al2: "+al2);
		*/
		
		//removeAll(): matching elements and all elements of copy are removed
		/*System.out.println("Remove all elements of al2 which is available in al");
		al.removeAll(al2);
		System.out.println("Elements in al : "+al);
		System.out.println("Elemetns in al2: "+al2);
		*/
		//clear remove everything from the collection and make it empty
		
		/*System.out.println("Clearing elements from al .");
		al.clear();
		System.out.println("Elements in al : "+al);
		System.out.println("Elemetns in al2: "+al2);
		*/
		
		/*ArrayList<Integer> al3=new ArrayList<Integer>();
		al3.add(10);
		al3.add(20);
		al3.add(30);
		al3.add(40);
		al3.add(20);
		System.out.println("Elemetns in al3 : "+al3);
		System.out.println("Removing 20 from al3: ");
		al3.remove(new Integer(20));
		System.out.println("Elemetns in al3 : "+al3);
		*/
		
		ArrayList<Integer> al3=new ArrayList<Integer>();
		al3.add(101);
		al3.add(102);
		al3.add(103);
		al3.add(104);
		al3.add(105);
		System.out.println(al3);
		al3.removeIf(n->n%2==0);
		System.out.println("Elements after removing Even: "+al3);
	}
	
}

