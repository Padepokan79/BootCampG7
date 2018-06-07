package Person;

public class Student extends Person{

	public Student(int umur, String nama, String nama2, String jenis, String hoby) {
		super(umur, nama, nama2, jenis, hoby);
	}
	
	String greeting() {
		return "Greating {Yo Iam "+firstName+"}";
	}

}
