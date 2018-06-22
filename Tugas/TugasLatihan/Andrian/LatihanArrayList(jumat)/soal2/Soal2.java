/**
 * 
 */
package soal2;

/**
 * @author rifanandrian
 * @date Jun 22, 2018
 * @time 11:19:43 AM
 * email : muhamadrifanandrian@gmail.com
 */
import java.util.*;
public class Soal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total=0;
		
		VisaGold card1 = new VisaGold(15);
		MasterTitanium card2 = new MasterTitanium(8);
		VisaPlatinum card3 = new VisaPlatinum(17);
		MasterWorldmiles card4 = new MasterWorldmiles(4);
		
		ArrayList<CreditCard> kartu= new ArrayList<CreditCard>();
		kartu.add(card1);
		kartu.add(card2);
		kartu.add(card3);
		kartu.add(card4);
		
		for (CreditCard uang: kartu) {
//			System.out.println(uang.hitung());
			total+=uang.hitung();
		}
		
		System.out.println("Total pendapatan dengan menjual kartu kredit selama setahun adalah "+total);
		
		
		
		
	}

}
