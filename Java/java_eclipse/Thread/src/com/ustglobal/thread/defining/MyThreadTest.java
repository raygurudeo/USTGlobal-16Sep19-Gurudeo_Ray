package com.ustglobal.thread.defining;

public class MyThreadTest {

	public static void main(String[] args) {

		System.out.println("Main started");
		
		MyThread mt = new MyThread();
		/*
		 *  mt.run();  -> don't call run() program would behave normal not as multithreading.
		 *  all code will execute inside main thread only
		 *  
		 *  */
		mt.start();
		
//		mt.start();		IllegalTreadStateException
		
		for(int i = 0; i<5; i++) {
			
			System.out.println("Main thread");
		}
		
		System.out.println("Main ended");
	}

}
