/*
     Creator     : Khairil
     Created At  : 1 Mei 2018 13:00 AM     
     Updated By  : 
     Update Date : 
*/
class Arief1 {
	public static void main(String[] args) {
		int pulpen, jumPulpen;
		double total, bayar, uang, banyakUang, kembalian;

		pulpen = 1950;
		jumPulpen = 12;
		total = pulpen * jumPulpen;
		uang = 10000;
		banyakUang = 3;
		bayar = uang * banyakUang;
		kembalian = bayar - total;

		System.out.println("Harga sebuah pulpen    : " + pulpen);
		System.out.println("Jumlah yang dibeli     : " + jumPulpen);
		System.out.println("Total Pembelian        : " + total);
		System.out.println("Uang yang dibayarkan   : " + bayar);
		System.out.printf("Kembalian   : %.2f", kembalian);		
	}
}

/*
Udin pergi ke toko alat tulis membeli pulpen seharga Rp. 1.950 per buah nya. Udin membeli pulpen sebanyak satu lusin, jika Udin membayar menggunakan uang lembaran Rp.10.000 sebanyak tiga lembar, berapakah kembalian yang diterima Udin?
*/