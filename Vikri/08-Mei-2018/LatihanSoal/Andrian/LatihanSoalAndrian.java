/*
	Created By Vikri
	08/05/2018

	diedit 09/05/2018
	09:46

	2. Di toko Bu Poniem tersedia 12 karung beras.
	   Setiap karung beratnya 50 kg.
	   Jika hari ini dan kemarin masing-masing terjual 175 kg dan 120 kg, 
	   berapa kg sisa beras di warung Bu Poniem sekarang ?
*/
public class LatihanSoalAndrian{
	public static void main(String[] args) {
		int beras, berat, today, yesterday, ty, sisa;
		beras = 12;
		berat = 50;
		today = 175;
		yesterday = 120;
		ty = today + yesterday;
		ty = (beras*berat)-ty;

		System.out.println("Sisa beras adalah: "+ty+" Kg");
	}	
}