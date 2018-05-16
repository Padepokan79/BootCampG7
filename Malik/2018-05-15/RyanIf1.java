/*
created by : Malik Chaudhary
time : 15-05-2018 2:51PM
Soal :
Seorang anak mempunyai 3 buah mobil dengan rincian kecepatan
	mobil 1 30km/jam asumsi bensin 1liter/15km
	mobil 2 35km/jam asumsi bensin 1liter/10km
	mobil 3 45km/jam asumsi bensin 1liter/20km

Mobil mana yang cocok untuk menempuh jarak 200 km degan menunjukan semua mobil, dengan 1 rekomendasi mobil tercepat dan hemat

*/
import java.util.Scanner;
public class RyanIf1{
	public static void main(String[] args){
		Scanner mobil = new Scanner(System.in);

		double jarak;
		int jarakMobil1, jarakMobil2, jarakMobil3, bensinMobil1, bensinMobil2, bensinMobil3;

		jarakMobil1 = 30;
		jarakMobil2 = 35;
		jarakMobil3 = 45;

		bensinMobil1 = 15;
		bensinMobil2 = 10;
		bensinMobil3 = 20;

		System.out.print("Masukan jarak tempuh (KM) : ");
		jarak = mobil.nextDouble();
		if ( jarak >= jarakMobil3 ) {
			System.out.println("Mobil rekomendasi : ");
			System.out.println("mobil 1 45km/jam asumsi bensin 1liter/20km ");
		}
		if ( jarak >= jarakMobil2  ) {
			System.out.println("Mobil rekomendasi : ");
			System.out.println("mobil 1 35km/jam asumsi bensin 1liter/10km ");
		}
		if ( jarak <= jarakMobil1 || jarak <= jarakMobil2 ) {
			System.out.println("Mobil rekomendasi : ");
			System.out.println("mobil 1 30km/jam asumsi bensin 1liter/15km ");
			
		}

	}
}