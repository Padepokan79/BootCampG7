package KeretaHashMap;
/* 
Created by  		: Richa Fitria
Date/hour			: 25 Juni 2018/ 10.46 AM
Updated by			:
Updated Date/hour	:
*/

import java.util.*;

public class MainKeretaApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double totalPendapatanHari1 = 0;
		double totalPendapatanHari2 = 0;
		double totalPendapatanHari3 = 0;
		double totalPendapatanHari4 = 0;
		double totalPendapatanHari5 = 0;
		double totalPendapatanHari6 = 0;
		double totalPendapatanHari7 = 0;
		
		
		TiketKereta ekonom = new TiketKereta("Ekonomi", 18000, 120, 100, 50, 30, 20, 150, 110);
		TiketKereta bisnis = new TiketKereta("Bisnis", 35000, 50, 15, 13, 10, 20, 55, 60);
		TiketKereta eksekutif = new TiketKereta("Eksekutif", 80000, 40, 21, 11, 16, 26, 35, 40);

		HashMap <Integer, TiketKereta> totalGerbong = new HashMap();
		totalGerbong.put (1, ekonom);
		totalGerbong.put (2, bisnis);
		totalGerbong.put (3, eksekutif);	
		
		/*
		Jumlah Penumpang Kereta Ekonomi:
		hari ke1 120, ke-2 100, ke-3 50, ke-4 30,ke-5 20, ke-6 150, ke-7 110.
		
		Jumlah Penumpang Kereta Bisnis:
		hari ke1 50, ke-2 15, ke-3 13, ke-4 10,ke-5 20, ke-6 55, ke-7 60,
		
		Jumlah Penumpang Kereta Executive
		hari ke1 40, ke-2 21, ke-3 11, ke-4 16,ke-5 12, ke-6 35, ke-7 40,
		 */
		
		//set pakai ArrayList tambahan
		HashMap<Integer, Integer> penumpangEkonom = new HashMap() ;
		penumpangEkonom.put(1, 120);
		penumpangEkonom.put(2, 100);
		penumpangEkonom.put(3, 50);
		penumpangEkonom.put(4, 30);
		penumpangEkonom.put(5, 20);
		penumpangEkonom.put(6, 150);
		penumpangEkonom.put(7, 110);
		
		HashMap<Integer, Integer> penumpangBisnis = new HashMap() ;
		penumpangBisnis.put(1, 50);
		penumpangBisnis.put(2, 15);
		penumpangBisnis.put(3, 13);
		penumpangBisnis.put(4, 10);
		penumpangBisnis.put(5, 20);
		penumpangBisnis.put(6, 55);
		penumpangBisnis.put(7, 60);
		
		HashMap<Integer, Integer> penumpangEksekutif = new HashMap () ;
		penumpangEksekutif.put(1, 40);
		penumpangEksekutif.put(2, 21);
		penumpangEksekutif.put(3, 11);
		penumpangEksekutif.put(4, 16);
		penumpangEksekutif.put(5, 12);
		penumpangEksekutif.put(6, 35);
		penumpangEksekutif.put(7, 40);
		
		
		System.out.println("Hari ke-1");
		for (Map.Entry <Integer, TiketKereta>jumlah : totalGerbong.entrySet()) {
			TiketKereta tiket = jumlah.getValue();
			System.out.println(tiket.getNamaKelas() + ": "+ tiket.getHarga()*tiket.getDay1());	
			totalPendapatanHari1 = totalPendapatanHari1 + tiket.getHarga()*tiket.getDay1();
		}
		System.out.println("Total Pendapatan Tiket Hari ke-1: " + totalPendapatanHari1);
		
		System.out.println();
		System.out.println("Hari ke-2");
		for (Map.Entry <Integer, TiketKereta>jumlah : totalGerbong.entrySet()) {
			TiketKereta tiket = jumlah.getValue();
			System.out.println(tiket.getNamaKelas() + ": "+ tiket.getHarga()*tiket.getDay2());	
			totalPendapatanHari2 = totalPendapatanHari2 + tiket.getHarga()*tiket.getDay2();
		}
		
		System.out.println("Total Pendapatan Tiket Hari ke-2: " + totalPendapatanHari2);
		
		System.out.println();
		System.out.println("Hari ke-3");
		for (Map.Entry <Integer, TiketKereta>jumlah : totalGerbong.entrySet()) {
			TiketKereta tiket = jumlah.getValue();
			System.out.println(tiket.getNamaKelas() + ": "+ tiket.getHarga()*tiket.getDay3());	
			totalPendapatanHari3 = totalPendapatanHari3 + tiket.getHarga()*tiket.getDay3();
		}
		System.out.println("Total Pendapatan Tiket Hari ke-3: " + totalPendapatanHari3);
		
		System.out.println();
		System.out.println("Hari ke-4");
		for (Map.Entry <Integer, TiketKereta>jumlah : totalGerbong.entrySet()) {
			TiketKereta tiket = jumlah.getValue();
			System.out.println(tiket.getNamaKelas() + ": "+ tiket.getHarga()*tiket.getDay4());	
			totalPendapatanHari4 = totalPendapatanHari4 + tiket.getHarga()*tiket.getDay4();
		}
		System.out.println("Total Pendapatan Tiket Hari ke-4: " + totalPendapatanHari4);
		
		System.out.println();
		System.out.println("Hari ke-5");
		for (Map.Entry <Integer, TiketKereta>jumlah : totalGerbong.entrySet()) {
			TiketKereta tiket = jumlah.getValue();
			System.out.println(tiket.getNamaKelas() + ": "+ tiket.getHarga()*tiket.getDay5());	
			totalPendapatanHari5 = totalPendapatanHari5 + tiket.getHarga()*tiket.getDay5();
		}
		System.out.println("Total Pendapatan Tiket Hari ke-5: " + totalPendapatanHari5);
		
		System.out.println();
		System.out.println("Hari ke-6");
		for (Map.Entry <Integer, TiketKereta>jumlah : totalGerbong.entrySet()) {
			TiketKereta tiket = jumlah.getValue();
			System.out.println(tiket.getNamaKelas() + ": "+ tiket.getHarga()*tiket.getDay6());	
			totalPendapatanHari6 = totalPendapatanHari6 + tiket.getHarga()*tiket.getDay6();
		}
		System.out.println("Total Pendapatan Tiket Hari ke-6: " + totalPendapatanHari6);
		
		System.out.println();
		System.out.println("Hari ke-7");
		for (Map.Entry <Integer, TiketKereta>jumlah : totalGerbong.entrySet()) {
			TiketKereta tiket = jumlah.getValue();
			System.out.println(tiket.getNamaKelas() + ": "+ tiket.getHarga()*tiket.getDay7());	
			totalPendapatanHari7 = totalPendapatanHari7 + tiket.getHarga()*tiket.getDay7();
		}
		System.out.println("Total Pendapatan Tiket Hari ke-7: " + totalPendapatanHari7);
		System.out.println();
		
		System.out.printf("Total Pendapatan : %.2f", (totalPendapatanHari1+totalPendapatanHari2+totalPendapatanHari3+totalPendapatanHari4+totalPendapatanHari5+totalPendapatanHari6+totalPendapatanHari7));
	}

}
