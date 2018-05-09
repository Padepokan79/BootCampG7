/*
	DATA CREATED 	: 08 Mei 2018
	AUTHOR 			: NURDHIAT CHAUDHARY MALIK
*/
/*
	2. 
*/
public class Alifhar02{
	public static void main(String[] args){
		
		double rumahPertama, rumahKedua, untung, rugi, totalPertama, totalKedua, opr1, opr2, total;

		rumahPertama 	= 60000000; // juta
		rumahKedua 		= 60000000; // juta
		untung 			= 30.0/100;
		rugi			= 15.0/100;

		totalPertama 	= rumahPertama*untung;
		totalKedua 		= rumahKedua*rugi;

		opr1 	= rumahPertama + totalPertama;
		opr2 	= rumahKedua - totalKedua;

		total 	= opr1 + opr2;

		System.out.println("Pak Ryu ingin menjual dua buah rumah yang harga beli nya sebesar 60 juta rupiah. Rumah pertama berhasil dijualnya dengan untung sebesar 30%. Namun rumah keduanya harus terpaksa dijual dengan harga 15% lebih murah dari harga belinya. Berapa total uang yang didapatkan oleh Pak Ryu?");
		System.out.printf("Total uang yang didapat Pak Ryu Rp %.0f ", total);
	}
}