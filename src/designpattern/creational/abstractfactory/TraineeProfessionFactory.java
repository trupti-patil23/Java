package designpattern.creational.abstractfactory;

public class TraineeProfessionFactory implements AbstractFactory {

	@Override
	public Professions getProfession(String professionType) {
		if(professionType == null || professionType.isEmpty()) {
			return null;
		}
		Professions instance = null;

		if (professionType.equalsIgnoreCase("Doctor")) {
			instance =  new TraineeDoctor();
		}
		
		if (professionType.equalsIgnoreCase("Teacher")) {
			instance = new TraineeTeacher();
		}		
		return instance;
	}
}
