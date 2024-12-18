package designpattern.creational.builder;

public class RegisterUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User user1 = User
				.createUser(new UserBuilder("Trupti", "Patil", "trupti@gmail.com").setAddress("Burnaby").setAge(40));

		System.out.println("USer created :" + user1);

	}

}
