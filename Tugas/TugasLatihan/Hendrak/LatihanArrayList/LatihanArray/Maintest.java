/*
Created by : Hendra Kurniawan
Date 	   : 21 Juni 2018  Time : 8:31 AM
Modified   :	
*/

package LatihanArray;
import java.util.*;

import ArrayListPerson.Person;

public class Maintest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Budi");
		al.add("Tono");
		al.add("Mawar");
		al.add("Tuti");
		
		for(String obj : al)
			System.out.println(obj);
	
		System.out.println();
		
		
		 Iterator itr= al.iterator(); 
		 
		 while(itr.hasNext()) {
			 System.out.print(itr.next() + " ");
		 }
		 
		 al.remove(3);
		 
		 Iterator<String> itr2 = al.iterator();
		 while(itr2.hasNext()) {
			 System.out.print(itr2.next() + " ");
		 }
		 
		 Person orang1 = new Person("Hendra", "Kurniawan", "Male", "Game", 25);
		 Person orang2 = new Person("Budi", "Purnama", "Male", "Traveling", 25);
		 Person orang3 = new Person("Tono", "Suryana", "Male", "Tidur", 25);
		 
		 ArrayList<Person> listorang = new ArrayList<Person>();
		 
		 listorang.add(orang1);
		 listorang.add(orang2);
		 listorang.add(orang3);
		 
		 for(Person orang : listorang) {
		 System.out.println("Nama   : " + orang.firstName + " " + orang.lastName + " , Umur " +  orang.age);
	 	 System.out.println(orang.greeting());
		 }
		 
		
	}
}
