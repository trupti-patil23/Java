package StringDemo;

public class MixingStrings {
	
	public static void main(String[] args) {
		System.out.println(winzip("Compass", "PASSport"));
	}

	private static String winzip(String str1, String str2) {
		String longer = null;
		String shorter = null;
		String result = "";
		
		if (str1.length() > str2.length()) {
			longer = str1.toUpperCase();
			shorter = str2.toLowerCase();
		} else {
			longer = str2.toUpperCase();
			shorter = str1.toLowerCase();
		}
		int size = shorter.length();
		int i = 0;

		while (size != 0) {
			result += String.valueOf(longer.charAt(i)) + String.valueOf(shorter.charAt(i));
			size--;
			i++;
		}
		result = result + longer.substring(shorter.length(), longer.length());
		
		return result;
	}
}
