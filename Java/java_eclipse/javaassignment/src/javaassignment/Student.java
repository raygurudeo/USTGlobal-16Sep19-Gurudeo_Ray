package javaassignment;

public class Student {

	int rollNo;
	String name;
	double percentage;
	
	public Student(int rollNo, String name, double percentage) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "[rollNo=" + rollNo + ", name=" + name + ", percentage=" + percentage + "]";
	}
	
	
}
