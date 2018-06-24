
public abstract class Person {
	String nama, gender;
	int usia;
	public Person() {
		
	}
	public Person(String nama, String gender, int usia) {
		this.nama = nama;
		this.gender = gender;
		this.usia = usia;
	}
	
	public abstract String toString ();

}
