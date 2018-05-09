/*
	DATA CREATED 	: 08 Mei 2018
	AUTHOR 			: NURDHIAT CHAUDHARY MALIK
*/

	/*
		1. Ijal mempunyai uang sebesar Rp. 20.000, ia membelanjakan setengah 
uangnya untuk membeli 10 butir kelereng. kemudian Ijal menjual 4 butir 
kelerengnya dengan laba 20% dari setiap butir kelereng yang dijualnya. 
Berapakan jumlah uang Ijal saat ini?
	*/
public class Yana01{
	public static void main(String[] args){
		 double uangAwal, uangBelanja, uangAkhir, jmlKelereng, jmlKelerengJual, laba, totalKeuntungan, hargaKelereng, hargaKeuntungan, uangSisa;

		 uangAwal 	= 20000;
		 uangBelanja= (20000*0.5);
		 jmlKelereng= 10;
		 jmlKelerengJual = 4;
		 laba		= 20.0/100;

		 uangSisa 	= uangAwal - uangBelanja;

		 hargaKelereng = uangBelanja/jmlKelereng;
		 hargaKeuntungan = hargaKelereng*laba;
		 totalKeuntungan = (hargaKelereng+hargaKeuntungan)*jmlKelerengJual;

		 uangAkhir 	= uangSisa + totalKeuntungan;


		System.out.print("Uang ijal saat ini " + uangAkhir);
	}
}