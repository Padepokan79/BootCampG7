package soal4;

/**
 * @author rifanandrian
 * @date Jun 22, 2018
 * @time 10:33:41 AM
 * email : muhamadrifanandrian@gmail.com
 */
public abstract class CreditCard implements IuranKartuKredit {
	int jumlah;
	
	int getJumlah() {
		return jumlah;
	}
	
	abstract int hitung();
	
}
