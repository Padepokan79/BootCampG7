package book;

public class Author {
	private String name, email;
	private char gender;
	
	public Author() {
		
	}
	
	public Author (String name, String email, char gender) {
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
	
	char getGender() {
		return gender;
	}
	
	void setEmail(String emailBaru) {
		email = emailBaru;
	}
	
	public String toString() {
		return 	" - Nama: "+name +"\n"+
				" - Email: "+ email +"\n"+
				" - Gender: "+ gender+"\n";
	}
}
