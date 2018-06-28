package Kereta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PenghasilanKereta {

	public static void main(String[] args) {
		Kereta ekonomi = new Kereta(18000,120, 100, 50, 30, 20, 150, 110);
		Kereta bisnis = new Kereta(35000, 50, 15, 13, 10, 20, 55, 60);
		Kereta eksekutif = new Kereta(80000, 40, 21, 11, 16, 12, 35, 40);
		
		Map<String, Kereta> kereta = new HashMap<String, Kereta>();
		kereta.put("Ekonomi", ekonomi);
		kereta.put("Bisnis", bisnis);
		kereta.put("Eksekutif", eksekutif);
		
//		ArrayList<Kereta> penumpang = new ArrayList<Kereta>();
//		penumpang.add(ekonomi);
//		penumpang.add(bisnis);
//		penumpang.add(eksekutif);
		
		int totalPerbulan = 0;
		for (int i = 1; i < 8; i++) {
			int totalPerHari=0;
			for (Map.Entry<String , Kereta> entry : kereta.entrySet()) {
				Kereta obj =entry.getValue();
				totalPerHari = totalPerHari + obj.getHargaPerHari(i);
			}
			System.out.println("Hari ke "+i+" "+totalPerHari);
			totalPerbulan = totalPerbulan+totalPerHari;
		}
		System.out.println("----------------------");
		System.out.println("Total perbulan : "+totalPerbulan);

	}

}
