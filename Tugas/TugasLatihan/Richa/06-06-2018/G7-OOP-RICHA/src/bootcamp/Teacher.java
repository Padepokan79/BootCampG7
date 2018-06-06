package bootcamp;

public class Teacher extends Person {
	
	String subject, prefix, gender;
	
	public Teacher (String fName, String lName, String gndr, String intrs, int ag, String subject) {
		super(fName, lName, gndr, intrs, ag);
		this.subject = subject;
		gender = gndr;
	}
	
	void greeting () {
		if (gender.equals ("female")) {
			prefix = "Mrs.";
		}
		else if  (gender.equals ("male")) {
			prefix = "Mr.";
		}
		System.out.println("Hello. My name is " + prefix + lastName + ", and I teach " + subject + "." );
	}
}
