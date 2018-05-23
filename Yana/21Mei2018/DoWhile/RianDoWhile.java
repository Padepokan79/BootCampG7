/*
Creted by	: Yana
Time		: 19 Mei 2018 17.38
*/

import java.util.Scanner;
import java.util.Random;

public class RianDoWhile{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random random = new Random();

		int round=0, tendanganPlayer, tendanganKomputer,
			tangkapanPlayer, tangkapanKomputer, poinPlayer=0, poinKomputer=0;
		String ok;

		do{
			round++;
			System.out.println();
			System.out.println("Ronde "+round);
			System.out.println();

			tendanganPlayer 	= random.nextInt();
			tendanganKomputer	= random.nextInt();
			tangkapanPlayer 	= random.nextInt();
			tangkapanKomputer 	= random.nextInt();

			System.out.print("Siap menendang? (ok) :");
			ok = keyboard.next();
			if (ok.equals("ok")) {
				if (tendanganPlayer > tendanganKomputer) {
					System.out.println("Tendangan masuk");
					poinPlayer = poinPlayer + 1;
				}	else{
					System.out.println("Tendangan tidak masuk");
				}		
			}else{

			}

			System.out.print("Siap menangkap? (ok) :");
			ok = keyboard.next();
			if (ok.equals("ok")) {
				if (tangkapanPlayer > tangkapanKomputer) {
					System.out.println("Tangkapan tepat");
				}else{
					System.out.println("Tangkapan tidak tepat");
					poinKomputer = poinKomputer + 1;
				}			
			}
		}while(round < 5);

		System.out.println();
		System.out.println("Skor: ");
		System.out.println("Player\t: Komputer");
		System.out.println(poinPlayer+"\t: "+poinKomputer);
	}
}
/*
coba buat game adu penalti dengan 5 penendang vs komputer.
untuk menentukan bola masuk atau tidak, menggunakan teknik random dimana yang mendapat random 
lebih tinggi itu yang berhasil memasukan/menangkap bola.
tapi random untuk player, diperintah dengan masukan tendang/tangkap
jika player memasukan perintah yang tidak sama dengan instruksi, random kekuatan player = 0


*/