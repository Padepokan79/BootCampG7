/*
 * DATE CREATED    : 24 JUNI 2018
 * AUTHOR          : NURDHIAT CHAUDHARY MALIK
 * */

package SoalHendraYN;

import java.util.ArrayList;

public class MainAppSoal02 {

	public static void main(String[] args) {
		int totalCard = 0, totalPerBulan = 0, maxBulan = 12;
		
		Soal02Credit visaGold = new Soal02Credit("Visa Gold", 15);
		Soal02Credit masterTitanium = new Soal02Credit("Master Titanium", 8);
		Soal02Credit visaPlatinum = new Soal02Credit("Visa Platinum", 17);
		Soal02Credit masterMiles = new Soal02Credit("Master Worldmiles", 4);
		
		ArrayList<Soal02Credit> arrGold = new ArrayList<Soal02Credit>();
		arrGold.add(visaGold);
		ArrayList<Soal02Credit> arrTitanium = new ArrayList<Soal02Credit>();
		arrTitanium.add(masterTitanium);
		ArrayList<Soal02Credit> arrPlatinum = new ArrayList<Soal02Credit>();
		arrPlatinum.add(visaPlatinum);
		ArrayList<Soal02Credit> arrMiles = new ArrayList<Soal02Credit>();
		arrMiles.add(masterMiles);
		
		for (Soal02Credit gold : arrGold) {
			totalCard += gold.qtyCreditCard*gold.visaGold;
		}
		for (Soal02Credit titanium : arrTitanium) {
			totalCard += titanium.qtyCreditCard*titanium.masterTitanium;
		}
		for (Soal02Credit platinum : arrPlatinum) {
			totalCard += platinum.qtyCreditCard*platinum.visaPlatinum;
		}
		for (Soal02Credit miles : arrMiles) {
			totalCard += miles.qtyCreditCard*miles.masterWordmiles;
		}
		
		for(int index = 1; index <= maxBulan; index++) {
			if (index == 3) {
				totalPerBulan += totalCard - (totalCard*20)/100;
				System.out.println("Jumlah Insentif karyawan bulan ke "+index+" Rp."+totalPerBulan);
				System.out.println("Potongan sebesar 20%");
			}else {
				totalPerBulan += totalCard;
				System.out.println("Jumlah Insentif karyawan bulan ke "+index+" Rp."+totalPerBulan);
			}
			System.out.println("");
		}
		System.out.println("");
		System.out.println("Jumlah Insentif selama setahun Rp."+totalPerBulan);
		
	}
}
