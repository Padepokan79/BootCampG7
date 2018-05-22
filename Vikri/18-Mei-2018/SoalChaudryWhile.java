/*
	Created By Vikri
	18/05/2018
	20:35
*/
import java.util.Scanner;
import java.util.Random;

public class SoalChaudryWhile{
	public static void main(String[] args) {
		int nyawaPlayer, stage, nyawaCom, ronde;
		String tebak, rank;
		char main, tebak2;

		Scanner string = new Scanner(System.in);
		Random rand = new Random();

		nyawaPlayer = 0;
		nyawaCom = 0;
		ronde = 1;
		while(ronde<21){
			System.out.println("\nRonde "+ronde);
			System.out.println("=============================");
			stage = 1;
			do{
				main = (char) (rand.nextInt(26)+'a');

				System.out.print("\n Tebak huruf: ");
				tebak=string.next();

				tebak2 = tebak.charAt(0);

				if (tebak2 == main) {
					System.out.println("Anda Benar");
					nyawaPlayer += 2;
					System.out.println("Nyawa Anda: "+nyawaPlayer);
					System.out.println("Nyawa PC: "+nyawaCom);
				} else {
					System.out.println("Anda Salah\n");
					nyawaCom += 2;
					nyawaPlayer -= 1;
					System.out.println("Nyawa Anda: "+nyawaPlayer);
					System.out.println("Nyawa PC: "+nyawaCom);
				}

				stage++;
			}while(stage<=2);
				if (nyawaPlayer>=16&&ronde<=8) {
					System.out.println("CHEATER\n");
					ronde += 20;
				} else if (nyawaPlayer>=16&&ronde>8&&ronde<=11) {
					System.out.println("NICE\n");
					ronde += 20;
				} else if (nyawaPlayer>=16&&ronde>11) {
					System.out.println("Noob\n");
					ronde += 20;
				}
			ronde++;
		}

		if (nyawaPlayer>nyawaCom) {
			System.out.print("U win");
		} else if ((nyawaPlayer-nyawaCom==6)||(nyawaCom-nyawaPlayer==6)) {
			System.out.print("U win dengan selisih 6");
		} else {
			System.out.print("U Lose");
		}
	}
}