package bootcamp;

public class Teacher extends Person {
	String subject, greeting, prefix;
	
	//concturcor
	public Teacher (String namaDepan, String namaBelakang, String jenisKelamin, String hobi, int umur, String subject) {
		super (namaDepan, namaBelakang, jenisKelamin, hobi, umur, subject);
		
		this.subject = subject;
	}
	//object
	String toStringBio() {
		return super.toStringBio() + "\nMy Subject : "+ subject ;
	}
	
	void prefixIns() {
		if (gender.equals("male")) {
			prefix = "Mr";
		}
		else if (gender.equals("female")) {
			prefix = "Mrs.";
		}
	}
	
	String toStringGreeting() {
		return "Hello my name is " + prefix + " " + lastName + " and i teach " + subject;
	}
	
}
