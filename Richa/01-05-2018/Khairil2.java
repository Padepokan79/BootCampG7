public class Khairil2 {
	public static void main (String[] args) {

		double phiPer, phiDec, jari1, jari2, luas2, luas1;

		phiPer = 22/7;
		phiDec = 3.14;
		jari1 = 21/14;
		jari2= 2.456;
		luas1 = jari1*phiPer;
		luas2 = jari2*phiDec;


		System.out.println ("Seorang guru sedang mengajarkan kepada muridnya untuk menghitung luas lingkaran.\nSetiap masing-masing lingkaran memiliki perhitungan yang berbeda.\napabila jari-jari memiliki ukuran kelipatan 7 maka pergunakan konstanta phi = 22/7\ndan apabila bukan kelipatan 7 maka pergunakan konstanta phi = 3,14.");
		System.out.println ("Luas lingkaran dengan jari-jari 21/14 cm meggunakan phi = 22/7 " + luas1 + " cm kuadrat");
		System.out.println ("Luas lingkaran dengan jari-jari 2.456 cm meggunakan phi = 3.14 " + luas2 + " cm kuadrat");
	}
}
