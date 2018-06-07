package bootcamp;

public class Student extends Person {

	public Student  (String fName, String lName, String gndr, String intrs, int ag) {
		super(fName, lName, gndr, intrs, ag);
	}
	
	void greeting () {
		System.out.println("Yo! I'm " + firstName + ".");
	}
}
