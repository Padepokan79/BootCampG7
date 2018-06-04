//Created ny : Hendra Kurniawan
//Date : 24 Mei 2018 Time : 12:06 AM
//Modified :
import java.util.Scanner;
import java.util.Random;

public class LoopingVikri{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();

		int i = 1, skorP1, predSkorP=0, skorA1, predSkorA=0, skorP,skorA;

		do{
			System.out.println("================================");
			System.out.println("Masukan Prediksi Skor Di Babak "+i);
			System.out.println("================================");
			System.out.print("Masukan Skor Persib : ");
			skorP1 = keyboard.nextInt();
			System.out.print("Masukan Skor Arema  : ");
			skorA1 = keyboard.nextInt();

			predSkorP += skorP1;
			predSkorA += skorA1;

			System.out.println(); 
			i++;
		}while(i<=2);

		skorA = rand.nextInt(10)+1;
		skorP = rand.nextInt(10)+1;

		System.out.println("=====================================");
		System.out.println("           PERSIB||AREMA" );
		System.out.println("Skor Akhir    "+ skorP + " : "+ skorA);
		System.out.println("Prediksi      "+ predSkorP + " : "+ predSkorA);
		System.out.println("======================================");

		if(predSkorP == skorP && predSkorA == skorA)
		{
			System.out.println("Paket Umroh Gratis.");
		}
		else if(predSkorA == skorA || predSkorP == skorP)
		{
			System.out.println("Selamat Dapat Kaos Atep.");
		}
		else 
		{
			System.out.println("Coba Lagi Minggu Depan.");
		}
	}
}