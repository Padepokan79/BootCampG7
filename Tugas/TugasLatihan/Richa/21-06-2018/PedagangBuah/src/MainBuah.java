/* 
Created by  		: Richa Fitria
Date/hour			: 21 Juni 2018/ 10.05 AM
Updated by			:
Updated Date/hour	:
*/
import java.util.*;


public class MainBuah {

	public static void main(String[] args) {
		double totalPendapatanHari1 = 0;
		double totalPendapatanHari2 = 0;
		double totalPendapatanHari3 = 0;
		double totalPendapatanHari4 = 0;
		double totalPendapatanHari5 = 0;
		double totalPendapatanHari6 = 0;
		double totalPendapatanHari7 = 0;
		double bandingHari1 = 0.0, bandingHari2 = 0.0, lebihBesar = 0.0;
		boolean cekValid = true;
		
		Buah semangka = new Buah ("Semangka", 18000, 12, 15, 11, 8, 20, 10, 14);
		Buah pisang = new Buah ("Pisang", 15000, 10, 14, 15, 7, 20, 13, 16);
		Buah mangga = new Buah ("Mangga", 10000, 13, 12, 9, 15, 20, 9, 13);
		Scanner keyboard = new Scanner (System.in);
		
		ArrayList <Buah> totalJualHari = new ArrayList <Buah> ();
		totalJualHari.add(semangka);
		totalJualHari.add(pisang);
		totalJualHari.add(mangga);
		
		ArrayList <String> namaHari = new ArrayList <String> ();
		namaHari.add("Senin");
		namaHari.add("Selasa");
		namaHari.add("Rabu");
		namaHari.add("Kamis");
		namaHari.add("Jumat");
		namaHari.add("Sabtu");
		namaHari.add("Minggu");
		
		ArrayList <String> namaBuah = new ArrayList <String> ();
		namaBuah.add("Semangka");
		namaBuah.add("Pisang");
		namaBuah.add("Mangga");
		
		System.out.println("PEDAGANG BUAH\r\n" + 
				"\r\n" + 
				"1. Penghasilan Perhari\r\n" + 
				"2. Penghasilan Perminggu\r\n" + 
				"3. Penghasilan Sebulan\r\n" + 
				"4. Penghasilan terkecil\r\n" + 
				"5. Penghasilan terbesar\r\n" + 
				"6. Perbandingan Penghasilan\r\n" + 
				"7. Buah yang paling banyak terjual selama seminggu.\r\n" + 
				"8. Buah yang memiliki penghasilan penjualan terbesar selama seminggu.\r\n" + 
				"9. Buah yang memiliki penghasilan penjualan terkecil selama seminggu.\r\n" + 
				"10.Hitung Penghasilan Laba penjual selama sebulan.\r\n" + 
				"\r\n" + 
				"");
		
		do {
		System.out.println("Masukan Menu yang diinginkan 1 s.d 10: ");
		String menu = keyboard.next();
		//cekValid = ValidasiAngka(menu, cekValid);
		
		
		} while (cekValid== false);
		
		for (Buah total : totalJualHari ) {
			totalPendapatanHari1 = totalPendapatanHari1 + total.getHarga()*total.getDay1();
			totalPendapatanHari2 = totalPendapatanHari2 + total.getHarga()*total.getDay2();
			totalPendapatanHari3 = totalPendapatanHari3 + total.getHarga()*total.getDay3();
			totalPendapatanHari4 = totalPendapatanHari4 + total.getHarga()*total.getDay4();
			totalPendapatanHari5 = totalPendapatanHari5 + total.getHarga()*total.getDay5();
			totalPendapatanHari6 = totalPendapatanHari6 + total.getHarga()*total.getDay6();
			totalPendapatanHari7 = totalPendapatanHari7 + total.getHarga()*total.getDay7();
		}
		
		if (menu.equals("1")) {
			//MENU 1
			System.out.println("Total Pendapatan pedagang buah hari Senin adalah Rp." + totalPendapatanHari1);
			System.out.println("Total Pendapatan pedagang buah hari Selasa adalah Rp." + totalPendapatanHari2);
			System.out.println("Total Pendapatan pedagang buah hari Rabu adalah Rp." + totalPendapatanHari3);
			System.out.println("Total Pendapatan pedagang buah hari Kamis adalah Rp." + totalPendapatanHari4);
			System.out.println("Total Pendapatan pedagang buah hari Jumat adalah Rp." + totalPendapatanHari5);
			System.out.println("Total Pendapatan pedagang buah hari Sabtu adalah Rp." + totalPendapatanHari6);
			System.out.println("Total Pendapatan pedagang buah hari Minggu adalah Rp." + totalPendapatanHari7);
		}
		
		double totalMinggu = (totalPendapatanHari1+totalPendapatanHari2+totalPendapatanHari3+totalPendapatanHari4+totalPendapatanHari5+totalPendapatanHari6+totalPendapatanHari7);
		if (menu.equals("2")) {
			//MENU 2
			System.out.printf("Total Pendapatan pedagang buah per minggu adalah Rp.%.2f", totalMinggu);
			System.out.println();
		}

		
		if (menu.equals("3")) {
			//MENU 3
			System.out.printf("Total Pendapatan pedagang buah per bulan adalah Rp.%.2f", (4*totalMinggu));
			System.out.println();
		}

		
		ArrayList <Double> totalPenghasilanPerHari = new ArrayList <Double> ();
		totalPenghasilanPerHari.add(totalPendapatanHari1);
		totalPenghasilanPerHari.add(totalPendapatanHari2);
		totalPenghasilanPerHari.add(totalPendapatanHari3);
		totalPenghasilanPerHari.add(totalPendapatanHari4);
		totalPenghasilanPerHari.add(totalPendapatanHari5);
		totalPenghasilanPerHari.add(totalPendapatanHari6);
		totalPenghasilanPerHari.add(totalPendapatanHari7);
		
		if (menu.equals("4")) {
			//MENU 4
			System.out.println("Penghasilan terkecil adalah hari " + namaHari.get(totalPenghasilanPerHari.indexOf(Collections.min (totalPenghasilanPerHari))) + " dengan besar penghasilan Rp. " + Collections.min (totalPenghasilanPerHari));
		}
		
		if (menu.equals("5")) {
			//MENU 5
			System.out.println("Penghasilan terbesar adalah hari " + namaHari.get(totalPenghasilanPerHari.indexOf(Collections.max (totalPenghasilanPerHari))) + " dengan besar penghasilan Rp. " + Collections.max (totalPenghasilanPerHari));
		}
		
		
		if (menu.equals("6"))  {
			//MENU 6

			System.out.println("Masukan Hari ke 1: ");
			String hari1 = keyboard.next();
			
			System.out.println("Masukan Hari ke 2: ");
			String hari2 = keyboard.next();
			
			for (String hari : namaHari) {
				if (hari1.equalsIgnoreCase(hari)) {
					bandingHari1 = totalPenghasilanPerHari.get(namaHari.indexOf(hari));
				}
				if (hari2.equalsIgnoreCase(hari)) {
					bandingHari2 = totalPenghasilanPerHari.get(namaHari.indexOf(hari));
				}
			}
			
			if (bandingHari1 > bandingHari2) {
				lebihBesar = bandingHari1;
			}
			else {
				lebihBesar = bandingHari2;
			}
			
			System.out.println("Perbandingan antara Hari "+ hari1 + " dan "  + hari2 + " adalah " + (bandingHari1/lebihBesar) + " : " + (bandingHari2/lebihBesar) + " pendapatan hari " + namaHari.get(totalPenghasilanPerHari.indexOf(lebihBesar)) +  " lebih besar");
		}
		
		ArrayList <Integer> qtySemangka = new ArrayList<Integer>();
		qtySemangka.add(semangka.day1);
		qtySemangka.add(semangka.day2);
		qtySemangka.add(semangka.day3);
		qtySemangka.add(semangka.day4);
		qtySemangka.add(semangka.day5);
		qtySemangka.add(semangka.day6);
		qtySemangka.add(semangka.day7);
		
		int jumlahSemangka = 0;
		for (int jmlSemangka : qtySemangka) {
			jumlahSemangka = jumlahSemangka + jmlSemangka;
		}
		
		
		ArrayList <Integer> qtyPisang = new ArrayList<Integer>();
		qtyPisang.add(pisang.day1);
		qtyPisang.add(pisang.day2);
		qtyPisang.add(pisang.day3);
		qtyPisang.add(pisang.day4);
		qtyPisang.add(pisang.day5);
		qtyPisang.add(pisang.day6);
		qtyPisang.add(pisang.day7);

		
		int jumlahPisang = 0;
		for (int jmlPisang : qtyPisang) {
			jumlahPisang = jumlahPisang + jmlPisang;
		}
		
		
		ArrayList <Integer> qtyMangga = new ArrayList<Integer>();
		qtyMangga.add(mangga.day1);
		qtyMangga.add(mangga.day2);
		qtyMangga.add(mangga.day3);
		qtyMangga.add(mangga.day4);
		qtyMangga.add(mangga.day5);
		qtyMangga.add(mangga.day6);
		qtyMangga.add(mangga.day7);
		
		int jumlahMangga = 0;
		for (int jmlMangga : qtyMangga) {
			jumlahMangga = jumlahMangga + jmlMangga;
		}
		
		ArrayList <Integer> jumlahBuah = new ArrayList<Integer>();
		jumlahBuah.add (jumlahSemangka);
		jumlahBuah.add (jumlahPisang);
		jumlahBuah.add (jumlahMangga);
		
		if (menu.equals("7"))  {
			//MENU 7
			System.out.println("Penjualan buah semangka selama seminggu adalah " + jumlahSemangka + " kg");
			System.out.println("Penjualan buah pisang selama seminggu adalah " + jumlahPisang + " kg");
			System.out.println("Penjualan buah mangga selama seminggu adalah " + jumlahMangga + " kg");
			System.out.println("Total penjualan buah yang paling banyak adalah " + namaBuah.get(jumlahBuah.indexOf(Collections.max(jumlahBuah))) + " dengan " + Collections.max(jumlahBuah) + " kg ");
			
		}

		ArrayList <Double> hargaTotalBuah = new ArrayList<Double>();
		hargaTotalBuah.add (jumlahSemangka*semangka.getHarga());
		hargaTotalBuah.add (jumlahPisang*pisang.getHarga());
		hargaTotalBuah.add (jumlahMangga*mangga.getHarga());
		
		if (menu.equals("8"))  {
			//MENU 8
			System.out.println("Total penjualan buah yang paling besar adalah " + namaBuah.get(hargaTotalBuah.indexOf(Collections.max(hargaTotalBuah))));

		}
		
		if (menu.equals("9"))  { 
			//MENU 9
			System.out.println("Total penjualan buah yang paling kecil adalah " + namaBuah.get(hargaTotalBuah.indexOf(Collections.min(hargaTotalBuah))));
		}
		
		if (menu.equals("10")) {
			//MENU 10
			System.out.println("Total laba penjualan selama sebulan adalah " + (0.2*(4*totalMinggu)));
		}
		else {
			cekValid = false;
		}
		
		
		
	}
	
	//method validasi
	public static boolean ValidasiAngka (String valid, boolean cek) {
		if (valid.matches ("[.0-9]+")) {
			cek = true;
		}
		else if (valid.matches ("[-.0-9]+")) {
			System.out.println("Maaf yang anda input salah, Silahkan inputkan berupa angka dari 1 s.d 10.");
			cek= false ;
		}
		else if (valid.matches ("[a-zA-Z .,]+")) {
			cek = false;	
			System.out.println("Maaf yang anda input salah, Silahkan inputkan berupa angka dari 1 s.d 10.");
		}
		return cek;
	} 
	public static boolean validasiHuruf (String input, boolean validHuruf) {
		if (input.matches("[a-zA-Z]+")) {
			validHuruf = true;
		}
		else {
			validHuruf = false;
			System.out.println("Maaf, input harus berupa huruf. Silahkan coba lagi!");
		}
		return validHuruf;
	}
}
