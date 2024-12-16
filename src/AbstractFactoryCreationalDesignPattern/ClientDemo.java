package AbstractFactoryCreationalDesignPattern;

public class ClientDemo {

	public static void main(String[] args) {
		// Get a Regular Profession Factory
		AbstractFactory professionFactory = FactoryProducer.getFactory(false);

		Professions doctor = professionFactory.getProfession("Doctor");
		doctor.print(); // Output: I am a Doctor.

		Professions teacher = professionFactory.getProfession("Teacher");
		teacher.print(); // Output: I am a Teacher.

		// Get a Trainee Profession Factory
		AbstractFactory traineeProfessionFactory = FactoryProducer.getFactory(true);

		Professions traineeDoctor = traineeProfessionFactory.getProfession("Doctor");
		traineeDoctor.print(); // Output: I am a Trainee Doctor.

		Professions traineeTeacher = traineeProfessionFactory.getProfession("Teacher");
		traineeTeacher.print(); // Output: I am a Trainee Teacher.

	}

}
