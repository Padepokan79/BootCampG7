/*
soal : 
Tuan Nishiyama ingin membuat aplikasi untuk mengukur kecepatan mobil. 
Setiap kecepatan memiliki indikasi yang berbeda. Asumsi untuk satuan jarak adalah km, 
kecepatan km/jam dan waktu jam, menit. inputan yang kosong hanya ada satu inputan baik itu jaraknya saja, 
kecepatannya saja ataupun waktunya saja. Kecepatan maksimum yang bisa diinputkan adalah sebesar 200km/jam.

create by : Malik Chaudhary
time : 08-05-2018 9:59PM

*/

public class KhairilSoal1{
	public static void main(String[] args){
		double waktu, kecepatan, jarak;
		waktu =2;
		kecepatan =120;
		jarak =kecepatan*waktu;

		System.out.println("Kecepatan mobil : "+kecepatan+"km/jam");
		System.out.println("Waktu tempuh : "+waktu+" jam");
		System.out.println("Jarak tempuh : "+jarak+" km");

	}
}