/*
	* Created by:	Alifhar Juliansyah
	* 				01-05-2018	13.35
	* Updated by:
	*
*/

public class Rifan2{
	public static void main(String[] args){
		System.out.println("Di toko Bu Poniem tersedia 12 karung beras. Setiap karung beratnya 50 kg.");
		System.out.println("Jika hari ini dan kemarin masing-masing terjual 175 kg dan 120 kg,");
		System.out.println("berapa kg sisa beras di warung Bu Poniem sekarang ?");

		int beras, berat, jual1, jual2, kilo;
		beras=12; berat=50;
		jual1=175; jual2=120;
		kilo=beras*berat;
		kilo=kilo-jual1-jual2;
		System.out.println("\nSisa beras di warung adalah "+kilo+" kg");
	}
}