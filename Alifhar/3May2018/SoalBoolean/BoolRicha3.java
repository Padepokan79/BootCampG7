/*
	* Created by:	Alifhar Juliansyah
	* 				03-05-2018	15.02
	* Updated by:
	*
*/

import java.util.Scanner;

public class BoolRicha3{
	public static void main(String[] args){
		Scanner keyboard=new Scanner(System.in);
		int umurSuami, umurIstri, beda=9, bertengkar;
		long gaji;
		boolean cocok;

		System.out.println("\nSelamat datang, ketahuilah kecocokan kalian sebagai suami istri!\n");
		System.out.print("Umur Suami : ");
		umurSuami=keyboard.nextInt();
		System.out.print("Umur Istri : ");
		umurIstri=keyboard.nextInt();
		System.out.print("Dalam sebulan berapa kali frekuensi kalian bertengkar? ");
		bertengkar=keyboard.nextInt();
		System.out.print("Berapa gaji suami dalam sebulan? ");
		gaji=keyboard.nextLong();
		
		cocok=( umurSuami<=(umurIstri+beda) && bertengkar<=5 && gaji>=5000000 );

		System.out.println("\nIni hasilnya....");
		System.out.println("Apakah kalian cocok menjadi suami istri? "+cocok);
	}
}