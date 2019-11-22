class AreaOfCircle {

	public static void main(String[] args) {

		int r = 14;
		System.out.println("Area of circle is = "+areaOfCircle(r));
		System.out.println("Circumfrence of circle is = "+circumfrenceOfCircle(r));
		System.out.println("14 is a even number "+oddOrEven(r));
		System.out.println("Factorial of 5 = "+factorial(5));
	}
	static double areaOfCircle(int r) {

		return 3.14 * Math.pow(r, 2);l
	}
	static double circumfrenceOfCircle(int r) {

		return 2 * 3.14 * r;
	}
	static boolean oddOrEven(int a) {

		return (a%2 == 0)?true:false;
	}
	int fact = 1;
	static int factorial(int n) {
		
		return (n == 0)?1:n * factorial(n-1);
	}
}