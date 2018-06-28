package amazon;
import java.util.*;

import bioskop.Cinema;

public class Struk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day, week, totalHarian, totalMingguan, totalMingguan3, totalMingguan4, diff,
		totFanta, totTaro, totClear, totTisu, totMagnum;
		
		diff = totalMingguan4 = totalMingguan3 = totalMingguan = day = 0;
		week = 7;
		
		Toko tk = new Toko();
		Toko fanta = new Toko("Fanta", 7000, 3, 15, 0, 0, 0, 5, 3);
		Toko taro = new Toko("Taro", 3000, 10, 20, 0, 18, 0, 6, 3);
		Toko clear = new Toko("Clear", 12000, 0, 0, 3, 0, 0, 12, 0);
		Toko tisu = new Toko("Tissuee", 2000, 0, 3, 0, 0, 0, 10, 0);
		Toko magnum = new Toko("Ice Cream", 10000, 0, 12, 0, 2, 0, 15, 2);
		
		List<Toko> barangList = new ArrayList<Toko>();
		List<Integer> emptyList = new ArrayList<Integer>();
		barangList.add(fanta);
		barangList.add(taro);
		barangList.add(clear);
		barangList.add(tisu);
		barangList.add(magnum);
//
//		System.out.println("Penghasilan Minggu Pertama");
//		for(day=1; day<=week; day++) {
//			totalHarian = 0;
//			for(Toko obj: barangList) {
//				totalHarian+=obj.daily(day);
//			}
//			System.out.println("Total pemasukan hari "+ tk.checkDaily(day) + " " + totalHarian);
//			totalMingguan+=totalHarian;
//		}
//		System.out.println("Penjualan Minggu Pertama " + totalMingguan);
		
		System.out.println();
		System.out.println("Penghasilan Minggu Ketiga");
		for(day=1; day<=week; day++) {
			totalHarian = 0;
			for(Toko obj: barangList) {
				totalHarian+=obj.daily3(day);
			}
			System.out.println("Total pemasukan hari "+ tk.checkDaily(day) + " " + totalHarian);
			totalMingguan3+=totalHarian;
		}
		System.out.println("Penghasilan Minggu Ketiga " + totalMingguan3);

		System.out.println();
		System.out.println("Penghasilan Minggu Keempat");
		for(day=1; day<=week; day++) {
			totalHarian = 0;
			for(Toko obj: barangList) {
				if (obj.daily4(day)<0) {
					totalHarian+= 0;
				}
				totalHarian+=obj.daily4(day);
			}
			System.out.println("Total pemasukan hari "+ tk.checkDaily(day) + " " + totalHarian);
			totalMingguan4+=totalHarian;
		}
		System.out.println("Penghasilan Minggu Keempat " + totalMingguan4);

		System.out.println();
		if (totalMingguan3-totalMingguan4==0) {
			System.out.println("Selisih Sama");
		} else if (totalMingguan3 > totalMingguan4) {
			diff = totalMingguan3-totalMingguan4;
			System.out.println("Selisih minggu ketiga dan minggu keempat "+ diff);
		} else {
			diff = totalMingguan4-totalMingguan3;
			System.out.println("Selisih minggu ketiga dan minggu keempat "+ diff);
		}
		
		
		totFanta = fanta.week1()+fanta.week2()+fanta.week3()+fanta.week4();
		totTaro = taro.week1()+taro.week2()+taro.week3()+taro.week4();
		totClear = clear.week1()+clear.week2()+clear.week3()+clear.week4();
		totTisu = tisu.week1()+tisu.week2()+tisu.week3()+tisu.week4();
		totMagnum = magnum.week1()+magnum.week2()+magnum.week3()+magnum.week4();
		
		emptyList.add(totFanta);
		emptyList.add(totTaro);
		emptyList.add(totClear);
		emptyList.add(totTisu);
		emptyList.add(totMagnum);
		
		int max = Collections.max(emptyList);
		tk.maximalize(totFanta, totTaro, totClear, totTisu, totMagnum, max);
		
	}

}
