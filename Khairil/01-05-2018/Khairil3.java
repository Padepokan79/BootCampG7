/*
     Creator     : Khairil
     Created At  : 1 Mei 2018 13:15 AM     
     Updated By  : 
     Update Date : 
*/
class Khairil3 {
	public static void main(String[] args) {
		int kemeja, celana, dasi, kaoskaki;
		double beli, potongan, total;
		String soal;
		soal = "Sebuah toko pakaian memiliki aplikasi POS sederhana. Item yang dijual adalah pakaian pria. Setiap pakaian memiliki harga yang bervariasi. Harga untuk sebuah kemeja adalah 120000, celana panjang 60000, dasi 40000, dan kaos kaki per pasang 35000. Untuk pembelian minimal 100000 mendapatkan potongan harga sebesar 10% dan pembelian minimal 250000 mendapatkan potongan harga sebesar 15%. Apabila pembelian mencapai 300000 berlaku kelipatan maka pembeli akan mendapatkan bonus 1 buah dasi.";		

		kemeja = 120000;
		celana = 60000;
		dasi = 40000;
		kaoskaki = 35000;

		kemeja = kemeja * 2;
		celana = celana * 1;
		dasi   = dasi * 4;
		kaoskaki = kaoskaki * 2;
		beli = kemeja + celana + dasi + kaoskaki;
		potongan = 0.15 * beli;
		total = beli - potongan;
		System.out.println(soal);
		System.out.println();			
		System.out.println("Kemeja      : " + kemeja);
		System.out.println("Celana      : " + celana);
		System.out.println("Dasi        : " + dasi);
		System.out.println("Kaos Kaki   : " + kaoskaki);
		System.out.println();		
		System.out.println("Total Harga : " + beli);
		System.out.println("Potongan    : " + potongan);
		System.out.println("-------------------------");
		System.out.println("Total       : " + total);
		System.out.println("Bonus       : 1 buah Dasi");		
	}
}