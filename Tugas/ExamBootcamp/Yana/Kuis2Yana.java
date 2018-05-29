/*
Created by 	: Yana
Date 		: 29 Mei 2018
Start 		: 12.**
End 		: 12.48
*/

import java.util.Scanner;

public class Kuis2Yana{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[][]	array = new int[100][100];
		String	strjumlahBaris;
		int 	jumlahBaris, batasMin, batasMax, batas1, batas2;

		jumlahBaris	= 0;
		batasMin 	= 2; //batas min input
		batasMax 	= 20; //batas max input
		batas1 		= 99;
		batas2 		= 9;

		//pertanyaan jumlah baris
		do{
			System.out.print("Jumlah baris untuk Segitiga Paskal yang akan ditampilkan: ");
			strjumlahBaris = input.nextLine();
			if (strjumlahBaris.matches("[0-9]*")) {
				jumlahBaris = Integer.parseInt(strjumlahBaris);
				if (jumlahBaris < batasMin) {
					System.out.println("Maaf, jumlah baris tidak boleh kurang dari 2.");
					System.out.println("Silahkan input kembali");
				}
				else if (jumlahBaris > batasMax) {
					System.out.println("Maaf, jumlah baris tidak boleh lebih dari 20.");
					System.out.println("Silahkan input kembali");
				}
			}
			else if (strjumlahBaris.matches("[^0-9]")) {
				System.out.println("Maaf, input yang diterima hanya berupa angka.");
				System.out.println("Silahkan input kembali");
			}	
		}while(strjumlahBaris.matches("[^0-9]") || jumlahBaris < batasMin || jumlahBaris > batasMax);

		//membuat segitiga paskal
		for (int baris=1; baris < jumlahBaris; baris++) {
			for (int nilai=1; nilai <= baris; nilai++) {
				if (baris == 0 || nilai == baris) {
					array[baris][nilai]=1;
					System.out.print(array[baris][nilai]);
				}
				else{
					array[baris][nilai] = array[baris-1][nilai-1] + array[baris-1][nilai];
					if (array[baris][nilai] > batas1) {
						System.out.print(array[baris][nilai]);
					}
					else if (array[baris][nilai]> batas2) {
						System.out.print(array[baris][nilai]);
					}
					else{
						System.out.print(array[baris][nilai]);	
					}
				}
			}
			System.out.println();
		}
	}
}