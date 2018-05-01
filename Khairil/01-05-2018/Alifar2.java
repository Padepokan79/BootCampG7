/*
     Creator     : Khairil
     Created At  : 1 Mei 2018 14:10 AM     
     Updated By  : 
     Update Date : 
*/
class Alifar2 {
	public static void main(String[] args) {
		int hargaBeli, rumahA, rumahB;
		double untungA, rugiB, totalKeuntungan;

		hargaBeli = 60000000;
		untungA = hargaBeli + 0.3 * 60000000.0;
		rugiB   = hargaBeli - 0.15 * 60000000.0;

		totalKeuntungan = untungA + rugiB;		

		System.out.println("Harga Rumah A        : " + hargaBeli);
		System.out.println("Harga Rumah B 		 : " + hargaBeli);
		System.out.printf("Hasil Jual Rumah A 	 : %.2f", untungA);
		System.out.printf("\nHasil Jual Rumah B 	 : %.2f", rugiB);
		System.out.printf("\nTotal Keuntungan     : %.2f", totalKeuntungan);
	}
}

/*
Pak Ryu ingin menjual dua buah rumah yang harga beli nya sebesar 60 juta rupiah. Rumah pertama berhasil dijualnya dengan untung sebesar 30%. Namun rumah keduanya harus terpaksa dijual dengan harga 15% lebih murah dari harga belinya. Berapa total uang yang didapatkan oleh Pak Ryu?
*/