/*
	Created by vikri
	09/05/2018
	09:00

	- Tuan Nishiyama ingin membuat aplikasi untuk mengukur kecepatan mobil.
	  Setiap kecepatan memiliki indikasi yang berbeda. 
	  Asumsi untuk satuan jarak adalah km, kecepatan km/jam dan waktu jam, 
	  menit. inputan yang kosong hanya ada satu inputan baik itu jaraknya 
	  saja, kecepatannya saja ataupun waktunya saja. Kecepatan maksimum yang bisa diinputkan adalah sebesar 200km/jam.
*/
public class LatihanSoalKhairil{
	public static void main(String[] args) {
		int kecepatan, jarak, waktu, hasil;
		jarak = 30;
		waktu = 2;
		kecepatan = jarak/waktu;

		System.out.println("kecepatan nya adalah: "+kecepatan+ "km/jam");
	}
}