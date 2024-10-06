package StringDemo;

import java.util.*;

public class IntStringPart1 {

	public static void main(String[] args) {

		String input = "abcddfabcde";

		int length = input.length();
		ArrayList<String> finalStr = new ArrayList<>();

		for (int i = 0; i < length - 1; i++) {
			String s1 = null;

			while (i < length - 1 && input.charAt(i) != input.charAt(i + 1)) {

				if (s1 == null) {
					s1 = String.valueOf(input.charAt(i)) + String.valueOf(input.charAt(i + 1));
				} else {
					s1 = s1 + String.valueOf(input.charAt(i + 1));
				}

				i++;
			}

			System.out.println("i value " + i);
			finalStr.add(s1);
		}
		System.out.println("Arraylist " + finalStr);

		int maxLength = 0;
		String finalString = "";
		Iterator<String> itr = finalStr.iterator();
		while (itr.hasNext()) {
			String result = (String) itr.next();
			if (maxLength < result.length()) {
				maxLength = result.length();
				finalString = result;
			}
		}
		System.out.println("\nLongest String is = " + finalString + " whose length =  " + maxLength);
	}
}
