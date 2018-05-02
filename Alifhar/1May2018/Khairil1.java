/*
	* Created by:	Alifhar Juliansyah
	* 				01-05-2018	08:50
	* Updated by:
	*
*/

public class Khairil1{
	public static void main(String[] args){
		System.out.println("Tuan Nishiyama ingin membuat aplikasi untuk mengukur kecepatan mobil.");
		System.out.println("Setiap kecepatan memiliki indikasi yang berbeda.");
		System.out.println("Asumsi untuk satuan jarak adalah km, kecepatan km/jam dan waktu jam, menit.");
		System.out.println("inputan yang kosong hanya ada satu inputan baik itu jaraknya saja, kecepatannya saja ataupun waktunya saja.");
		System.out.println("Kecepatan maksimum yang bisa diinputkan adalah sebesar 200km/jam.");

		double jarak, waktu, kecepatan;
		kecepatan=80; waktu=1.5;
		System.out.println("\nKecepatan: "+kecepatan+" km/jam\nWaktu: "+waktu+" jam");
		jarak=kecepatan*waktu;
		System.out.println("maka jaraknya adalah "+jarak+" km");
	}
}