import java.util.HashMap;
import java.util.Map.Entry;

/*
 * DATE CREATED    : 25 JUNI 2018
 * AUTHOR          : NURDHIAT CHAUDHARY MALIK
 * */

public class HashMapBiasa {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(100, "Nurdhiat");
		hm.put(101, "Chaudhary");
		hm.put(102, "Malik");
		
		for (Entry<Integer, String> m : hm.entrySet()) {
			System.out.println(m.getKey() + " "+ m.getValue());
		}
	}

}
