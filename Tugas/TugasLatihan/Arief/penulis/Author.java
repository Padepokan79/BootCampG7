package penulis;

public class Author {
	private String name, email;
	private char gender;
	
	public Author() {
		// TODO Auto-generated constructor stub
	}
	
	public Author(String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	
	String getName(){
		return name;
	}
	
	String getEmail(){
		return email;
	}
	
	char getGender(){
		return gender;
	}
	
	void setEmail(String email) {
		this.email = email;
	}
	
	String printString() {
		return "Author [name=" + name + ", email=" + email + ", gender=" + gender + "]";
	}
}
