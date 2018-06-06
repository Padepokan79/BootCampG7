/* 
Created by  		: Richa Fitria
Date/hour			: 05 Juni 2018/ 03.26 PM
Updated by			:
Updated Date/hour	:
*/

public class Author {

	private String name, email;
	private char gender;
	
	public Author () {
		name = "Pidi Baiq";
		email = "ayahpidi@yahoo.co.id";
		gender ='m';
	}
	public Author (String nama, String email, char gndr) {
		name = nama;
		this.email = email;
		gender = gndr;	
	}
	
	String getName () {
		return name;
	}
	
	String getEmail () {
		return email;
	}
	
	char getGender () {
		return gender;
	}
	void setEmail (String mailing) {
		email = mailing;
	}
	
	public String toString () {
		return "Author Name = " + name + ", email = " + email + ", gender = " + gender;
	}
}
