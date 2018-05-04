/*
Create by	: Yana
Time 		: 3 Mei 2018 15.28
Update by	:
*/

import java.util.Scanner;

public class KhairilBoolean1{
	public static void main(String[] args){

		Scanner keyboard = new Scanner(System.in);
		Scanner line	 = new Scanner(System.in);

		String 	jenisKelamin, pengalamanSeleksi, domisili;
		double	nilaiMTK1, nilaiMTK2;
		boolean hasil;

		System.out.print("Jenis Kelamin: ");
		jenisKelamin	= keyboard.next();
		System.out.print("Pernah ikut Seleksi: ");
		pengalamanSeleksi	= keyboard.next();
		System.out.print("Berdomisili di: ");
		domisili	= line.nextLine();
		System.out.print("Nilai Matematika 1: ");
		nilaiMTK1	= keyboard.nextDouble();
		System.out.print("Nilai Matematika 2: ");
		nilaiMTK2	= keyboard.nextDouble();
		
		hasil	= ( ( jenisKelamin.equals("L") || jenisKelamin.equals("P") ) && pengalamanSeleksi.equals("T") && domisili.equals("Bandung")  );
	
		System.out.println("Selecsi Olimpiade MTK terpenuhi: " +hasil);
	}
}