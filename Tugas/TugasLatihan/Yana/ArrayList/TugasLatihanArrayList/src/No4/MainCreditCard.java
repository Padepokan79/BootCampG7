package No4;

import java.util.ArrayList;

public class MainCreditCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreditCard ayah = new CreditCard("Ayah", 0,0,1,1);
		CreditCard ibu 	= new CreditCard("Ibu", 1,0,1,0);
		CreditCard anak = new CreditCard("Anak", 0,1,0,1);
		
		double iuranTahunan = 0;
		
		ArrayList<CreditCard> listCreditCard = new ArrayList<CreditCard>();
		listCreditCard.add(ayah);
		listCreditCard.add(ibu);
		listCreditCard.add(anak);
		
		for (int index = 1; index <= 12; index++) {
			System.out.println("Bulan ke "+index);
			for(CreditCard hasil : listCreditCard) {
				iuranTahunan += hasil.tagihanIuran(index);
				System.out.println(String.format("%.0f", iuranTahunan));
			}
		}
		
//		for(CreditCard tagihan : listCreditCard) {
//			System.out.println("");
//		}
		System.out.println("Total Tahihan : "+String.format("%.0f", iuranTahunan));
	}

}
