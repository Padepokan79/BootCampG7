/**
 * 
 */
package soal4;

/**
 * @author rifanandrian
 * @date Jun 22, 2018
 * @time 1:42:17 PM
 * email : muhamadrifanandrian@gmail.com
 */
public class VisaPlatinum extends CreditCard {
	private String nama="Visa Platinum";
	

	int hitung() {
//		int total=0;
//		for (int tahun=1;tahun<=5;tahun++) {
//			if (tahun==3) {
//				total+=jumlah*iuranVisaPlatinum*0.9;				
//			} else {
//				total+=jumlah*iuranVisaPlatinum;
//			}
//		}
//		return total;
		return iuranVisaPlatinum;
	}
	
	String getNama() {
		return nama;
	}
	
}
