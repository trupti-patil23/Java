package StringDemo;

import java.util.Scanner;

public class AnagramsDemo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");

	}

	static boolean isAnagram(String a, String b) {

		if (a.length() != b.length())
			return false;

		a = a.toLowerCase();
		b = b.toLowerCase();

		for (int i = 0; i < a.length(); i++) {
			String temp = a.substring(i, i + 1);
			b = b.replaceFirst(temp, "");
		}

		if (b.isEmpty())
			return true;
		else
			return false;

	}

}
