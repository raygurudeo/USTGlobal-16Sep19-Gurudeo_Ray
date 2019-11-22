class TestC {

	public static void main(String[] args) {

		int marks = 84;
		if(marks >= 75) {

			System.out.println("First division with honours.");
		}
		else if(marks >= 60) {

			System.out.println("First division.");
		}
		else if(marks >= 45) {

			System.out.println("Second division.");
		}
		else if(marks >= 30) {

			System.out.println("Third division.");
		}
		else {
	
			System.out.println("Fail");
		}
	}
}