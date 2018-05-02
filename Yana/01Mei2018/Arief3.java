/*
created by 	: Yana
time		: 1 Mei 2018

Us pergi kepasar membeli beberapa lauk. Satu bungkus tahu harganya Rp. 3.000, 
tempe satu potong seharga Rp. 4.500, dan kangkung Rp. 1.000 per ikatnya. 
Jika Uus belanja tahu 4 bungkus, tempe 8 potong, dan kangkung 3 ikat, 
berapa uang yang harus dibayarkan oleh Uus?
*/

public class Arief3{
	public static void main(String[] args){

		int hargaTahu, hargaTempe, hargaKangkung, jumlahTahu, jumlahTempe, jumlahKangkung, jumlahBayar;

		hargaTahu		= 3000;
		hargaTempe		= 4500;
		hargaKangkung	= 1000;
		jumlahTahu		= 4;
		jumlahTempe		= 8;
		jumlahKangkung	= 3;
		jumlahBayar		= (hargaTahu * jumlahTahu) + (hargaTempe * jumlahTempe) + (hargaKangkung * jumlahKangkung);

		System.out.println("Jumlah uang yang harus dibayar Us adalah Rp. " +jumlahBayar);	
	}
}