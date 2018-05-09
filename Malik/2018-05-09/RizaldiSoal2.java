/*
soal : 
adi menabung perhari sebesar 2000 rupiah. dia hendak membeli gitar seharga 245.000 rupiah
dari hasil tabungan nya itu. disaat hari ke 80 adi memakai uang tabungannya sebanyak 100.000 rupiah
untuk mengikuti praktikum.
berapa hari lagi agar adi bisa membeli gitar dari hasil tabungan dan sisa uang nya tersebut ?

create by : Malik Chaudhary
time : 08-05-2018 9:00PMPM

*/

public class RizaldiSoal2{
	public static void main(String[] args){
		double nabungSehari, hargaGitar, banyakHari, banyakUangDipakai, berapaHari, uang, hari;
		
		nabungSehari = 2000;
		hargaGitar = 245000;
		banyakHari = 80;
		banyakUangDipakai = 100000;

		uang = (nabungSehari*banyakHari)-banyakUangDipakai;
		uang = hargaGitar-uang;
		hari = uang/nabungSehari;

		System.out.print("Banyak hari : "+hari+" Sisa uang : "+uang);

	}
}