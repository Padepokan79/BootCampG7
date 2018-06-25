/* 
Created by  		: Richa Fitria
Date/hour			: 21 Juni 2018/ 09.05 AM
Updated by			:
Updated Date/hour	:
*/

import java.util.ArrayList;

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

		ArrayList <TiketKereta> totalGerbong = new ArrayList<TiketKereta>();
		totalGerbong.add(ekonom);
		totalGerbong.add (bisnis);
		totalGerbong.add (eksekutif);	
		
		//set jumlah penumpang dari class TiketKereta
		ekonom.setDay1(1);
		ekonom.setDay2(1);
		ekonom.setDay3(1);
		ekonom.setDay4(1);
		ekonom.setDay5(1);
		ekonom.setDay6(1);
		ekonom.setDay7(1);
		
		bisnis.setDay1(1);
		bisnis.setDay2(1);
		bisnis.setDay3(1);
		bisnis.setDay4(1);
		bisnis.setDay5(1);
		bisnis.setDay6(1);
		bisnis.setDay7(1);
		
		eksekutif.setDay1(1);
		eksekutif.setDay2(1);
		eksekutif.setDay3(1);
		eksekutif.setDay4(1);
		eksekutif.setDay5(1);
		eksekutif.setDay6(1);
		eksekutif.setDay7(1);
		
		//set pakai ArrayList tambahan
		ArrayList <Integer> penumpangEkonom = new ArrayList <Integer> () ;
		penumpangEkonom.add(2);
		penumpangEkonom.add(4);
		penumpangEkonom.add(5);
		penumpangEkonom.add(2);
		penumpangEkonom.add(1);
		penumpangEkonom.add(0);
		penumpangEkonom.add(1);
		
		ArrayList <Integer> penumpangBisnis = new ArrayList <Integer> () ;
		penumpangBisnis.add(2);
		penumpangBisnis.add(4);
		penumpangBisnis.add(5);
		penumpangBisnis.add(2);
		penumpangBisnis.add(1);
		penumpangBisnis.add(0);
		penumpangBisnis.add(1);
		
		ArrayList <Integer> penumpangEksekutif = new ArrayList <Integer> () ;
		penumpangEksekutif.add(2);
		penumpangEksekutif.add(4);
		penumpangEksekutif.add(5);
		penumpangEksekutif.add(2);
		penumpangEksekutif.add(1);
		penumpangEksekutif.add(0);
		penumpangEksekutif.add(1);
		
		
		System.out.println("Hari ke-1");
		for (TiketKereta jumlah : totalGerbong) {
			System.out.println(jumlah.getNamaKelas() + ": "+ jumlah.getHarga()*jumlah.getDay1());	
			totalPendapatanHari1 = totalPendapatanHari1 + jumlah.getHarga()*jumlah.getDay1();
		}
		System.out.println("Total Pendapatan Tiket Hari ke-1: " + totalPendapatanHari1);
		
		System.out.println();
		System.out.println("Hari ke-2");
		for (TiketKereta jumlah : totalGerbong) {
			System.out.println(jumlah.getNamaKelas() + ": "+ jumlah.getHarga()*jumlah.getDay2());	
			totalPendapatanHari2 = totalPendapatanHari2 + jumlah.getHarga()*jumlah.getDay2();
		}
		
		System.out.println("Total Pendapatan Tiket Hari ke-2: " + totalPendapatanHari2);
		
		System.out.println();
		System.out.println("Hari ke-3");
		for (TiketKereta jumlah : totalGerbong) {
			System.out.println(jumlah.getNamaKelas() + ": "+ jumlah.getHarga()*jumlah.getDay3());	
			totalPendapatanHari3 = totalPendapatanHari3 + jumlah.getHarga()*jumlah.getDay3();
		}
		System.out.println("Total Pendapatan Tiket Hari ke-3: " + totalPendapatanHari3);
		
		System.out.println();
		System.out.println("Hari ke-4");
		for (TiketKereta jumlah : totalGerbong) {
			System.out.println(jumlah.getNamaKelas() + ": "+ jumlah.getHarga()*jumlah.getDay4());	
			totalPendapatanHari4 = totalPendapatanHari4 + jumlah.getHarga()*jumlah.getDay4();
		}
		System.out.println("Total Pendapatan Tiket Hari ke-4: " + totalPendapatanHari4);
		
		System.out.println();
		System.out.println("Hari ke-5");
		for (TiketKereta jumlah : totalGerbong) {
			System.out.println(jumlah.getNamaKelas() + ": "+ jumlah.getHarga()*jumlah.getDay5());	
			totalPendapatanHari5 = totalPendapatanHari5 + jumlah.getHarga()*jumlah.getDay5();
		}
		System.out.println("Total Pendapatan Tiket Hari ke-5: " + totalPendapatanHari5);
		
		System.out.println();
		System.out.println("Hari ke-6");
		for (TiketKereta jumlah : totalGerbong) {
			System.out.println(jumlah.getNamaKelas() + ": "+ jumlah.getHarga()*jumlah.getDay6());	
			totalPendapatanHari6 = totalPendapatanHari6 + jumlah.getHarga()*jumlah.getDay6();
		}
		System.out.println("Total Pendapatan Tiket Hari ke-6: " + totalPendapatanHari6);
		
		System.out.println();
		System.out.println("Hari ke-7");
		for (TiketKereta jumlah : totalGerbong) {
			System.out.println(jumlah.getNamaKelas() + ": "+ jumlah.getHarga()*jumlah.getDay7());	
			totalPendapatanHari7 = totalPendapatanHari7 + jumlah.getHarga()*jumlah.getDay7();
		}
		System.out.println("Total Pendapatan Tiket Hari ke-7: " + totalPendapatanHari7);
		System.out.println();
		
		System.out.printf("Total Pendapatan : %.2f", (totalPendapatanHari1+totalPendapatanHari2+totalPendapatanHari3+totalPendapatanHari4+totalPendapatanHari5+totalPendapatanHari6+totalPendapatanHari7));
	}

}
