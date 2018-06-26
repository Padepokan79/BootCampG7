import java.util.*;

/* 
Created by  		: Richa Fitria
Date/hour			: 25 Juni 2018/ 10.13 AM
Updated by			:
Updated Date/hour	:
*/


public class HashMapObject {

	public static void main(String[] args) {
		
			Person orangPertama = new Person ();
			Person orangKedua = new Person("Muhamad", "Ronaldy", "male", "dancing", 22);
			Person orangKetiga = new Person ();
			
			HashMap<Integer, Person> map = new HashMap <Integer, Person> ();
			
			orangPertama.firstName = "Richa";
			orangPertama.lastName = "Fitria";
			orangPertama.age = 23;
			orangPertama.gender = "female";
			orangPertama.interest = "Dancing, Music and Basketball";
			
			orangKetiga.person("Adi", "Pangestu", "Male", "Mancing", 36);
			
			map.put(1, orangPertama);
			map.put(2, orangKedua);
			map.put(3, orangKetiga);
			
			/*System.out.println("Orang ke-1");
			orangPertama.biodata();
			orangPertama.greeting();
			System.out.println();
			
			System.out.println("Orang ke-2");
			orangKedua.biodata();
			orangKedua.greeting();
			System.out.println();
			
			orangKetiga.person("Adi", "Pangestu", "Male", "Mancing", 36);
			System.out.println("Orang ke-3");
			orangKetiga.biodata();
			orangKetiga.greeting();
			*/

		    for(Map.Entry<Integer, Person> orang : map.entrySet()){    
		    	int key= orang.getKey();  
		        Person p = orang.getValue();  
		        System.out.println("Orang ke-" + orang.getKey());  
		        System.out.println(p.lastName + ", " + p.firstName + " umur " + p.age);   
		    }
	}
}
