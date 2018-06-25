/* 
Created by  		: Richa Fitria
Date/hour			: 25 Juni 2018/ 10.13 AM
Updated by			:
Updated Date/hour	:
*/

public class Person {
	String firstName, lastName, gender, interest;
	int age;
	public Person () {
		
	}
	public Person (String fName, String lName, String gndr, String intrs, int ag) {
		firstName = fName;
		lastName = lName;
		gender = gndr;
		interest = intrs;
		age	= ag;
	}
	
	void biodata () {
		System.out.println(firstName + " is " + age + " year old. They like " + interest);
	}
	void greeting () {
		System.out.println("Hi, I'm " + firstName + " " + lastName + ".");
	}
	
	void person (String fName, String lName, String gndr, String intrs, int ag) {
		firstName = fName;
		lastName = lName;
		gender = gndr;
		interest = intrs;
		age	= ag;
	}
}
