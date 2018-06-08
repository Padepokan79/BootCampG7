package Buku;

public class Author {
	private String name, email;
	private char gender;
	
	//Construction
	public Author() {
		
	}
	
	public Author (String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	
	//Method
	String getName() {
		return this.name;
	}
	
	String getEmail() {
		return this.email;
	}
	
	void setEmail(String email) {
		this.email = email;
	}
	
	char getGender() {
		return this.gender;
	}
	
	public String toString() {
		return "Author, Name : "+name+" ,email : "+email+" ,gender : "+gender;
	}
	
}
