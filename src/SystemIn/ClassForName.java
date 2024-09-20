package SystemIn;

import java.lang.reflect.*;
import java.util.*;

class Student {
	private String name;
	private String id;
	private String email;

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}

class ClassForName {

	public static void main(String[] args) {
		try {
			Class student = Class.forName("SystemIn.Student");

			System.out.println("getName(): " + student.getName()+"\n");

			System.out.println("SuperClass: " + student.getSuperclass()+"\n");

			// Get Method names and sort in Ascending order
			System.out.println("-------------------------------------------");
			Method[] methods = student.getMethods(); // check student.getDeclaredMethods()
			ArrayList<String> methodList = new ArrayList<>();
			for (Method method : methods) {
				methodList.add(method.getName());
			}
			Collections.sort(methodList);
			for (String name : methodList) {
				System.out.println(name);
			}
		} catch (ClassNotFoundException ex) {
			System.out.println("Student Class not found");
		}
	}
}
