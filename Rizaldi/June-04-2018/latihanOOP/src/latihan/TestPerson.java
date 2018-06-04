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

		
	}

}
