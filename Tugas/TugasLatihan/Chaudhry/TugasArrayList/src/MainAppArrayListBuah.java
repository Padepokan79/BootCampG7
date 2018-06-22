import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * DATE CREATED : 21 Juni 2018
 * AUTHOR       : NURDHIAT CHAUDHARY MALIK
 * */
public class MainAppArrayListBuah {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int incomeSenin  = 0;		int incomeJumat  = 0;		int hargaBanding1 = 0;		int laba  = 0;					int penjualanMangga = 0;
		int incomeSelasa = 0;		int incomeSabtu  = 0;		int hargaBanding2 = 0;		int total = 0;
		int incomeRabu   = 0;		int incomeMinggu = 0;		int totalSemangka = 0;		int indexBuah = 0;
		int incomeKamis  = 0;		int nilaiMaxMin = 0; 		int totalPisang   = 0;		int penjualanSemangka = 0;
		int incomePerMinggu = 0;	int indexHari    = 0;		int totalMangga   = 0;		int penjualanPisang = 0;
		String inputAngka, inputHari, inputHariBanding1, inputHariBanding2, lanjutkan;
		boolean studiBanding1, studiBanding2;
		
		Buah buahSemangka = new Buah("Semangka", 18000, 12, 15, 11, 8, 20, 10, 14);		Buah stokSemangka = new Buah(12, 15, 11, 8, 20, 10, 14);
		Buah buahPisang = new Buah("Pisang", 15000, 10, 14, 15, 7, 20, 13, 16);			Buah stokPisang = new Buah(10, 14, 15, 7, 20, 13, 16);
		Buah buahMangga = new Buah("Mangga", 10000, 13, 12, 9, 15, 20, 9, 13);			Buah stokMangga = new Buah(13, 12, 9, 15, 20, 9, 13);
		
		ArrayList<Buah> listBuah = new ArrayList<Buah>();				ArrayList<Buah> totalBuahPisang = new ArrayList<Buah>();
		ArrayList<String> listHari = new ArrayList<String>();			ArrayList<Buah> totalBuahMangga = new ArrayList<Buah>();
		ArrayList<Integer> listIncome = new ArrayList<Integer>();		ArrayList<String> namaBuah = new ArrayList<String>();
		ArrayList<Integer> totalBuah = new ArrayList<Integer>();		ArrayList<Integer> hasilJual = new ArrayList<Integer>();
		ArrayList<Buah> totalBuahSemangka = new ArrayList<Buah>();
		
		listBuah.add(buahSemangka);			totalBuahSemangka.add(stokSemangka);
		listBuah.add(buahPisang);			totalBuahPisang.add(stokPisang);
		listBuah.add(buahMangga);			totalBuahMangga.add(stokMangga);
		listHari.add("Senin");				namaBuah.add("Semangka");
		listHari.add("Selasa");				namaBuah.add("Pisang");
		listHari.add("Rabu");				namaBuah.add("Mangga");
		listHari.add("Kamis");
		listHari.add("Jumat");
		listHari.add("Sabtu");
		listHari.add("Minggu");
		
		for (Buah buah : listBuah) {
			incomeSenin += buah.getHargaBuah()*buah.jmlTerjual1;
			incomeSelasa += buah.getHargaBuah()*buah.jmlTerjual2;
			incomeRabu += buah.getHargaBuah()*buah.jmlTerjual3;
			incomeKamis += buah.getHargaBuah()*buah.jmlTerjual4;
			incomeJumat += buah.getHargaBuah()*buah.jmlTerjual5;
			incomeSabtu += buah.getHargaBuah()*buah.jmlTerjual6;
			incomeMinggu += buah.getHargaBuah()*buah.jmlTerjual7;
		}
		listIncome.add(incomeSenin);
		listIncome.add(incomeSelasa);
		listIncome.add(incomeRabu);
		listIncome.add(incomeKamis);
		listIncome.add(incomeJumat);
		listIncome.add(incomeSabtu);
		listIncome.add(incomeMinggu);
		incomePerMinggu += incomeSenin + incomeSelasa + incomeRabu + incomeKamis + incomeJumat + incomeSabtu + incomeMinggu;
		
