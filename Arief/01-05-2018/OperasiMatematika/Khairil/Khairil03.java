/*
Date Created	: 1 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
public class Khairil03{
	public static void main( String[] args){
		double hargaKemeja, hargaCelana, hargaDasi, hargaKaosKaki, totalKemeja, totalCelana, totalDasi, totalKaosKaki, totalBelanja, diskon, bayar;

		hargaKemeja = 120000;
		hargaCelana = 60000;
		hargaDasi = 40000;
		hargaKaosKaki = 35000;

		totalKemeja = 1;
		totalCelana = 2;
		totalDasi = 1;
		totalKaosKaki = 2;

		totalBelanja = (totalKemeja * hargaKemeja) + (totalCelana * hargaCelana) + (totalDasi * hargaDasi) + (totalKaosKaki * hargaKaosKaki);
		diskon = (15.0/100) * totalBelanja;
		bayar = totalBelanja - diskon;

		System.out.println("Sebuah toko pakaian memiliki aplikasi POS sederhana. Item \n" +
							"yang dijual adalah pakaian pria. Setiap pakaian memiliki \n" +
							"harga yang bervariasi. Harga untuk sebuah kemeja adalah \n" +
							"120000, celana panjang 60000, dasi 40000, dan kaos kaki \n" +
							"per pasang 35000. Untuk pembelian minimal 100000 \n" +
							"mendapatkan potongan harga sebesar 10% dan pembelian \n" +
							"minimal 250000 mendapatkan potongan harga sebesar 15%. \n" +
							"Apabila pembelian mencapai 300000 berlaku kelipatan \n" +
							"maka pembeli akan mendapatkan bonus 1 buah dasi.");

		System.out.println("Total Belanja = " + totalBelanja);
		System.out.println("Diskon 15% = " + diskon + " + 1 Buah Dasi");
		System.out.println("Pembayaran = " + bayar);

	}
}