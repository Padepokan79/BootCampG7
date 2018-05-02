/*
Date Created	: 1 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
public class Alifhar02 {
	public static void main( String[] args ){
		double beliRumah1, beliRumah2, untung, rugi, totalUang;

		beliRumah1 = 60000000;
		beliRumah2 = beliRumah1;
		untung = (30.0/100) * beliRumah1;
		rugi = (15.0/100) * beliRumah1;
		totalUang = (beliRumah1 + untung) + (beliRumah2  - rugi);
		
		System.out.println("Pak Ryu ingin menjual dua buah rumah yang harga beli nya sebesar \n" +
							"60 juta rupiah. Rumah pertama berhasil dijualnya dengan untung \n"+
							"sebesar 30%. Namun rumah keduanya harus terpaksa dijual dengan \n" + 
							"harga 15% lebih murah dari harga belinya. Berapa total uang \n" +
							"yang didapatkan oleh Pak Ryu?");
		System.out.println();
		System.out.printf("Keuntungan Rumah Pertama = %.0f \n", untung);
		System.out.printf("Kerugian Rumah Kedua = %.0f \n", rugi);
		System.out.printf("Total uang yang didapat  = (%.0f + %.0f) + (%.0f - %.0f) \n " + 
							"= %.0f", beliRumah1, untung, beliRumah2, rugi, totalUang);
	}
}