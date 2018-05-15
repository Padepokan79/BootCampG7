/*
	 Program     : Soal 1 - Alifhar
     Creator     : Khairil
     Created At  : 15 Mei 2018 08:35 AM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;

public class AlifharIfElse1 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int nolAjah, satuAjah;
		double inputBil, penentu;
		String jenisAngka, jenisBR, jenisGG;

		System.out.println("=====================================");
		System.out.print("Masukkan bilangan: ");
		inputBil = keyboard.nextDouble();

		nolAjah = 0;
		satuAjah = 1;
		penentu = inputBil % 2.0;

		System.out.println("=====================================");
		System.out.println("Bilangan tersebut adalah");
		if(inputBil < nolAjah) {
			jenisAngka = "negatif";
		}
		else {
			jenisAngka = "positif";
		}

		if( penentu == nolAjah ) {
			jenisGG = "genap";
		}
		else {
			jenisGG = "ganjil";
		}

		if( penentu != nolAjah && penentu != satuAjah && penentu != -satuAjah ) {
			jenisBR = "riil";
			System.out.println("Bilangan " + jenisBR +  " " + jenisAngka);			
		}
		else {
			jenisBR = "bulat";
			System.out.println("Bilangan " + jenisBR + " " + jenisGG + " " + jenisAngka);			
		}
		System.out.println("=====================================");
	}
}     