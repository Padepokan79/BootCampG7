
public class Author {
	private String name, email;
	private char gender;
	
	public Author() {
		
	}
	public Author(String nama, String e_mail, char kelamin) {
		name 	= nama;
		email 	= e_mail;
		gender	= kelamin;
	}
	
	void setEmail(String email) {
		this.email = email;
	}
	
	String getName() {
		return name;
	}
	String getEmail() {
		return email;
	}
	char getGender() {
		return gender;
	}
	
	public String toString() {
		return "Nama : "+ getName() + ", email : "+ getEmail() +", gender : "+getGender();
	}
	
}
