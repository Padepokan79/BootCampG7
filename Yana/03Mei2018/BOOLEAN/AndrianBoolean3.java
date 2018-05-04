/*
Create by	: Yana
Time 		: 3 Mei 2018 20.21
Update by	:
*/

import java.util.Scanner;

public class AndrianBoolean3{
	public static void main(String[] args){

		Scanner keyboard = new Scanner(System.in);

		int		jumlahLantai, jumlahFlora, julahKolam, jumlahMobil;
		double	luasTanah;
		boolean hasil;


		System.out.print("Luas Tanah (Hektar): ");
		luasTanah	= keyboard.nextDouble();
		System.out.print("Jumlah Lantai ");
		jumlahLantai	= keyboard.nextInt();
		System.out.print("Jumlah Kolam ");
		julahKolam	= keyboard.nextInt();
		System.out.print("Jumlah Mobil ");
		jumlahMobil	= keyboard.nextInt();
		System.out.print("Jumlah Flora ");
		jumlahFlora	= keyboard.nextInt();


		hasil	= ( ( ( luasTanah > 0.3 && jumlahLantai > 3 ) || ( luasTanah >= 0.7 && jumlahLantai <= 3 ) ) && 
				  ( ( jumlahFlora >= 5 && julahKolam >= 2 ) || ( jumlahFlora >= 8 && julahKolam < 2 ) ) && jumlahMobil > 3 );
		
		
		System.out.println("Rumah cocok: " +hasil);
	}
}