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
		double luas, luas2, phi, phi2, jari, jari2;
		jari = 21;
		jari2 = 10;
		phi = 22/7;
		phi2 = 3.14;
		luas = phi*(jari*jari);
		luas2 = phi2*(jari2*jari2);
		
		System.out.println("Luas Lingkaran dengan rusuk "+jari+" adalah: "+luas+ "cm");
		System.out.println("Luas Lingkaran dengan rusuk "+jari2+" adalah: "+luas2+ "cm");
	}
}