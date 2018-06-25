/* 
Created by  		: Richa Fitria
Date/hour			: 16 Mei 2018/ 09.54 PM
Updated by			:
Updated Date/hour	:

*/

import java.util.Scanner;

public class YanaIF1 {
	public static void main( String[] args ) {
	Scanner keyboard = new Scanner(System.in);

	double tas, dompet, sepatu, jas, kemeja, dasi, uang, sisaUang=0;

	System.out.println("=============================");
	System.out.println("Masukkan nominal uang Budi:");
	uang = keyboard.nextInt ();
	System.out.println();

	tas = 60000;
	dompet = 40000;
	sepatu = 120000;
	jas = 250000;
	kemeja = tas + dompet;
	dasi = dompet;

	if (uang > 500000) {
		System.out.println("Budi membeli jas seharga Rp. 250000 ");
		System.out.println("Budi membeli kemeja seharga Rp. 100000");
		System.out.println("Budi membeli dasi seharga Rp. 40000");
		sisaUang = uang - (jas+kemeja+dasi);
	}
	else if (uang > 200000) {
		System.out.println("Budi membeli tas seharga Rp. 60000 ");
		System.out.println("Budi membeli sepatu seharga Rp. 120000 ");
		sisaUang = uang - (tas + sepatu);
	}
	else if (uang > 100000) {
		System.out.println("Budi membeli tas seharga Rp. 60000 ");
		System.out.println("Budi membeli dompet seharga Rp. 40000 ");
		sisaUang = (uang- (tas+dompet)*0.9);
	}

	else if (uang > 90000) {
		System.out.println("Budi membeli tas seharga Rp. 60000 "); 
		sisaUang = (uang-tas) *0.9;
	}



	System.out.println();
	System.out.println("Sisa uang budi adalah Rp. " + sisaUang); 
	System.out.println("=============================");
}
}


/*
1. Budi mempunyai rencana belanja, jika Budi mempunyai uang sebesar lebih dari Rp. 90.000 Budi akan membeli Tas, lebih dari Rp. 100.000 akan membeli Tas dan Dompet, 
lebih dari Rp. 200.000 akan membeli Tas dan sepatu dan lebih dari Rp. 500.000 akan membeli jas.
Jika Budi membeli jas maka Budi harus membeli kemeja dan dasi.
Jika membeli tas atau dompet akan mendapatkan diskon 10% dari transaksi belanjanya.

Berikut harga barang yang akan dibeli.
Tas Rp. 60.000
Dompet Rp. 40.000
Sepatu Rp. 120.000
Jas Rp. 250.000
Kemeja seharga tas dan dompet
Dasi seharga dompet

Tampilkan apa yang dibeli oleh Budi dengan uangnya. Serta tampilkan sisa uang Budi.

Contoh output 

=============================
Masukkan nominal uang Budi:
150000

Budi membeli tas seharag Rp. 60000
Budi membeli dompet seharga Rp. 40000

Sisa uang budi adalah Rp. 60000
=============================

*/
