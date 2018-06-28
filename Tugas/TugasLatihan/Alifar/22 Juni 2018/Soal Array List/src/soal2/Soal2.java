package soal2;

import java.util.ArrayList;

/**
 * Created by : Alifhar Juliansyah
 * Jun 22, 2018
 * 11:16:13 AM
 */

public class Soal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total=0;
		
		VisaGold jml=new VisaGold(15);
		MasterTitanium jml2=new MasterTitanium(8);
		VisaPlatinum jml3=new VisaPlatinum(17);
		MasterWorldmiles jml4=new MasterWorldmiles(4);
		
		ArrayList<CreditCard> card=new ArrayList<CreditCard>();
		card.add(jml);
		card.add(jml2);
		card.add(jml3);
		card.add(jml4);
		
		for(CreditCard each:card) {
			System.out.println("Insentif dari Credit Card "+each.getNama()+" adalah "+each.hitung());
			total+=each.hitung();
		}
		
		System.out.println("\nTotal uang yang didapatkan selama satu tahun adalah "+total);
	}

}
