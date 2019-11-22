class Operators {

	public static void main(String[] args) {

		int a = 10;
		double b = a;
		System.out.println("a is "+a);
		System.out.println("b is "+b);
		
		double c = 20.6;
		// int d = c;		//  Inompataible data type
		System.out.println("c is "+c);
		// System.out.println("d is "+d);
		
		int x = 10;
		double y = 28.7;
		double z = x + y;
		System.out.println("z is "+z);

		int p = 5/2;
		System.out.println("p is "+p);

		int j = 7;
		double k = 2.0;
		double l = j/k;			// operation of two lower and higher type data gives always higher data-type
		System.out.println("l is "+l);

	}
}