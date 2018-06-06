
public class Student extends Person {
	public Student() {
		
	}
	public Student(String namaDepan, String namaBelakang, int age, String gender, String interest) {
		super(namaDepan, namaBelakang, age, gender, interest);
	}
	public String greeting() {
		return "Yo aku "+firstName;
	}
}
