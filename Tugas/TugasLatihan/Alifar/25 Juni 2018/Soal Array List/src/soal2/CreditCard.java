package soal2;

public abstract class CreditCard implements Insentif {
	int terjual;
	
	int getTerjual() {
		return terjual;
	}
	
	abstract int hitung();
	abstract String getNama();
}
