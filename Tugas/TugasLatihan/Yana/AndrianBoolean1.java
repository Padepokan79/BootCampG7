/*
Create by	: Yana
Time 		: 3 Mei 2018 20.21
Update by	:
*/

import java.util.Scanner;

public class AndrianBoolean1{
	public static void main(String[] args){

		Scanner keyboard = new Scanner(System.in);

		String	jenisKelamin, status, hadiah;
		double	tampang, hargaHadiah;
		boolean hasil;


		System.out.print("Teman Sekolah: Y/T :");
		status	= keyboard.next();
		System.out.print("Jenis Kelamin: L/P :");
		jenisKelamin	= keyboard.next();
		System.out.print("Bawa hadiah: Y/T ");
		hadiah	= keyboard.next();
		System.out.print("Harga Hadiah");
		hargaHadiah	= keyboard.nextDouble();
		System.out.print("Tampang: ");
		tampang	= keyboard.nextDouble();
		

		hasil	= ( status.equals("Y") && ( jenisKelamin.equals("L") || jenisKelamin.equals("P") ) && hadiah.equals("Y") && ( ( tampang >= 8.5 && hargaHadiah > 5000000) || ( tampang >= 0.0 && hargaHadiah > 20000000 ) )  );

		
		System.out.println("Dipersilahkan ke party: " +hasil);
	}
}