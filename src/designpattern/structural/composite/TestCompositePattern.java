package designpattern.structural.composite;

public class TestCompositePattern {

	public static void main(String[] args) {
		ComputerComponent mouse = new Leaf("Mouse", 500);
		ComputerComponent keypad = new Leaf("Keypad", 1000);
		ComputerComponent hardDrive = new Leaf("HardDrive", 3000);
		ComputerComponent CPU = new Leaf("CPU", 3000);
		ComputerComponent RAM = new Leaf("RAM", 2000);
		
		Composite ph = new Composite("PeriPheral Devices");
		Composite mb = new Composite("Motherboard");
		Composite comp = new Composite("Computer");
		Composite cabinate = new Composite("Cabinate");
		
		ph.addComponent(mouse);
		ph.addComponent(keypad);		
		mb.addComponent(CPU);
		mb.addComponent(RAM);
		cabinate.addComponent(mb);
		cabinate.addComponent(hardDrive);
		
		comp.addComponent(cabinate);
		comp.addComponent(ph);
		
		mouse.showPrice();
		RAM.showPrice();
		ph.showPrice();

	}

}
