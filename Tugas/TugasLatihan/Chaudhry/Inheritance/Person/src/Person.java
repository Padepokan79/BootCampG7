
public class Person {
	String firstName, lastName, gender, interest;
	int age;
	
	public Person() {
		
	}
	public Person(String namaDepan, String namaBelakang, int age, String gender, String interest) {
		firstName 	= namaDepan;
		lastName	= namaBelakang;
		this.age 	= age;
		this.gender	= gender;
		this.interest 	= interest;
	}
	
	public String bio() {
		return "Nama Saya " + firstName +" "+ lastName + ", Usia " + age + " Tahun. Saya menyukai "+ interest;
	}
	public String greeting() {
		return "Hi Aku "+ firstName +" "+ lastName;
	}
}
