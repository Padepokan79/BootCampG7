/*
creadted by : Yana
*/
/*
Seorang guru sedang mengajarkan kepada muridnya untuk menghitung luas lingkaran. 
Setiap masing-masing lingkaran memiliki perhitungan yang berbeda. 
apabila jari-jari memiliki ukuran kelipatan 7 maka pergunakan konstanta phi = 22/7 
dan apabila bukan kelipatan 7 maka pergunakan konstanta phi = 3,14.
*/

public class Khairil2{
	public static void main(String[] args){

		double r, phi, luasLingkaran;

		r 				= 21;
		phi 			= 22 / 7;
		luasLingkaran	= phi * r * r;


		System.out.printf("Luas keliling lingkaran adalah %.2f" ,luasLingkaran);
	}
}
