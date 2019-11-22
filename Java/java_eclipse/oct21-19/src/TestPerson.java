
public class TestPerson {

	public static void main(String[] args) {
		
		Person p = new Person();
		p.name = "Rahul";
		p.age = 23;
		Person.color = "White";
		System.out.println("Color : "+Person.color);
		Person.sleep();
	}

}
