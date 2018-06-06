package latihan;

public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person firstPerson = new Person();//instansiasi by reference variable
		Person secondPerson = new Person("Rizalddi", "Rnensia", "Male", "Music, Food", 21);//instansiasi by konstruktor
		Person thirdPerson = new Person("Arul", "Aral", "Male", "soccer", 30);//instansiasi by konstruktor
		
		
		firstPerson.firstName	= "Rizaldi";// instansiasi by reference variable
		firstPerson.lastName	= "Rnensia";
		firstPerson.age			= 29;
		firstPerson.gender		= "Male";
		firstPerson.interest	= "Music, food, travel";
		
		System.out.println("Orang ke 1 : ");
		firstPerson.biodata();// instansiasi by method
		firstPerson.greeting();
		System.out.println("Orang ke 2 : ");
		secondPerson.biodata();// instansiasi by method
		secondPerson.greeting();
		System.out.println("Orang ke 3 : ");
		thirdPerson.biodata();// instansiasi by method
		thirdPerson.greeting();
		thirdPerson.sayThanks();
		
		Teacher firstTeacher = new Teacher();
		firstTeacher.firstName	= "asep";
		firstTeacher.lastName	= "Sutiawan";
		firstTeacher.age		= 29;
		firstTeacher.gender		= "Male";
		firstTeacher.interest	= "noodles";
		firstTeacher.subject	= "Math";
		
		System.out.println("\nGuru ke 1 : ");
		firstTeacher.biodata();
		firstTeacher.greeting();

		Student firstStudent = new Student("Richa", "Fitria", "Female", "Makan", 20);
		
		System.out.println("\nMurid ke 1 : ");
		firstStudent.biodata();
		firstStudent.greeting();
	}

}
