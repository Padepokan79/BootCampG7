/*
	DATA CREATED 	: 08 Mei 2018
	AUTHOR 			: NURDHIAT CHAUDHARY MALIK
*/

/*
	2. adi menabung perhari sebesar 2000 rupiah. dia hendak membeli gitar seharga 245.000 rupiah
dari hasil tabungan nya itu. disaat hari ke 80 adi memakai uang tabungannya sebanyak 100.000 rupiah
untuk mengikuti praktikum.
berapa hari lagi agar adi bisa membeli gitar dari hasil tabungan dan sisa uang nya tersebut ?
*/
public class Rizaldi02{
	public static void main(String[] args){
		
		int menabung, hargaGitar, hariPraktikum, uangPraktikum, hitungHari, sisaUang, hitungTabungan, sisaTabungan, hariH;

		menabung 	= 2000;
		hargaGitar 	= 245000;
		hariPraktikum = 80;
		uangPraktikum = 100000;

		hitungTabungan  = menabung*hariPraktikum;
		sisaTabungan 	= hitungTabungan - uangPraktikum; 

		hitungHari 	= (hargaGitar - sisaTabungan)/menabung; 
		hariH 	= hitungHari + 1;


		System.out.print("Adi bisa membeli gitar dalam kurun waktu " + hariH + " hari" );
	}
}