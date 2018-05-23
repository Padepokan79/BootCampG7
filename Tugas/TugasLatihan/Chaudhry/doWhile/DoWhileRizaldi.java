/*
	DATE CREATED : 19 MEI 2018
	TIME CREATED : 20.00 WIB
	AUTHOR 		 : NURDHIAT CHAUDHARY MALIK

	>lotre
	- anda membeli lotre dengan kriteria
	- harga 100 kesempatan mendapat point 0s/d10
	- harga 200=0s/d20, 300=0s/d50, 500=0s/d100
	- yang pertama kali mencapai point 1000 menang.
	- yang uang nya habis, kalah dan point lotre nya tidak dapet.
	- yang menjadi pemain 2 orang manusia.
	- diberi modal awal 100.000.
*/
import java.util.Scanner;
import java.util.Random;
public class DoWhileRizaldi{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();
		int totalPointP1, totalPointP2, inputPlayer1, inputPlayer2, pointMax, uangPlayer1, uangPlayer2, angkaRand;
		totalPointP1 = totalPointP2 = 0;
		pointMax = 1000;
		uangPlayer1 = uangPlayer2 = 100000;

		System.out.println("");
		System.out.println(">> LOTRE");
		System.out.println("========================");

		while(totalPointP1 <= pointMax && totalPointP2 <= pointMax && uangPlayer1 > 0 && uangPlayer2 > 0){
			System.out.println("PLAYER SATU");
			System.out.print("Input harga P01 : ");
			inputPlayer1 = keyboard.nextInt();

			if (inputPlayer1 == 100) {
				angkaRand = rand.nextInt(11);
				System.out.println("Point didapat   : "+angkaRand);
				totalPointP1 = totalPointP1 + angkaRand;
				System.out.println("Total Point 01  : "+totalPointP1);
				uangPlayer1 = uangPlayer1 - 100;
				System.out.println("Modal anda      : "+(uangPlayer1));
			}
			else if (inputPlayer1 == 200) {
				angkaRand = rand.nextInt(21);
				System.out.println("Point didapat   : "+angkaRand);
				totalPointP1 = totalPointP1 + angkaRand;
				System.out.println("Total Point 01  : "+totalPointP1);
				uangPlayer1 = uangPlayer1 - 200;
				System.out.println("Modal anda      : "+(uangPlayer1));
			}
			else if (inputPlayer1 == 300) {
				angkaRand = rand.nextInt(51);
				System.out.println("Point didapat   : "+angkaRand);
				totalPointP1 = totalPointP1 + angkaRand;
				System.out.println("Total Point 01  : "+totalPointP1);
				uangPlayer1 = uangPlayer1 - 300;
				System.out.println("Modal anda      : "+(uangPlayer1));
			}
			else if (inputPlayer1 == 500) {
				angkaRand = rand.nextInt(101);
				System.out.println("Point didapat   : "+angkaRand);
				totalPointP1 = totalPointP1 + angkaRand;
				System.out.println("Total Point 01  : "+totalPointP1);
				uangPlayer1 = uangPlayer1 - 500;
				System.out.println("Modal anda      : "+(uangPlayer1));
			}

			System.out.println("------------------------------");

			System.out.println("PLAYER KEDUA");
			System.out.print("Input harga P02 : ");
			inputPlayer2 = keyboard.nextInt();

			if (inputPlayer2 == 100) {
				angkaRand = rand.nextInt(11);
				System.out.println("Point didapat   : "+angkaRand);
				totalPointP2 = totalPointP2 + angkaRand;
				System.out.println("Total Point 01  : "+totalPointP2);
				uangPlayer2 = uangPlayer2 - 100;
				System.out.println("Modal anda      : "+(uangPlayer2));
			}
			else if (inputPlayer2 == 200) {
				angkaRand = rand.nextInt(21);
				System.out.println("Point didapat   : "+angkaRand);
				totalPointP2 = totalPointP2 + angkaRand;
				System.out.println("Total Point 01  : "+totalPointP2);
				uangPlayer2 = uangPlayer2 - 200;
				System.out.println("Modal anda      : "+(uangPlayer2));
			}
			else if (inputPlayer2 == 300) {
				angkaRand = rand.nextInt(51);
				System.out.println("Point didapat   : "+angkaRand);
				totalPointP2 = totalPointP2 + angkaRand;
				System.out.println("Total Point 01  : "+totalPointP2);
				uangPlayer2 = uangPlayer2 - 300;
				System.out.println("Modal anda      : "+(uangPlayer2));
			}
			else if (inputPlayer2 == 500) {
				angkaRand = rand.nextInt(101);
				System.out.println("Point didapat   : "+angkaRand);
				totalPointP2 = totalPointP2 + angkaRand;
				System.out.println("Total Point 01  : "+totalPointP2);
				uangPlayer2 = uangPlayer2 - 500;
				System.out.println("Modal anda      : "+(uangPlayer2));
			}

			System.out.println("------------------------------");

			if (totalPointP1 >= 1000) {
				System.out.println("SELAMAT!! PLAYER SATU MENANG!!");
				System.out.println("POINT PLAYER SATU : "+totalPointP1);
			}
			else if (totalPointP2 >= 1000) {
				System.out.println("SELAMAT!! PLAYER DUA MENANG!!");
				System.out.println("POINT PLAYER DUA : "+totalPointP2);
			}

			if (uangPlayer1 == 0) {
				System.out.println("SELAMAT!! PLAYER DUA MENANG");
				System.out.println("POINT PLAYER DUA : "+(totalPointP2));
				System.out.println("PLAYER SATU KALAH!!");
				System.out.println("POINT PLAYER SATU : "+(totalPointP1 = 0));
			}
			else if (uangPlayer2 == 0) {
				System.out.println("SELAMAT!! PLAYER SATU MENANG");
				System.out.println("POINT PLAYER SATU : "+(totalPointP1));
				System.out.println("PLAYER DUA KALAH!!");
				System.out.println("POINT PLAYER KEDUA : "+(totalPointP2 = 0));
			}


		}

	}
}