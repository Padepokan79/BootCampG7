package bootcamp;

public class Person {
	String firstname, lastName, interest, gender, tLahir;
	int age;
	
	public Person() {
		
	}
	
	public Person(String namaDepan, String namaBelakang, String jKelamin, String hobi, int umur, String lahir) {
		firstname = namaDepan;
		lastName = namaBelakang;
		interest = hobi;
		gender = jKelamin;
		age = umur;
		tLahir = lahir;	
	}
	
	void biodata() {
		System.out.println(firstname+" "+"is "+age+" years old. he like "+interest);
	}
	
	void greeting() {
		System.out.println("Hi, im "+firstname+" "+lastName);
	}
	
	void gooday() {
		System.out.println("i wish u have good day "+firstname);
	}
}