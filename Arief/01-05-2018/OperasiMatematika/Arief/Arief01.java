/*
Date Created	: 1 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
public class Arief01{
	public static void main( String[] args){
	int pulpen, totalPulpen, uang, lembaran, totalUang, lusin, kembalian;

	pulpen = 1950;
	lusin = 12;
	uang = 10000;
	lembaran = 3;
	totalUang = uang * lembaran;
	totalPulpen = pulpen * lusin;
	kembalian = totalUang - totalPulpen;

	System.out.println("Udin pergi ke toko alat tulis membeli pulpen seharga Rp. 1.950 per buah nya. \n" + 
						"Udin membeli pulpen sebanyak satu lusin, jika Udin membayar menggunakan uang \n" +
						"lembaran Rp.10.000 sebanyak tiga lembar, berapakah kembalian yang diterima Udin?");
	System.out.println("Total Harga Pulpen = " + totalPulpen);
	System.out.println("Uang Pembayaran = " + totalUang);
	System.out.println("Kembalian yang diterima Udin = " + totalUang + " - " + totalPulpen + " = " + kembalian);

	}
}