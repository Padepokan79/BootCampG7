public class Rizaldi2 {
	public static void main (String[] args) {

		double nabung, gitar, tabungan, hari;

		nabung = 2000;
		gitar = 245000;
		tabungan = (80*nabung) - 100000;
		hari = (245000 - tabungan)/2000;

		System.out.println ("Adi menabung perhari sebesar 2000 rupiah.\ndia hendak membeli gitar seharga 245.000 rupiah dari hasil tabungan nya itu.\ndisaat hari ke 80 adi memakai uang tabungannya sebanyak 100.000 rupiah untuk mengikuti praktikum.\nberapa hari lagi agar adi bisa membeli gitar dari hasil tabungan dan sisa uang nya tersebut ?");
		System.out.println ("Jadi, Adi akan mampu membeli gitar " + hari + " hari lagi");
	}
}

