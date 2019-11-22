package com.ustglobal.thread.pausing;

public class TestMyThread {

	public static void main(String[] args) {

		System.out.println("Main started");
		
		MyThread mt = new MyThread();
		mt.start();
		
		for(int i = 0; i<10; i++) {
			
			System.out.println("main thread");
		}
		
		System.out.println("Main ended");
	}

}
