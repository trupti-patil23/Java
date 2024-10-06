package StringDemo;

public class StringDemo {

	public static void main(String[] args) {

		String s1 = "abc";
		String s2 = "abc";

		// It proves StringPooling as it gives same hashcode
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

		// String objects are immutable
		String s = "Hello";
		System.out.println("Before concat :" + s);
		s.concat(" world");
		System.out.println("After concat :" + s);

		// you have to assign variable to new String object (Hello World)
		String s4 = s.concat(" world");
		System.out.println("S points to  :" + s);
		System.out.println("S4 points to : " + s4);

		String str = "abc"; // This assignment will take object from StringPool
		// This will create new oject having value "abc"/JVM will give new memory
		// location to this object
		String str1 = new String("abc");

		System.out.println(s1 == s2); // Returns true
		System.out.println(str == str1); // it returns false
		System.out.println(str.equals(str1)); // returns true

		String StrName = "MyIndia";
		System.out.println(StrName.substring(2)); // India
		System.out.println(StrName.substring(2, 5)); // Ind BeginIndex 0 based, End Index 1 based

	}
}
