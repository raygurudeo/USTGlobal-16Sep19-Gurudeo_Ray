
public class Person {

	String name;
	int age;
	public Person() {
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
//		System.out.println(this.age);
	}

	public static void main(String[] args) {

		Person p1 = new Person();
		Person p2 = new Person("Rahul", 23);
	}

}
