package rough;

import java.util.stream.Stream;

public class Factorial 
{
	public static long multiplyFactorial(int num)
	{
		// Factorial no using recursion
		/*if(num >= 1)
			return num*(multiplyFactorial(num-1));
		
		return 1;*/
		
		// Without using recursion
		/*long factorial=1;
		for(int i=1;i<=num;i++)
		{
			factorial*= i;
		}
		return factorial;*/
		
		//Using Stream
		
		return Stream.iterate(1,n->n+1).limit(num).reduce(1, (a,b)->a*b);
	}
	public static void main(String[] args) 
	{
		int no=5;
		long fact=multiplyFactorial(no);		
		System.out.println("Factorial of "+no+" is : "+fact);
	}
}