		for (Buah semangka : totalBuahSemangka) {			for (Buah pisang : totalBuahPisang) {			for (Buah mangga : totalBuahMangga) {
			totalSemangka += semangka.jmlTerjual1;				totalPisang += pisang.jmlTerjual1;				totalMangga += mangga.jmlTerjual1;
			totalSemangka += semangka.jmlTerjual2;				totalPisang += pisang.jmlTerjual2;				totalMangga += mangga.jmlTerjual2;
			totalSemangka += semangka.jmlTerjual3;				totalPisang += pisang.jmlTerjual3;				totalMangga += mangga.jmlTerjual3;
			totalSemangka += semangka.jmlTerjual4;				totalPisang += pisang.jmlTerjual4;				totalMangga += mangga.jmlTerjual4;
			totalSemangka += semangka.jmlTerjual5;				totalPisang += pisang.jmlTerjual5;				totalMangga += mangga.jmlTerjual5;
			totalSemangka += semangka.jmlTerjual6;				totalPisang += pisang.jmlTerjual6;				totalMangga += mangga.jmlTerjual6;
			totalSemangka += semangka.jmlTerjual7;				totalPisang += pisang.jmlTerjual7;				totalMangga += mangga.jmlTerjual7;
		}													}												}
		
		totalBuah.add(totalSemangka);
		totalBuah.add(totalPisang);
		totalBuah.add(totalMangga);
		
		penjualanSemangka = totalSemangka*18000;
		penjualanPisang = totalPisang*15000;
		penjualanMangga = totalMangga*10000;
		hasilJual.add(penjualanSemangka);
		hasilJual.add(penjualanPisang);
		hasilJual.add(penjualanMangga);
		
