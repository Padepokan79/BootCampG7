package Latihan;

public class Person {
	String firstName, lastName, gender, interest;
	int age;
	
	public Person() {
		
	}
	
	public Person(String fName, String lName, String gndr, String intrs, int age) {
		firstName = fName;
		lastName = lName;
		gender = gndr;
		interest = intrs;
		this.age = age;
	}
	
	void bidata() {
		System.out.println(firstName+" is "+age+" years old. They like "+interest);
	}
	
	void greeting() {
		System.out.println("Hi, I am "+firstName+" "+lastName);
	}
	
	void inisialisasiPerson(String namaDepan, String namaBelakang, String kelamin, String hobi, int usia) {
		firstName = namaDepan;
		lastName = namaBelakang;
		gender = kelamin;
		interest = hobi;
		age = usia;
	}
	
}
