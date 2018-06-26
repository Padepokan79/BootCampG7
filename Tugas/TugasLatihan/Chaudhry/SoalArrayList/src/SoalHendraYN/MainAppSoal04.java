/*
 * DATE CREATED    : 24 JUNI 2018
 * AUTHOR          : NURDHIAT CHAUDHARY MALIK
 * */

package SoalHendraYN;

import java.util.ArrayList;

public class MainAppSoal04 {

	public static void main(String[] args) {
		int totalIuran = 0, besarIuran = 0, iuranAyah = 0, iuranIbu = 0, iuranAnak = 0, jangkaTahun = 5;
		
		ArrayList<String> namaCredit = new ArrayList<String>();
		namaCredit.add("Visa Gold");
		namaCredit.add("Master Titanium");
		namaCredit.add("Visa Platinum");
		namaCredit.add("Master Worldmiles");
		
		Soal04CreditCard ayah = new Soal04CreditCard("Ayah", 0, 0, 1, 1);
		Soal04CreditCard ibu = new Soal04CreditCard("Ibu", 1, 0, 1, 0);
		Soal04CreditCard anak = new Soal04CreditCard("Anak", 0, 1, 0, 0);
		
		ArrayList<Soal04CreditCard> arrAyah = new ArrayList<Soal04CreditCard>();
		arrAyah.add(ayah);
		ArrayList<Soal04CreditCard> arrIbu = new ArrayList<Soal04CreditCard>();
		arrIbu.add(ibu);
		ArrayList<Soal04CreditCard> arrAnak = new ArrayList<Soal04CreditCard>();
		arrAnak.add(anak);
		
		ArrayList<Integer> iuranKelg = new ArrayList<Integer>();
		for (Soal04CreditCard father : arrAyah) {
			iuranAyah = father.qtyWorldmiles*father.masterWordmiles + father.qtyPlatinum*father.visaPlatinum;
			iuranKelg.add(iuranAyah);
			totalIuran += iuranAyah;
		}
		for (Soal04CreditCard mother : arrIbu) {
			iuranIbu = mother.qtyGold*mother.visaGold + mother.qtyPlatinum*mother.visaPlatinum;
			iuranKelg.add(iuranIbu);
			totalIuran += iuranIbu;
		}
		for (Soal04CreditCard son : arrAnak) {
			iuranAnak = son.qtyTitanium*son.masterTitanium;
			iuranKelg.add(iuranAnak);
			totalIuran += iuranAnak;
		}
		
		for(int index = 1; index <= jangkaTahun; index++) {
			System.out.println("Tahun ke "+index+" ------------");
			if (index == 3) {
				besarIuran += totalIuran - (totalIuran*10)/100;
				System.out.println("Iuran : Rp."+besarIuran);
				System.out.println("Potongan 10% untuk semua jenis kartu");
			}else {
				besarIuran += totalIuran;
				System.out.println("Iuran : Rp."+besarIuran);
			}
			System.out.println("");
		}
		
		
	}
}
