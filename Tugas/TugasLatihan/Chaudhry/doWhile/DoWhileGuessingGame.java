/*
	DATE CREATED : 17 MEI 2018
	AUTHOR 		 : NURDHIAT CHAUDHARY MALIK
*/
import java.util.Scanner;
import java.util.Random;
public class DoWhileGuessingGame{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		Random rand 	 = new Random();
		int kesempatan, angka, inputAngka, angkaRound, angkaRand, round, benar, salah;
		angka = 1;
		angkaRound = 1;
		kesempatan = 3;
		round = 10;
		benar = salah = 0;


		do{

			System.out.println("Round "+angkaRound);
			angka = 1;
			angkaRand = rand.nextInt(10) + 1;
			System.out.println("PC: "+angkaRand);

				do{

					System.out.print("Tebak angka 1 - 10  :   ");
					inputAngka 	= keyboard.nextInt();

					if (inputAngka == angkaRand) {
						System.out.println("BENAR");
						angka    = kesempatan;
						benar += 1;
						System.out.println("Kamu menang "+benar+" dari 10");
						System.out.println("");
					}
					else{

						if (angka == kesempatan) {
							System.out.println("SALAH");
							System.out.println("Kamu menang "+benar+" dari 10");
							System.out.println("");
							salah += 1;
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
				}while(angka <= kesempatan);


			if (angkaRound == 10) {
				System.out.println("");
				System.out.println("Menang   : "+benar);
				System.out.println("Kalah    : "+salah);
				if (benar <= 7) {
					System.out.print("Status : AMATEURS");
				}
				else if (benar == 8) {
					System.out.print("Status : ADVANCED");
				}
				else if (benar == 9) {
					System.out.print("Status : PROFESSIONAL");
				}
				else if (benar == 10) {
					System.out.print("Status : HACKERS");
				}
			}

			angkaRound = angkaRound + 1;	

		}while(angkaRound <= round);


	}
}