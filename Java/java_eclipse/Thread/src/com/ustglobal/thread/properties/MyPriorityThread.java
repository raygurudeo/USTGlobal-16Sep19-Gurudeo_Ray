package com.ustglobal.thread.properties;

public class MyPriorityThread extends Thread {

	public static void main(String[] args) {

		System.out.println("Main started");
		
		// By default priority of main and child thread is 5 given by JVM
		int p = Thread.currentThread().getPriority();
		System.out.println("Main thread priority : "+p);
		
		/*
		 * Child thread should have same priority as main thread. If we set priority of
		 * main thread then child thread priority automatically changed
		 */
		Thread.currentThread().setPriority(7);
		System.out.println("Main thread priority : "+Thread.currentThread().getPriority());
		
		MyPriorityThread mpt = new MyPriorityThread();
		int q = mpt.getPriority();
		System.out.println("MyPriorityThread priority : "+q);
		
		mpt.setPriority(6);		// we can change child thread priority
		System.out.println("MyPriorityThread priority : "+mpt.getPriority());
		
		System.out.println("Main ended");
	}

}
