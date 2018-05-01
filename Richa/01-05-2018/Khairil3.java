public class Khairil3 {
	public static void main (String[] args) {

		double kemeja, celana, dasi, kaoskaki, total, bonus;

		kemeja = 120000;
		celana = 60000;
		dasi = 4000;
		kaoskaki = 35000;

		total = kemeja + celana+ dasi+ kaoskaki;
		bonus = total * 0.1;



		System.out.println ("Sebuah toko pakaian memiliki aplikasi POS sederhana. Item yang dijual adalah pakaian pria.\nSetiap pakaian memiliki harga yang bervariasi. Harga untuk sebuah kemeja adalah 120000, celana panjang 60000, dasi 40000, dan kaos kaki per pasang 35000.\nUntuk pembelian minimal 100000 mendapatkan potongan harga sebesar 10% dan pembelian minimal 250000 mendapatkan potongan harga sebesar 15%.\nApabila pembelian mencapai 300000 berlaku kelipatan maka pembeli akan mendapatkan bonus 1 buah dasi.");
		System.out.println ("Total belanja " + total );
		System.out.println ("Maka bonus yang didapatkan adalah " + bonus);

		
	}
}
