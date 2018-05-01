/*
     Creator     : Khairil
     Created At  : 1 Mei 2018 13:45 AM     
     Updated By  : 
     Update Date : 
*/
class Arief3 {
	public static void main(String[] args) {
		int tahu, tempe, kangkung, jumTahu, jumTempe, jumKangkung;
		double hargaTahu, hargaTempe, hargaKangkung, total;

		tahu = 3000;
		tempe = 4500;
		kangkung = 1000;

		jumTahu = 4;
		jumTempe = 8;
		jumKangkung = 3;

		hargaTahu = tahu * jumTahu;
		hargaTempe = tempe * jumTempe;
		hargaKangkung = kangkung * jumKangkung;

		total  = hargaTahu + hargaTempe + hargaKangkung;

		System.out.println("Harga tahu " + tahu + " beli " + jumTahu + " buah");
		System.out.println("Harga tempe " + tempe + " beli " + jumTempe + " buah");
		System.out.println("Harga kangkung " + kangkung + " beli " + jumKangkung + " buah");
		System.out.printf("Total Pembelian       : %.2f", total);		
	}
}

// Us pergi kepasar membeli beberapa lauk. Satu bungkus tahu harganya Rp. 3.000, tempe satu potong seharga Rp. 4.500, dan kangkung Rp. 1.000 per ikatnya. Jika Uus belanja tahu 4 bungkus, tempe 8 potong, dan kangkung 3 ikat, berapa uang yang harus dibayarkan oleh Uus?