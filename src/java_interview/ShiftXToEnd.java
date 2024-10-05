package java_interview;

public class ShiftXToEnd {
	static String input = "axbxcxxdx";
	static int inputLength = input.length();
	static char element = 'x';
	static String result = "";
	static  String XString = "";
	
	public static void main(String[] args) {
		
		int index =0;
		shift(index);
		System.out.println("Final ->"+ result.concat(XString));		
	}

	private static void shift(int index) {
		
		if(index == inputLength)
			return;
		
		char currentChar = input.charAt(index);	
		
		if(currentChar == element) {
			XString += currentChar;
		} else {
			result += currentChar;
		}			
		shift(index+1);
	}
}
