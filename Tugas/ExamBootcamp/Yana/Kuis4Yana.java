/*
Created by 	: Yana
Date 		: 29 Mei 2018
Start 		: 10.05
End 		: 11.25
*/

import java.util.Scanner;

public class Kuis4Yana{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] 	deretAngka = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		String 	strjumlahShift;
		int 	jumlahShift, temporari, batasMinKel, batasMaxKel, indexInput=0;

		jumlahShift	= temporari = 0;
		batasMinKel	= 1;  //batasMinKel untuk batas minumum input
		batasMaxKel	= 10; //batasMaxKel untuk batas maksimum input 

		//menampilkan angka awal
		System.out.println("Posisi awal");
		for (int awal : deretAngka) {
			System.out.print(awal+" ");
		}
		System.out.println();
		System.out.println();

		//pertanyaan jumlah shift
		do{
			System.out.print("Shift ke kiri Sebanyak: ");
			strjumlahShift = input.nextLine();
			if (strjumlahShift.matches("[0-9]*")) {
				jumlahShift = Integer.parseInt(strjumlahShift);
				if (jumlahShift < batasMinKel) {
					System.out.println("Maaf, jumlah penggeseran tidak boleh kurang dari 1.");
					System.out.println("Silahkan input kembali");
				}
				else if (jumlahShift > batasMaxKel) {
					System.out.println("Maaf, jumlah penggeseran tidak boleh lebih dari 10.");
					System.out.println("Silahkan input kembali");
				}
			}
			else if (strjumlahShift.matches("[^0-9]")) {
				System.out.println("Maaf, input yang diterima hanya berupa angka.");
				System.out.println("Silahkan input kembali");
			}	
		}while(strjumlahShift.matches("[^0-9]*") || jumlahShift < batasMinKel || jumlahShift > batasMaxKel);

		while(indexInput < jumlahShift){
			temporari = deretAngka[0];
			for (int indexArray=0; indexArray < deretAngka.length; indexArray++) {
				if (indexArray < deretAngka.length-1) {
					deretAngka[indexArray] = deretAngka[indexArray+1];	
				}
				else if (indexArray >= deretAngka.length-1){
					deretAngka[deretAngka.length-1] = temporari;
				}
			}			
		// System.out.println(temporari);
		indexInput++;
		}

		//menampilkan hasil shift
		for (int hasil: deretAngka) {
			System.out.print(hasil+" ");
		}
	}
}