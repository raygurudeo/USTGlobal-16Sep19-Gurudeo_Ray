package Calculator;

public class MainClass {

	public static void main(String[] args) {

		Calculator c = new Calculator();
		c.add();
		c.mul();
		
		ScientificCalculator sc = new ScientificCalculator();
		sc.sin();
		sc.cos();
		sc.add();
		sc.mul();
	}

}
