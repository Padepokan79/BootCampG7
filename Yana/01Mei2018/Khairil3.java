/*
created by 	: Yana
time 		: 1 Mei 2018

Sebuah toko pakaian memiliki aplikasi POS sederhana. 
Item yang dijual adalah pakaian pria. Setiap pakaian memiliki harga yang bervariasi. 
Harga untuk sebuah kemeja adalah 120000, celana panjang 60000, dasi 40000, dan kaos kaki per pasang 35000. 
Untuk pembelian minimal 100000 mendapatkan potongan harga sebesar 10% dan 
pembelian minimal 250000 mendapatkan potongan harga sebesar 15%. 
Apabila pembelian mencapai 300000 berlaku kelipatan maka pembeli akan mendapatkan bonus 1 buah dasi.
*/

public class Khairil3{
	public static void main(String[] args){
		double hargaKemeja, hargaCelana, haragDasi, hargaKaosKaki, potongan, pembelian, totalBayar;

		hargaKemeja		= 120000;
		hargaCelana		= 60000;
		haragDasi		= 40000;
		hargaKaosKaki	= 35000;
		potongan		= 15.0 / 100.0;
		pembelian		= hargaKemeja + haragDasi + hargaCelana + hargaKaosKaki;
		totalBayar		= pembelian - pembelian * potongan;


		System.out.println("jumlah yang harus dibayar adalah Rp " +totalBayar);
		
	}
}