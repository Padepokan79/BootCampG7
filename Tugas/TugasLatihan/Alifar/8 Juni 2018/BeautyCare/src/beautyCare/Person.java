package beautyCare;

public abstract class Person {
	private String name, gender;
	private int age;
	
	Person() {}
	Person(String name, String gender, int age){
		this.name=name;
		this.gender=gender;
		this.age=age;
	}
	
	String getName() {
		return name;
	}
	
	public String toString() {
		return "Nama\t\t: "+name+"\nJenis Kelamin\t: "+gender+"\nUmur\t\t: "+age;
	}
}
