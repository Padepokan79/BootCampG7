/*
     * Display a listing of the resource.
     *
     * Programmer : Ryan Ahmaad N
     * Created By : Ryan Ahmad N
     * Created At : 20 May 2018 18:15
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;
import java.util.Random;

public class LatihanLoopChaudry{
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		Random rand = new Random();

		int nyawaPlay=1, nyawaKom=1, round=1, MaxRound=20, kesempatan=1, maksKesempatan=2;

		System.out.println("**********************************");
		System.out.println("***********TEBAK HURUF************");
		System.out.println("**********************************");

		do{
			System.out.println("\n--------------------------------\n");
			char huruf = (char) (rand.nextInt(26)+'A');
			kesempatan = 1;
			do{
				
				System.out.println("\nRonde : "+round);
				System.out.println("Kesempatan ke : "+kesempatan);
				System.out.println(huruf);
				System.out.println();
				System.out.print("Tebakan User : ");
				String hurufU = key.next();

				
				if (hurufU.charAt(0) == huruf) {
					System.out.println("Madep tebakan anda benar !!!");
					nyawaPlay = nyawaPlay+2;
					kesempatan++;
				}
				else if(kesempatan == 1){
					System.out.println("\nCoba Lagi");
				}
				else {
					System.out.println("Ronde Ini anda gagal");
					nyawaPlay = nyawaPlay-1;
					nyawaKom = nyawaKom+2;
				}

				kesempatan++;
			}while (kesempatan <= maksKesempatan);
		System.out.println("\nNyawa Player\t: "+nyawaPlay+"\nNyawa Komputer\t: "+nyawaKom);

		if (nyawaKom - nyawaPlay >= 6 || nyawaKom >= 16) {
			System.out.println("Shit Game Over !!!!!");
			round = 21;	
		}
		else if ( nyawaPlay - nyawaKom >= 6 || nyawaPlay >= 16) {
			System.out.println("\n---------------------------");
			System.out.println("Your Win !!");
			System.out.print("Rating : ");
			if (round <= 8) {
				System.out.print("CHEATER");
			}
			else if (round <= 11) {
				System.out.print("NICE");
			}
			else {
				System.out.print("NOOB");
			}
			round = 21;
		}

		round++;
		} while(round <= MaxRound);
			

	}
}