package com.ustglobal.sorting.list;

public class Pen implements Comparable<Pen> {

	double price;
	String brand;
	
	public Pen(double price, String brand) {
		super();
		this.price = price;
		this.brand = brand;
	}
	
	@Override
	public int compareTo(Pen p) {
		
		Double i = this.price;
		Double j = p.price;
		
		return i.compareTo(j);
	}
	
//	@Override
//	public int compareTo(Pen p) {
//		
//		String i = this.brand;
//		String j = p.brand;
//		
//		return i.compareTo(j);
//	}
}
