package child;

import parent.Person;

public class Teacher extends Person {
	String subject, prefix;
	
	public Teacher(String firstName, String lastName, String gender, String interest, int age, String subject, String prefix) {
		super(firstName, lastName, gender, interest, age);
		this.subject = subject;
		this.prefix = prefix;
	}
	
	public String biodata() {
		return super.biodata(); 
	}
	
	public String subject() {
		return "Subject " + subject;
	}
	
	public String greetings() {
		return "Hello my name is " + prefix + " " + lastName + " and I teach " + subject;
	}	
}
