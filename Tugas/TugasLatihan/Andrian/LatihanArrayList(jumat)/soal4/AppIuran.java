/**
 * 
 */
package soal4;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author rifanandrian
 * @date Jun 22, 2018
 * @time 1:44:52 PM
 * email : muhamadrifanandrian@gmail.com
 */
public class AppIuran {
	
	public static void main(String[] args) {
		int total=0;
		
		CreditCard card1 = new VisaGold();
		CreditCard card2 = new MasterTitanium();
		CreditCard card3 = new VisaPlatinum();
		CreditCard card4 = new MasterWorldmiles();
		
		Person orng1 = new Person("Ayah", card4, card3);
		Person orng2 = new Person("Ibu", card1, card3);
		Person orng3 = new Person("Anak", card2);
		
		ArrayList<Person> kelarga= new ArrayList<Person>(Arrays.asList(orng1, orng2, orng3));
		
		for (int tahun=1; tahun<=5; tahun++) {
			//System.out.println("Tahun ke "+tahun);
			for(Person orang:kelarga) {
				int temp=0;
				for(CreditCard kartu:orang.kartu) {
					if (tahun==3) {
						temp+=kartu.hitung()*0.9;				
					} else {
						temp+=kartu.hitung();
					}
				}
				//System.out.println(temp);
				total+=temp;
			}
			//System.out.println();
		}		
		System.out.println("Total pembayaran selama 5tahun adalah "+total);
	}

}
