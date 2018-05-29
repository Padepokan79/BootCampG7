/*
Created by 	: Yana
Date 		: 29 Mei 2018
Start 		: 11.31
End 		: 
*/

import java.util.Scanner;

public class Kuis5Yana{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] 	number1 = {2, 39, 47, 14, 36, 56, 57, 49, 43, 79};
		int[] 	number2 = new int[number1.length+1];
		String 	strangkaSisip, strindexSisip;
		int 	angkaSisip, indexSisip, batasMin, batasMax, tambahan, index=0;

		angkaSisip 	= indexSisip = tambahan = 0;
		batasMin	= 1; //batas minimus input index sisipan 
		batasMax	= 10; //batas minimus input index sisipan 

		//menampilkan array number1
		for (int awal : number1) {
			System.out.print(awal+" ");
		}
		System.out.println();
		
		//pertanyaan input nilai sisipan
		do{
			System.out.print("Masukan Angka yang mau disisipkan: ");
			strangkaSisip = input.nextLine();
			if (strangkaSisip.matches("[0-9]*")) {
				angkaSisip = Integer.parseInt(strangkaSisip);			
			}
			else if (strangkaSisip.matches("[^0-9]")) {
				System.out.println("Maaf, input yang diterima hanya berupa angka.");
				System.out.println("Silahkan input kembali");
			}		
		}while(strangkaSisip.matches("[^0-9]*"));

		//pertanyaa index sisipan
		do{
			System.out.print("Sisipkan pada posisi ke: ");
			strindexSisip = input.nextLine();
			if (strindexSisip.matches("[0-9]*")) {
				indexSisip = Integer.parseInt(strindexSisip);
				if (indexSisip < batasMin) {
					System.out.println("Maaf, input posisi tidak boleh kurang dari 1.");
					System.out.println("Silahkan input kembali");
				}
				else if (indexSisip > batasMax) {
					System.out.println("Maaf, input posisi tidak boleh lebih dari 10.");
					System.out.println("Silahkan input kembali");
				}			
			}
			else if (strindexSisip.matches("[^0-9]")) {
				System.out.println("Maaf, input yang diterima hanya berupa angka.");
				System.out.println("Silahkan input kembali");
			}	
		}while(strindexSisip.matches("[^0-9]") || indexSisip < batasMin || indexSisip > batasMax);

		// menyisipkan angka
		while(index < number2.length){
			if (index == indexSisip) {
				number2[index] = angkaSisip;
			}
			else /*if (index != indexSisip && index < number1.length) */{
				number2[index] = number1[tambahan];	
				tambahan++;			
			}
			index++;
		}

		//menampilkan hasil sisipan
		System.out.println();
		for (int hasil : number2) {
			System.out.print(hasil+" ");
		}
	}
}