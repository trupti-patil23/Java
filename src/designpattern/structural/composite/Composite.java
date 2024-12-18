package designpattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements ComputerComponent {
	String name;
	
	List<ComputerComponent> list = new ArrayList<ComputerComponent>();
	
	public Composite(String name) {		
		this.name = name;
	}

	@Override
	public void showPrice() {
		System.out.println(this.name);
		for(ComputerComponent cc :list) {	
			cc.showPrice();
		}
	}
	
	public void addComponent(ComputerComponent component) {
		list.add(component);
	}

}
