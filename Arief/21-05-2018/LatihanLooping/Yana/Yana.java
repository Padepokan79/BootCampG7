/*
Date Created	: 20 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;
import java.util.Random;
public class Yana {
 	public static void main(String[] args) {
		Scanner inputKey = new Scanner(System.in);
		Random rand = new Random();

		int kBudi, menit, kMan, kTono, dadu;

		kBudi = 200; // 20 / menit
		kMan = 10; // 40 / menit
		kTono = 500; // dadu / menit
		menit = 0;
 		
 		System.out.println("Tono mengocok dadu");
 		System.out.print("Jumlah dadu : ");
 		dadu = rand.nextInt(6)+1;
 		System.out.println(dadu);
		System.out.println("=========================================");
		
 		do{
 			menit++;
 			kBudi+=20;
 			kMan+=40;
 			kTono+=dadu;
 			if (kMan>=kBudi) {
 				kTono += kBudi;
 			}
 			System.out.println("Menit ke " + menit);
 			System.out.println("Dadu Budi saat ini" + kBudi);
 			System.out.println("Dadu Man saat ini" + kMan);
 			System.out.println("Dadu Tono saat ini" + kTono);
			System.out.println("=========================================");
 		}while (kBudi>=kMan);

 		System.out.println("Tono mengocok dadu");
 		System.out.print("Jumlah dadu : ");
 		dadu = rand.nextInt(6)+1;
 		System.out.println(dadu);
		System.out.println("=========================================");

 		do{
 			menit++;
 			kBudi+=20;
 			kMan+=40;
 			kTono+=dadu;
 			System.out.println("Menit ke " + menit);
 			System.out.println("Dadu Budi saat ini" + kBudi);
 			System.out.println("Dadu Man saat ini" + kMan);
 			System.out.println("Dadu Tono saat ini" + kTono);
			System.out.println("=========================================");
 		}while (kTono>=kMan);

 		System.out.println("\nMenit Man mengejar Tono ada di " + menit);



 			
 	}
}