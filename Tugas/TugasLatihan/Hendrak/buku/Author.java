//Created by : Hendra Kurniawan
//Date : 6 Juni 2018 Time : 3:58 AM
//Modified :

public class Author {
	private String name;
	private String email;
	private char gender;
	
	public Author() {
		
	}
	
	public Author(String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	void setEmail(String e) {
		email = e;
	}
	public char getGender() {
		return gender;
	}
	
	public String toString() {
		return "Author[name= "+ name + ", email= " + email +", gender= " + gender + " ]"; 
	}
	
	
}
