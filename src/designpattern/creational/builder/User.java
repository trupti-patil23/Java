package designpattern.creational.builder;

public class User {
    // Required fields
    private final String firstName;
    private final String lastName;
    private final String email;

    // Optional fields 
    private final int age;
    private final String phoneNumber;
    private final String address;

    // Private constructor to enforce the use of the builder
    private User(String firstName, String lastName, String email, int age, String phoneNumber, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
    
 // Factory method to create a User instance using the builder
    public static User createUser(UserBuilder builder) {
        return new User(builder.getFirstName(), builder.getLastName(),builder.getEmail(), builder.getAge(), builder.getPhoneNumber(), builder.getAddress());
    }
   
    @Override
    public String toString() {
        return "User [firstName=" + firstName + ", lastName=" + lastName +
               ", email=" + email + ", age=" + age + 
               ", phoneNumber=" + phoneNumber + ", address=" + address + "]";
    }
}

