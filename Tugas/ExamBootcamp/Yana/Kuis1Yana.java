/*
Created by 	: Yana
Date 		: 29 Mei 2018
Start 		:
End 		: 09.00
Modif Start : 10.**
Modif End   : 10.**
*/

import java.util.Scanner;

public class Kuis1Yana{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String 	strpanjangArray;
		int 	panjangArray, nilai, panjangMin, panjangMax;

		panjangArray	= 0;
		nilai 			= 2;
		panjangMin 		= 5; //panjang minimal array
		panjangMax 		= 100; //panjang maksimal array

		//pertanyaan panjang array
		do{			
			System.out.println();
			System.out.print("Jumlah urutan angka Fibonacci yang akan ditampilkan: ");
			strpanjangArray = input.nextLine();
			if (strpanjangArray.matches("[0-9]*")) {
				panjangArray = Integer.parseInt(strpanjangArray);
				if (panjangArray < panjangMin) {
					System.out.println("Maaf, jumlah urutan angka tidak boleh kurang dari 5.");
					System.out.println("Silahkan input kembali");
				}
				else if (panjangArray > panjangMax) {
					System.out.println("Maaf, jumlah urutan angka tidak boleh lebih dari 100.");
					System.out.println("Silahkan input kembali");
				}
			}
			else if (strpanjangArray.matches("[^0-9]")) {
				System.out.println("Maaf, input yang diterima hanya berupa angka.");
				System.out.println("Silahkan input kembali");
			}			
		}while(strpanjangArray.matches("[^0-9]") || panjangArray < panjangMin || panjangArray > panjangMax);

		//menentukan panjang array fibonaci
		int[] 	fibonacci = new int[panjangArray];
		fibonacci[0] = fibonacci[1] = 1;

		//mengisi array dengan bilangan fibonacci
		while(nilai < panjangArray){
			fibonacci[nilai] = fibonacci[nilai-1] + fibonacci[nilai-2];
			nilai++;
		}
		// System.out.println("");
		//menampilkan bilangan fibonacci
		for (int tampil : fibonacci) {
			System.out.print(tampil+" ");
		}
	}
}