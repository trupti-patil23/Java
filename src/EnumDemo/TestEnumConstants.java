package EnumDemo;

public class TestEnumConstants {
	
	
enum colour {RED, WHITE, BLUE};

public static void main(String[] args) {
		
		System.out.println("\n ENUM Constants from ENUM class");
		// toString() method is implicit in ENUM type class
		System.out.println("Credit Constant :  "+PaymentType.CREDITCARD);
		System.out.println("Debit Constant :  "+PaymentType.DEBITCARD);
		System.out.println("Cash Constant :  "+PaymentType.lmlm);
		
		System.out.println("\n ENUM Constants from another class");
		System.out.println(CreateEnum.LevelType.HIGH);
		System.out.println(CreateEnum.LevelType.LOW);
		System.out.println(CreateEnum.LevelType.MEDIUM);
	
		
		System.out.println("\n ENUM declared from same class");
		System.out.println(colour.RED);
		System.out.println(colour.WHITE);
		System.out.println(colour.BLUE);
	}

}
