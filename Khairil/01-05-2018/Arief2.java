/*
     Creator     : Khairil
     Created At  : 1 Mei 2018 13:30 AM     
     Updated By  : 
     Update Date : 
*/
class Arief2 {
	public static void main(String[] args) {
		int helmA, helmB, helmC, toko, jumHari;
		double helmHa, helmHb, helmHc, total;

		helmA = 250000;
		helmB = 50000;
		helmC = 650000;

		toko  = 5;
		jumHari = 7;

		helmHa = jumHari * helmA;
		helmHb = jumHari * helmB;
		helmHc = jumHari * helmC;

		total  = helmHa + helmHb + helmHc;

		System.out.println("Harga helm A  		   : " + helmA);
		System.out.println("Harga helm B     	   : " + helmB);
		System.out.println("Harga helm C           : " + helmC);
		System.out.println("Jumlah Toko            : " + toko);
		System.out.println("Jumlah Hari            : " + jumHari);
		System.out.printf("Total Penghasilan       : %.2f", total);		
	}
}