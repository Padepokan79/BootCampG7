public class Khairil2 {
	public static void main (String[] args) {

		double phi, jari1, jari2, luas2, luas1;

		phi = 22/7;
		jari1 = 21/14;
		luas1 = (jari1*jari1)*phi;
		phi = 3.14;
		jari2= 2.456;
		luas2 = (jari2*jari2)*phi;


		System.out.println ("Seorang guru sedang mengajarkan kepada muridnya untuk menghitung luas lingkaran.\nSetiap masing-masing lingkaran memiliki perhitungan yang berbeda.\napabila jari-jari memiliki ukuran kelipatan 7 maka pergunakan konstanta phi = 22/7\ndan apabila bukan kelipatan 7 maka pergunakan konstanta phi = 3,14.");
		System.out.println ("Luas lingkaran dengan jari-jari 21/14 cm meggunakan phi = 22/7 adalah " + luas1 + " cm kuadrat");
		System.out.println ("Luas lingkaran dengan jari-jari 2.456 cm meggunakan phi = 3.14 adalah " + luas2 + " cm kuadrat");
	}
}
