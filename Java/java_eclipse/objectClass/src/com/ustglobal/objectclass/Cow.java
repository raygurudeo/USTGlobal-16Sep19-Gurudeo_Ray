package com.ustglobal.objectclass;

public class Cow {

	int id;
	String name;
	int price;
	public Cow(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		Cow c = (Cow)obj;
		if(this.id == c.id) {
			if(this.name == c.name) {
				if(this.price == c.price) {
					return true;
				}
				else {
					return false;
				}
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
	
}
