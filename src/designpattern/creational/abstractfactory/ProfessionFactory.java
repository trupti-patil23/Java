package designpattern.creational.abstractfactory;


public class ProfessionFactory implements AbstractFactory {

	@Override
	public Professions getProfession(String professionType) {
		if(professionType == null || professionType.isEmpty()) {
			return null;
		}
		Professions instance = null;

		if (professionType.equalsIgnoreCase("Doctor")) {
			instance =  new Doctor();
		}
		
		if (professionType.equalsIgnoreCase("Teacher")) {
			instance = new Teacher();
		}		
		return instance;
	}

}
