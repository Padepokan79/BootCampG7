/*
     * Tes5 Java.
     *
     * Programmer : Ryan Ahmad N
     * Created By :	Ryan Ahmad N
     * Created At : 29 May 2018 09:57 - 10:15
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;

public class Kuis5Ryan{
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);

		int[] number1 = {2, 39, 47, 14, 36, 56, 57, 49, 43, 79};
		int cek=1, posisiIn=0, angkaIn, array=0, posisiArray=1, posisiMin=1, posisiMax=10;
		String posisi, angka;

			//Batasan:
			//-User input Posisi, tidak boleh lebih dari 10.
			//-User input Posisi, tidak boleh kurang dari 1.
			//-User input hanya menerima angka saja.

		System.out.print("\nHasil yang diinginkan adalah : \n{ ");
		for (int d : number1) {
			System.out.print(d+" ");
		}
		System.out.println("}");

		System.out.println();
		System.out.print("Masukan angka yang mau disisipkan : ");
		do{
			angka = key.nextLine();
			if (angka.matches("[0-9 ]+")) {
				angkaIn = Integer.parseInt(angka);
			}
			else {
				System.out.println("Maaf, input yang diterima hanya berupa angka.\nSilahkan input kembali");
				cek = 0;
			}
		}while (cek == 0);

		System.out.println();
		System.out.print("Sisipkan pada posisi ke : ");
		do{
			posisi = key.nextLine();
			if (posisi.matches("[0-9 ]+")) {
				posisiIn = Integer.parseInt(posisi);
				if (posisiIn > posisiMax) {
					System.out.println("Maaf, input posisi tidak boleh lebih dari "+posisiMax+".\nSilahkan input kembali.");
					cek = 0;
				}
				else if (posisiIn < posisiMin) {
					System.out.println("Maaf, input posisi tidak boleh kurang dari "+posisiMin+".\nSilahkan input kembali.");
					cek = 0;
				}
				else{
					cek = 1;
				}
			}
			else {
				System.out.println("Maaf, input yang diterima hanya berupa angka.\nSilahkan input kembali");
				cek = 0;
			}
		}while (cek == 0);
		System.out.print("{ ");

		while (array < number1.length) {
			if (posisiArray == posisiIn) {
				System.out.print(angka+" ");
			}
			else {
				System.out.print(number1[array]+" ");
				array++;
			}
				posisiArray++;
		}
		System.out.println("}");
	}
}