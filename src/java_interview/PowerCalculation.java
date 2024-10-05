package java_interview;

public class PowerCalculation {

	public static void main(String[] args) {
		int base = 2; //base
		int power = 4; //power
		
		int result = calcPower(base, power);
		System.out.println("Total :"+result);
	}

	private static int calcPower(int base, int power) {
		int result = 1;
		if(power == 0) 
			return 1;
			
		if(base ==0)
			return 0;
		return result = base * calcPower(base, power-1);		
	}

}
