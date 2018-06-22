/**
 * 
 */
package soal2;

/**
 * @author rifanandrian
 * @date Jun 22, 2018
 * @time 10:25:46 AM
 * email : muhamadrifanandrian@gmail.com
 */
public class VisaGold extends CreditCard implements Intensif{
	public VisaGold(int terjual) {
		this.terjual=terjual;
	}
	
	int hitung() {
		int total=0;
		for (int bulan=0;bulan<12;bulan++) {
			if (bulan==2) {
				total+=terjual*insentifVisaGold*0.8;				
			} else {
				total+=terjual*insentifVisaGold;
			}
		}
		return total;
	}
}

