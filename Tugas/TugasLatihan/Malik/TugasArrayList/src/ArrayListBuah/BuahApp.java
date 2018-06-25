/*
 * Name Create 	: Malik Chaudhary
 * Time Create  : 2018-06-21
 * 
 * */

package ArrayListBuah;

import java.util.*;

public class BuahApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int menu, qtySemangka = 0, qtyPisang = 0, qtyMangga = 0, qtyBuah = 0;
		String namaHari, hariCompare1, hariCompare2;
		
		int incomeSenin = 0, 
			incomeSelasa= 0,
			incomeRabu  = 0, 
			incomeKamis = 0, 
			incomeJumat = 0,
			incomeSabtu = 0,
			incomeMinggu= 0,
			nilaiMaxMin = 0,
			indexHari   = 0;
		
		Buah mangga 	= new Buah("Mangga", 10000, 13, 12, 9, 15, 20, 9, 13);
		Buah semangka 	= new Buah("Semangka", 18000, 12, 15, 11, 8, 20, 10, 14);
		Buah pisang 	= new Buah("Pisang", 15000, 10, 14, 15, 7, 20, 13, 16);
		
		Buah jmlMangga 	= new Buah(13, 12, 9, 15, 20, 9, 13);
		Buah jmlSemangka= new Buah(12, 15, 11, 8, 20, 10, 14);
		Buah jmlPisang 	= new Buah(10, 14, 15, 7, 20, 13, 16);
		
		
		ArrayList<Buah> arrBuah 		= new ArrayList<Buah>();
		ArrayList<Buah> arrJmlSemangka	= new ArrayList<Buah>();
		ArrayList<Buah> arrJmlPisang	= new ArrayList<Buah>();
		ArrayList<Buah> arrJmlMangga	= new ArrayList<Buah>();
		ArrayList<Integer> arrIncomeMin = new ArrayList<Integer>();
		ArrayList<String> arrHari 		= new ArrayList<String>();
		ArrayList<Integer> arrHarga     = new ArrayList<Integer>();
		ArrayList<Integer> arrQtyBuah   = new ArrayList<Integer>();
		ArrayList<String> arrNamaBuah 	= new ArrayList<String>();
		ArrayList<Integer> arrPriceBuah   = new ArrayList<Integer>();
		
		arrHari.add("Senin");
		arrHari.add("Selasa");
		arrHari.add("Rabu");
		arrHari.add("Kamis");
		arrHari.add("Jumat");
		arrHari.add("Sabtu");
		arrHari.add("Minggu");
		
		arrBuah.add(mangga);
		arrBuah.add(semangka);
		arrBuah.add(pisang);
		
		arrJmlMangga.add(jmlMangga);
		arrJmlSemangka.add(jmlSemangka);
		arrJmlPisang.add(jmlPisang);
		
		for(Buah buah : arrBuah) {
			arrHarga.add(buah.getHarga());
		}
		
			arrNamaBuah.add("Mangga");
			arrNamaBuah.add("Semangka");
			arrNamaBuah.add("Pisang");
		

		for(Buah buah:arrBuah) {
			incomeSenin += buah.qty1*buah.getHarga();
			incomeSelasa += buah.qty2*buah.getHarga();
			incomeRabu += buah.qty3*buah.getHarga();
			incomeKamis += buah.qty4*buah.getHarga();
			incomeJumat += buah.qty5*buah.getHarga();
			incomeSabtu += buah.qty6*buah.getHarga();
			incomeMinggu += buah.qty7*buah.getHarga();
		}
		arrIncomeMin.add(incomeSenin);
		arrIncomeMin.add(incomeSelasa);
		arrIncomeMin.add(incomeRabu);
		arrIncomeMin.add(incomeKamis);
		arrIncomeMin.add(incomeJumat);
		arrIncomeMin.add(incomeSabtu);
		arrIncomeMin.add(incomeMinggu);
		
		for(Buah buah:arrJmlSemangka) {
			qtySemangka += buah.qty1;
			qtySemangka += buah.qty2;
			qtySemangka += buah.qty3;
			qtySemangka += buah.qty4;
			qtySemangka += buah.qty5;
			qtySemangka += buah.qty6;
			qtySemangka += buah.qty7;
		}for(Buah buah:arrJmlMangga) {
			qtyMangga += buah.qty1;
			qtyMangga += buah.qty2;
			qtyMangga += buah.qty3;
			qtyMangga += buah.qty4;
			qtyMangga += buah.qty5;
			qtyMangga += buah.qty6;
			qtyMangga += buah.qty7;
		}for(Buah buah:arrJmlPisang) {
			qtyPisang += buah.qty1;
			qtyPisang += buah.qty2;
			qtyPisang += buah.qty3;
			qtyPisang += buah.qty4;
			qtyPisang += buah.qty5;
			qtyPisang += buah.qty6;
			qtyPisang += buah.qty7;
		}

		arrQtyBuah.add(qtyMangga);
		arrQtyBuah.add(qtySemangka);
		arrQtyBuah.add(qtyPisang);

		int hargaWeekMangga = qtyMangga*arrHarga.get(0);
		int hargaWeekSemangka = qtySemangka*arrHarga.get(1);
		int hargaWeekPisang = qtyPisang*arrHarga.get(2);

		arrPriceBuah.add(hargaWeekMangga);
		arrPriceBuah.add(hargaWeekSemangka);
		arrPriceBuah.add(hargaWeekPisang);
		
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
		System.out.print("Pilih menu ? ");
		menu = scan.nextInt();
		if (menu == 1) {
			System.out.println();
			System.out.print("Masukan nama hari : ");
			namaHari = scan.next();
				if (namaHari.equals(arrHari.get(0))) {
					System.out.println("Penghasilan pada hari Senin : Rp. "+incomeSenin);
				}else if (namaHari.equals(arrHari.get(1))) {
					System.out.println("Penghasilan pada hari Selasa : Rp. "+incomeSelasa);
				}else if (namaHari.equals(arrHari.get(2))) {
					System.out.println("Penghasilan pada hari Rabu : Rp. "+incomeRabu);
				}else if (namaHari.equals(arrHari.get(3))) {
					System.out.println("Penghasilan pada hari Kamis : Rp. "+incomeKamis);
				}else if (namaHari.equals(arrHari.get(4))) {
					System.out.println("Penghasilan pada hari Jumat : Rp. "+incomeJumat);
				}else if (namaHari.equals(arrHari.get(5))) {
					System.out.println("Penghasilan pada hari Sabtu : Rp. "+incomeSabtu);
				}else if (namaHari.equals(arrHari.get(6))) {
					System.out.println("Penghasilan pada hari Minggu : Rp. "+incomeMinggu);
				}
		}else if (menu == 2) {
			System.out.println("Penghasilan Seminggu : Rp. "+(incomeSenin+incomeSelasa+incomeRabu+incomeKamis+incomeJumat+incomeSabtu+incomeMinggu));
		}else if (menu == 3) {
			System.out.println("Penghasilan Sebulan : Rp. "+(incomeSenin+incomeSelasa+incomeRabu+incomeKamis+incomeJumat+incomeSabtu+incomeMinggu)*4);
		}else if (menu == 4) {
			nilaiMaxMin = arrIncomeMin.get(0);
			for(int index = 1; index < arrIncomeMin.size(); index++) {
				if (nilaiMaxMin > arrIncomeMin.get(index)) {
					indexHari = index;
					nilaiMaxMin = arrIncomeMin.get(index);
				}
			}
			System.out.println("Penghasilan terkecil pada hari "+arrHari.get(indexHari)+" Sebesar : Rp. "+nilaiMaxMin);
		}else if (menu == 5) {
			nilaiMaxMin = arrIncomeMin.get(0);
			for(int index = 1; index < arrIncomeMin.size(); index++) {
				if (nilaiMaxMin < arrIncomeMin.get(index)) {
					indexHari = index;
					nilaiMaxMin = arrIncomeMin.get(index);
				}
			}
			System.out.println("Penghasilan terbesar pada hari "+arrHari.get(indexHari)+" Sebesar : Rp. "+nilaiMaxMin);
			
		}else if (menu == 6) {
			int price1 = 0, price2 = 0;
			System.out.println("Masukan Hari ke 1 : ");
			hariCompare1 = scan.next();
			System.out.println("Masukan Hari ke 2 : ");
			hariCompare2 = scan.next();
				for(int index = 0; index < arrHari.size(); index++) {
					if (hariCompare1.equals(arrHari.get(index))) {
						price1 = arrIncomeMin.get(index);
					}
				}
				for(int index = 0; index < arrHari.size(); index++) {
					if (hariCompare2.equals(arrHari.get(index))) {
						price2 = arrIncomeMin.get(index);
					}
				}
				if (price1 > price2) {
					System.out.println("Perbandingan hari "+hariCompare1+" dan "+hariCompare2+" adalah "+(price1-price2)+", pendapatan hari "+hariCompare1+" lebih besar");
				}else if (price1 < price2) {
					System.out.println("Perbandingan hari "+hariCompare1+" dan "+hariCompare2+" adalah "+(price2-price1)+", pendapatan hari "+hariCompare2+" lebih besar");
					
				}
		}else if (menu == 7) {
			String indexBuah = null;
			for(int index = 0; index < arrQtyBuah.size(); index++) {
				if (arrQtyBuah.get(index) > 0) {
					qtyBuah = arrQtyBuah.get(index);
					indexBuah = arrNamaBuah.get(index);
				}
			}
			System.out.println("Buah yang paling terbanyak terjual selama \nseminggu adalah buah "+indexBuah+" sebanyak "+qtyBuah);

		}else if (menu == 8 ) {
			int price = arrPriceBuah.get(0);
			String indexBuah = null;
			for(int index = 1; index < arrPriceBuah.size(); index++) {
				if (price < arrPriceBuah.get(index)) {
					indexBuah = arrNamaBuah.get(index);
					price = arrPriceBuah.get(index);
				}
			}
			System.out.println("Buah yang memiliki penghasilan penjualan terbesar \nselama seminggu adalah buah "+indexBuah+", sebesar Rp. "+price);
			
		}else if (menu == 9 ) {
			int price = arrPriceBuah.get(0);
			int indexBuah = 0;
			for(int index = 1; index < arrPriceBuah.size(); index++) {
				if (price > arrPriceBuah.get(index)) {
					indexBuah = index;
					price = arrPriceBuah.get(index);
				}
			}
			System.out.println("Buah yang memiliki penghasilan penjualan terkecil \nselama seminggu adalah buah "+arrNamaBuah.get(indexBuah)+", sebesar Rp. "+price);
			
		}else if (menu == 10 ) {
			System.out.println("Penghasilan laba penjualan pada hari "+arrHari.get(0)+" adalah Rp. "+arrIncomeMin.get(0)*20/100);
			System.out.println("Penghasilan laba penjualan pada hari "+arrHari.get(1)+" adalah Rp. "+arrIncomeMin.get(1)*20/100);
			System.out.println("Penghasilan laba penjualan pada hari "+arrHari.get(2)+" adalah Rp. "+arrIncomeMin.get(2)*20/100);
			System.out.println("Penghasilan laba penjualan pada hari "+arrHari.get(3)+" adalah Rp. "+arrIncomeMin.get(3)*20/100);
			System.out.println("Penghasilan laba penjualan pada hari "+arrHari.get(4)+" adalah Rp. "+arrIncomeMin.get(4)*20/100);
			System.out.println("Penghasilan laba penjualan pada hari "+arrHari.get(5)+" adalah Rp. "+arrIncomeMin.get(5)*20/100);
			System.out.println("Penghasilan laba penjualan pada hari "+arrHari.get(6)+" adalah Rp. "+arrIncomeMin.get(6)*20/100);
			System.out.println();
			System.out.println("Penghasilan laba penjualan selama sebulan adalah Rp. "+(incomeSenin+incomeSelasa+incomeRabu+incomeKamis+incomeJumat+incomeSabtu+incomeMinggu)*4*20/100);
		}
	}
}
