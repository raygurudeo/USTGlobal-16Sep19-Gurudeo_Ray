
public class SubClass extends SuperClass {

	String s = "sub class variable.";
	public SubClass() {
//		super(); ->> if we don't mention super() compiler will add automatically.
		System.out.println("Sub class constructor.");
	}
	
	void getData() {
		System.out.println(s);
		System.out.println(this.s);
		System.out.println(super.s);
		super.superClassMethod();
		superClassMethod();
	}
}
