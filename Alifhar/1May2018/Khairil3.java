/*
	* Created by:	Alifhar Juliansyah
	* 				01-05-2018	09.08
	* Updated by:
	*
*/

public class Khairil3{
	public static void main(String[] args){
		System.out.println("Sebuah toko pakaian memiliki aplikasi POS sederhana.");
		System.out.println("Harga untuk sebuah kemeja 120000, celana panjang 60000, dasi 40000, dan kaos kaki 35000.");
		System.out.println("Untuk pembelian minimal 100000 mendapatkan potongan harga sebesar 10%");
		System.out.println("pembelian minimal 250000 mendapatkan potongan harga sebesar 15%.");

		int kemeja, celana, dasi, kaoskaki, harga;
		kemeja=120000; celana=60000; dasi=40000; kaoskaki=35000;
		System.out.println("\nAde membeli 2 kemeja dan 1 kaos kaki");
		harga=2*kemeja+kaoskaki;
		harga=harga-(harga*15/100);
		System.out.println("harga setelah dikurangi diskon adalah "+harga+" rupiah");
	}
}

// untuk menulis / deklarasikan variabel jangan di tengah-tengah karena saat melibatkan banyak class nanti bingung sendiri posisinya
// untuk penulisan soal bisa dibuat var String soal system.out.printl(soal)