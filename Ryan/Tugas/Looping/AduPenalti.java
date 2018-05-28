/*
     * Display a listing of the resource.
     *
     * Programmer : Ryan Ahmaad N
     * Created By : Ryan Ahmad N
     * Created At : 18 May 2018 13:40
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;
import java.util.Random;

public class AduPenalti{
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		Random rand = new Random();

		String pilihan;
		int kesempatan=5, ronde =1, kekuatanKom, kekuatanPlay,
		skorPlayer=0, skorKom=0;

		System.out.println("\n====== Adu penalti v1 ======");
		System.out.print("\nPenendang pertama\t: Player");
		System.out.print("\nPenendang kedua\t\t: Komputer");
		System.out.println("\n==============================\n");
		System.out.println("Lets Start");
		while (ronde <= kesempatan) {
			System.out.println("\n*******************************");
			System.out.println("Round ke "+ronde);
				System.out.println("\nJika Siap menendang, masukan (ok)");
				pilihan = key.next();
				kekuatanKom = rand.nextInt(10)+1;
				if (pilihan.equals("ok")) {
					kekuatanPlay = rand.nextInt(10)+1;
				}
				else{
					kekuatanPlay = 0;
				}
				///////////////////////////
				if ( kekuatanPlay > kekuatanKom) {
					skorPlayer = skorPlayer+1;
					System.out.println("\nMantap anda memasukan bola!!");
				}
				else{
					System.out.println("\nSayang sekali tendangan anda lemah!!");
				}
			System.out.println("\n-----------------------------------\n");
				System.out.println("Jika anda siap menangkap, masukan (ok)");
				pilihan = key.next();
				kekuatanKom = rand.nextInt(10)+1;
				if (pilihan.equals("ok")) {
					kekuatanPlay = rand.nextInt(10)+1;
				}
				else{
					kekuatanPlay = 0;
				}
				///////////////////////////
				if ( kekuatanPlay >= kekuatanKom) {
					System.out.println("\nMantap anda Menangkap Bola dengan baik bola!!");
				}
				else{
					skorKom = skorKom+1;
					System.out.println("\nSayang sekali Feeling anda terhadap bola jelek!!");
				}
			System.out.println("\nSkor : Player "+skorPlayer+" - Komputer "+skorKom);
		if (ronde == kesempatan && skorPlayer > skorKom) {
			System.out.println("\n\n=============================================================");
			System.out.println("Congratulations anda memengkan permainan dengan skor "+skorPlayer+" - "+skorKom);
		}
		else if (ronde == kesempatan && skorPlayer < skorKom) {
			System.out.println("\n\n=============================================================");
			System.out.println("Game over kamu kalah oleh komputer dengan skor "+skorPlayer+" - "+skorKom);
		}
		else if (ronde == kesempatan && skorPlayer == skorKom) {
			System.out.println("\n\n=============================================================");
			System.out.println("Game Draw / sama kuat dengan skor "+skorPlayer+" - "+skorKom);
		}
			ronde++;
		}

		

	}
}