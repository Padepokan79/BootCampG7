/*
	DATA CREATED 	: 08 Mei 2018
	AUTHOR 			: NURDHIAT CHAUDHARY MALIK
*/
/*
	2. 
*/	
public class Andrian01{
	public static void main(String[] args){
		
		int jmlKarung, beratKarung, terjualHariIni, terjualKemarin, operasi, totalBerat, totalTerjual;

		jmlKarung 	= 12; // karung
		beratKarung = 50; // kg
		terjualHariIni = 175; // kg
		terjualKemarin = 120; // kg

		totalBerat 	 = jmlKarung*beratKarung;
		totalTerjual = terjualHariIni + terjualKemarin;

		operasi = totalBerat - totalTerjual; 

		System.out.println("Di toko Bu Poniem tersedia 12 karung beras. Setiap karung beratnya 50 kg. Jika hari ini dan kemarin masing-masing terjual 175 kg dan 120 kg, berapa kg sisa beras di warung Bu Poniem sekarang ?");
		System.out.print("Sisa beras di warung Bu Poniem sekarang  " + operasi + " Kg");
	}
}