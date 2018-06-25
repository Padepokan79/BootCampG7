package Person;

import java.security.PublicKey;

public class Person {
	int age;
	String firstName, lastName, genders, interest;
	
	public Person(int umur, String nama, String nama2, String jenis, String hoby) {
		age = umur;
		firstName = nama;
		lastName = nama2;
		genders = jenis;
		interest = hoby;
	}
	String bio() {
		return "Bio {"+firstName+" is "+age+" years old. They like "+interest+"}";
	}
	
	String greeting() {
		return "Greeting {Hi iam "+firstName+"}";
	}
	
	
}