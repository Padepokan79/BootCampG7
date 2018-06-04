package latihan;

public class Person {
	String firstName, lastName, gender, interest;
	int age;
	public Person() {}
	public Person(String namaDepan, String namaBelakang, String jenisKelamin, String hobi, int umur) {
		firstName=namaDepan;
		lastName=namaBelakang;
		gender=jenisKelamin;
		interest=hobi;
		age=umur;
	}
	void biodata() {
		if(gender.equals("Male"))
			System.out.println(firstName+" is "+age+" years old. He like "+interest);
		else
			System.out.println(firstName+" is "+age+" years old. She like "+interest);
	}
	void greeting() {
		System.out.println("Hi, I'm "+firstName+" "+lastName);
	}
	void initial(String namaDepan, String namaBelakang, String jenisKelamin, String hobi, int umur) {
		firstName=namaDepan;
		lastName=namaBelakang;
		gender=jenisKelamin;
		interest=hobi;
		age=umur;		
	}
}
