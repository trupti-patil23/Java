
package SystemIn;


import java.util.*;



public class ConsoleInput {
	
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		System.out.println("================================");
		System.out.println("Enter firstName: " );
		String firstName = sc.next();
		
		System.out.println("Enter LastName: " );
		String lastName = sc.next();
		
		System.out.println("Enter Age: " );
		int age= sc.nextInt();	
		
		System.out.println("Enter RollNo:");
		int rollNo = sc.nextInt();
			
		System.out.println("Student First Name: "+firstName);
		System.out.println("Student Last Name:"+lastName);
		System.out.println("Age:"+age);
		System.out.println("RollNumber"+rollNo);	
	}

}
