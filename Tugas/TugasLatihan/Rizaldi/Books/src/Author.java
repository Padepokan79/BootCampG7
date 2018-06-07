
public class Author {
	private String name, email;
	private char gender;
	
	public Author() {
		
	}
	public Author(String nama, String mail, char jKelamin) {
		name	= nama;
		email	= mail;
		gender	= jKelamin;
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
	
	void setMail(String mailing) {
		email = mailing;
	}
	
	public String toString() {
		return "Author[Name = "+name+", email = "+email+", gender = "+gender+"] ";
	}
}
