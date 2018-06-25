package SoalHendraYN;

import java.util.ArrayList;

public class Soal02App {

	public static void main(String[] args) {
		
		int incomeGold = 0, incomeTitanium = 0, incomePlatinum = 0, incomeWorld = 0, incomeBulan = 0, incomeTahun = 0;
		
		Soal02 visaGold 		= new Soal02("Visa Gold", 15);
		Soal02 masterTitanium 	= new Soal02("Master Titanium", 8);
		Soal02 visaPlatinum 	= new Soal02("Visa Plainum", 17);
		Soal02 masterWorldmiles = new Soal02("Master Worldmiles", 4);
		
		ArrayList<Soal02> arrGold = new ArrayList<Soal02>();
		ArrayList<Soal02> arrTitanium = new ArrayList<Soal02>();
		ArrayList<Soal02> arrPlatinum = new ArrayList<Soal02>();
		ArrayList<Soal02> arrWorld = new ArrayList<Soal02>();
		
		arrGold.add(visaGold);
		arrTitanium.add(masterTitanium);
		arrPlatinum.add(visaPlatinum);
		arrWorld.add(masterWorldmiles);
		
		for(Soal02 credit : arrGold) {
			incomeGold = credit.qtyCredit*credit.visaGold;
		}for(Soal02 credit : arrTitanium) {
			incomeTitanium = credit.qtyCredit*credit.masterTitanium;
		}for(Soal02 credit : arrPlatinum) {
			incomePlatinum = credit.qtyCredit*credit.visaPlatinum;
		}for(Soal02 credit : arrWorld) {
			incomeWorld = credit.qtyCredit*credit.masterWorldmiles;
		}
		incomeBulan = incomeGold+incomeTitanium+incomePlatinum+incomeWorld;
		
		for(int index = 1; index <= 12; index++) {
			if (index == 3) {
				incomeTahun += incomeBulan-(incomeBulan*20/100);
				System.out.println("Biaya bulan ke "+index+" sebesar Rp. "+(incomeBulan-(incomeBulan*20/100)));
			}else {
				incomeTahun += incomeBulan;
				System.out.println("Biaya bulan ke "+index+" sebesar Rp. "+incomeTahun);
			}
		}
		System.out.println("Jumlah biaya intensif yang harus dibayar selama setahun adalah Rp. "+incomeTahun);
	}

}
