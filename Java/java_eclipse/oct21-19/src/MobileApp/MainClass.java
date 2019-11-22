package MobileApp;

public class MainClass {

	public static void main(String[] args) {

		FirstGen f = new FirstGen();
		f.call();
		f.msg();
		
		System.out.println("==============");
		SecondGen s = new SecondGen();
		s.call();
		f.msg();
		s.games();
		
		System.out.println("==============");
		ThirdGen mob = new ThirdGen();
		mob.call();
		mob.msg();
		mob.games();
		mob.camera();
	}
}
