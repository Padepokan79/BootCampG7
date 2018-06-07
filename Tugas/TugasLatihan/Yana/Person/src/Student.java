
public class Student extends Person {
	
	public Student (String firstName, String lastName, String gender, String interest, String address, int age) {
		super(firstName,  lastName, gender, interest, address, age);
	}
	
	public String greeting() {
		return "Yo! I'm "+firstName;
	}
}
