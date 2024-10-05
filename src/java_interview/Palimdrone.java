package java_interview;

public class Palimdrone {

	public static void main(String[] args) {

		String input = "MADAM" ; //"123321";
		int length = input.length();

		int mid = (length % 2 == 0) ? length / 2 : (length + 1)/2;

		String secondHalf = input.substring(mid);
		int secLength = secondHalf.length();
		int i = 0;
		boolean flag = true;
		while (i < mid && secLength > 0) {
			char ch1 = input.charAt(i);
			char ch2 = secondHalf.charAt(--secLength);		
			if (ch1 != ch2) {
				flag = false;				
				break;
			}
			i++;
		}

		if (flag) {
			System.out.println("String is Palindrome");
		} else {
			System.out.println("String is not Palindrome");
		}

	}

}
