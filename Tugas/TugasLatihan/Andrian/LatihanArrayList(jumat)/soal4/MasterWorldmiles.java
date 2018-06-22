/**
 * 
 */
package soal4;

/**
 * @author rifanandrian
 * @date Jun 22, 2018
 * @time 1:42:38 PM
 * email : muhamadrifanandrian@gmail.com
 */
public class MasterWorldmiles extends CreditCard {
	private String nama="Master Worldmiles";
	

	
	int hitung() {
//		int total=0;
//		for (int tahun=1;tahun<=5;tahun++) {
//			if (tahun==3) {
//				total+=jumlah*iuranMasterWorldmiles*0.9;				
//			} else {
//				total+=jumlah*iuranMasterWorldmiles;
//			}
//		}
//		return total;
		return iuranMasterWorldmiles;
	}
	
	String getNama() {
		return nama;
	}
}
