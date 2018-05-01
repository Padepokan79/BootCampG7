/*
created by	: Yana
time		: 14.21
*/
/*
Pak Ryu ingin menjual dua buah rumah yang harga beli nya sebesar 60 juta rupiah. 
Rumah pertama berhasil dijualnya dengan untung sebesar 30%. 
Namun rumah keduanya harus terpaksa dijual dengan harga 15% lebih murah dari harga belinya. 
Berapa total uang yang didapatkan oleh Pak Ryu?
*/

public class Alifhar2{
	public static void main(String[] args){

		double jumlahRumah, hargaRumah, labaRumah, rugiRumah, totalUang;

		jumlahRumah	= 2;
		hargaRumah	= 60000000;
		labaRumah	= hargaRumah * 30.0 / 100.0;
		rugiRumah	= hargaRumah * 15.0 / 100.0;

		totalUang	= hargaRumah * jumlahRumah + labaRumah - rugiRumah;

		System.out.printf("Total uang yang didapat oleh Pak Ryu adalah %.0f" ,totalUang);
	}
}
