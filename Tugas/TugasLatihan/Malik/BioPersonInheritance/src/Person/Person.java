package Person;

public class Person {
	String firstName, lastName, gender, interest;
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
	
	String toBio() {
		return firstName+" "+lastName+" is "+age+" years old. They like "+interest;
	}
	
	String toGreet() {
		return "Hi, I'm "+firstName+" "+lastName;
	}
	
}
