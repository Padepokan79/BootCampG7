package person;

public class Student extends Person{
	public Student() {
		
	}
	public Student(String namaDepan, String namaBelakang, String jKelamin, String hobi, int umur) {
		super(namaDepan, namaBelakang, jKelamin, hobi, umur);
	}
	
	void greeting() {
		System.out.println("Yo iam "+firstname);
	}
	
	void biodata() {
		System.out.println(firstname+" "+"is "+age+" years old. he like "+interest);
	}
	void bio() {
		System.out.println("Name: "+firstname+" ");
		System.out.println("age: "+age);
		System.out.println("Gender: "+gender);
		System.out.println("Interest: "+interest);
		System.out.print("Bio: ");
	}
}
