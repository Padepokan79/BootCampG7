package child;

import parent.Person;

public class Student extends Person {
	
	public Student(String firstName, String lastName, String gender, String interest, int age) {
		super(firstName, lastName, gender, interest, age);
	}
	
	public String biodata() {
		return super.biodata();
	}
	
	public String greetings() {
		return "Yo! I'm " + firstName;
	}

}
