/*
	* Created by:	Alifhar Juliansyah
	* 				03-05-2018	11.16
	* Updated by:
	*
*/

import java.util.Scanner;

public class BoolAlifhar3{
	public static void main(String[] args){
		Scanner keyboard=new Scanner(System.in);
		int benar, salah, kosong, nilaiBenar=4, nilaiSalah=-1, total;
		String pensil, rambut;
		double rapi;
		boolean boleh, disiplin;

		System.out.print("\nJawaban benar: ");
		benar=keyboard.nextInt();
		System.out.print("Jawaban salah: ");
		salah=keyboard.nextInt();
		System.out.print("Jawaban kosong: ");
		kosong=keyboard.nextInt();
		System.out.print("pensil yang digunakan (HB/2B/3B/4B/5B/6B): ");
		pensil=keyboard.next();
		System.out.print("Skala kerapian (0 sampai 10): ");
		rapi=keyboard.nextDouble();
		System.out.print("Rambut (pendek/panjang): ");
		rambut=keyboard.next();

		total=benar*nilaiBenar+salah*nilaiSalah;
		disiplin=pensil.equals("2B") && (rapi>=8 || rambut.equals("pendek"));

		boleh=(total>130 && disiplin );
		System.out.println("\nTotal nilai   : "+total);
		System.out.println("Kedispilinan  : "+disiplin);
		System.out.println("Anda Lulus    : "+boleh);
	}
}