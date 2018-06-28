package kereta;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TestKereta {
	public static void main(String[] args) {
		int totalPemasukan = 0, totalPemasukanSeminggu = 0;
		Kereta ekonomi = new Kereta("Ekonomi", 18000, 120, 100, 50, 30, 20, 150, 110);
		Kereta bisnis = new Kereta("Bisnis", 35000, 50, 15, 13, 10, 20, 55, 60);
		Kereta executive = new Kereta("Eksekutif", 80000, 40, 21, 11, 16, 12, 35, 40);
		
		HashMap<Integer, Kereta> hm = new HashMap<Integer, Kereta>();
		hm.put(22, ekonomi);
		hm.put(31, bisnis);
		hm.put(10, executive);
				
		Map<Integer, Kereta> mep = new TreeMap<Integer, Kereta>(hm);
		
		for(int i = 1; i <= 7; i++) {
			System.out.println("Hari ke "+i);
			totalPemasukan = 0;
			
			Set set = mep.entrySet();
			Iterator it = set.iterator();

			while(it.hasNext()) {
				Map.Entry<Integer, Kereta> map = (Map.Entry) it.next();
				System.out.println(map.getValue().getNama()+" :"+map.getValue().pemasukanPerhari(i));
				totalPemasukan += map.getValue().pemasukanPerhari(i);
				totalPemasukanSeminggu += map.getValue().pemasukanPerhari(i);
			}
 
			System.out.println("Total Hari ini: "+totalPemasukan);
			System.out.println();
		}
		System.out.println("Total Pemasukan Seminggu: "+totalPemasukanSeminggu);
	}
}
