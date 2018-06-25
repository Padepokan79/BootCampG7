package person;

public class Teacher extends Person{
	
	String subjek, prefix;
	public Teacher() {
		
	}
	public Teacher(String namaDepan, String namaBelakang, String jKelamin, String hobi, int age, String subject) {
		super(namaDepan, namaBelakang, jKelamin, hobi, age);
		subjek = subject;
	}
	
	void greeting() {
		if (gender.equals("Male")) {
			prefix = "Mr. ";
		} else {
			prefix = "Mrs. ";
		}
		System.out.println("Hello my name is "+prefix+" "+lastName+" and i teach "+subjek);
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
