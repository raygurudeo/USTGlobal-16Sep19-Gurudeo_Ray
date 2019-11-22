package com.ustglobal.objectclass;

public class TestCar {

	public static void main(String[] args) {

		Car c = new Car(500000, "BMW", "Black");
		System.out.println("Car cost: "+c.hashCode());
		System.out.println(c);
		
		Car c1 = new Car(200000, "Hundai", "Black");
		System.out.println("Car cost: "+c1.hashCode());
		System.out.println(c1);
		
		Car c2 = new Car(400000, "Audi", "Black");
		System.out.println("Car cost: "+c2.hashCode());
		System.out.println(c2);
		
	}

}
