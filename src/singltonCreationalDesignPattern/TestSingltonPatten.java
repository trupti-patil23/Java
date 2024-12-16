package singltonCreationalDesignPattern;

public class TestSingltonPatten {

	public static void main(String[] args) {
		Demo d = Demo.getInstance();
		System.out.println(d.hashCode());
		System.out.println(d.getName() + "  " + d.getSurname());
	}
}
