package learn;

import java.util.ArrayList;

public class TryArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList<String> al=new ArrayList<String> ();
//		al.add("Ravi");
//		al.add("Vijay");
//		al.add("Ravi");
//		al.add("Ajay");
//		for (String obj : al)
//			System.out.println(obj);
//		
//		System.out.println("===============");
//		Iterator<String> itr=al.iterator();
//		while(itr.hasNext())
//			System.out.println(itr.next());
		
		Person orang1=new Person("Alifhar", "Juliansyah", "Male", "Gaming", 21);
		Person orang2=new Person("Deo", "Bright", "Male", "Programming", 22);
		Person orang3=new Person("Kiseki", "no Hero", "Male", "Farming", 27);
		ArrayList<Person> listPerson=new ArrayList<Person>();
		listPerson.add(orang1);
		listPerson.add(orang2);
		listPerson.add(orang3);
		for (Person obj : listPerson) {
			System.out.println(obj.firstName+" "+obj.lastName+"\n"+obj.age+" years old");
			System.out.println(obj.biodata());
			System.out.println(obj.greeting());
			System.out.println();
		}
	}

}
