package ContohHashMap;

public class Person {
	private String firstName;
	String lastName, gender, interest;
	int age;
	
	public Person() {
		
	}
	
	public Person(String fName, String lName, int age, String gndr, String intrs ) {
		firstName 	= fName;
		lastName 	= lName;
		this.age 	= age;
		gender 		= gndr;
		interest 	= intrs;
	}
	
	String getFirsName() {
		return firstName;
	}
	
	void setFirstName(String name) {
		firstName = name;
	}
	
	String toBio() {
		return firstName+" "+lastName+" is "+age+" years old. They like "+interest;
	}
	
	String toGreet() {
		return "Hi, I'm "+firstName+" "+lastName;
	}
	
}
