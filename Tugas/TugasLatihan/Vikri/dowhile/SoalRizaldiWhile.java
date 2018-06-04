/*
	Created By Vikri
	20/05/2018
	5:06
*/
import java.util.Scanner;
import java.util.Random;

public class SoalRizaldiWhile{
	public static void main(String[] args) {
		int kartu ,kartu2, kartu3, poin1, poin2, poin3;

		Scanner string = new Scanner(System.in);
		Random rand = new Random();

		int hangus = 0;
		poin1 = 0;
		poin2 = 0;
		poin3 = 0;
		do{
			kartu = rand.nextInt(10)+2;
			kartu2 = rand.nextInt(10)+2;
			kartu3 = rand.nextInt(10)+2;
			
			if (kartu==11) {
				System.out.println("Kamu mendapatkan as");
				poin1 = 21;
			} else {
				poin1 = poin1+kartu;
				poin2 = poin2+kartu2;
				poin3 = poin3+kartu3;
				
				if (poin1>21||poin2>21||poin3>21) {
					if (poin1>21) {
						poin1 = 0;
						hangus += 1;
						System.out.println("kamu hangus "+hangus+"x");
					} else if (poin2>21) {
						poin2 = 0;
					} else {
						poin3 = 0;
					}
				} else {
					System.out.println("\n"+kartu);
					System.out.println("Your poin now: "+poin1);

					System.out.println("");

					System.out.println(kartu2);
					System.out.println("pc1 poin now: "+poin2);

					System.out.println("");

					System.out.println(kartu2);
					System.out.println("pc2 poin now: "+poin2);
				}
			}
			
		}while(poin1!=21&&hangus<=3&&poin2!=21&&poin3!=21);

			if (poin1 == 21&&poin2!=21&&poin3!=21){
				System.out.println("\nu win");
			}
			else if (poin2==21&&poin2!=21&&poin3!=21) {
				System.out.println("\npc 1 win");
				System.out.println("u lose");
			} else {
				System.out.println("\npc 2 win");
				System.out.println("u lose");
			}
	}
}