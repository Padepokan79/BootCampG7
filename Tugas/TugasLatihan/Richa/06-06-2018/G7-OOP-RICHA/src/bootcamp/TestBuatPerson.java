package bootcamp;

public class TestBuatPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Person orangPertama = new Person ();
		Person orangKedua = new Person("Muhamad", "Ronaldy", "male", "dancing", 22);
		Person orangKetiga = new Person ();
		Teacher teacher1 = new Teacher("Hendra", "Yudiyana", "male", "Swimming", 29, "IT");
		Student student1 = new Student ("Rizaldi", "", "male", "eating", 23);
		
		orangPertama.firstName = "Richa";
		orangPertama.lastName = "Fitria";
		orangPertama.age = 23;
		orangPertama.gender = "female";
		orangPertama.interest = "Dancing, Music and Basketball";
		
		orangKetiga.person("Adi", "Pangestu", "Male", "Mancing", 36);
		
		System.out.println("Orang ke-1");
		orangPertama.biodata();
		orangPertama.greeting();
		System.out.println();
		
		System.out.println("Orang ke-2");
		orangKedua.biodata();
		orangKedua.greeting();
		
		System.out.println();
		
		System.out.println("Orang ke-3");
		orangKetiga.biodata();
		orangKetiga.greeting();
		
		System.out.println("\nTeacher 1");
		teacher1.biodata();
		teacher1.greeting();
		
		System.out.println("\nStudent 1");
		student1.biodata();
		student1.greeting();
		
		
	}

}
