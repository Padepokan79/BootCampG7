package ContohHashMap;

import java.util.HashMap;
import java.util.Map.Entry;

public class ContohHashMapObejct {

	public static void main(String[] args) {
		
		HashMap<Integer, Person> map = new HashMap<>();
		
		Person person1 = new Person("Malik", "Chandr", 18, "Male", "Musik");
		Person person2 = new Person("Alan", "Fusi", 19, "Male", "Musik");
		Person person3 = new Person("Porda", "Iwiw", 18, "Male", "Musik");
		
		map.put(1, person1);
		map.put(2, person2);
		map.put(3, person3);
		
		for (Entry<Integer, Person> entry:map.entrySet()) {
			int key = entry.getKey();
			Person p = entry.getValue();
			
			System.out.println(key+" Details:");
			System.out.println(p.getFirsName()+" "+p.lastName+" "+p.age);
		}
	}

}
