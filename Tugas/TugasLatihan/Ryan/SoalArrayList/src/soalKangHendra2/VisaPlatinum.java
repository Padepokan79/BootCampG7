package soalKangHendra2;

/**
 *SoalArrayList
 * VisaPlatinum.java
 ----------------------------
 * @author Ryan Ahmad Nuriana
 * 10.42.00 22 Jun 2018
 */
public class VisaPlatinum extends CreditCard implements Insentif{
	
	public VisaPlatinum(int banyakTerjual) {
		this.banyakTerjual = banyakTerjual;
	}
	int insentif() {
		return getBanyakTerjual()*insentifVisaPlatinum;
	}
	public int getBanyakTerjual() {
		return banyakTerjual;
	}
	public void setBanyakTerjual(int banyakTerjual) {
		this.banyakTerjual = banyakTerjual;
	}
}
