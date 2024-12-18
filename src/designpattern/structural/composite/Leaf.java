package designpattern.structural.composite;

public class Leaf implements ComputerComponent   {
	String name;
	int price;	
	
	public Leaf(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public void showPrice() {
		System.out.println(this.name + " : " + this.price);		
	}

}
