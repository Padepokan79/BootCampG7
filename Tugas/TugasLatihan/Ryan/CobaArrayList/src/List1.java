import java.util.ArrayList;
import java.util.Iterator;

public class List1{
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ravi");
		al.add("Ajay");
		
		Iterator src = al.iterator();
		while (src.hasNext()) {
		 System.out.println(src.next());
		}
		System.out.println();
		for (String obj : al) {
			System.out.println(obj);
		}
		
		Person p1 = new Person(18, "Ryan", "Ahmad", "Laki Laki", "Bobo");
		Person p2 = new Person(21, "Ahmad", "Nuriana", "Laki Laki", "Tidur");
		Person p3 = new Person(25, "Nuriana", "Ryan", "Laki Laki", "Hees");
		
		ArrayList<Person> al2 = new ArrayList<Person>();
		al2.add(p1);
		al2.add(p2);
		al2.add(p3);
		System.out.println();
		for (Person person : al2) {
			System.out.println("Nama : "+person.firstName+" "+ person.lastName +" , "+"Umur "+person.age);
			System.out.println(person.greeting());
		}
//		System.out.println();
//		Iterator iterat = al2.iterator();
//		while (iterat.hasNext()) {
//			System.out.println("Nama : "+iterat.firstName+" "+ person.lastName +" , "+"Umur "+person.age);
//			System.out.println(person.greeting());
//		}
	}

}
