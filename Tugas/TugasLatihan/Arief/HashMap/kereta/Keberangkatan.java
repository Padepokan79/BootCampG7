package kereta;
import java.util.*;

import penulis.Book;

public class Keberangkatan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int week = 7, totHarian, total, hrgTiket, penumpang1, penumpang2, penumpang3, penumpang4, penumpang5, penumpang6, penumpang7;
		totHarian = total = hrgTiket = penumpang1 = penumpang2 = penumpang3 = penumpang4 = penumpang5 = penumpang6 = penumpang7 = 0;
		
		HashMap<Integer, Kereta> recList = new HashMap<Integer, Kereta>();
		
		Kereta eco = new Kereta("Ekonomi", 18000, 120, 100, 50, 30, 20, 150, 110);
		Kereta biz = new Kereta("Bisnis", 35000, 50, 15, 13, 10, 20, 55, 60);
		Kereta exe = new Kereta("Eksekutif", 80000, 40, 21, 11, 16, 12, 35, 40);
		Kereta krt = new Kereta();
		
		recList.put(102, eco);
		recList.put(203, biz);
		recList.put(304, exe);
		
		for(int day=1; day<=week; day++) {
			totHarian=0;
			for(Map.Entry<Integer, Kereta> ent:recList.entrySet()){
	            int key = ent.getKey();  
	            Kereta krtx = ent.getValue();  
				totHarian+=krtx.daily(day);
	        } 
			System.out.println("Total Pemasukan hari ke-" + day + " " + totHarian);
		}
		
		System.out.println();
		for(Map.Entry<Integer, Kereta> obj : recList.entrySet()) {
            int key = obj.getKey();  
            krt = obj.getValue();  
			krt.daily();
			System.out.println("Total penumpang kereta "+ krt.getKelas() +" adalah sebesar "+ krt.daily());
			total+=krt.daily();;
		}
	}
}
