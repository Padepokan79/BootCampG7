/*
	DATA CREATED : 08 MEI 2018
	AUTHOR 		 : NURDHIAT CHAUDHARY MALIK
*/
/*
	- Tuan Nishiyama ingin membuat aplikasi untuk mengukur kecepatan mobil. Setiap kecepatan memiliki indikasi yang berbeda. Asumsi untuk satuan jarak adalah km, kecepatan km/jam dan waktu jam, menit. inputan yang kosong hanya ada satu inputan baik itu jaraknya saja, kecepatannya saja ataupun waktunya saja. Kecepatan maksimum yang bisa diinputkan adalah sebesar 200km/jam.
*/
public class Khairil01{
	public static void main(String[] args){
		double jarak, kecepatan, waktu;
		waktu 		= 5;
		kecepatan 	= 150;
		jarak 		= kecepatan*waktu;

		System.out.println("Kecepatan : " + kecepatan + " km/jam");
		System.out.println("Waktu     : " + waktu + " jam");
		System.out.println("Jarak     : " + jarak + " km");

	}
}