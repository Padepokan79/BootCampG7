//Created by : Hendra Kurniawan
//Date 		 : 22 Juni 2018 Time : 10:39 AM
//Modified   :
package SoalHendraYN;

import java.util.ArrayList;

public class SoalKeempatMain implements SoalKeempatInterface{

	public static void main(String[] args) {
		int iuranTahunanKeluarga=0;
		// TODO Auto-generated method stub
		
		SoalKeempatCreditCard vGold = new SoalKeempatCreditCard("visa gold", visaGold);
		SoalKeempatCreditCard mTitanium = new SoalKeempatCreditCard("master titanium", masterTitanium);
		SoalKeempatCreditCard vPlatinum = new SoalKeempatCreditCard("visa platinum", visaPlatinum);
		SoalKeempatCreditCard mWorldmiles = new SoalKeempatCreditCard("master worldmiles", masterWorldmiles);
	
		ArrayList<SoalKeempatCreditCard> ayah = new ArrayList<>();
		ayah.add(mWorldmiles);
		ayah.add(vPlatinum);
		ArrayList<SoalKeempatCreditCard> ibu = new ArrayList<>();
		ibu.add(vGold);
		ibu.add(vPlatinum);
		ArrayList<SoalKeempatCreditCard> anak = new ArrayList<>();
		anak.add(mTitanium);
		
		
		for(int index=0; index < 5; index++) {
			iuranTahunanKeluarga=0;
			System.out.print("Iuran credit card tahun ke " + (index+1) +", sebesar Rp.");
			for (SoalKeempatCreditCard ayh : ayah) {
				iuranTahunanKeluarga += ayh.getIuranTahunan();	
			}
			for (SoalKeempatCreditCard ib : ibu) {
				iuranTahunanKeluarga += ib.getIuranTahunan();	
			}
			for (SoalKeempatCreditCard ank : anak) {
				iuranTahunanKeluarga += ank.getIuranTahunan();
			}
			if((index+1)==3) {
				System.out.println(iuranTahunanKeluarga-(iuranTahunanKeluarga*10/100));
			}
			else {
				System.out.println(iuranTahunanKeluarga);	
			}
		}	
	}
}
