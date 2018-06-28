package customer;

public abstract class Person {
	String name, gender;
	int usia;
	
	public Person(String name, String gender, int usia) {
		this.name = name;
		this.gender = gender;
		this.usia = usia;
	}
	
	abstract String getName();
	abstract int getUsia();
	abstract String getGender();

	public abstract String toString();
}
