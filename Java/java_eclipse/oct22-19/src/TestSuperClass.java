
public class TestSuperClass {

	final void add() {
		System.out.println("add() method");
	}
	final void add(int a) {
		System.out.println("add(int a) method");
	}
	public static void main(String[] args) {

		SuperClass sc = new SuperClass();
		SubClass sub = new SubClass();
		
		SubClass sb = new SubClass();
		sb.getData();
	}
	
}
