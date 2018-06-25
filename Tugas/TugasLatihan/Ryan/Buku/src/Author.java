
public class Author {
	private String name, email;
	private char gender;
	
	public Author() {
		
	}
	
	public Author(String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}

	String getName() {
		return name;
	}
	String getEmail() {
		return email;
	}
	void setEmail(String gantiEmail) {
		email = gantiEmail;
	}
	char getGender() {
		return gender;
	}
	public String toString() {
		return "Author [Nama = "+name+", Email = "+email+", Gender = "+gender+"]";
	}
}
