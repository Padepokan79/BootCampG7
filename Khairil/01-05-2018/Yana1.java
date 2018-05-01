/*
     Creator     : Khairil
     Created At  : 1 Mei 2018 11:00 AM     
     Updated By  : 
     Update Date : 
*/
class Yana1 {
	public static void main(String[] args) {
		int kelereng, jual;
		double hargaKelereng, uangIjal, laba, belanjaKelereng, uangJual;

		uangIjal = 20000;
		belanjaKelereng = 0.5 * uangIjal;
		kelereng = 10;
		jual = 4;
		hargaKelereng = belanjaKelereng / 10; 
		laba = 0.2 * hargaKelereng;
		uangJual = hargaKelereng + laba;
		System.out.println("Uang Ijal        = " + uangIjal);
		System.out.println("Belanja kelereng = " + belanjaKelereng);
		System.out.println("Beli kelereng    = " + kelereng);
		System.out.println("Kelereng Terjual = " + jual);
		System.out.println("Laba             = " + laba * jual);
		uangIjal = uangJual + uangIjal - belanjaKelereng;		
		System.out.println("Jumlah uang Ijal = " + uangIjal);
	}
}

/*
Ijal mempunyai uang sebesar Rp. 20.000, ia membelanjakan setengah 
uangnya untuk membeli 10 butir kelereng. kemudian Ijal menjual 4 butir 
kelerengnya dengan laba 20% dari setiap butir kelereng yang dijualnya. 
Berapakan jumlah uang Ijal saat ini?
*/