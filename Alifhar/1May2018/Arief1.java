/*
	* Created by:	Alifhar Juliansyah
	* 				01-05-2018	08:27
	* Updated by:
	*
*/

public class Arief1{
	public static void main(String[] args){
		System.out.println("Udin pergi ke toko alat tulis membeli pulpen seharga Rp. 1.950 per buah nya.");
		System.out.println("Udin membeli pulpen sebanyak satu lusin,");
		System.out.println("jika Udin membayar menggunakan uang lembaran Rp.10.000 sebanyak tiga lembar,");
		System.out.println("berapakah kembalian yang diterima Udin?");

		int uangUdin,pulpen;
		pulpen=1950;
		uangUdin=10000*3;

		uangUdin=uangUdin-pulpen*12;
		System.out.println("\nKembalian yang diterima udin adalah "+uangUdin+" Rupiah");
	}
}