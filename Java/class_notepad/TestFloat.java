class TestFloat {

	public static void main(String[] args) {

		int a = 10;
		int b = 5;
		int c = 8;
		int result = a > b && a > c ? a : (b > c ? b : c);
		System.out.println(result);
	}
}