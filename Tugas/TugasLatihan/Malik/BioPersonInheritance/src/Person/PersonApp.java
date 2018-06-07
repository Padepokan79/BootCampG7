package Person;

public class PersonApp {

	public static void main(String[] args) {
		Person  p1 	= new Person("malik","chandr",18,"male","gaming");
		Student s1 	= new Student();
		Teacher t1 	= new Teacher("Diana","herlina",18,"female","music","math");
		
		System.out.println("Person");
		System.out.println();
		System.out.println(p1.toBio());
		System.out.println(p1.toGreet());
		
		s1.firstName = "Yana";
		s1.lastName  = "Nur";
		s1.age 		 = 25;
		s1.gender 	 = "male";
		s1.interest  = "Reading";
		
		System.out.println();
		System.out.println("Student");
		System.out.println();
		System.out.println(s1.toBio());
		System.out.println(s1.toGreet());

		System.out.println();
		System.out.println("Teacher");
		System.out.println();
		System.out.println(t1.toBio());
		System.out.println(t1.toGreet());
	}

}
