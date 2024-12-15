package Cloning;


class Person implements Cloneable {
	String name;
	int age;
	Address address;

	public Person(String name, int age,  Address address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address.city + "]";
	}
}

public class ShallowClone {

	public static void main(String[] args) {
		Person original = new Person("Trupti", 30, new Address("Canada"));			
		System.out.println("Original Object before: " + original);
		
		try {
			Person cloned = (Person) original.clone(); // Default Shallow copy
			cloned.name = "Riaan";
			cloned.address.city = "Seattle";
			
			
			System.out.println("Original Object after: " + original);
			System.out.println("Cloned object " + cloned);
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
