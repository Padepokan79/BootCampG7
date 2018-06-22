package learn;

public class Person {
	String firstName, lastName, gender, interest;
	int age;
	
	public Person() {
		System.out.println("masuk");
	}
	public Person(String namaDepan, String namaBelakang, String jenisKelamin, String hobi, int umur) {
		firstName=namaDepan;
		lastName=namaBelakang;
		gender=jenisKelamin;
		interest=hobi;
		age=umur;
	}
	
	String biodata() {
		return firstName+" is "+age+" years old. He like "+interest;
	}
	
	String greeting() {
		return "Hi, I'm "+firstName+" "+lastName;
	}
	
//	void initial(String namaDepan, String namaBelakang, String jenisKelamin, String hobi, int umur) {
//		firstName=namaDepan;
//		lastName=namaBelakang;
//		gender=jenisKelamin;
//		interest=hobi;
//		age=umur;		
//	}
}
