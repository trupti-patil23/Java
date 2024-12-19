package designpattern.behavioural.strategy;

public class StrategyPatternBasicExample {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();

		// Perform addition
		calculator.setOperation(new Addition());
		System.out.println("Addition: " + calculator.calculate(27, 9));

		// Perform subtraction
		calculator.setOperation(new Subtraction());
		System.out.println("Subtraction: " + calculator.calculate(27, 9));

		// Perform multiplication
		calculator.setOperation(new Multiplication());
		System.out.println("Multiplication: " + calculator.calculate(27, 9));

	}

}
