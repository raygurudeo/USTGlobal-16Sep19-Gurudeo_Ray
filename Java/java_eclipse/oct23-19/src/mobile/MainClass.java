package mobile;

public class MainClass {

	public static void main(String[] args) {

		Sony s = new Sony();
		s.homeScreen();
		System.out.println("----------");
		
		OnePlus op = new OnePlus();
		op.homeScreen();
		System.out.println("----------");
		
		Mi mi = new Mi();
		mi.homeScreen();
	}

}
