package FactoryCreationalDesignPattern;

public class FactoryPatternExample {
	public static void main(String[] args) {
		
		Profession doctor = ProfessionFactory.getInstance("Doctor");
		doctor.print();

		Profession teacher = ProfessionFactory.getInstance("Teacher");
		teacher.print();

		Profession engineer = ProfessionFactory.getInstance("Engineer");
		engineer.print();
	}
}
