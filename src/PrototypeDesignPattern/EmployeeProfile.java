package PrototypeDesignPattern;

public class EmployeeProfile {
	public static void main(String[] args) {

		// Create a prototype for a Software Engineer in the IT department
		Employee prototypeEmployee = new Employee("Prototype", "IT", "Software Engineer", "Building A");

		// Clone the prototype and modify for a new employee
		Employee newEmployee1 = prototypeEmployee.clone();
		newEmployee1.setName("Trupti");   //only Change a name

		Employee newEmployee2 = prototypeEmployee.clone();
		newEmployee2.setName("Riaan");

		// Display the employee profiles
		System.out.println(newEmployee1);
		System.out.println(newEmployee2);
	}
}
