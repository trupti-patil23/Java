package FactoryCreationalDesignPattern;

public class ProfessionFactory {
	
	static Profession getInstance(String name) {
		
		if(name == null) {
			return null;
		}
		Profession instance = null;

		if (name.equalsIgnoreCase("Doctor")) {
			instance =  new Doctor();
		}
		
		if (name.equalsIgnoreCase("Teacher")) {
			instance = new Teacher();
		}

		if (name.equalsIgnoreCase("Engineer")) {
			instance = new Engineer();
		}
		return instance;
	}
}
