/*
soal : 
Di toko Bu Poniem tersedia 12 karung beras. 
Setiap karung beratnya 50 kg. Jika hari ini dan kemarin masing-masing terjual 175 kg dan 120 kg, 
berapa kg sisa beras di warung Bu Poniem sekarang ?

create by : Malik Chaudhary
time : 08-05-2018 8:02PM

*/

public class AndrianSoal2{
	public static void main(String[] args){
		int banyakBeras, beratKarung, terjualHariIni, terjualKemarin, totalKg;
		
		banyakBeras = 12;
		beratKarung = 50;

		terjualHariIni = 175;
		terjualKemarin = 120;

		totalKg = banyakBeras*beratKarung;
		totalKg = totalKg-(terjualHariIni+terjualKemarin);

		System.out.print("Sisa beras di warung Bu Poniem : "+totalKg);

	}
}