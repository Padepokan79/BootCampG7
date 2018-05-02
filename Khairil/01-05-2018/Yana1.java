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
		System.out.println("Uang ijal Awal   = " + uangIjal);		
		belanjaKelereng = 1.0 / 2.0 * uangIjal;
		kelereng = 10;
		jual = 4;
		laba = (belanjaKelereng / kelereng) * 20.0 / 100.0 * jual ;
		uangIjal = uangIjal - belanjaKelereng + (belanjaKelereng / kelereng * jual) + laba;
		System.out.println("Uang Ijal        = " + uangIjal);
	}
}

/*
Ijal mempunyai uang sebesar Rp. 20.000, ia membelanjakan setengah 
uangnya untuk membeli 10 butir kelereng. kemudian Ijal menjual 4 butir 
kelerengnya dengan laba 20% dari setiap butir kelereng yang dijualnya. 
Berapakan jumlah uang Ijal saat ini?
*/