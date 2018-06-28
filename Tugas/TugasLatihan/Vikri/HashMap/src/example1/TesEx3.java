package example1;

import java.util.HashMap;
import java.util.Map.Entry;

public class TesEx3 {
	public static void main(String[] args) {
		Ex3 ex = new Ex3("Vikri", 18);
		Ex3 ex1 = new Ex3("Gintama", 28);
		
		HashMap<Integer, Ex3> hm = new HashMap<Integer, Ex3>();
		hm.put(1, ex);
		hm.put(2, ex1);
		
		for(Entry<Integer, Ex3> cek:hm.entrySet()) {
			System.out.println(cek.getValue().getNama()+" Berumur "+cek.getValue().getUmur());
		}
	}
}
