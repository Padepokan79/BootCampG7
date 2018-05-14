/*
soal : 
Us pergi kepasar membeli beberapa lauk. Satu bungkus tahu harganya Rp. 3.000, 
tempe satu potong seharga Rp. 4.500, dan kangkung Rp. 1.000 per ikatnya. 
Jika Uus belanja tahu 4 bungkus, tempe 8 potong, dan kangkung 3 ikat, 
berapa uang yang harus dibayarkan oleh Uus?

create by : Malik Chaudhary
time : 08-05-2018 8:18PM

*/

public class AriefSoal2{
	public static void main(String[] args){
		int hargaTahu, hargaTempe, hargaKangkung, total, banyakTahu, banyakTempe, banyakKangkung;

		hargaTahu = 3000;
		hargaTempe = 4500;
		hargaKangkung = 1000;

		banyakTahu = 4;
		banyakTempe = 8;
		banyakKangkung = 3;

		total = (banyakTahu*hargaTahu)+(banyakTempe*hargaTempe)+(banyakKangkung*hargaKangkung);

		
		System.out.print("uang yang harus dibayarkan oleh Uus : Rp. "+total);

	}
}