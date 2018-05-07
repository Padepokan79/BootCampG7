/*
	* Created by:	Alifhar Juliansyah
	* 				03-05-2018	15.50
	* Updated by:
	*
*/

import java.util.Scanner;

public class BoolYana2{
	public static void main(String[] args){
		Scanner keyboard=new Scanner(System.in);
		double ipk1, ipk2, rata;
		String kelamin, akreditasi, pendidikan;
		boolean diterima;

		System.out.print("\nJenis Kelamin (pria/wanita): ");
		kelamin=keyboard.next();
		System.out.print("Pendidikan terakhir anda: ");
		pendidikan=keyboard.next();
		System.out.print("IPK S1: ");
		ipk1=keyboard.nextDouble();
		System.out.print("IPK S2: ");
		ipk2=keyboard.nextDouble();
		System.out.print("Akreditasi Kampus (A/B/C): ");
		akreditasi=keyboard.next();

		rata=(ipk1+ipk2)/2;

		diterima=( (kelamin.equals("pria")||kelamin.equals("wanita")) && pendidikan.equals("S2") && rata>=3.25 && (akreditasi.equals("A") ||akreditasi.equals("B")) );
		
		System.out.println("Anda diterima beasiswa S3 "+diterima);
	}
}