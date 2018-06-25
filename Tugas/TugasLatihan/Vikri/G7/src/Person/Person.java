package Person;

public class Person {
	String firstname, lastName, interest, gender ;
	int age;
	
	public Person() {
		
	}
	
	public Person(String namaDepan, String namaBelakang, String jKelamin, String hobi, int umur) {
		firstname = namaDepan;
		lastName = namaBelakang;
		interest = hobi;
		gender = jKelamin;
		age = umur;
	}
	
	void biodata() {
		System.out.println(firstname+" "+"is "+age+" years old. he like "+interest);
	}
	
	void greeting() {
		System.out.println("Hi, im "+firstname+" "+lastName);
	}
	
	void gooday() {
		System.out.println("i wish u have good day "+firstname);
	}
	public static void main(String[] args) {
		Person prs = new Person("vikri", "rmdn", "pria", "game", 18);
		
		System.out.println("Name\t "+prs.firstname+" "+prs.lastName);
		System.out.println("Age\t "+prs.age);
		System.out.println("Gender\t "+prs.gender);
		System.out.println("Interest\t "+prs.interest);
	}
}