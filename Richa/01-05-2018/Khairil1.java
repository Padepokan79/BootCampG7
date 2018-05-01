public class Khairil1 {
	public static void main (String[] args) {

		double kecMax, jarak, waktuMax;

		kecMax = 200; //kec maksimum
		jarak = 5430; //asumsi jarak yang ditempuh
		waktuMax = kecMax/jarak;

		System.out.println ("Tuan Nishiyama ingin membuat aplikasi untuk mengukur kecepatan mobil.\nSetiap kecepatan memiliki indikasi yang berbeda.\nAsumsi untuk satuan jarak adalah km, kecepatan km/jam dan waktu jam, menit.\ninputan yang kosong hanya ada satu inputan baik itu jaraknya saja, kecepatannya saja ataupun waktunya saja.\nKecepatan maksimum yang bisa diinputkan adalah sebesar 200km/jam.");
		System.out.println ("Waktu maksimum yang dibutuhkan " + waktuMax + " jam");
	}
}
