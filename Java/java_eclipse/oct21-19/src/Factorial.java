
public class Factorial {

	public static void main(String[] args) {
		
		System.out.println("Factorial of 5 = "+factorial(5));
	}
	static int factorial(int n) {
		
		return (n == 0)?1:n * factorial(n-1);
	}

}
