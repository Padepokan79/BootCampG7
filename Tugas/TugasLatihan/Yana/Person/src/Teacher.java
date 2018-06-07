
public class Teacher extends Person{

	String subject, prefix;
	
	public Teacher (String firstName, String lastName, String gender, String interest, String address, int age, String subject) {
		super(firstName,  lastName, gender, interest, address, age);
		this.subject = subject;
	}
	
	public String greeting() {
		if (gender.equals("Laki-laki")) {
			prefix = "Mr";
		}
		else if (gender.equals("Perempuan")) {
			prefix = "Mrs/Ms";
		}		
		return "Hello! My name is "+prefix+ " " +lastName+ " And i teach "+subject;
	}
}
