/*
Date Created	: 21 June 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
package tiketKeretaApi;

import java.util.*;

public class Keberangkatan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int week = 7, totHarian = 0, total = 0;
		
		
		Kereta eco = new Kereta("Ekonomi", 18000, 120, 100, 50, 30, 20, 150, 110);
		Kereta biz = new Kereta("Bisnis", 35000, 50, 15, 13, 10, 20, 55, 60);
		Kereta exe = new Kereta("Eksekutif", 80000, 40, 21, 11, 16, 12, 35, 40);
		
		List<Kereta> recList = new ArrayList<Kereta>();
		recList.add(eco);
		recList.add(biz);
		recList.add(exe);
		
		for(int day=1; day<=week; day++) {
			totHarian=0;
			for(Kereta obj: recList)
				totHarian+=obj.daily(day);
			System.out.println("Total Pemasukan hari ke-"+day+" "+totHarian);
		}
		
		System.out.println();
		for(Kereta obj : recList) {
			System.out.println("Total penumpang kereta "+obj.getKelas()+" adalah sebesar "+obj.daily());
			total+=obj.daily();
		}
	}
}
