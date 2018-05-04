/*
Create by	: Yana
Time 		: 3 Mei 2018 19.33
Update by	:
*/

import java.util.Scanner;

public class KhairilBoolean3{
	public static void main(String[] args){

		Scanner keyboard = new Scanner(System.in);

		int		lamaTerbang;
		String	jenisTiket, typeKelas, jenisKelamin;
		boolean hasil;


		System.out.print("Jenis Tiket Kelas Bisnis: Y/T ");
		jenisTiket	= keyboard.next();
		System.out.print("Tipe Kelas: D/F/T ");
		typeKelas	= keyboard.next();
		System.out.print("Jenis Kelamin : ");
		jenisKelamin	= keyboard.next();
		System.out.print("Lama Terbang: ");
		lamaTerbang	= keyboard.nextInt();


		hasil	= ( jenisTiket.equals("Y") && ( ( jenisKelamin.equals("L") || jenisKelamin.equals("P") ) && ( typeKelas.equals("D") 
				&& lamaTerbang > 30 || typeKelas.equals("F") && lamaTerbang > 30 ) ) || ( typeKelas.equals("T") 
				&& ( ( jenisKelamin.equals("L") && lamaTerbang > 20 ) || ( jenisKelamin.equals("P") && lamaTerbang > 15 ) ) ) ) ;

		
		System.out.println("Penerbangan diperbolehkan " +hasil);
	}
}