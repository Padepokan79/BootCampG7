/* 
Created by  		: Richa Fitria
Date/hour			: 16 Mei 2018/ 10.56 PM
Updated by			:
Updated Date/hour	:

*/

import java.util.Scanner;

public class RyanIF1 {
	public static void main( String[] args ) {
	Scanner keyboard = new Scanner(System.in);

	int jarak, kecMobil1, kecMobil2, kecMobil3, bensinMobil1, bensinMobil2, bensinMobil3;
	jarak =200;

	kecMobil1 = 30;
	kecMobil2 = 35;
	kecMobil3 = 30;

	bensinMobil1 = 15;
	bensinMobil2 = 10;
	bensinMobil3 = 20;

	if (kecMobil1 < kecMobil2){
		if (kecMobil2 < kecMobil3) {
			System.out.println("Paling cepat adalah mobil 3");
		}
	}

	if (bensinMobil1>bensinMobil2){
		if (bensinMobil2<bensinMobil3){
			System.out.println("Paling hemat adalah mobil 3");
		}

	}
}
}

/*1. Seorang anak mempunyai 3 buah mobil dengan rincian kecepatan
	mobil 1 30km/jam asumsi bensin 1liter/15km
	mobil 2 35km/jam asumsi bensin 1liter/10km
	mobil 3 45km/jam asumsi bensin 1liter/20km

Mobil mana yang cocok untuk menempuh jarak 200 km degan menunjukan semua mobil, dengan 1 rekomendasi mobil tercepat dan hemat */