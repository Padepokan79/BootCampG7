/*
	* Created by:	Alifhar Juliansyah
	* 				01-05-2018	13.05
	* Updated by:
	*
*/

public class Alifhar2{
	public static void main(String[] args){
		System.out.println("Pak Ryu ingin menjual dua buah rumah yang harga beli nya sebesar 60 juta rupiah.");
		System.out.println("Rumah pertama berhasil dijualnya dengan untung sebesar 30%.");
		System.out.println("rumah keduanya harus terpaksa dijual dengan harga 15% lebih murah");
		System.out.println("Berapa total uang yang didapatkan oleh Pak Ryu?");

		double beli, uang, rumah1, rumah2;
		beli=60000000;
		rumah1=beli+0.3*beli;
		rumah2=beli-0.15*beli;
		uang=rumah1+rumah2;
		System.out.printf("\nTotal uang pak Ryu adalah %.0f rupiah",uang);
	}
}