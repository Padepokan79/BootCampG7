import parent.Person;
import child.Teacher;
import child.Student;

public class TestPerson {

	public static void main(String[] args) {
		
		Person p1 = new Person("Khairil", "Anwar", "Men", "Sports, Playing Game", 30);
		System.out.println( p1.biodata() );
		System.out.println( p1.greetings() );
		System.out.println();
		
		Teacher p2 = new Teacher("Bambang", "Hartono", "Male", "Teaching", 34, "Science", "Mr.");
		System.out.println( p2.biodata() );
		System.out.println( p2.subject() );
		System.out.println( p2.greetings() );
		System.out.println();
		
		Student p3 = new Student("Awkarin", "Susilawati", "Female", "Gangguin Orang", 23);
		System.out.println( p3.biodata() );
		System.out.println( p3.greetings() );
		System.out.println();
	}

}
