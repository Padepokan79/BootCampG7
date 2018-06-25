/**
 * 
 */
package soal2;

/**
 * @author rifanandrian
 * @date Jun 22, 2018
 * @time 11:05:48 AM
 * email : muhamadrifanandrian@gmail.com
 */
public class MasterWorldmiles extends CreditCard implements Intensif {
	
	public MasterWorldmiles(int terjual) {
		this.terjual=terjual;
	}
	
	int hitung() {
		int total=0;
		for (int bulan=0;bulan<12;bulan++) {
			if (bulan==2) {
				total+=terjual*insentifMasterWorldmiles*0.8;				
			} else {
				total+=terjual*insentifMasterWorldmiles;
			}
		}
		return total;
	}
}
