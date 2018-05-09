/*
	Created by vikri
	09/05/2018
	09:20

	- Seorang guru sedang mengajarkan kepada muridnya 
	  untuk menghitung luas lingkaran. Setiap masing-masing 
	  lingkaran memiliki perhitungan yang berbeda. 
	  apabila jari-jari memiliki ukuran kelipatan 7 maka pergunakan 
	  konstanta phi = 22/7 dan apabila bukan kelipatan 7 maka pergunakan konstanta phi = 3,14. 
*/
public class LatihanSoalKhairil2{
	public static void main(String[] args) {
		double luas, phi, jari;
		jari = 21;
		phi = 22/7;
		luas = phi*(jari*jari);

		System.out.println("Luas Lingkaran adalah adalah: "+luas+ "cm");
	}
}