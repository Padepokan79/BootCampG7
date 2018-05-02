/*
created by 	: Yana
time		: 1 Mei 2018

Tuan Nishiyama ingin membuat aplikasi untuk mengukur kecepatan mobil. 
Setiap kecepatan memiliki indikasi yang berbeda. Asumsi untuk satuan jarak adalah km, 
kecepatan km/jam dan waktu jam, menit. inputan yang kosong hanya ada satu inputan baik itu jaraknya saja, 
kecepatannya saja ataupun waktunya saja. Kecepatan maksimum yang bisa diinputkan adalah sebesar 200km/jam.
*/

public class Khairil1{
	public static void main(String[] args){
		int jarakTempuh, waktuTempuh, kecepatan;

		jarakTempuh	= 50;
		waktuTempuh	= 2;
		kecepatan 	= jarakTempuh / waktuTempuh;

		System.out.println("Waktu tempuh adalah "+kecepatan+"/jam");
	}
}