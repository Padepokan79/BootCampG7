/*
	Data Created 	= 07 Mei 2018
	Author			= Nurdhiat Chaudhary Malik
*/
public class SoalCerita03{
	public static void main(String[] args){
		int hargaTahu, hargaTempe, hargaKangkung, xTahu, yTempe, zKangkung, operasi;

		hargaTahu  = 3000; // satu bungkus
		hargaTempe = 4500; // satu potong
		hargaKangkung = 1000; // per ikat

		xTahu 	= 4;
		yTempe 	= 8;
		zKangkung = 3;

		operasi 	= (hargaTahu*xTahu) + (hargaTempe*yTempe) + (hargaKangkung*zKangkung);
		System.out.println("Uang yang harus dibayar Uus Rp " + operasi);
	}
}


