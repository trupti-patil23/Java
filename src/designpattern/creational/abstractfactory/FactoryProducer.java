package designpattern.creational.abstractfactory;

public class FactoryProducer {
	public static AbstractFactory getFactory(boolean isTrainee) {
		if (isTrainee) {
			return new TraineeProfessionFactory();
		} else {
			return new ProfessionFactory();
		}
	}
}
