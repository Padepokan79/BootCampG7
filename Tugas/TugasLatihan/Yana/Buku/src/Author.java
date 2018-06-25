
public class Author {
	private String 	name, email;
	private char 	gender;
	
	public Author() {
	}
	
	public Author(String nama, String mail, char jenisKelamin) {
		name 	= nama;
		email	= mail;
		gender	= jenisKelamin;
	}
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public char getGender() {
		return gender;
	}
	
	void setEmail(String mail) {
		email 	= mail;
	}
	
	public String toString() {
		return "Author[name=" +name+ ",email=" +email+",gender="+gender+"]";
	}
}
