/*
	 Program     : Soal 3 - Chaudhry
     Creator     : Khairil
     Created At  : 15 Mei 2018 15:07 PM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;

public class ChaudhryIfElse3 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int inputJarak, jalanKaki, naikSepeda, naikMotor, naikMobil, naikHelikopter;

		jalanKaki = 10;
		naikSepeda = 35;
		naikMotor = 72;
		naikMobil = 100;
		naikHelikopter = 150;

		System.out.println("++++++++++++++++++++++++++++++++++++");
		System.out.println("PERJALANANKU MENUJU TEMPAT KERJA :)");
		System.out.println("++++++++++++++++++++++++++++++++++++");
		System.out.println();
		System.out.print("Masukan jarak rumah dengan perusahaan : ");
		inputJarak = keyboard.nextInt();
		System.out.println();
		System.out.println("Perjalanan yang tersedia untuk anda : "); 

		if(inputJarak >= naikHelikopter) {
			System.out.println(" - Naik Helikopter");
		}
		if(inputJarak >= naikMobil) {
			System.out.println(" - Naik Mobil");
		}
		if(inputJarak >= naikMotor) {
			System.out.println(" - Naik Motor");
		}
		if(inputJarak >= naikSepeda) {
			System.out.println(" - Naik Sepeda");
		}
		if(inputJarak >= jalanKaki) {
			System.out.println(" - Jalan Kaki");
		}
		if(inputJarak < jalanKaki) {
			System.out.println(" - Jalan Kaki");
		}
	}
}