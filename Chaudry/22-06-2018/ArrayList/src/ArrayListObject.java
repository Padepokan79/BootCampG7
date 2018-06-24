import java.util.ArrayList;
import java.util.Iterator;

/*
 * DATE CREATED : 21 Juni 2018
 * AUTHOR       : NURDHIAT CHAUDHARY MALIK
 * */
public class ArrayListObject {

	public static void main(String[] args) {
		Person satu = new Person("Nurdhiat", "Malik", 18, "Pria", "Gaming");
		Person dua  = new Person("Irfan", "Hanafi", 24, "Pria", "Travel");
		Person tiga = new Person("Friska", "Putri", 17, "Wanita", "Makan");
		
		ArrayList<Person> list = new ArrayList<Person>();
		list.add(satu);
		list.add(dua);
		list.add(tiga);
		
		System.out.println("Menggunakan For Each ------------------------------");
		for (Person person : list) {
			System.out.println("Nama   : "+person.getFirstName()+" "+person.getLastName());
			System.out.println("Usia   : "+person.getAge());
			System.out.println("Gender : "+person.getGender());
			System.out.println("");
		}
		
		System.out.println("---------------------------------------------------");
		System.out.println("");
		System.out.println("Menggunakan Iterator ------------------------------");
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			Person ps = (Person)itr.next();
			System.out.println("Nama   : "+ps.getFirstName()+" "+ps.getLastName());
			System.out.println("Usia   : "+ps.getAge());
			System.out.println("Gender : "+ps.getGender());
			System.out.println("");
		}
		
		satu.printContent();
		
	}

}
