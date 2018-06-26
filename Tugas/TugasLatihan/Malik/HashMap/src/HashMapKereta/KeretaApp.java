package HashMapKereta;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class KeretaApp {

	public static void main(String[] args) {
		int incomeHari1 = 0,
			incomeHari2 = 0,
			incomeHari3 = 0,
			incomeHari4 = 0,
			incomeHari5 = 0,
			incomeHari6 = 0,
			incomeHari7 = 0,
			incomeWeek  = 0;
		
		Kereta ekonomi  = new Kereta("Ekonomi", 18000, 120, 100, 50, 30, 20, 150, 110);
		Kereta bisnis   = new Kereta("Bisnis", 35000, 50, 15, 13, 10, 20, 55, 60);
		Kereta executiv = new Kereta("Executive", 80000, 40, 21, 11, 16, 12, 35, 40);
		
		HashMap<String, Kereta> map = new HashMap<>();
		HashMap<Integer, String> mapHari = new HashMap<>();
		HashMap<Integer, Integer> mapIncome = new HashMap<>();
		
		map.put("ekonomi", ekonomi);
		map.put("bisnis", bisnis);
		map.put("executiv", executiv);
		
		
		mapHari.put(1, "senin");
		mapHari.put(2, "selasa");
		mapHari.put(3, "rabu");
		mapHari.put(4, "kamis");
		mapHari.put(5, "jumat");
		mapHari.put(6, "sabtu");
		mapHari.put(7, "minggu");
		
		for(Entry<String, Kereta> entry : map.entrySet()) {
			Kereta k = entry.getValue();
			incomeHari1 += k.getHarga()*k.hariKe1;
			incomeHari2 += k.getHarga()*k.hariKe2;
			incomeHari3 += k.getHarga()*k.hariKe3;
			incomeHari4 += k.getHarga()*k.hariKe4;
			incomeHari5 += k.getHarga()*k.hariKe5;
			incomeHari6 += k.getHarga()*k.hariKe6;
			incomeHari7 += k.getHarga()*k.hariKe7;
		}
		
		mapIncome.put(1, incomeHari1);
		mapIncome.put(2, incomeHari2);
		mapIncome.put(3, incomeHari3);
		mapIncome.put(4, incomeHari4);
		mapIncome.put(5, incomeHari5);
		mapIncome.put(6, incomeHari6);
		mapIncome.put(7, incomeHari7);
		
		// fungsi untuk mengrutkan key acak
		Map<Integer, Integer> mapSort = new TreeMap<Integer, Integer>(mapIncome);
		
		System.out.println();
		System.out.println("PT. KAI jalur Bandung-Bekasi");
		System.out.println();
		
		for(int index = 1; index <= mapHari.size(); index++) {
			System.out.println("Penghasilan hari "+mapHari.get(index)+" sebesar Rp. "+mapIncome.get(index));
			incomeWeek += mapIncome.get(index);
		}
		
		System.out.println();
		System.out.println("Penghasilan selama seminggu sebesar Rp. "+incomeWeek);
	}

}
