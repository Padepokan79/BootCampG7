package latihan;

public class Student extends Person{
	
	public Student(String namaDepan, String namaBelakang, String jenisKelamin, String hobi, int umur) {
		super(namaDepan, namaBelakang, jenisKelamin, hobi, umur);
		
	}
	
	public Student() {
		
	}
	
	void biodata() {// method
		System.out.println(firstName+" is "+age+" years old. they like "+interest);
	}
	
	void greeting() {// method
		System.out.println("Yo, Im "+firstName);
	}
	
}
