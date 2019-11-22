class TestA {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		int c = a++ + b;
		System.out.println("C is "+c);	// c = 30, a = 10
		System.out.println("a is "+a);	// a = 11
	}
}