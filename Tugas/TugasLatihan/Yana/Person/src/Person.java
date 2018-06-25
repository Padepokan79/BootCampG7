
public class Person {
	String 	firstName, lastName, gender, interest, address;
	int age;
	
	public Person() {
	}
	
	public Person(String namaDepan, String namaBelakang, String jenisKelamin, String hobi, String alamat, int umur) {
		firstName 	= namaDepan;
		lastName 	= namaBelakang;
		gender 		= jenisKelamin;
		interest 	= hobi;
		address 	= alamat;
		age 		= umur;
	}
	
	void biodata() {
		System.out.println(firstName+" is "+age);
	}
	
	public String bio() {
		return "" +firstName+ " "+lastName+ " is " +age+ " years old. They like "+interest;
	}
	
	public String greeting() {
		return "Hi! I'm "+firstName+ " " +lastName;
	}
}
