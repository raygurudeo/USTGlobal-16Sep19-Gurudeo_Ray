package interfaceEx;

public class TestAutomobile {

	public static void main(String[] args) {

		BMW a = new BMW();
		a.gear();
		a.gps();
		a.abs();
		System.out.println("-----------");
		
		Automobile a1 = new Toyota();
		a1.gear();
		a1.gps();
	}

}
