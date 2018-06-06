package Parent;

public class Author {
	private String nameAuthor, email;
	private char gender;
	
	public Author() {
		
	}
	
	public Author(String name, String email, char gender){
		nameAuthor 	= name;
		this.email 	= email;
		this.gender = gender;
	}
	
	String getName() {
		return nameAuthor;
	}
	
	String getEmail() {
		return email;
	}
	
	char getGender() {
		return gender;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
		return "Author [ name= "+nameAuthor+", email= "+email+", gender= "+gender+" ]";
	}
	
	
}
