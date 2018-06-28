package SoalHendraYN;

import java.util.ArrayList;

public class Soal04App{

	public static void main(String[] args) {
		int cardGold = 0, cardTitanium = 0, cardPlatinum = 0, cardWolrdmiles = 0, besarIuranTahun = 0,
			besarIuran = 0, jangkaIuran = 5;
		Soal04 ayah = new Soal04("Ayah", 0, 0, 1, 1);
		Soal04 ibu = new Soal04("Ibu", 1, 0, 1, 0);
		Soal04 anak = new Soal04("Anak", 0, 1, 0, 0);
		
		
		ArrayList<Soal04> arrCredit = new ArrayList<Soal04>();
		ArrayList<String> arrNamaCredit = new ArrayList<String>();
		ArrayList<Integer> arrBesarIuranOrang = new ArrayList<Integer>();
		
		arrCredit.add(ayah);
		arrCredit.add(ibu);
		arrCredit.add(anak);
		
		arrNamaCredit.add("Visa Gold");
		arrNamaCredit.add("Master Platinum");
		arrNamaCredit.add("Visa Platinum");
		arrNamaCredit.add("Master Worldmiles");
		
		for(Soal04 creditCard : arrCredit) {
			cardGold += creditCard.qtyGold*creditCard.visaGold;
			cardTitanium += creditCard.qtyTitanium*creditCard.masterTitanium;
			cardPlatinum += creditCard.qtyPlatinum*creditCard.visaPlatinum;
			cardWolrdmiles += creditCard.qtyWorldmiles*creditCard.masterWorldmiles;
		}
		
		arrBesarIuranOrang.add(cardGold);
		arrBesarIuranOrang.add(cardTitanium);
		arrBesarIuranOrang.add(cardPlatinum);
		arrBesarIuranOrang.add(cardWolrdmiles);
		
		besarIuranTahun = cardGold+cardTitanium+cardPlatinum+cardWolrdmiles;
		
		for(int index = 1; index <= jangkaIuran; index++) {
			if (index == 3) {
				besarIuran += besarIuranTahun-(besarIuranTahun*10/100);
				System.out.println("Iuran tahun ke "+index+" sebesar Rp. "+(besarIuranTahun-(besarIuranTahun*10/100)));
			}else {
				besarIuran += besarIuranTahun;
				System.out.println("Iuran tahun ke "+index+" sebesar Rp. "+besarIuran);
			}
			
		}
		System.out.println();
		System.out.println("Total iuran yang dibayar Rp. "+besarIuran);
		

	}

}
