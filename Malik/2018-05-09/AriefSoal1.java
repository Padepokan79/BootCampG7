/*
soal : 
Udin pergi ke toko alat tulis membeli pulpen seharga Rp. 1.950 per buah nya. 
Udin membeli pulpen sebanyak satu lusin, jika Udin membayar menggunakan uang lembaran Rp.10.000 sebanyak tiga lembar, 
berapakah kembalian yang diterima Udin?

create by : Malik Chaudhary
time : 08-05-2018 8:15PM

*/

public class AriefSoal1{
	public static void main(String[] args){
		int hargaPulpen, banyakPulpen, uang, kembalian;

		hargaPulpen = 1950;
		banyakPulpen = 12;
		uang = 30000;

		kembalian = uang-(hargaPulpen*banyakPulpen);
		
		System.out.print("kembalian yang diterima Udin : "+kembalian);

	}
}