/*
     * Display a listing of the resource.
     *
     * Programmer : Ryan Ahmaad N
     * Created By : Ryan Ahmad N
     * Created At : 17 May 2018 14:34
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;
import java.util.Random;

public class RollVsComputer{
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		Random rand = new Random();

		String pilihan="N";
		int komputer1, komputer2, komputer3, skorKomputer=0,
			user, skorUser=0, skorSementara=0, round= 1;

		System.out.println("\n===========Selamat datang di Roll Dice vs Computer=============");
		System.out.println("Ketentuan\t:");
		System.out.println("* Siapa yang mendapat nilai 100 terlebih dahulu, itu yang menang");
		System.out.println("* Komputer mendapat roll pertama dan me-roll 3 dadu");
		System.out.println("* Player me-roll 1x tapi bisa terus menerus");
		System.out.println("* Jika player mendapat roll dadu bernilai 1, skor round saat bermain hangus / = 0");
		System.out.println("* Skor bertambah jika player mengakhiri round");
		System.out.println("===============================================================\n");
		System.out.println("\nLets Start!!");

		while (pilihan.equals("N") && skorKomputer < 100 && skorUser < 100) {
			
			komputer1 = rand.nextInt(6)+1;
			komputer2 = rand.nextInt(6)+1;
			komputer3 = rand.nextInt(6)+1;
			System.out.println("-----------------------------------");
			System.out.println("Round : "+round);
			System.out.println();
			System.out.println();
			System.out.print("Computer : ");
			System.out.println(komputer1+" "+komputer2+" "+komputer3);
			skorKomputer = skorKomputer + (komputer1+komputer2+komputer3);
			System.out.println("Skor Komputer : "+skorKomputer);
			pilihan = "Y";
			skorUser = skorUser+skorSementara;
			skorSementara = 0;

			while (pilihan.equals("Y") && skorKomputer < 100 && skorUser < 100) {
				user = rand.nextInt(6)+1;
				System.out.print("\nPlayer : "+user);
				skorSementara = skorSementara+user;
				if (user == 1) {
					skorSementara = 0;
					System.out.println("\nSkor Player Sementara : "+skorSementara);
					System.out.println("Skor Player : "+skorUser);
					pilihan = "N";
				}
				if (pilihan.equals("Y") && skorKomputer < 100 && skorUser < 100) {
					System.out.println("\nSkor Player Sementara : "+skorSementara);
					System.out.println("Skor Player : "+skorUser);
					System.out.println("\nLanjut Me roll dadu? (Y/N)");
					pilihan = key.next();
					System.out.println();	
				}
				
			}
			round++;
		}

		if (skorKomputer >= 100) {
			System.out.println("\n******************************");
			System.out.println("Skor Komputer : "+skorKomputer);
			System.out.println("Skor Player : "+skorUser);
			System.out.println("\nOh no Computer Win the game !!");
		}
		else if (skorUser >= 100) {
			System.out.println("\n******************************");
			System.out.println("Skor Komputer : "+skorKomputer);
			System.out.println("Skor Player : "+skorUser);
			System.out.println("\nOh yesss You are win the game !!");
		}

	}
}