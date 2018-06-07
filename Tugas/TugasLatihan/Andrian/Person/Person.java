package bootcamp;

public class Person {
	String firstName, lastName, gender, interest, greeting;
	int age;

	public Person() {

	}

	public Person(String namaDepan, String namaBelakang, String jenisKelamin, String hobi, int umur, String greeting) {
		firstName = namaDepan;
		lastName = namaBelakang;
		gender = jenisKelamin;
		interest = hobi;
		age = umur;
		this.greeting = greeting;
	}

//	void biodata() {
//		System.out.println(firstName + " is " + age + " years old. They like " + interest);
//	}
//
//	
//	void bolenang (int a, String k, String f, String l, String g) {
//		age = a;
//		interest = k;
//		firstName = f;
//		lastName = l;
//		gender = g;
//	}
	
	String toStringBio() {
		return "Name : " + firstName + " , " + lastName + "\nAge : " + age + "\nGender : " + 
				gender + "\nInterest : " + interest + "\nBio : "+  "Name " + firstName + " , " + lastName + " is " + age + " years old. They like " + interest ;
	}
	
	String toStringGreeting() {
		return "Hi. My name is " + firstName + " " + lastName;
	}


}