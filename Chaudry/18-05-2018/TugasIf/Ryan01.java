/*
	DATE CREATED : 17 MEI 2018
	AUTHOR       : NURDHIAT CHAUDHARY MALIK
*/
/*
	Seorang anak mempunyai 3 buah mobil dengan rincian kecepatan
	mobil 1 30km/jam asumsi bensin 1liter/15km
	mobil 2 35km/jam asumsi bensin 1liter/10km
	mobil 3 45km/jam asumsi bensin 1liter/20km

	rekomendasikan mobil tercepat dan terhemat
*/
import java.util.Scanner;
public class Ryan01{
	public static void main(String[] args){
		Scanner key = new Scanner(System.in);
		int satu, inputJarak, jarakMobil30, jarakMobil35, jarakMobil45, jarak15, jarak10, jarak20;
		String ket1, ket2, ket3;
		jarakMobil30 = 30;
		jarakMobil35 = 35;
		jarakMobil45 = 45;
		jarak15 	= 15;
		jarak10   	= 10;
		jarak20 	= 20;
		satu 		= 1;
		ket1 	= "mobil 1 30km/jam asumsi bensin 1liter/15km";
		ket2 	= "mobil 2 35km/jam asumsi bensin 1liter/10km";
		ket3 	= "mobil 3 45km/jam asumsi bensin 1liter/20km";


		System.out.print("Input jarak : ");
		inputJarak = key.nextInt();


		System.out.println("Rekomendasi mobil tercepat dan terhemat : ");
		if (inputJarak <= jarak10) {
			System.out.println(ket3);
		}
		else if (inputJarak > jarak10 && inputJarak <= jarak15) {
			System.out.println(ket3);
		}
		else if (inputJarak > jarak15 && inputJarak <= jarak20) {
			System.out.println(ket3);
		}
		else if (inputJarak > jarak20 && inputJarak <= jarakMobil30) {
			System.out.println(ket1);
		}
		else if (inputJarak > jarakMobil30 && inputJarak <= jarakMobil35) {
			System.out.println(ket3);
		}
		else if (inputJarak > jarakMobil35 && inputJarak <= jarakMobil45) {
			System.out.println(ket3);
		}
		else if (inputJarak > jarakMobil45) {
			System.out.println(ket3);
		}



	}
}