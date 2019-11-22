
public class TestA {

	public static void add(int a, int b) {
		System.out.println("1st add method.");
	}
	public long add(int a, long b) {
		System.out.println("2nd add method.");
		return a+b;
	}
	public int mul(int a, int b) {
		System.out.println("1st mul method.");
		return a*b;
	}
	public static int mul(int a, int b, int c) {
		System.out.println("1st mul method.");
		return a*b*c;
	}
	public static void main(String[] args) {

		System.out.println("Main main() method.");
		main(10);
		add(10, 2);
		add(10, 1245547888);
		TestA t = new TestA();
		t.mul(10, 4);
	}
	public static void main(int a) {

		System.out.println("2nd main method");
	}
}
