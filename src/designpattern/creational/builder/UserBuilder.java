package designpattern.creational.builder;

public class UserBuilder {
	// Required fields
	private final String firstName;
	private final String lastName;
	private String email;

	// Optional fields with default values
	private int age = 0;
	private String phoneNumber = "";
	private String address = "";

	// Constructor for required fields
	public UserBuilder(String firstName, String lastName, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	public int getAge() {
		return age;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	// Setter methods for optional fields
	public UserBuilder setAge(int age) {
		this.age = age;
		return this;
	}

	public UserBuilder setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		return this;
	}

	public UserBuilder setAddress(String address) {
		this.address = address;
		return this;
	}
}