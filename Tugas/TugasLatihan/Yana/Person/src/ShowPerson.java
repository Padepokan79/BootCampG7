
public class ShowPerson {

	public static void main(String[] args) {
		Person 	person	= new Person("Yana", "NY", "Laki-laki", "language", "Garut", 23);
		Person 	person2 = new Person();
		Teacher teacher	= new Teacher("Budi", "Chaudhary Malik", "Laki-laki", "teach", "Jakarta", 32, "Matematika");
		Student student = new Student("Ani", "Supriani", "Perempuan", "karoke", "Bandung", 17);
		
		person2.firstName 	= "Adi";
		person2.lastName 	= "Mulya";
		person2.gender 		= "Perempuan";
		person2.interest	= "Sepak Bola";
		person2.address		= "Papua";
		person2.age			= 14;
		
		System.out.println("\nPERSON");
		System.out.println(person.bio());
		System.out.println(person.greeting());
		System.out.println("\nPERSON 2");
		System.out.println(person2.bio());
		System.out.println(person2.greeting());
		System.out.println("\nTEACHER");
		System.out.println(teacher.bio());
		System.out.println(teacher.greeting());
		System.out.println("\nSTUDENT");
		System.out.println(student.bio());
		System.out.println(student.greeting());
	}
}
