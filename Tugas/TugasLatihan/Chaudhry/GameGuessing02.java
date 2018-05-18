/*
	DATE CREATED : 16 MEI 2018
	AUTHOR       : NURDHIAT CHAUDHARY MALIK
*/
import java.util.Scanner;
import java.util.Random;

public class GameGuessing02 {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		Random rand 	 = new Random();
		int inputAngka, angkaRand, maxKesempatan, satu, angka;
		int selisih;
		satu 			 = 1;
		maxKesempatan    = 3;

		angkaRand = rand.nextInt(10) + 1;
		System.out.println("PC: "+angkaRand);
		

		for (angka = satu; angka <= maxKesempatan; angka++) {

			System.out.print("Tebak angka 1 - 10  :   ");
			inputAngka 	= keyboard.nextInt();

			if (inputAngka == angkaRand) {
				System.out.println("BENAR");
				angka    = maxKesempatan;
				System.out.println("KAMU MENANG");
			}
			else{

				if (angka == maxKesempatan) {
					System.out.println("GAME OVER");
				}else{
					if ( (inputAngka - angkaRand) >= 3 || (angkaRand - inputAngka) >= 3) {
						System.out.println("Cold");
					}else if ( ((inputAngka - angkaRand) <= 2 && (inputAngka - angkaRand) > 1) || ((angkaRand - inputAngka) <= 2 && (angkaRand - inputAngka) > 1) ) {
						System.out.println("Warm");
					}else if ( (inputAngka - angkaRand) <= 1 || (angkaRand - inputAngka) <= 1 ) {
						System.out.println("Hot");
					}
				}
			}	

		}
	}
}