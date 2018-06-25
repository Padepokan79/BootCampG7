package latihan;

public class Teacher extends Person{
	String subject, prefix;
	Boolean isMale=true;
	public Teacher(String namaDepan, String namaBelakang, String jenisKelamin, String hobi, int umur, String subjek) {
		super(namaDepan, namaBelakang, jenisKelamin, hobi, umur);
		subject = subjek;
	}
	
	public Teacher() {
		
	}
	
	void biodata() {
		System.out.println(firstName+" is "+age+" years old. they like "+interest);
	}
	
	void greeting() {
		if(gender.equals("Male")) {
			prefix="Mr.";
		}
		else if(gender.equals("Female")) {
			prefix="Mrs.";
		}
		else {
			prefix="?";
		}
		
		System.out.println("Hallo, My name is "+prefix+lastName+" and i teach "+subject);
	}
}
