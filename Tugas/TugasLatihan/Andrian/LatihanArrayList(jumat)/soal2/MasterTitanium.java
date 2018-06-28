/**
 * 
 */
package soal2;

/**
 * @author rifanandrian
 * @date Jun 22, 2018
 * @time 11:01:57 AM
 * email : muhamadrifanandrian@gmail.com
 */
public class MasterTitanium extends CreditCard implements Intensif {
	public MasterTitanium(int terjual) {
		this.terjual=terjual;
	}
	
	int hitung() {
		int total=0;
		for (int bulan=0;bulan<12;bulan++) {
			if (bulan==2) {
				total+=terjual*insentifMasterTitanium*0.8;				
			} else {
				total+=terjual*insentifMasterTitanium;
			}
		}
		return total;
	}
}

