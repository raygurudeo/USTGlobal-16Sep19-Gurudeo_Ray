class BMI {

	public static void main(String[] args) {

		double weight = 60;
		double height = 173.7;
		double bmi = weight / Math.pow(height, 2);
		System.out.println("Our BMI is = "+bmi);
	}
}