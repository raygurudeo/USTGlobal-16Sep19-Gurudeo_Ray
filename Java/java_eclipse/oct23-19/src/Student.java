public class Student {

	String name;
	int rollNo;
	final String clgName = "IES";
	final int clgId;
	
	public Student(String name, int rollNo, int clgId) {
		this.name = name;
		this.rollNo = rollNo;
		this.clgId = clgId;
	}
	
	final void printDetails() {
		System.out.println("Hi "+name+" welcome to "+clgName);
	}
	final void printDetails(String name) {
		System.out.println("Hi "+name+" welcome to "+clgName);
	}
	
}

