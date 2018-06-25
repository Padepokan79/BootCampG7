package PedagangBuah;

import java.util.*;

public class PedagangBuah {
	public static void main(String[] args) {
		String hari1, hari2, inputMenu;
		Scanner kb = new Scanner(System.in);
		Buah semangka = new Buah("Semangka", 18000, 12, 15, 11, 8, 20, 10, 14);
		Buah pisang = new Buah("Pisang", 15000, 10, 14, 15, 7, 20, 13, 16);
		Buah mangga = new Buah("Mangga", 10000, 13, 12, 9, 15, 20, 9, 13);
		
		ArrayList<Buah> listBuah = new ArrayList<Buah>();
		listBuah.add(semangka);
		listBuah.add(pisang);
		listBuah.add(mangga);
		
		ArrayList<String> listHari = new ArrayList<String>();
		listHari.add("Senin");
		listHari.add("Selasa");
		listHari.add("Rabu");
		listHari.add("Kamis");
		listHari.add("Jumat");
		listHari.add("Sabtu");
		listHari.add("Minggu");
		
		System.out.println("== Hasil Penjualan Harian ==");
		double totalPemasukanHariSenin = 0;
		double totalPemasukanHariSelasa = 0;
		double totalPemasukanHariRabu = 0;
		double totalPemasukanHariKamis = 0;
		double totalPemasukanHariJumat = 0;
		double totalPemasukanHariSabtu = 0;
		double totalPemasukanHariMinggu = 0;
		double totDay1 = 0;
		double totDay2 = 0;
		double totDay3 = 0;
		double totDay4 = 0;
		double totDay5 = 0;
		double totDay6 = 0;
		double totDay7 = 0;
		double totalPemasukanMingguan = 0;
		double totalPemasukanBulanan = 0;
		
		for(Buah total:listBuah) {
			totDay1 = total.getHargaBuah() * total.day1;
			totalPemasukanHariSenin+=totDay1;
			totDay2 = total.getHargaBuah() * total.day2;
			totalPemasukanHariSelasa+=totDay2;
			totDay3 = total.getHargaBuah() * total.day3;
			totalPemasukanHariRabu+=totDay3;
			totDay4 = total.getHargaBuah() * total.day4;
			totalPemasukanHariKamis+=totDay4;
			totDay5 = total.getHargaBuah() * total.day5;
			totalPemasukanHariJumat+=totDay5;
			totDay6 = total.getHargaBuah() * total.day6;
			totalPemasukanHariSabtu+=totDay6;
			totDay7 = total.getHargaBuah() * total.day7;
			totalPemasukanHariMinggu+=totDay7;
		}
		totalPemasukanMingguan = totalPemasukanHariSenin + totalPemasukanHariSelasa + totalPemasukanHariRabu + totalPemasukanHariKamis + totalPemasukanHariJumat + totalPemasukanHariSabtu + totalPemasukanHariMinggu;
		totalPemasukanBulanan = totalPemasukanMingguan * 4;
		
		//Menu Utama
		System.out.println("PEDAGANG BUAH");
		System.out.println();
		System.out.println("1. Penghasilan Perhari");
		System.out.println("2. Penghasilan Perminggu");
		System.out.println("3. Penghasilan Sebulan");
		System.out.println("4. Penghasilan terkecil");
		System.out.println("5. Penghasilan terbesar");
		System.out.println("6. Perbandingan Penghasilan");
		System.out.println("7. Buah yang paling banyak terjual selama seminggu.");
		System.out.println("8. Buah yang memiliki penghasilan penjualan terbesar selama seminggu.");
		System.out.println("9. Buah yang memiliki penghasilan penjualan terkecil selama seminggu.");
		System.out.println("10.Hitung Penghasilan Laba penjual selama sebulan.");
		System.out.println();
		System.out.print("Input pilihan anda : ");
		inputMenu = kb.next();
		
		ArrayList<Double> listPenghasilanHarian = new ArrayList<Double>();
		listPenghasilanHarian.add(totalPemasukanHariSenin);
		listPenghasilanHarian.add(totalPemasukanHariSelasa);
		listPenghasilanHarian.add(totalPemasukanHariRabu);
		listPenghasilanHarian.add(totalPemasukanHariKamis);
		listPenghasilanHarian.add(totalPemasukanHariJumat);
		listPenghasilanHarian.add(totalPemasukanHariSabtu);
		listPenghasilanHarian.add(totalPemasukanHariMinggu);
		
		//Penjualan Per Jenis Buah
		int totalJualSemangka = 0;
		int totalJualPisang = 0;
		int totalJualMangga = 0;
		int totalPenjualanSemangka = 0;
		int totalPenjualanPisang = 0;
		int totalPenjualanMangga = 0;
		
		ArrayList<Integer> banyakSemangka = new ArrayList<Integer>();
		banyakSemangka.add(semangka.day1);
		banyakSemangka.add(semangka.day2);
		banyakSemangka.add(semangka.day3);
		banyakSemangka.add(semangka.day4);
		banyakSemangka.add(semangka.day5);
		banyakSemangka.add(semangka.day6);
		banyakSemangka.add(semangka.day7);
		
		ArrayList<Integer> banyakPisang = new ArrayList<Integer>();
		banyakPisang.add(pisang.day1);
		banyakPisang.add(pisang.day2);
		banyakPisang.add(pisang.day3);
		banyakPisang.add(pisang.day4);
		banyakPisang.add(pisang.day5);
		banyakPisang.add(pisang.day6);
		banyakPisang.add(pisang.day7);
		
		ArrayList<Integer> banyakMangga = new ArrayList<Integer>();
		banyakMangga.add(mangga.day1);
		banyakMangga.add(mangga.day2);
		banyakMangga.add(mangga.day3);
		banyakMangga.add(mangga.day4);
		banyakMangga.add(mangga.day5);
		banyakMangga.add(mangga.day6);
		banyakMangga.add(mangga.day7);
		
		//List Per Jenis Buah yang terjual
		for(int totalSemangka:banyakSemangka) {
			totalJualSemangka+=totalSemangka;
		}
		
		for(int totalPisang:banyakPisang) {
			totalJualPisang+=totalPisang;
		}
		
		for(int totalMangga:banyakMangga) {
			totalJualMangga+=totalMangga;
		}	
		
		ArrayList<Integer> totalPerbuah = new ArrayList<Integer>();
		totalPerbuah.add(totalJualSemangka);
		totalPerbuah.add(totalJualPisang);
		totalPerbuah.add(totalJualMangga);
		
		ArrayList<String> jenisBuah = new ArrayList<String>();
		jenisBuah.add("Semangka");
		jenisBuah.add("Pisang");
		jenisBuah.add("Mangga");
		
		totalPenjualanSemangka = totalJualSemangka * semangka.getHargaBuah();
		totalPenjualanPisang = totalJualPisang * pisang.getHargaBuah();
		totalPenjualanMangga = totalJualMangga * mangga.getHargaBuah();
		
		ArrayList<Double> totalPenjualan = new ArrayList<Double>();
		totalPenjualan.add((double) totalPenjualanSemangka);
		totalPenjualan.add((double) totalPenjualanPisang);
		totalPenjualan.add((double) totalPenjualanMangga);

		//Menu 1
		if(inputMenu.equalsIgnoreCase("1")) {
			System.out.printf("Total Pemasukan Hari Senin \t : Rp %.2f", totalPemasukanHariSenin);
			System.out.println();
			System.out.printf("Total Pemasukan Hari Selasa \t : Rp %.2f", totalPemasukanHariSelasa);
			System.out.println();
			System.out.printf("Total Pemasukan Hari Rabu \t : Rp %.2f", totalPemasukanHariRabu);
			System.out.println();
			System.out.printf("Total Pemasukan Hari Kamis \t : Rp %.2f", totalPemasukanHariKamis);
			System.out.println();
			System.out.printf("Total Pemasukan Hari Jumat \t : Rp %.2f", totalPemasukanHariJumat);
			System.out.println();
			System.out.printf("Total Pemasukan Hari Sabtu \t : Rp %.2f", totalPemasukanHariSabtu);
			System.out.println();
			System.out.printf("Total Pemasukan Hari Minggu \t : Rp %.2f", totalPemasukanHariMinggu);
			System.out.println();			
		}
		 
		//Menu 2
		else if(inputMenu.equalsIgnoreCase("2")) {
			System.out.printf("Total Pemasukan Mingguan \t : Rp %.2f", totalPemasukanMingguan);
			System.out.println();			
		}

		//Menu 3
		else if(inputMenu.equalsIgnoreCase("3")) {
			System.out.printf("Total Pemasukan Bulanan \t : Rp %.2f", totalPemasukanBulanan);
			System.out.println();
			System.out.println();			
		}
		
		
		//Menu 4
		//List mencari nilai minimum penghasilan\
		else if(inputMenu.equalsIgnoreCase("4")) {
			System.out.print("Penghasilan Minimum Pada Hari "  + listHari.get(listPenghasilanHarian.indexOf(Collections.min(listPenghasilanHarian))));
			System.out.printf(" senilai \t : Rp %.2f", listPenghasilanHarian.get(listPenghasilanHarian.indexOf(Collections.min(listPenghasilanHarian))));
			System.out.println();
		}
		
		//Menu 5
		//List mencari nilai maksimum penghasilan\
		else if(inputMenu.equalsIgnoreCase("5")) {
			System.out.print("Penghasilan Maksimum Pada Hari "  + listHari.get(listPenghasilanHarian.indexOf(Collections.max(listPenghasilanHarian))));
			System.out.printf(" senilai \t : Rp %.2f", listPenghasilanHarian.get(listPenghasilanHarian.indexOf(Collections.max(listPenghasilanHarian))));
			System.out.println();
		}
		
		//Menu 6
		else if(inputMenu.equalsIgnoreCase("6")) {
			System.out.print("Masukkan hari ke 1 : ");
			hari1 = kb.next();
			System.out.print("Masukkan hari ke 2 : ");
			hari2 = kb.next();
			System.out.println();
			
			double val1 = 0, val2 = 0, val11 = 0, val22 = 0;
			for(double bandingHarga: listPenghasilanHarian) {
				if(hari1.equalsIgnoreCase("senin")) {
					val1 = listPenghasilanHarian.get(0);
				}
				else if(hari1.equalsIgnoreCase("selasa")) {
					val1 = listPenghasilanHarian.get(1);
				}
				else if(hari1.equalsIgnoreCase("rabu")) {
					val1 = listPenghasilanHarian.get(2);
				}
				else if(hari1.equalsIgnoreCase("kamis")) {
					val1 = listPenghasilanHarian.get(3);
				}
				else if(hari1.equalsIgnoreCase("jumat")) {
					val1 = listPenghasilanHarian.get(4);
				}
				else if(hari1.equalsIgnoreCase("sabtu")) {
					val1 = listPenghasilanHarian.get(5);
				}
				else if(hari1.equalsIgnoreCase("minggu")) {
					val1 = listPenghasilanHarian.get(6);
				}
				else {
					val1 = (Double) null;
				}
				
				if(hari2.equalsIgnoreCase("senin")) {
					val2 = listPenghasilanHarian.get(0);
				}
				else if(hari2.equalsIgnoreCase("selasa")) {
					val2 = listPenghasilanHarian.get(1);
				}
				else if(hari2.equalsIgnoreCase("rabu")) {
					val2 = listPenghasilanHarian.get(2);
				}
				else if(hari2.equalsIgnoreCase("kamis")) {
					val2 = listPenghasilanHarian.get(3);
				}
				else if(hari2.equalsIgnoreCase("jumat")) {
					val2 = listPenghasilanHarian.get(4);
				}
				else if(hari2.equalsIgnoreCase("sabtu")) {
					val2 = listPenghasilanHarian.get(5);
				}
				else if(hari2.equalsIgnoreCase("minggu")) {
					val2 = listPenghasilanHarian.get(6);
				}
				else {
					val2 = (Double) null;
				}
			}
				
			if(val1 != val2 && val1 < val2) {
				val11 = val1/val1;
				val22 = val2/val1;
				System.out.println("Perbandingan antara Hari " + hari1 + " dan "+ hari2 +" adalah " + Math.ceil(val11) + ":" + Math.ceil(val22) + ", pendapatan hari " + hari2 + " lebih besar.");
			}
			else if(val1 != val2 && val1 > val2) {
				val11 = val2/val2;
				val22 = val1/val2;
				System.out.println("Perbandingan antara Hari " + hari1 + " dan "+ hari2 +" adalah " + Math.ceil(val11) + ":" + Math.ceil(val22) + ", pendapatan hari "+ hari1 +" lebih besar.");
			}
			else {
				System.out.println("Hari tidak boleh sama");
			}
		}
		
		//Menu 7
		else if(inputMenu.equalsIgnoreCase("7")) {
			System.out.println("Banyak semangka yang terjual \t\t\t : " + totalJualSemangka + " kg");
			System.out.println("Banyak pisang yang terjual \t\t\t : " + totalJualPisang + " kg");		
			System.out.println("Banyak mangga yang terjual \t\t\t : " + totalJualMangga + " kg");
			
			//List mencari nilai minimum penghasilan\
			System.out.println("Buah paling banyak terjual \t\t\t : "  + jenisBuah.get(totalPerbuah.indexOf(Collections.max(totalPerbuah))));	
		}
		
		
		//Menu 8
		else if(inputMenu.equalsIgnoreCase("8")) {
			System.out.print("Penjualan terkecil selama seminggu yaitu buah " + jenisBuah.get(totalPenjualan.indexOf(Collections.max(totalPenjualan))));
			System.out.printf(" sebesar Rp %.2f", totalPenjualan.get(totalPenjualan.indexOf(Collections.max(totalPenjualan))));
			System.out.println();			
		}
		
		//Menu 9
		else if(inputMenu.equalsIgnoreCase("9")) {
			System.out.print("Penjualan terbesar selama seminggu yaitu buah " + jenisBuah.get(totalPenjualan.indexOf(Collections.min(totalPenjualan))));
			System.out.printf(" sebesar Rp %.2f", totalPenjualan.get(totalPenjualan.indexOf(Collections.min(totalPenjualan))));
			System.out.println();			
		}
		
		//Menu 10
		else if(inputMenu.equalsIgnoreCase("10")) {
			double laba = 0.2;
			double totalLabaSebulan = (laba * totalPemasukanBulanan);
			System.out.printf("Penghasilan Laba penjual selama sebulan \t : Rp %.2f", totalLabaSebulan);
		}
		
		else {
			System.out.println("Inputan Salah");
		}
	}
}