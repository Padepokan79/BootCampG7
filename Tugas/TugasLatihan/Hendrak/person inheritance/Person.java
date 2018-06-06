//Created by : Hendra Kurniawan
//Date : 5 Juni 2018 Time : 2:32 PM
//Modified :
package latihan;

public class Person {
	String firstName, lastName, gender, interest,addres;
	int age;
	
	
	public Person() {
		
	}
	
	public Person(String namaDepan, String namaBelakang, String jenisKelamin, String hoby, int umur) {
		firstName = namaDepan;
		lastName = namaBelakang;
		gender = jenisKelamin;
		interest = hoby;
		age = umur;
	}
	
	public String bio()
	{
		return "Bio{ Nama " + firstName + " " + lastName + " " + age + " years old. They like " + interest +". }";
	}
	
	public String greeting() {
		return "Hi, Im " + firstName + " " + lastName ;
	}
	
	void biodata() {
		System.out.println(firstName + " is " + age + " years old. They like " + interest);
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
