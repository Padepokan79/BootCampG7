/*
	Created By Vikri
	19/05/2018
	10:57
*/
import java.util.Scanner;
import java.util.Random;

public class SoalMalikWhile{
	public static void main(String[] args) {
		int pencil, tebak, tebakPencil, kesempatan, score, score2;
		String jawab;
		Random rand = new Random();
		Scanner input = new Scanner(System.in);
		kesempatan = 2;
		score = 0;
		do{
			System.out.print("Masukan jumlah pencil: ");
			pencil=input.nextInt();

			tebakPencil=rand.nextInt(pencil)+1;

			System.out.print(tebakPencil+" Tebak: ");
			tebak=input.nextInt();
			if (tebakPencil==tebak) {
				kesempatan += 1;
				score += 10;
				System.out.println("Tebakan benar! Score +10");
				System.out.println("Jumlah Score: "+score);
				System.out.println("Kesempatan anda: "+kesempatan+"\n");
			} else {
				kesempatan -= 1;
				System.out.println("Tebakan Salah!");
				System.out.println("Jumlah Score: "+score);
				System.out.println("Kesempatan anda: "+kesempatan+"\n");
			}

			if (kesempatan == 0&&score>=10) {
				System.out.print("Tukarkan 10 score untuk 1 kesempatan? ");
				jawab=input.next();

				if (jawab.equals("ya")) {
					System.out.print("Berapa skor yang ingin anda tukar?");
					score2=input.nextInt();

					if (score2<=score) {
						kesempatan = score2/10;
						score = score-score2;
						System.out.println("Score Berhasil di tukar menjadi "+kesempatan+" kesempatan");
						System.out.println("Sisa Score anda : "+score+"\n");
					} else{
						System.out.println("Skor Tidak cukup\n");
					}
				
				} else {
					System.out.println("Game Over");
					System.out.println("Your score: "+score);
				}
			}
		}while(kesempatan>0);
			System.out.println("Game Over");
			System.out.println("Your score: "+score);
	}
}