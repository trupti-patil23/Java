package java_interview;

public class RemoveDuplicates {
	public static void main(String[] args) {
		
		String input = "aaabcdbcdeef";
		String result="";
		 result = removeDuplicate(input,0, result);
		 System.out.println(result);
	}

	private static String removeDuplicate(String input, int index, String result) {
		
		if(index==input.length()) {
			return result;
		}
		
		char currentChar = input.charAt(index);
		
		if(result.isBlank()) {
			result += currentChar;  //first char
		} else {
			if(!result.contains(Character.toString(currentChar))) {
				result += currentChar;
			}
		}
		return removeDuplicate(input,index+1,result);		
	}
}
