package ContohHashMap;

import java.util.HashMap;
import java.util.Map;

public class ContohHashMap {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(1, "Malik");
		map.put(2, "Chandr");
		map.put(3, "Ahmed");
		map.put(4, "Muhammad");
		
		for(Map.Entry mp : map.entrySet()) {
			System.out.println(mp.getKey()+" "+mp.getValue());
		}

	}

}
