/*
	DATE CREATED : 16 MEI 2018
	AUTHOR       : NURDHIAT CHAUDHARY MALIK
*/
import java.util.Scanner;
import java.util.Random;

public class GameGuessing01 {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		Random rand 	 = new Random();
		int inputAngka, angkaRand, maxKesempatan, satu, angka;
		maxKesempatan    = 3;
		satu 			 = 1;

		angkaRand = rand.nextInt(10) + 1;
		System.out.println("PC: "+angkaRand);
		

		for (angka = satu; angka <= maxKesempatan; angka++) {

			System.out.print("Tebak angka 1 - 10  :   ");
			inputAngka 	= keyboard.nextInt();

			if (inputAngka == angkaRand) {
				System.out.println("BENAR");
				angka = maxKesempatan;
				System.out.println("KAMU MENANG");
			}
			else{
				System.out.println("SALAH");
				if (angka == maxKesempatan) {
					System.out.println("GAME OVER");
				}
			}	

		}
	}
}