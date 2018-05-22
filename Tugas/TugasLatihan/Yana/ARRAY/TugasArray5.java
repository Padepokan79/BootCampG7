/*
Creted by	: Yana
Time		: 21 Mei 2018 20.36
*/

import java.util.Scanner;

public class TugasArray5{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);

		int[] angka 	= {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int	jumlah=0, rataan, ubah, posisi;
		boolean status = false;
		
		for (int tampil : angka) {
			System.out.print(tampil+" ");
		}

		System.out.println();
		System.out.println();
		System.out.print("Masukkan nilai: ");
		ubah = keyboard.nextInt();
		System.out.print("Masukkan posisi: ");
		posisi = keyboard.nextInt();
		System.out.println();

		for (int index=0; index < angka.length; index++ ) {
			angka[posisi-1] = ubah;
			System.out.print(angka[index]+" ");
		}
	}
}