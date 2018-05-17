/*
	 Program     : Soal 3 - Malik
     Creator     : Khairil
     Created At  : 16 Mei 2018 09:55 AM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;

public class MalikIfElse3 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int inputJujur, inputBohong, inputSombong, inputAngkuh, totalSkala;
		boolean baik, kurangBaik, sangatBaik, buruk, masihBaik;

		System.out.println("===================================");
		System.out.println("DETECTED UR ATTITUDE");
		System.out.println("===================================");
		System.out.print("skala jujur anda   : ");
		inputJujur = keyboard.nextInt();
		System.out.print("skala bohong anda  : ");
		inputBohong = keyboard.nextInt();
		System.out.print("skala sombong anda : ");
		inputSombong = keyboard.nextInt();
		System.out.print("skala angkuh anda  : ");
		inputAngkuh = keyboard.nextInt();
		System.out.print("-----------------------------------");
		
		System.out.println("===================================");
		System.out.println("DETECTED UR ATTITUDE");
		System.out.println("===================================");
		System.out.println("skala jujur anda   : "+ inputJujur);
		System.out.println("skala bohong anda  : "+ inputBohong);
		System.out.println("skala sombong anda : "+ inputSombong);
		System.out.println("skala angkuh anda  : "+ inputAngkuh);
		System.out.println("-----------------------------------");

		baik = inputJujur >= 8 && inputBohong < 5 && inputSombong < 6 && inputAngkuh < 7;
		masihBaik = inputJujur >= 9 && inputSombong < 2; 
		totalSkala = inputJujur + inputBohong + inputSombong + inputAngkuh;
		kurangBaik = totalSkala < 5;
		sangatBaik = totalSkala > 35;
		buruk = totalSkala < 15;

		if(baik || masihBaik) {
			if(baik) {
				System.out.println("SELAMAT! anda baik !");
			}
			else if(masihBaik) {
				System.out.println("SELAMAT! anda baik !");
			}
			else {
				System.out.println("Hmmmm... anda kurang baik");
			}
		}
		else if(kurangBaik) {
			System.out.println("Hmmmm... anda kurang baik");
		}
		else if(sangatBaik) {
			System.out.println("WOW!! anda sangat baik!!");
		}
		else if(buruk) {
			System.out.println("TOBAAAAT!!!");
		}
	}
}