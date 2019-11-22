package Education;

public class MainStudent {

	public static void main(String[] args) {

		Student.clgName = "IES College";
		Student s = new Student();
		s.name = "Rahul";
		s.id = 101;
		System.out.println("College name is "+Student.clgName);
		System.out.println("Name is "+s.name);
		System.out.println("Id is "+s.id);
	}
}
