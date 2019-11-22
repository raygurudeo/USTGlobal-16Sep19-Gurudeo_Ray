public class OverridingTest extends OverridingExample {

	@Override
	public void count() {
		
		System.out.println("count() method of child class.");
	}

	public static void main(String[] args) {

		OverridingExample oe = new OverridingExample();
		oe.count();
		
		OverridingTest ot = new OverridingTest();
		ot.count();
	}

}
