package com.mi.multitreading;

public class ThreadState extends Thread
{
	
	public static void main(String[] args) throws InterruptedException
	{
		Thread t1=Thread.currentThread();
		System.out.println(t1.getName());
		ThreadState ts=new ThreadState();
		System.out.println(ts.getState());
		System.out.println(ts.getState());
		ThreadState ts1=new ThreadState();
		System.out.println(ts1.getName());
		
		
	}
}