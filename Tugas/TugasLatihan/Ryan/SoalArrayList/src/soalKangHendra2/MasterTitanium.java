
package soalKangHendra2;

/**
 *SoalArrayList
 * masterTitanium.java
 ----------------------------
 * @author Ryan Ahmad Nuriana
 * 10.40.48 22 Jun 2018
 */
public class MasterTitanium extends CreditCard implements Insentif{
	
	public MasterTitanium(int banyakTerjual) {
		this.banyakTerjual = banyakTerjual;
	}
	int insentif() {
		return getBanyakTerjual()*insentifMasterTitanium;
	}
	public int getBanyakTerjual() {
		return banyakTerjual;
	}
	public void setBanyakTerjual(int banyakTerjual) {
		this.banyakTerjual = banyakTerjual;
	}
}
