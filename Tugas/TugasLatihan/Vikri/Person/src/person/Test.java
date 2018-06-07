package person;

public class Test extends Person{
	public static void main(String[] args) {
	
		Person person = new Person();
		person.firstname = "Vikri";
		person.lastName = "Ramdhani";
		person.gender = "Male";
		person.age = 18;
		person.interest = "Music, Reading";
		person.tLahir = "Bandung";
	
		person.bio();
		person.biodata();
		person.greeting();
		System.out.println();
		
		Student person2= new Student();
		person2.firstname = "Aceng";
		person2.lastName = "kwansa";
		person2.gender = "Male";
		person2.age = 20;
		person2.interest = "Reading";
		
		person2.bio();
		person2.biodata();
		person2.greeting();
		System.out.println();
		
		Teacher person3= new Teacher();
		person3.firstname = "Asep";
		person3.lastName = "Ramdhani";
		person3.gender = "Male";
		person3.age = 19;
		person3.interest = "Music";
		person3.subjek = "Bio";
		
		person3.bio();
		person3.biodata();
		person3.greeting();
		System.out.println();
	}
}
