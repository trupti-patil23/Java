package Cloning;

class Person1 implements Cloneable {
	String name;
	int age;
	Address address;

	public Person1(String name, int age, Address address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		Person1 cloned = (Person1) super.clone();
		cloned.address = (Address) address.clone(); // Deep clone address
		return cloned;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address.city + "]";
	}
}

public class DeepClone {

	public static void main(String[] args) {
		Person1 original = new Person1("Trupti", 30, new Address("Canada"));
		System.out.println("Original Object before: " + original);

		try {
			Person1 cloned = (Person1) original.clone(); // Default Shallow copy
			cloned.name = "Riaan";
			cloned.address.city = "Seattle";

			System.out.println("Original Object after: " + original);
			System.out.println("Cloned object: " + cloned);

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
