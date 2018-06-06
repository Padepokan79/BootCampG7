package Person;

public class Student extends Person {
	
	Student(){
		
	}
	
	Student(String firstName, String lastName, int age, String gender, String interest){
		super(firstName,lastName,age,gender,interest);
	}
	
	String toGreet() {
		return "Yo, I'm "+firstName;
	}
	
}
