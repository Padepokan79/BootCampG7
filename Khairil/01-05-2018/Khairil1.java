/*
     Creator     : Khairil
     Created At  : 1 Mei 2018 09:00 AM     
     Updated By  : 
     Update Date : 
*/
class Khairil1 {
	public static void main(String[] args) {
		double kecepatan, waktu, jarak;
		String soal;
		soal = "Tuan Nishiyama ingin membuat aplikasi untuk mengukur kecepatan mobil. Setiap kecepatan memiliki indikasi yang berbeda. Asumsi untuk satuan jarak adalah km, kecepatan km/jam dan waktu jam, menit. inputan yang kosong hanya ada satu inputan baik itu jaraknya saja, kecepatannya saja ataupun waktunya saja. Kecepatan maksimum yang bisa diinputkan adalah sebesar 200km/jam.";
		kecepatan = 90; //km/jam
		waktu = 4; //jam
		jarak = kecepatan * waktu;
		System.out.println(soal);
		System.out.println();		
		System.out.println("Kecepatan mobil adalah : " + kecepatan + " km/jam");
		System.out.println("Waktu tempuh adalah    : " + waktu + " jam");
		System.out.println("Jarak tempuh adalah    : " + jarak + " km");
	}
}