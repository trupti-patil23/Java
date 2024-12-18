package designpattern.creational.singleton;

class Demo {
	private String name;
	private String Surname;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return Surname;
	}

	public void setSurname(String surname) {
		Surname = surname;
	}
	
	static Demo demo  = new Demo("Sam", "Thomas");
	
	private Demo(String name, String surname) {
		this.name = name;
		this.Surname = surname;
	}
	
	public static Demo getInstance() {
		
		return demo;
	}
	
	@Override
	public String toString() {
		return "Demo [name=" + name + ", Surname=" + Surname + "]";
	}
}

public class SingletonDemo {

	public static void main(String[] args) {
		
		Demo d = Demo.getInstance();		
		System.out.println(d.hashCode());
		System.out.println(d.getName() + "  " + d.getSurname());
		d.setName("Ram");
		d.setSurname("Raina");		
		
		Demo d1 = Demo.getInstance();
		System.out.println(d1.hashCode());
	
		System.out.println(d1.getName() + "  " + d1.getSurname());

	}

}
