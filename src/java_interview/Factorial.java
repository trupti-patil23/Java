package java_interview;

/**
 * The factorial of a number n is the product of all positive integers less than or equal to n. 
 * It is denoted as n!. 5! = 5 * 4 * 3 * 2 * 1 = 120
 */
public class Factorial {
	public static void main(String[] args) {
		int n = 6;
		int result = calcFactorial(n);
		System.out.println(result);
	}

	private static int calcFactorial(int n) {	
		if(n==1 || n==0) {
			return 1;
		}		
		return  n * calcFactorial(n-1);	
	}
}
