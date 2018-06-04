package latihan;

public class Person {
	String firstName, lastName, gender, interest;
	int age;
	public Person() {// constructor default
		
	}
	public Person(String namaDepan, String namaBelakang, String jenisKelamin, String hobi, int umur) {// refer variable
		firstName = namaDepan;
		lastName = namaBelakang;
		gender = jenisKelamin;
		interest = hobi;
		age = umur;
	}
	void biodata() {// method
		System.out.println(firstName+" is "+age+" years old. they like "+interest);
	}
	void greeting() {// method
		System.out.println("Hi, Im "+firstName+" "+lastName);
	}
	void sayThanks() {// method
		System.out.println("Thanks for tour attention");
	}
}
