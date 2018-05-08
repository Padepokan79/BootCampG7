/*
	 Program     : Boolean Richa 3 / Kecocokan jadi Suami Istri
     Creator     : Khairil
     Created At  : 3 Mei 2018 19:55 PM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;

class BooleanRicha3 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int inputUmurSuami, inputUmurIstri, inputFrekuensi, inputGaji, umurRange, frekuensi, gaji;
		boolean cocokKah;

		System.out.println( "Selamat datang, ketahuilah kecocokan kalian sebagai suami istri!" );
		System.out.println();

		System.out.print( "Umur Suami : " );
		inputUmurSuami = keyboard.nextInt();

		System.out.print( "Umur Istri : " );
		inputUmurIstri = keyboard.nextInt();
		
		System.out.print( "Dalam sebulan berapa kali frekuensi kalian bertengkar ? : " );
		inputFrekuensi = keyboard.nextInt();

		System.out.print( "Berapa gaji suami dalam sebulan ? : " );
		inputGaji = keyboard.nextInt();

		umurRange = 9;
		frekuensi = 5;
		gaji = 5000000;

		cocokKah = inputUmurIstri <= inputUmurSuami - 9 && inputFrekuensi < frekuensi && inputGaji > gaji  ;

		System.out.println( "Ini hasilnya...." );
		System.out.println( "Apakah kalian cocok menjadi suami istri? " + cocokKah );		
	}
}