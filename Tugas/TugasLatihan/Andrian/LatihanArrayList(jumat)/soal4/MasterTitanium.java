/**
 * 
 */
package soal4;

/**
 * @author rifanandrian
 * @date Jun 22, 2018
 * @time 1:41:54 PM
 * email : muhamadrifanandrian@gmail.com
 */
public class MasterTitanium extends CreditCard{
	private String nama="Master Titanium";

	
	int hitung() {
//		int total=0;
//		for (int tahun=1;tahun<=5;tahun++) {
//			if (tahun==3) {
//				total+=jumlah*iuranMasterTitanium*0.9;				
//			} else {
//				total+=jumlah*iuranMasterTitanium;
//			}
//		}
//		return total;
		return iuranMasterTitanium;
	}
	
	String getNama() {
		return nama;
	}
}
