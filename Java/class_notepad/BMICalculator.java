class BMICalculator {

	public static void main(String[] args) {

		double weight = 60.5;
		double height = 5.7;
		double bmi = (weight / Math.pow(height, 2)) * 10;
		//System.out.println(bmi);
		
		if(bmi < 18.5) {

			System.out.println("You are in underweight.");
		}
		else if(bmi > 18.5 && bmi < 24.9) {

			System.out.println("You are in healthy weight");
		}
		else if(bmi > 24.9 && bmi < 29.9) {

			System.out.println("You are in overweight");
		}
		else {

			System.out.println("You are in obese weight range");
		}	
	}
}