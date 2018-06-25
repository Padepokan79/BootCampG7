package Person;

import java.security.PublicKey;

public class Person {
	int age;
	String firstName, lastName, genders, interest;
	
	public Person() {
	
	}
	
	public Person(int umur, String nama, String nama2, String jenis, String hoby) {
		age = umur;
		firstName = nama;
		lastName = nama2;
		genders = jenis;
		interest = hoby;
	}
	
	void Person(int umur, String nama, String nama2, String jenis, String hoby) {
		age = umur;
		firstName = nama;
		lastName = nama2;
		genders = jenis;
		interest = hoby;
	}
	
	void dataDiri() {
		System.out.println("Bio {"+firstName+" is "+age+" years old. They like "+interest+"}");
		System.out.println("Greeting {Hi iam "+firstName+"}");
	}
	
	
}