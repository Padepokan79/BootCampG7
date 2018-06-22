/*
 Created by 	: Yana NY
 Time 			: 21 Juni 2018 09.25
 */

import java.util.*;
public class ShowKereta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//OBJECT
		Kereta	ekonomi		= new Kereta("Ekonomi", 18000, 120, 100, 50, 30, 20, 150, 110);
		Kereta	bisnis		= new Kereta("Bisnis", 35000, 50, 15, 13, 10, 20, 55, 60);
		Kereta	executive	= new Kereta("Executive", 80000, 40, 21, 11, 16, 12, 35, 40);
		
		double 	totalPendapatanHari1 = 0,
				totalPendapatanHari2 = 0,
				totalPendapatanHari3 = 0,
				totalPendapatanHari4 = 0,
				totalPendapatanHari5 = 0,
				totalPendapatanHari6 = 0,
				totalPendapatanHari7 = 0,
				totalPendapatanSemua = 0;
		
		//ADD KE ARRAY LIST
		ArrayList<Kereta> listKereta = new ArrayList<Kereta>();
		listKereta.add(ekonomi);
		listKereta.add(bisnis);
		listKereta.add(executive);
		
		//MENAMPILKAN
		for(Kereta kereta : listKereta) {
			double pendapatanHari1 	= kereta.getHarga() * kereta.getHari1();
			double pendapatanHari2	= kereta.getHarga() * kereta.getHari2();
			double pendapatanHari3	= kereta.getHarga() * kereta.getHari3();
			double pendapatanHari4	= kereta.getHarga() * kereta.getHari4();
			double pendapatanHari5	= kereta.getHarga() * kereta.getHari5();
			double pendapatanHari6	= kereta.getHarga() * kereta.getHari6();
			double pendapatanHari7	= kereta.getHarga() * kereta.getHari7();
			double totalPendapatan	= pendapatanHari1 + pendapatanHari2 + pendapatanHari3 + pendapatanHari4 + pendapatanHari5 + pendapatanHari6 + pendapatanHari7;
			totalPendapatanHari1 	= totalPendapatanHari1 + pendapatanHari1;
			totalPendapatanHari2 	= totalPendapatanHari2 + pendapatanHari2;
			totalPendapatanHari3 	= totalPendapatanHari3 + pendapatanHari3;
			totalPendapatanHari4 	= totalPendapatanHari4 + pendapatanHari4;
			totalPendapatanHari5 	= totalPendapatanHari5 + pendapatanHari5;
			totalPendapatanHari6 	= totalPendapatanHari6 + pendapatanHari6;
			totalPendapatanHari7 	= totalPendapatanHari7 + pendapatanHari7;
			totalPendapatanSemua	= totalPendapatanHari1 + totalPendapatanHari2 + totalPendapatanHari3 + totalPendapatanHari4 + totalPendapatanHari5 + totalPendapatanHari6 + totalPendapatanHari7;
			System.out.println(
					"\nKelas Kereta      : "+kereta.getKelas()+ 
					"\nHarga Tiket       : "+kereta.getHarga()+ 
					"\nPenumpang Hari-1  : "+kereta.getHari1()+ 
					"\nPendapatan Hari-1 : "+pendapatanHari1+ 
					"\nPendapatan Hari-2 : "+pendapatanHari2+ 
					"\nPendapatan Hari-3 : "+pendapatanHari3+ 
					"\nPendapatan Hari-4 : "+pendapatanHari4+ 
					"\nPendapatan Hari-5 : "+pendapatanHari5+ 
					"\nPendapatan Hari-6 : "+pendapatanHari6+ 
					"\nPendapatan Hari-7 : "+pendapatanHari7+ 
					"\nTOTAL PENDAPATAN  : "+String.format("%.0f", totalPendapatan));
		}
		
		System.out.println("\n\nTotal Pendapatan Hari-1 : "+totalPendapatanHari1);
		System.out.println("Total Pendapatan Hari-2 : "+totalPendapatanHari2);
		System.out.println("Total Pendapatan Hari-3 : "+totalPendapatanHari3);
		System.out.println("Total Pendapatan Hari-4 : "+totalPendapatanHari4);
		System.out.println("Total Pendapatan Hari-5 : "+totalPendapatanHari5);
		System.out.println("Total Pendapatan Hari-6 : "+totalPendapatanHari6);
		System.out.println("Total Pendapatan Hari-7 : "+totalPendapatanHari7);
		System.out.println("TOTAL PENDAPATAN SEMUA  : "+String.format("%.0f", totalPendapatanSemua));
	}
}