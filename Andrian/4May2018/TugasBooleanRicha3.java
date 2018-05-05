/* 	Date 		: 3/5/2018    
	Time 		: 08:31:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	import java.util.Scanner;

	public class TugasBooleanRicha3 {
		public static void main(String [] args){
			Scanner key = new Scanner(System.in);
			int umursuami, selisihUmur,umuristri,batasusia,batasbertengkar,batasgaji,bertengkar,gaji;
			boolean hasil, suami;
			
			batasusia = 9;
			batasbertengkar = 5;
			batasgaji = 5000000;

			System.out.println("Selamat datang, ketahuilah kecocokan kalian sebagai suami istri!");

			System.out.println("\nUmur suami :");
			umursuami = key.nextInt();

			System.out.println("Umur istri :");
			umuristri = key.nextInt();

			System.out.println("Dalam sebulan berapa kali frekuensi kalian bertengkar?");
			bertengkar = key.nextInt();

			System.out.println("Berapa gaji suami dalam sebulan?");
			gaji = key.nextInt();

			selisihUmur = umursuami - umuristri;
			
			hasil = ( umursuami>umuristri && selisihUmur<=batasusia ) && bertengkar<=batasbertengkar && gaji>=batasgaji ;

			System.out.println("Ini hasilnya.... ");
			System.out.println("Apakah kalian cocok menjadi suami istri? " + hasil);
			
		}
	}