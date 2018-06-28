/*
 * DATE CREATED : 21 Juni 2018
 * AUTHOR       : NURDHIAT CHAUDHARY MALIK
 * */
public class Person {
	private String firstName, lastName, gender, interest;
	private int age;
	
	public Person() {
		
	}
	public Person(String namaDepan, String namaBelakang, int age, String gender, String interest) {
		firstName 	= namaDepan;
		lastName	= namaBelakang;
		this.age 	= age;
		this.gender	= gender;
		this.interest 	= interest;
	}
	
	String getFirstName() {
		return firstName;
	}
	String getLastName() {
		return lastName;
	}
	String getGender() {
		return gender;
	}
	String getInterest() {
		return interest;
	}
	int getAge() {
		return age;
	}
	
	void printContent() {
		System.out.println("Kami ALUMNI SMKN 2 CIMAHI :)");
	}
}
