/*
	* Created by:	Alifhar Juliansyah
	* 				01-05-2018	13.49
	* Updated by:
	*
*/

public class Yana1{
	public static void main(String[] args){
		System.out.println("Ijal mempunyai uang sebesar Rp. 20.000,");
		System.out.println("ia beli setengah uangnya untuk membeli 10 butir kelereng.");
		System.out.println("Ijal menjual 4 butir kelerengnya dengan laba 20%");
		System.out.println("Berapakan jumlah uang Ijal saat ini?");

		int uang, kelereng, beli, jual;
		uang=20000;
		
		kelereng=10;
		beli=uang*1/2;
		
		uang=uang-beli;
		
		jual=(beli/kelereng)*20/100*4;
		uang=uang+jual;
		System.out.println("\nUang ijal saat ini adalah "+uang+" rupiah");
	}
}