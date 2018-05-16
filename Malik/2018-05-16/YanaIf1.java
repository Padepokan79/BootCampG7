/*
created by 	: Malik Chaudhary
time 		: 15-05-2018 8:45PM 

Soal :
Budi mempunyai rencana belanja, jika Budi mempunyai uang sebesar lebih dari Rp. 90.000 Budi akan membeli Tas, lebih dari 
Rp. 100.000 akan membeli Tas dan Dompet, lebih dari Rp. 200.000 akan membeli Tas dan sepatu dan lebih dari Rp. 500.000 akan 
membeli jas.
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

import java.util.Scanner;
public class YanaIf1{
	public static void main(String[] args){
		Scanner belanja = new Scanner(System.in);

		double uang, hargaTas, hargaDompet, hargaSepatu, hargaJas, hargaKemeja, hargaDasi, diskon, uangSatu, uangDua, uangTiga, uangEmpat;

		hargaTas	= 60000;
		hargaDompet	= 40000;
		hargaSepatu	= 120000;
		hargaJas	= 250000;
		hargaKemeja	= hargaTas+hargaDompet;
		hargaDasi	= hargaDompet;
		diskon		= 10.0/100;

		uangSatu 	= 90000;
		uangDua		= 100000;
		uangTiga	= 200000;
		uangEmpat	= 500000;

		System.out.println("=========================");
		System.out.print("Masukkan nominal uang Budi : Rp. ");
		uang = belanja.nextDouble();
		System.out.print("");

		if ( (uang > uangSatu) && (uang <= uangDua)) {
			System.out.println("Budi membeli tas seharga Rp. "+hargaTas);
			System.out.println("");
			System.out.println("Sisa uang budi adalah Rp. "+(uang-hargaTas));
		}else if ( (uang > uangDua) && (uang <= uangTiga) ) {
			System.out.println("Budi membeli tas seharga Rp. "+hargaTas);
			System.out.println("Budi membeli dompet seharga Rp. "+hargaDompet);
			System.out.println("");
			System.out.println("Sisa uang budi adalah Rp. "+(uang-(hargaTas+hargaDompet) ));
		}else if ( (uang > uangTiga) && (uang <= uangEmpat) ) {
			System.out.println("Budi membeli tas seharga Rp. "+hargaTas);
			System.out.println("Budi membeli sepatu seharga Rp. "+hargaSepatu);
			System.out.println("");
			System.out.println("Sisa uang budi adalah Rp. "+(uang-(hargaTas+hargaSepatu) ));
		}else if ( uang > uangEmpat ) {
			System.out.println("Budi membeli jas seharga Rp. "+hargaJas);
			System.out.println("membeli item tambahan : ");
			System.out.println("Budi membeli kemeja seharga Rp. "+hargaKemeja);
			System.out.println("Budi membeli dasi seharga Rp. "+hargaDasi);
			System.out.println("");
			System.out.println("Sisa uang budi adalah Rp. "+(uang-(hargaJas+hargaKemeja+hargaDasi) ));
		}else{
			System.out.println("Maaf uang anda kurang dari batas minimum");
		}


	}
}