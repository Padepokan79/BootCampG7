package latihan;

public class Person {
	String firstName, lastName, gender, interest,addres;
	int age;
	
	
	public Person() {
		
	}
	
	public Person(String namaDepan, String namaBelakang, String jenisKelamin, String hoby, int umur, String alamat) {
		firstName = namaDepan;
		lastName = namaBelakang;
		gender = jenisKelamin;
		interest = hoby;
		age = umur;
		addres = alamat;
	}
	
	public Person(String alamat) {
		addres = alamat;
	}
	
	
	void biodata() {
		System.out.println(firstName + " is " + age + " years old. They like " + interest);
	}
	
	void greeting() {
		System.out.println("Hi, My name is " + firstName + " " + lastName + " I Live  in " + addres);
	}
	
	void isiData(String namaDepan, String namaBelakang, String jenisKelamin, String hoby, int umur, String alamat) {
		firstName = namaDepan;
		lastName = namaBelakang;
		gender = jenisKelamin;
		interest = hoby;
		age = umur;
		addres = alamat;
	}
}
