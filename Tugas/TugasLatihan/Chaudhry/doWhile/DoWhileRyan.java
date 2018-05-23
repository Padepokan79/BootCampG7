/*
	DATE CREATED : 20 MEI 2018
	TIME CREATED : 15.45 WIB
	AUTHOR 		 : NURDHIAT CHAUDHARY MALIK

	coba buat game adu penalti dengan 5 penendang vs komputer.
	untuk menentukan bola masuk atau tidak, menggunakan teknik random 
	dimana yang mendapat random lebih tinggi itu yang berhasil memasukan/menangkap bola.
	tapi random untuk player, diperintah dengan masukan tendang/tangkap
	jika player memasukan perintah yang tidak sama dengan instruksi, 
	random kekuatan player = 0
*/
import java.util.Scanner;
import java.util.Random;
public class DoWhileRyan{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();
		int penendang, satu, angkaPlayer, angkaKomputer, masukPlayer, masukKomputer;
		String player, komputer;
		satu = 1;
		penendang = 5;
		masukPlayer = masukKomputer = 0;

		System.out.println("================== ADU PINALTI ==================");
		System.out.println("");

		
		while(satu <= penendang){

			System.out.println("Rounde "+satu);
			System.out.println("");
			
			System.out.print("Anda siap menendang |Y| ? ");
			player = keyboard.next();
			if (player.equals("Y")) {
				angkaPlayer 	= rand.nextInt(10) + 1;
				angkaKomputer 	= rand.nextInt(10) + 1;	

				if (angkaPlayer > angkaKomputer) {
					System.out.print("SELAMAT anda berhasil memasukan bola");
					masukPlayer += 1;
				}
				else if (angkaKomputer > angkaPlayer) {
					System.out.print("Sayang sekali bola ditangkap :( ");
				}
			}

			System.out.println("");

			System.out.print("Anda siap menangkap bola |Y| ? ");
			player = keyboard.next();
			if (player.equals("Y")) {
				angkaPlayer 	= rand.nextInt(10) + 1;
				angkaKomputer 	= rand.nextInt(10) + 1;	

				if (angkaPlayer > angkaKomputer) {
					System.out.print("SELAMAT anda berhasil menangkap bola");
				}
				else if (angkaKomputer > angkaPlayer) {
					System.out.print("Sayang sekali komputer berhasil mencetak gol");
					masukKomputer += 1;
				}else{
					System.out.print("Seri !!");
				}
			}

			System.out.println("");
			System.out.println("Skor ---------------------------");
			System.out.println("Player   : "+masukPlayer);
			System.out.println("Komputer : "+masukKomputer);
			System.out.println("==============================================");
			System.out.println("");


			satu += 1;
		}

		if (masukPlayer > masukKomputer) {
			System.out.println("Adu pinalti dimenangkan oleh MANUSIA");
		}else if (masukKomputer > masukPlayer) {
			System.out.println("Adu pinalti dimenangkan oleh KOMPUTER");
		}else if (masukKomputer == masukPlayer) {
			System.out.println("Adu pinalti SERI");
		}


	}
}