package Kereta;

import java.util.*;

class Passenger {

	public static void main(String[] args) {
		int maxDay = 7;
		
		Kereta kelas1 = new Kereta();
		kelas1.setKelas("Ekonomi");
		kelas1.setHarga(18000);
		
		Kereta kelas2 = new Kereta();
		kelas2.setKelas("Bisnis");
		kelas2.setHarga(35000);		
		
		Kereta kelas3 = new Kereta();
		kelas3.setKelas("Executive");
		kelas3.setHarga(80000);		

		System.out.println(kelas1.sammery());
		System.out.println(kelas2.sammery());
		System.out.println(kelas3.sammery());
		
		TreeMap<Integer, Kereta> listKelas = new TreeMap<Integer, Kereta>();
		listKelas.put(1, kelas1);
		listKelas.put(2, kelas2);
		listKelas.put(3, kelas3);
		
		//penjualan tiket ekonomi
		TreeMap<Integer, Integer> kelasEkonomi = new TreeMap<Integer, Integer>();
		kelasEkonomi.put(1, 120);
		kelasEkonomi.put(2, 100);
		kelasEkonomi.put(3, 50);
		kelasEkonomi.put(4, 30);
		kelasEkonomi.put(5, 20);
		kelasEkonomi.put(6, 150);
		kelasEkonomi.put(7, 110);
		
		//penjualan tiket bisnis
		TreeMap<Integer, Integer> kelasBisnis = new TreeMap<Integer, Integer>();
		kelasBisnis.put(1, 50);
		kelasBisnis.put(2, 15);
		kelasBisnis.put(3, 13);
		kelasBisnis.put(4, 10);
		kelasBisnis.put(5, 20);
		kelasBisnis.put(6, 55);
		kelasBisnis.put(7, 60);

		//penjualan tiket eksekutif
		TreeMap<Integer, Integer> kelasExecutive = new TreeMap<Integer, Integer>();
		kelasExecutive.put(1, 40);
		kelasExecutive.put(2, 21);
		kelasExecutive.put(3, 11);
		kelasExecutive.put(4, 16);
		kelasExecutive.put(5, 12);
		kelasExecutive.put(6, 35);
		kelasExecutive.put(7, 40);
		
		int i = 1, j = 1, k = 1;
		int eko = 0, bis = 0, exa = 0;
		int totalEkonomiPerHari = 0;
		int totalBisnisPerHari = 0;
		int totalExecutivePerHari = 0;
		int totPenjualanEko = 0;
		int totPenjualanBis = 0;
		int totPenjualanExe = 0;
		int setTotalPerHari = 0;
		
		System.out.println("=============================================");
		for(Map.Entry<Integer, Integer> ekonomi : kelasEkonomi.entrySet()) {
			totalEkonomiPerHari = kelas1.getHarga() * ekonomi.getValue();
			System.out.print("Penjualan Tiket Ekonomi hari ke " + i + " : " + totalEkonomiPerHari + "\n");
			i++;
			totPenjualanEko = totPenjualanEko + totalEkonomiPerHari;
		}

		System.out.println("=============================================");
		for(Map.Entry<Integer, Integer> bisnis : kelasBisnis.entrySet()) {
			totalBisnisPerHari = kelas2.getHarga() * bisnis.getValue();
			System.out.print("Penjualan Tiket Bisnis hari ke " + j + " : " + totalBisnisPerHari + "\n");
			j++;
			totPenjualanBis = totPenjualanBis + totalBisnisPerHari;
		}
		
		System.out.println("=============================================");
		for(Map.Entry<Integer, Integer> executive : kelasExecutive.entrySet()) {
			totalExecutivePerHari = kelas3.getHarga() * executive.getValue();
			System.out.print("Penjualan Tiket Executive hari ke " + k + " : " + totalExecutivePerHari + "\n");
			k++;
			totPenjualanExe = totPenjualanExe + totalExecutivePerHari;
		}
		System.out.println("=============================================");
		
		for(int jumHari = 1; jumHari <= maxDay; jumHari++) {
			eko = kelasEkonomi.get(jumHari) * kelas1.getHarga();
			bis = kelasBisnis.get(jumHari) * kelas2.getHarga();
			exa = kelasExecutive.get(jumHari) * kelas3.getHarga();
			setTotalPerHari = eko + bis + exa;
			System.out.println("Penjualan hari ke-" + jumHari + " : " + setTotalPerHari);
		}
		System.out.println("=============================================");
		System.out.println("Total Penjualan Ekonomi \t: Rp " + totPenjualanEko);
		System.out.println("Total Penjualan Bisnis \t\t: Rp " + totPenjualanBis);
		System.out.println("Total Penjualan Executive \t: Rp " + totPenjualanExe);
		int totalSeminggu = totPenjualanEko + totPenjualanBis + totPenjualanExe;
		System.out.println("------------------------------------------- +");
		System.out.println("Total Penjualan 7 Hari \t\t: Rp " + totalSeminggu);
	}

}
