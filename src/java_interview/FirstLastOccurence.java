package java_interview;

public class FirstLastOccurence {
	
	public static int firstIndex = -1;
	public static int lastIndex = -1;
	public static char element = 'a';
	public static String input = "babcbbccab"; 
			
	public static void main(String[] args) {
		int index =0;
		checkOccurence(0);
		System.out.println("first Occurenec -> "+firstIndex);
		System.out.println("Last Occurenec -> "+lastIndex);		
	}

	private static void checkOccurence(int index) {
		
		if(index == input.length())
		return;
		
		char currentChar = input.charAt(index);		
		if(currentChar == element) {
			if(firstIndex == -1) {
				firstIndex = index;
			} else {
				lastIndex = index;
			}		
		}	
		checkOccurence(index+1);
	}
	}
