
public class Employee {

	String name;
	int eid;
	
	public Employee() {}
	public Employee(String name, int eid) {
		this.name = name;
		this.eid = eid;
	}
	public void getDetails() {
		System.out.println(this.eid+" "+this.name);
	}

	public static void main(String[] args) {
		
		Employee e = new Employee();
		Employee e1 = new Employee("Rahul", 101);
		Employee e2 = new Employee("Rana", 102);
		Employee e3 = new Employee("Sonu", 103);
		e1.getDetails();
		e2.getDetails();
		e3.getDetails();
		
	}

}
