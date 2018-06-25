package parent;

public class Person {
	public String firstName;
	protected String lastName;
	String gender;
	String interest;
	int age;
	
	public Person(String firstName, String lastName, String gender, String interest, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.interest = interest;
		this.age = age;
	}
	
	public String biodata() {
		return firstName + " " + lastName + " is " + age + " years old. They like " + interest;
	}
	
	public String greetings() {
		return "Hi! I'm " + firstName;
	}
}
