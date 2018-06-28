package HashMap;


import java.nio.channels.FileChannel.MapMode;
import java.util.*;
public class ContohHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(100, "Amit");
		hm.put(101, "Vijay");
		hm.put(102, "Rahul");
		
		for(Map.Entry m: hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		Map<Integer, Person> map = new HashMap<>();
		Person p1 = new Person("Hendra", "Kurniawan", "male", "main", 25);
		Person p2 = new Person("Tono", "Kurnia", "male", "main", 25);
		map.put(1, p1);
		map.put(2, p2);
		
		
		for(Map.Entry<Integer, Person> entry : map.entrySet()) {
			int key = entry.getKey();
			Person p = entry.getValue();
			System.out.println(key + " Details : ");
			System.out.println(p.firstName + " " + p.lastName + " umur " + p.age + ", hobi " + p.interest);
			
		}
		
		
	}

}
