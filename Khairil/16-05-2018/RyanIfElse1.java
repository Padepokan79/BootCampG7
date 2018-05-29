/*
	 Program     : Soal 1 - Ryan
     Creator     : Khairil
     Created At  : 16 Mei 2018 19:20 PM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;

public class RyanIfElse1 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String mobil1, mobil2, mobil3;
		int mobspeed1, mobspeed2, mobspeed3, mobilLiter1, mobilLiter2, mobilLiter3;
		double inputJarak, konsumsiLiter1, konsumsiLiter2, konsumsiLiter3, jarakPerJam1, jarakPerJam2, jarakPerJam3;

		mobspeed1 = 30;
		mobspeed2 = 35;
		mobspeed3 = 45;

		mobilLiter1 = 15;
		mobilLiter2 = 10;
		mobilLiter3 = 20;

		mobil1 = "mobil 1 30km/jam asumsi bensin 1liter/15km";
		mobil2 = "mobil 2 35km/jam asumsi bensin 1liter/10km";
		mobil3 = "mobil 3 45km/jam asumsi bensin 1liter/20km";

		System.out.print("Input jarak : ");
		inputJarak = keyboard.nextDouble();

		konsumsiLiter1 = inputJarak / mobilLiter1;
		konsumsiLiter2 = inputJarak / mobilLiter2;
		konsumsiLiter3 = inputJarak / mobilLiter3;

		jarakPerJam1 = inputJarak / mobspeed1;
		jarakPerJam2 = inputJarak / mobspeed2;
		jarakPerJam3 = inputJarak / mobspeed3;

		System.out.println("Hasil Kalkulasi : ");
		System.out.println();
		System.out.printf("Mobil 1 Konsumsi %.2f", konsumsiLiter1); System.out.printf(" liter dan jarak tempuh per jam adalah %.2f", jarakPerJam1); 
		System.out.println();
		System.out.printf("Mobil 2 Konsumsi %.2f", konsumsiLiter2); System.out.printf(" liter dan jarak tempuh per jam adalah %.2f", jarakPerJam2); 
		System.out.println();		
		System.out.printf("Mobil 3 Konsumsi %.2f", konsumsiLiter3); System.out.printf(" liter dan jarak tempuh per jam adalah %.2f", jarakPerJam3); 
		System.out.println();
		System.out.println();

		if( (konsumsiLiter1 < konsumsiLiter2 && jarakPerJam1 < jarakPerJam2) || (konsumsiLiter1 < konsumsiLiter3 && jarakPerJam1 < jarakPerJam3) ) {
			System.out.println("Rekomendasi");
			System.out.println(mobil1);
		}
		else if( (konsumsiLiter2 < konsumsiLiter3 && jarakPerJam2 < jarakPerJam3) || (konsumsiLiter2 < konsumsiLiter1 && jarakPerJam2 < jarakPerJam1) ) {
			System.out.println("Rekomendasi");
			System.out.println(mobil2);	
		}
		else if( (konsumsiLiter3 < konsumsiLiter1 && jarakPerJam3 < jarakPerJam1) || (konsumsiLiter3 < konsumsiLiter2 && jarakPerJam3 < jarakPerJam2) ) {
			System.out.println("Rekomendasi");			
			System.out.println(mobil3);	
		}
	}
}