		do {
			System.out.println("Pedagang Buah ------------------");
			System.out.println("[1] --> Penghasilan perhari");
			System.out.println("[2] --> Penghasilan perminggu");
			System.out.println("[3] --> Penghasilan sebulan");
			System.out.println("[4] --> Penghasilan terkecil");
			System.out.println("[5] --> Penghasilan terbesar");
			System.out.println("[6] --> Perbandingan penghasilan");
			System.out.println("[7] --> Buah yang paling banyak terjual selama seminggu");
			System.out.println("[8] --> Buah yang memiliki penghasilan penjualan terbesar selama seminggu");
			System.out.println("[9] --> Buah yang memiliki penghasilan penjualan terkecil selama seminggu");
			System.out.println("[10] --> Hitung Penghasilan Laba penjual selama sebulan");
			System.out.print("Masukan angka 1 - 10 : ");
			inputAngka = scan.nextLine();
			
			System.out.println("");
			System.out.println("-----------------------------------------------------------");
			if (inputAngka.equals("1")) {
				System.out.print("Masukan Hari : ");
				inputHari = scan.nextLine();
				
				if (inputHari.equals(listHari.get(0))) {
					System.out.println("Penghasilan Penjualan pada Hari Senin : Rp."+incomeSenin);
				
				}else if (inputHari.equals(listHari.get(1))) {
					System.out.println("Penghasilan Penjualan pada Hari Selasa : Rp."+incomeSelasa);
				
				}else if (inputHari.equals(listHari.get(2))) {
					System.out.println("Penghasilan Penjualan pada Hari Rabu : Rp."+incomeRabu);
				
				}else if (inputHari.equals(listHari.get(3))) {
					System.out.println("Penghasilan Penjualan pada Hari Kamis : Rp."+incomeKamis);
				
				}else if (inputHari.equals(listHari.get(4))) {
					System.out.println("Penghasilan Penjualan pada Hari Jumat : Rp."+incomeJumat);
				
				}else if (inputHari.equals(listHari.get(5))) {
					System.out.println("Penghasilan Penjualan pada Hari Sabtu : Rp."+incomeSabtu);
				
				}else if (inputHari.equals(listHari.get(6))) {
					System.out.println("Penghasilan Penjualan pada Hari Minggu : Rp."+incomeMinggu);
				}
			
			}else if(inputAngka.equals("2")) {
				System.out.println("Total Penghasilan penjualan selama seminggu : Rp."+incomePerMinggu);
				
			}else if(inputAngka.equals("3")) {
				incomePerMinggu += incomeSenin + incomeSelasa + incomeRabu + incomeKamis + incomeJumat + incomeSabtu + incomeMinggu;
				System.out.println("Total Penghasilan penjualan selama sebulan : Rp."+(incomePerMinggu*4));
				
			}else if(inputAngka.equals("4")) {				
				nilaiMaxMin = listIncome.get(0);
				for(int index = 1; index < listIncome.size(); index++) {
					if (nilaiMaxMin > listIncome.get(index)) {
						indexHari = index;
						nilaiMaxMin = listIncome.get(index);
					}
				}
				System.out.println("Penghasilan Terkecil pada hari : "+listHari.get(indexHari)+", Penghasilan : " +nilaiMaxMin);
				
			}else if(inputAngka.equals("5")) {
				nilaiMaxMin = listIncome.get(0);
				for(int index = 1; index < listIncome.size(); index++) {
					if (nilaiMaxMin < listIncome.get(index)) {
						indexHari = index;
						nilaiMaxMin = listIncome.get(index);
					}
				}
				System.out.println("Penghasilan Terbesar pada hari : "+listHari.get(indexHari)+", Penghasilan : " +nilaiMaxMin);
				
			}else if(inputAngka.equals("6")) {
				System.out.print("Masukan hari ke 1 : ");
				inputHariBanding1 = scan.nextLine();
				for(int index = 0; index < listHari.size(); index++) {
					if (listHari.get(index).equals(inputHariBanding1)) {
						hargaBanding1 = listIncome.get(index);
					}
				}
				System.out.print("Masukan hari ke 2 : ");
				inputHariBanding2 = scan.nextLine();
				for(int index = 0; index < listHari.size(); index++) {
					if (listHari.get(index).equals(inputHariBanding2)) {
						hargaBanding2 = listIncome.get(index);
					}
				}
				studiBanding1 = hargaBanding1 > hargaBanding2;
				studiBanding2 = hargaBanding2 > hargaBanding1;
				if (hargaBanding1 - hargaBanding2 < 0) {
					hargaBanding1 = hargaBanding2 - hargaBanding1;
				
				}else if(hargaBanding2 - hargaBanding1 < 0) {
					hargaBanding1 = hargaBanding1 - hargaBanding2;
				}
				System.out.print("Perbandingan antara Hari "+inputHariBanding1+" dan "+inputHariBanding2+" adalah "+hargaBanding1+", ");
				if (studiBanding1) {
					System.out.println("Pendapatan hari "+inputHariBanding1+" Lebih besar");
				
				}else if (studiBanding2) {
					System.out.println("Pendapatan hari "+inputHariBanding2+" Lebih besar");
				}
				
			}else if(inputAngka.equals("7")) {
				for(int index = 0; index < totalBuah.size(); index++) {
					if (totalBuah.get(index) > total) {
						total = totalBuah.get(index);
						indexBuah = index;
					}
				}
				System.out.println("Penjualan terbanyak dalam seminggu, Buah "+namaBuah.get(indexBuah)+" dengan Total "+total+" kg");
			
			}else if(inputAngka.equals("8")) {			
				nilaiMaxMin = hasilJual.get(0);
				for (int index = 1; index < namaBuah.size(); index++) {
					if (nilaiMaxMin < hasilJual.get(index)) {
						nilaiMaxMin = hasilJual.get(index);
						indexBuah = index;
					}
				}
				System.out.println("Buah dengan penghasilan terbesar selama seminggu, buah "+namaBuah.get(indexBuah)+" sebesar Rp."+nilaiMaxMin);
				
			}else if(inputAngka.equals("9")) {
				nilaiMaxMin = hasilJual.get(0);
				for (int index = 1; index < namaBuah.size(); index++) {
					if (nilaiMaxMin > hasilJual.get(index)) {
						nilaiMaxMin = hasilJual.get(index);
						indexBuah = index;
					}
				}
				System.out.println("Buah dengan penghasilan terkecil selama seminggu, buah "+namaBuah.get(indexBuah)+" sebesar Rp."+nilaiMaxMin);
				
			}else if(inputAngka.equals("10")) {
				laba = ( (incomePerMinggu*4)*20 )/100;
				System.out.println("Laba dari hasil penjualan Rp."+laba);
			}
			
			System.out.print("Mau menghitung yang lain | Y / T | ?");
			lanjutkan = scan.nextLine();
			
		}while(lanjutkan.equals("Y"));
		
	}
}
