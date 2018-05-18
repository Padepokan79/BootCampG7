/*
	DATE CREATED : 17 MEI 2018
	AUTHOR 		 : NURDHIAT CHAUDHARY MALIK
*/
import java.util.Scanner;
import java.util.Random;
public class WhileGuessingGame{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		Random rand 	 = new Random();
		int kesempatan, angka, inputAngka, angkaRand;
		angka = 1;
		kesempatan = 3;

		angkaRand = rand.nextInt(10) + 1;
		System.out.println("PC: "+angkaRand);

		while (angka <= kesempatan) {

			System.out.print("Tebak angka 1 - 10  :   ");
			inputAngka 	= keyboard.nextInt();

			if (inputAngka == angkaRand) {
				System.out.println("BENAR");
				angka    = kesempatan;
				System.out.println("KAMU MENANG");
			}
			else{

				if (angka == kesempatan) {
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

			angka = angka + 1;
		}




	}
}