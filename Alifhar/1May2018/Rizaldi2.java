/*
	* Created by:	Alifhar Juliansyah
	* 				01-05-2018	11.39
	* Updated by:
	*
*/

public class Rizaldi2{
	public static void main(String[] args){
		System.out.println("adi menabung perhari sebesar 2000 rupiah.");
		System.out.println("dia hendak membeli gitar seharga 245.000 rupiah");
		System.out.println("di hari ke 80 adi memakai uang tabungannya sebanyak 100.000 rupiah untuk praktikum.");
		System.out.println("berapa hari lagi agar adi bisa membeli gitar");

		int uang, nabung, gitar, praktikum, sisa;
		nabung=2000;
		gitar=245000;
		praktikum=100000;

		//dihari ke 80
		uang=nabung*80;
		uang=uang-praktikum;

		sisa=(gitar-uang)/nabung+1;
		System.out.println("\nJadi adi dapat membeli gitar dalam "+sisa+" hari lagi");
	}
}