package com.ustglobal.abstraction;

public class Test {

	public static void main(String[] args) {

		Machine m = new Machine();
		
		HDFC h = new HDFC();
		m.slot(h);
		System.out.println("---------");
		
		ICICI i = new ICICI();
		m.slot(i);
		System.out.println("---------");
		
		SBI s = new SBI();
		m.slot(s);
		
	}

}
