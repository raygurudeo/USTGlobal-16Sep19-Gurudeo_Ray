class TestCow {
	
	public static void main(String[] args) {
		
		Cow c = new Cow();
		c.name = "Ganga";
		c.color = "White";
		System.out.println("Cow name is "+c.name);
		System.out.println("Cow color is "+c.color);
		c.eat();
		c.sleep();
	}
}