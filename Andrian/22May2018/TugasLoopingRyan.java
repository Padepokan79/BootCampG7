/* 	Date 		: 14/5/2018    
	Time 		: 13:20:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
	
coba buat game adu penalti dengan 5 penendang vs komputer.
untuk menentukan bola masuk atau tidak, menggunakan teknik random dimana yang mendapat random lebih tinggi itu yang berhasil memasukan/menangkap bola.
tapi random untuk player, diperintah dengan masukan tendang/tangkap
jika player memasukan perintah yang tidak sama dengan instruksi, random kekuatan player = 0
*/
	
	import java.util.Scanner;
	import java.util.Random;

	public class TugasLoopingRyan {
		public static void main(String[] args) {
			Scanner key = new Scanner(System.in);
			Random rand = new Random();

			int round=1, playerPower, randKomp, scorePlayer=0, scoreKomp=0;
			String playerTurn;

			System.out.println("====================================================");
			System.out.println("                WELCOME TO THE GAME                 ");
			System.out.println("====================================================");
			System.out.println("penendang pertama \t\t: Player");
			System.out.println("penendang pertama \t\t: Komputer");

			while (round<=5) {
				System.out.println("====================================================");
				System.out.println("                Round "+round);
				System.out.println("====================================================");
				randKomp = rand.nextInt(10)+1;
				System.out.println(randKomp); //cheat

				System.out.println("Jika siap menendang, masukan (ok) : ");
				playerTurn = key.next();

				if (playerTurn.equals("ok")) {
					playerPower = rand.nextInt(10)+1;
					if (playerPower>=randKomp) {
						System.out.println("GOOL!!");
						scorePlayer+=1;
					}
					else {
						System.out.println("Tertahan bung");
					}
				} 
				System.out.println("---------------------------------------------------");
				System.out.println("Jika siap menangkap, masukan (ok) : ");
				playerTurn = key.next();

				if (playerTurn.equals("ok")) {
					playerPower = rand.nextInt(10)+1;
					if (playerPower>=randKomp) {
						System.out.println("Tertangkap bung!!");
					}
					else {
						System.out.println("Kebobolan saudara-saudara");
						scoreKomp+=1;
					}

				}

			System.out.println();
			System.out.println("Score player "+scorePlayer);
			System.out.println("score Komputer "+scoreKomp);

			round++;
			}
			System.out.println();
			System.out.println("Score akhir player "+scorePlayer);
			System.out.println("score akhir Komputer "+scoreKomp);
		}
	}