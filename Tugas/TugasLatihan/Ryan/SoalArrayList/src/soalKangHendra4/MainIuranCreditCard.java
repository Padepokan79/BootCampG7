package soalKangHendra4;

import java.util.ArrayList;

/**
 *SoalArrayList
 * MainIuranCreditCard.java
 ----------------------------
 * @author Ryan Ahmad Nuriana
 * 13.10.16 22 Jun 2018
 */
public class MainIuranCreditCard {
	public static void main(String[] args) {
		
		int temp=0;
		
		CreditCard ayah = new CreditCard("Ayah", "Master Worldmiles", 1);
		CreditCard ayah1 = new CreditCard("Ayah", "Visa Platinum", 1);
		CreditCard ibu = new CreditCard("Ibu", "Visa Platinum", 1);
		CreditCard ibu2 = new CreditCard("Ibu", "Visa Gold", 1);
		CreditCard anak = new CreditCard("Anak", "Master Titanium", 1);
		
		ArrayList<Integer> bayarPertahun = new ArrayList<Integer>();
		
		for (int i = 0; i < 5; i++) {
			temp = temp +ayah.tagihanPertahun();
			temp = temp +ayah1.tagihanPertahun();
			temp = temp +ibu.tagihanPertahun();
			temp = temp +ibu2.tagihanPertahun();
			temp = temp +anak.tagihanPertahun();
			bayarPertahun.add(temp);
			temp = 0;
		}
		for (Integer integer : bayarPertahun) {
			temp = temp + integer;
		}
		 temp = temp - (bayarPertahun.get(2)*10/100);
		 System.out.println("Tagihan dalam 5 tahun + potongan 10% untuk semua jenis kartu adalah Rp."+temp);
		
	}

}
