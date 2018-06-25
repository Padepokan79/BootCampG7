package soalKangHendra2;

/**
 *SoalArrayList
 * VisaGold.java
 ----------------------------
 * @author Ryan Ahmad Nuriana
 * 10.40.34 22 Jun 2018
 */
public class VisaGold extends CreditCard implements Insentif{
	
	public VisaGold(int banyakTerjual) {
		this.banyakTerjual = banyakTerjual;
	}
	int insentif() {
		return getBanyakTerjual()*insentifVisaGold;
	}
	public int getBanyakTerjual() {
		return banyakTerjual;
	}
	public void setBanyakTerjual(int banyakTerjual) {
		this.banyakTerjual = banyakTerjual;
	}
}
