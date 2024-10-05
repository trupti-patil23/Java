package java_interview;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		int firstNo = 0,secondNo =1;	
		int n = 10;
		System.out.print(firstNo + " "+ secondNo+ " ");
		calcFib(firstNo, secondNo, n-2);
	}

	private static void calcFib(int firstNo, int secondNo, int term) {
		
		if(term == 0)
			return;
		
		int sum = firstNo + secondNo;
		
		System.out.print(sum+" ");
		term--;
		
		calcFib(secondNo, sum, term);		
	}

}
