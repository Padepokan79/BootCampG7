/**
 * 
 */
package soalKangHendra2;

/**
 *SoalArrayList
 * MasterWorldMiles.java
 ----------------------------
 * @author Ryan Ahmad Nuriana
 * 10.42.21 22 Jun 2018
 */
public class MasterWorldMiles extends CreditCard implements Insentif{
	
	public MasterWorldMiles(int banyakTerjual) {
		this.banyakTerjual = banyakTerjual;
	}
	int insentif() {
		return getBanyakTerjual()*insentifMasterWorldMiles;
	}
	public int getBanyakTerjual() {
		return banyakTerjual;
	}
	public void setBanyakTerjual(int banyakTerjual) {
		this.banyakTerjual = banyakTerjual;
	}
}
