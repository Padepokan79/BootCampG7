package latihan1;

public class Person {
	String firstname, lastName, interest, gender, tLahir;
	int age;
	
	public Person() {
		
	}
	
	public Person(String namaDepan, String namaBelakang, String jKelamin, String hobi, int umur) {
		firstname = namaDepan;
		lastName = namaBelakang;
		interest = hobi;
		gender = jKelamin;
		age = umur;
	}
	void biodata() {
		System.out.println(firstname+" "+"is "+age+" years old. he like "+interest);
	}
	
	void greeting() {
		System.out.println("Hi iam "+firstname);
	}
	
	void gooday() {
		System.out.println("i wish u have good day "+firstname);
	}
	
	void bio() {
		System.out.println();
		System.out.println("Name: "+firstname+" ");
		System.out.println("age: "+age);
		System.out.println("Gender: "+gender);
		System.out.println("Interest: "+interest);
		System.out.print("Bio: ");
	}
	
}
