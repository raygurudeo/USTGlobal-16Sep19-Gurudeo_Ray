package com.ustglobal.thread.properties;

public class MyThread extends Thread {

	public static void main(String[] args) {
		
		System.out.println("Main started");
		String tname = Thread.currentThread().getName();
		System.out.println("Current thread : "+tname);
		
		MyThread mt = new MyThread();
		String mName = mt.getName();
		System.out.println("My thread name : "+mName);
		
		Thread.currentThread().setName("Bala");
		
		mt.setName("Golu");
		System.out.println("My thread name : "+mt.getName());
		
		
		System.out.println(10/0);
		
		System.out.println("Main ended");
	}
}
