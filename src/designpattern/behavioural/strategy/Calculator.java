package designpattern.behavioural.strategy;

//Create the context
public class Calculator {
	MathOperation mathOperation = null;

	public void setOperation(MathOperation mathOperation) {
		this.mathOperation = mathOperation;
	}
	
	public int calculate(int a, int b) {
		if(mathOperation == null) {
			System.out.println("No operation set");
		}
		return mathOperation.performOperation(a, b);		
	}
}
