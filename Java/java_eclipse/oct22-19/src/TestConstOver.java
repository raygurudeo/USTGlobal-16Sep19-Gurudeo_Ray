
public class TestConstOver {

	public static void main(String[] args) {

		ConstructorOverloading  c = new ConstructorOverloading(101, "Rahul");
		System.out.println(c);
		ConstructorOverloading c2 = new ConstructorOverloading("Sonu",102);
		System.out.println(c2);
		ConstructorOverloading c3 = new ConstructorOverloading("Guru", 103, 84578999);
		System.out.println(c3);
	}

}
