package latihan1;

import java.util.ArrayList;
import java.util.Iterator;

public class TestPerson {
	public static void main(String[] args) {
		Person person = new Person("Vikri", "Ramdhani", "Pria", "Makan", 18);
		Person person2 = new Person("Desta", "Ramdhani", "Pria", "Makan", 18);
		Person person3 = new Person("Desti", "Ramdhani", "Pria", "Makan", 18);
		
		ArrayList<Person> ar = new ArrayList<Person>();
		
		ar.add(person);
		ar.add(person2);
		ar.add(person3);
		
		for(Person prs:ar) {
			prs.bio();
			prs.biodata();
		}
		
		System.out.println("=================================================");
		
		Iterator it = ar.iterator();
		while(it.hasNext()) {
			Person prs  = (Person) it.next();
			prs.bio();
			prs.biodata();
		}
	}
}
