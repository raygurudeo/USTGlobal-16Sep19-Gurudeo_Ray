package com.ustglobal.thread.pausing;

public class MyJoinThreadTest {

	public static void main(String[] args) {
		
		System.out.println("Main started");

		MyJoinThread mjt = new MyJoinThread();
		mjt.start();
		try {

			mjt.join(10000);

		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		for(int i=0; i<10; i++) {

			System.out.println("Main thread");
		}
		
		System.out.println("Main ended");
	}

}
