/**
 * 
 */
package soal4;

/**
 * @author rifanandrian
 * @date Jun 22, 2018
 * @time 1:26:17 PM
 * email : muhamadrifanandrian@gmail.com
 */
public class VisaGold extends CreditCard {
	private String nama="Visa Gold";

	int hitung() {
//		int total=0;
//		for (int tahun=1;tahun<=5;tahun++) {
//			if (tahun==3) {
//				total+=jumlah*iuranVisaGold*0.9;				
//			} else {
//				total+=jumlah*iuranVisaGold;
//			}
//		}
//		return total;
		return iuranVisaGold;
	}
	
	String getNama() {
		return nama;
	}

}
